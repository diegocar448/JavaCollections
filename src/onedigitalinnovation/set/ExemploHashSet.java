package onedigitalinnovation.set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.Integer;
import java.lang.String;


import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

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












        /*
        * Desafio 1
        * */
        /*public static void main(String[] args) throws IOException {

            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.000");
            int t, vm, distancia;
            double litros;

            t = input.nextInt();
            vm = input.nextInt();

            distancia = t * vm;
            litros = distancia * 1 / 12.0;

            System.out.println(df.format(litros));
        }*/


        /*
         * Desafio 2
         * */
        /*public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            //declare suas variaveis do tipo double
            double area, valor;

            //continue a solucao
            valor = input.nextDouble();
            //valor = 100.64;

            area = 3.14159 * (Math.pow(  valor  ,2));

            System.out.printf("A=%.4f\n", area);
        }*/


    /*
     * Desafio 3
     * */
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());

        double salary = valor2 * valor3; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + valor1);
        System.out.printf("SALARY = U$ %.2f", salary);
    }*/



    /*
    * Desafio 4
    * */
    /*public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();
        //if (valor1 % 2 == 0 && valor2 % 2 == 0) {
        if ((valor1 % valor2 == 0) | (valor2 % valor1 == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não Sao Multiplos");
        }
    }*/


    /*
    Desafio 5
    * */
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        String linha;
        int pos, neg, par, impar, num;


        pos = neg = par = impar = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = br.readLine();
            num = Integer.parseInt(linha);

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (num > 0) pos++;
            if (num < 0) neg++;
        }

        System.out.println("" + par +" valor(es) par(es)");
        System.out.println("" + impar + " valor(es) impar(es)");
        System.out.println("" + pos + " valor(es) positivo(s)");
        System.out.println("" + neg + " valor(es) negativo(s)");
    }





















}
