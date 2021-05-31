package onedigitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    private static Object HashSet;

    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionar as notas no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);


        System.out.println(sequenciaNumerica);

        //Remove a nota do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navegar em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer nota : sequenciaNumerica) {
            System.out.println(nota);
        }

        sequenciaNumerica.clear();

        System.out.println(sequenciaNumerica.isEmpty());

    }

}
