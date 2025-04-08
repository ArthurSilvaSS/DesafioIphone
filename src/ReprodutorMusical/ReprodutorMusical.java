package ReprodutorMusical;

import java.util.Scanner;

public class ReprodutorMusical {
    Scanner scanner = new Scanner(System.in);

    private String musica;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void adicionarMusica() {
        System.out.println("Digite o nome da musica a ser adicionada");
        String nomeDaMusica = this.scanner.next();
        setMusica(nomeDaMusica);
        System.out.println("Nova musica adicionado com sucesso (" + nomeDaMusica + ") ...");
    }

    public void tocarMusica() {
        String nomeDaMusica = getMusica();
        if (nomeDaMusica == null){
            System.out.println("Sem musica adicionada !!!");
            System.out.println("Adicione uma musica para poder reproduzila");
            adicionarMusica();
        }else {
            System.out.println("Tocando a musica (" + nomeDaMusica + ") ...");
        }

    }
    public void avancarMusica(){
        String musicaAtual = getMusica();
        if (musicaAtual == null){
            System.out.println("Sem musica adicionada !!!");
            System.out.println("Adicione uma musica para poder reproduzir");
            adicionarMusica();
        }else {
            System.out.println("Trocando de Musica " + musicaAtual + " para nova musica !!");
        }
    }
    public void voltarMusica() {
        String musicaAtuial = getMusica();
        if (musicaAtuial == null){
            System.out.println("Sem musica adicionada !!!");
            System.out.println("Adicione uma musica para poder reproduzir");
            adicionarMusica();
        }else {
            System.out.println("Voltando para musica anterior .. " + musicaAtuial);
        }
    }
    public void pausarMusica() {
        String musicaAtuial = getMusica();
        if (musicaAtuial == null){
            System.out.println("Sem musica adicionada !!!");
            System.out.println("Adicione uma musica para poder reproduzir");
            adicionarMusica();
        }else {
            System.out.println("Pausando a musica .. " + musicaAtuial);
        }
    }
}
