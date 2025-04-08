package NavegadorDeInternet;

import java.util.Scanner;

public class NavegadorDeInternet {
    Scanner scanner = new Scanner(System.in);
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public void fazerBusca(){
        String linkDaPagina = getLink();
        if (linkDaPagina == null){
            System.out.println("Sem link para realizar a busca");
            adicionarLink();
        }
        else {
            System.out.println("Fazendo busca apartir do link " + getLink() + " ....");
        }

    }
    public void adicionarLink(){
        System.out.println("digite um link para realizar buscas");
        String link = this.scanner.next();
        setLink(link);
    }
    public void acessarPagina(){
        String linkDaPagina = getLink();
        if (linkDaPagina == null){
            System.out.println("Sem link para realizar a busca");
            adicionarLink();
        }
        else {
            System.out.println("Acessando pagina apartitr do link " + getLink() + " ....");
        }
    }
    public void voltarPagina(){
        String linkDaPagina = getLink();
        if (linkDaPagina == null){
            System.out.println("Sem link para realizar a busca");
            adicionarLink();
        }
        else {
            System.out.println("voltando para a busca inicial ....");
        }
    }
}
