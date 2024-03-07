public class Media
{
	public static void main(String[] args) {
		
		float n1 = 6, n2 = 7, n3 = 7, n4 = 9, media;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Sua média é: " + media);
		
		if (media >= 7) {
		   System.out.println("Aprovado!");
		} else {
		   System.out.println("Reprovado!");
		}
	}
}
