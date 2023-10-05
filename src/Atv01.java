// Gerar a média de duas notas:
// Caso a nota seja maior igual a 6, imprimir mensagem de parabéns.
// Caso seja menor que 6, informar ao usuário que ele não passou.


import  java.util.Scanner;

public class Atv01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media >= 6){
            System.out.printf("Parabéns! Sua média é de %f", media);
        } else{
            System.out.printf("Você não passou, sua nota média foi de %f. A média é no mínimo 6.", media);
        }
    }
}
