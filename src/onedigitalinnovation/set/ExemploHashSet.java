package onedigitalinnovation.set;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;

public class ExemploHashSet {

    private static Object HashSet;

    /*public static void main(String[] args) {
        Set<Double> notasAlunos =  new HashSet<>();

        //Adicionar as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);


        System.out.println(notasAlunos);
        
        //Remove a nota do set
        notasAlunos.remove(3.8);        
        System.out.println(notasAlunos);
        
        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());
        
        //Navegar em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());


    }*/










        import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

        /*
        * Desafio 1
        * */


        public static void main(String[] args) throws IOException {

            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.000");
            int t, vm, distancia;
            double litros;

            t = input.nextInt();
            vm = input.nextInt();

            distancia = t * vm;
            litros = distancia * 1 / 12.0;

            System.out.println(df.format(litros));

        }





















}
