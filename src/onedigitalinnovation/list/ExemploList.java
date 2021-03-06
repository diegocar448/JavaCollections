package onedigitalinnovation.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("Joao");


        System.out.println(nomes);

        /*setar uma posição*/
        nomes.set(2, "Larissa");

        System.out.println(nomes);

        /*simples forma de ordernar*/
        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Pedro");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        int tamanho = nomes.size();

        nomes.remove("Camila");



        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);



        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes){
            System.out.println("--> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("----> " + iterator.next());
        }

        nomes.clear();

        listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);


    }
}
