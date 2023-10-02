//Faça um programa que receba um número inteiro do usuário
// e informe se este número é positivo ou negativo.

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número:");

        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Número positivo!");
        }
        else{
            System.out.println("Número negativo");
        }
    }
}
