package onedigitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploTreeSet {



    private static Object HashSet;

    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Adicionar as "" no set
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Belo Horizonte");


        System.out.println(treeCapitais);


        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //Retorna a ultima capital no topo da arvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima da arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a ultima capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String capital: treeCapitais){
            String capítal ="";
            System.out.println(capítal);
        }









    }
}
