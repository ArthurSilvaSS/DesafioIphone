import AparelhoTelefonico.Telefone;
import NavegadorDeInternet.NavegadorDeInternet;
import ReprodutorMusical.ReprodutorMusical;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem - vindo ao seu Iphone");
        System.out.println("qual funcao gostaria de esta usando");

        int opcao;
        do {
            System.out.println("[1] - Reprodutor Musical");
            System.out.println("[2] - Navegador de Internet");
            System.out.println("[3] - Aparelho Telefonico");
            System.out.println("[0] - Sair");

            while (!scanner.hasNext()){
                System.out.println("Digite um numero valido !");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
                    System.out.println("Bem - vindo ao menu do reprodutor musical");
                    System.out.println("Escolha a opcao a ser executada");

                    int opcaoDoReprodutorMusical;
                    do {
                        System.out.println("[1] - Adicionar musica");
                        System.out.println("[2] - Tocar Musica");
                        System.out.println("[3] - Avancar para a proxima musica");
                        System.out.println("[4] - volta para a musica anterior");
                        System.out.println("[5] - pausar musica");
                        System.out.println("[0] - Sair");

                        while (!scanner.hasNext()){
                            System.out.println("Digite um valor valido");
                            scanner.next();
                        }
                        opcaoDoReprodutorMusical = scanner.nextInt();

                        switch (opcaoDoReprodutorMusical){
                            case 1 -> reprodutorMusical.adicionarMusica();
                            case 2 -> reprodutorMusical.tocarMusica();
                            case 3 -> reprodutorMusical.avancarMusica();
                            case 4 -> reprodutorMusical.voltarMusica();
                            case 5 -> reprodutorMusical.pausarMusica();
                        }
                    }while (opcaoDoReprodutorMusical != 0);

                }
                case 2: {
                    NavegadorDeInternet navegadorDeInternet = new NavegadorDeInternet();
                    System.out.println("Bem - vindo ao navegador de internet");
                    System.out.println("Escolha uma das opcoes a ser executada");

                    int opcaoDoNavegador;
                    do {
                        System.out.println("[1] - Fazer pesquisa na internet");
                        System.out.println("[2] - Acessar pagina");
                        System.out.println("[3] - Voltar pagina ");

                        while (!scanner.hasNext()){
                            System.out.println("Digite um valor valido");
                            scanner.next();
                        }
                        opcaoDoNavegador = scanner.nextInt();
                        switch (opcaoDoNavegador){
                            case 1 -> navegadorDeInternet.fazerBusca();
                            case 2 -> navegadorDeInternet.acessarPagina();
                            case 3 -> navegadorDeInternet.voltarPagina();
                        }
                    }while (opcaoDoNavegador != 0);
                }
                case 3: {
                    Telefone telefone = new Telefone();
                    System.out.println("Bem vindo ao telefone celular");
                    System.out.println("Escolha uma das opcoes a ser executada");

                    int opcaoDoCelular;
                    int numeroSalvo = -1;
                    do {
                        System.out.println("[1] - fazer ligacao");
                        System.out.println("[2] - mandar menssagem");
                        System.out.println("[3] - ver agennda de contatos");

                        while (!scanner.hasNext()){
                            System.out.println("Digite um valor valido");
                            scanner.next();
                        }
                        opcaoDoCelular = scanner.nextInt();


                        switch (opcaoDoCelular){
                            case 1 -> numeroSalvo = telefone.ligar();
                            case 2 -> {
                                if (numeroSalvo == -1){
                                    System.out.println("faca uma ligacao para poder mandar um sms");
                                    numeroSalvo = telefone.ligar();
                                }
                                telefone.mandarSms(numeroSalvo);

                            }
                            case 3 -> telefone.verAgenda();
                        }

                    }while (opcaoDoCelular != 0);
                }
            }

        }while (opcao != 0);
        scanner.close();
    }
}
