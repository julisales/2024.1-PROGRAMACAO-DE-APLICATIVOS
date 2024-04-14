#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    struct entradas
    {
        float previsao[3];
        float realizada[3];
    };

    struct saidas
    {
        char nome[50];
        float previsao[3];
        float realizada[3];
    };

    int qtd_recebimento, qtd_contas, i, j;
    float total_previsao_entradas[3] = {0}, total_realizada_entradas[3] = {0};
    float total_previsao_saidas[3] = {0}, total_realizada_saidas[3] = {0};
    float entradas_saidas_previsao[3] = {0}, entradas_saidas_realizada[3] = {0}, saldo_acumulado_previsao[3], saldo_acumulado_realizada[3];

    printf("------------------ ENTRADAS -----------------\n");
    printf("Digite a quantidade de entradas que deseja adicionar: ");
    scanf("%d", &qtd_recebimento);

    struct entradas recebimentos[qtd_recebimento];

    system("cls || clear");

    for (i = 0; i < qtd_recebimento; i++)
    {
        printf("RECEBIMENTO %d: \n", i + 1);

        for (j = 0; j < 3; j++)
        {
            printf("Digite a previsão %d: ", j + 1);
            scanf("%f", &recebimentos[i].previsao[j]);

            printf("Digite a realizada %d: ", j + 1);
            scanf("%f", &recebimentos[i].realizada[j]);

            total_previsao_entradas[j] += recebimentos[i].previsao[j];
            total_realizada_entradas[j] += recebimentos[i].realizada[j];
        }

        system("cls || clear");
    }

    printf("------------------ SAÍDAS -----------------\n");
    printf("Quantas saídas deseja adicionar: ");
    printf("%f", &qtd_contas);

    struct saidas contas[qtd_contas];

    system("cls || clear");

    for (i = 0; i < qtd_recebimento; i++)
    {
        printf("Digite o nome da conta da saída %d: ", i + 1);
        scanf("%s", contas[i].nome); 

        strupr(contas[i].nome);

        system("cls || clear");

        printf("%s:\n", contas[i].nome); 

        for (j = 0; j < 3; j++)
        {
            printf("Digite a previsão %d: ", j + 1);
            scanf("%f", &contas[i].previsao[j]);

            printf("Digite a realizada %d: ", j + 1);
            scanf("%f", &contas[i].realizada[j]);

            total_previsao_saidas[j] += contas[i].previsao[j];
            total_realizada_saidas[j] += contas[i].realizada[j];
        }

        system("cls || clear");
    }

    for(j = 0; j < 3; j++){
        entradas_saidas_previsao[j] = total_previsao_entradas[j] - total_previsao_saidas[j];
        entradas_saidas_realizada[j] = total_realizada_entradas[j] - total_realizada_saidas[j];
        
        saldo_acumulado_previsao[j] =  entradas_saidas_previsao[j];
        saldo_acumulado_realizada[j] =  entradas_saidas_realizada[j];
    }

    return 0;
}
