package AparelhoTelefonico;

import java.util.Scanner;

public class Telefone {
    Scanner scanner = new Scanner(System.in);
    private int numeroDeTelefone;

    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public int ligar(){
        System.out.println("Digite o numero para qual quer ligar");
        int numero = this.scanner.nextInt();
        setNumeroDeTelefone(numero);

        System.out.println("Ligando para o  numero " + getNumeroDeTelefone() + " ...");

        return numero;
    }
    public void mandarSms(int numero){
        System.out.println("mandando SMS para o numero " + numero + " ...");
    }
    public void verAgenda(){
        System.out.println("Lista de contatos / Agenda");
    }
}
