package onedigitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);


        //remove da fila
        /*String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);*/
        System.out.println(filaBanco);

        //pega o primeiro mas não o retira da fila
        String primeiroClente = filaBanco.peek();

        System.out.println(primeiroClente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        //o element não remova apenas retorna, caso esteja vazia ocorrerá retornará erro
        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for(String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while(iteratorFilaBanco.hasNext()){
            System.out.println("====>>>" +iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());
    }
}
