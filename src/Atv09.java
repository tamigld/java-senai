//Apresente o valor do salário atual e adicione 100 até que chegue em 5000

public class Atv09 {
    public static void main(String[] args){
        int salario = 1000;

        while (salario < 5000){

            salario += 100;

            System.out.printf("O salário ainda é de R$%d \n", salario);
        }
        System.out.println("O salário atingiu R$5000!");
    }
}
