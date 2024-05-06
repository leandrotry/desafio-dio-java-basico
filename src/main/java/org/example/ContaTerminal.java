package org.example;

import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Por favor, digite o número da Agência !");
        cliente.setNumero(scan.nextInt());
        System.out.println("Por favor, digite o código da Agência !");
        cliente.setAgencia(scan.next());
        System.out.println("Por favor, digite o nome do Cliente !");
        cliente.setNome(scan.next());
        System.out.println("Por favor, digite o Saldo !");
        cliente.setSaldo(scan.nextDouble());
        scan.close();
        cliente.imprimirMensagem();
    }
}