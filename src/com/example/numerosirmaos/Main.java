package com.example.numerosirmaos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre um numero não negativo: ");
        int numero = scanner.nextInt();
        while(numero < 0){
            System.out.println("Entre um numero não negativo: ");
            numero = scanner.nextInt();
        }
        NumberChecker nc = new NumberChecker();
        int result = nc.solution(numero);
        System.out.println(result);
    }


}
