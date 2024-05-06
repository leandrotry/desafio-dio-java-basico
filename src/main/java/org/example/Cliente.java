package org.example;

public class Cliente {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void imprimirMensagem(){
        System.out.println("Olá "+ getNome()+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ getAgencia()+ ", conta "+ getNumero()+ " e seu saldo "+ getSaldo()+ " já está disponível para saque");
    }
}
