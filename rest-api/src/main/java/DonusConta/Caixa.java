package DonusConta;

import ContaDonus.Conta;

import java.util.Scanner;
import java.util.Random;

public class Caixa {


    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome, cpf;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite seu cpf: ");
        cpf = entrada.nextLine();


        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }

}