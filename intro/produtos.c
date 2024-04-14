#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <time.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    struct fichaProduto
    {
        char nome[100], resultado[100];
        float mes[3];
        float total, vmd, tr, lr, emin, emax, ea;
    };

    struct fichaProduto produto[999];

    int i, j;
    int contador = 0, codigo;

    do
    {
        printf("%-10s|%-25s\n", "CÓDIGO", "FUNÇÃO");
        printf("%-10s|%-25s\n", "   1", "ADICIONAR PRODUTO");
        printf("%-10s|%-25s\n\n", "   2", "EXIBIR RESULTADOS");

        printf("Digite o código do que deseja fazer: ");
        scanf("%d", &codigo);

        system("cls || clear");

        switch (codigo)
        {
        case 1:
            produto[contador].total = 0;

            fflush(stdin);

            printf("Digite o nome do produto: ");
            fgets(produto[contador].nome, 100, stdin);

            for (j = 0; j < 3; j++)
            {
                printf("Total de vendas do %dº mês: ", j + 1);
                scanf("%f", &produto[contador].mes[j]);
                
                produto[contador].total += produto[contador].mes[j];
            }

            produto[contador].vmd = (produto[contador].total / 3) / 25;

            printf("Tempo de reposição: ");
            scanf("%f", &produto[contador].tr);

            produto[contador].emin = produto[contador].vmd * produto[contador].tr;

            printf("Lote de reposição: ");
            scanf("%f", &produto[contador].lr);

            produto[contador].emax = produto[contador].emin + produto[contador].lr;

            printf("Estoque total: ");
            scanf("%f", &produto[contador].ea);

            strcpy(produto[contador].resultado, (produto[contador].ea > produto[contador].emin) ? "NÃO COMPRAR" : "COMPRAR");
            
            contador++;
            system("cls || clear");
            break;

        case 2:
            for (i = 0; i < contador; i++)
            {
                printf("------------- INFORMAÇÕES DO %dº PRODUTO -------------\n", i + 1);
                printf("Nome do produto: %s", produto[i].nome);
                printf("Venda média diária: R$%.2f\n", produto[i].vmd);
                printf("Estoque mínimo: %.f\n", produto[i].emin);
                printf("Estoque máximo: %.f\n", produto[i].emax);
                printf("Resultado: %s\n", produto[i].resultado);
                printf("------------------------------------------------------\n\n");
            }
            break;

            default:
            printf("Código inválido! Digite novamente.\n");
            break;
        }
    } while (codigo != 2);

    return 0;
}
