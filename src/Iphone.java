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
            }

        }while (opcao != 0);
        scanner.close();
    }
}
