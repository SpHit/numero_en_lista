package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            long ini = System.currentTimeMillis();
            Random aleatorio = new Random();
            ArrayList<Integer> milista = new ArrayList<>();
            int num = 4;

<<<<<<< HEAD
            for (int i = 0; i < 1000000; i++){
                milista.add(aleatorio.nextInt(100000));
            }
            long fi = System.currentTimeMillis();
        System.out.println(milista.contains(num));
        System.out.println("Y ha tardado " + (fi-ini) + " milisegundos");
=======
            if (num%2==0){

                for (int i = 0; i < 700000; i++){
                    milista.add(aleatorio.nextInt(100000));
                }
                System.out.println(milista.contains(num));
            }else {
                System.out.println("Solo números pares");
            }
>>>>>>> master
    }
}
