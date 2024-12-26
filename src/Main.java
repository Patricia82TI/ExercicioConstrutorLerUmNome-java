import java.util.Scanner;

//Faça um programa que leia um nome para um funcionário e cria um objeto funcionário
//com esse nome informado e um salário de R$1000
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nomeLido = sc.nextLine();

        Funcionario funcionario = new Funcionario(nomeLido);

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salário: " + funcionario.salario);
    }
}