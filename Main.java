package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            Random aleatorio = new Random();
            ArrayList<Integer> milista = new ArrayList<>();
            int num = 5;

            for (int i = 0; i < 500000; i++){
                milista.add(aleatorio.nextInt(100000));
            }
            System.out.println(milista.contains(num));
    }
}
