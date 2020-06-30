package com.example.numerosirmaos;

import java.util.Arrays;
import java.util.Collections;

public class NumberChecker {

    public static int solution(int num){
        String numero = String.valueOf(num);
        String [] arrNumeros = numero.split("");
        Arrays.sort(arrNumeros, Collections.reverseOrder());
        int result = Integer.parseInt(String.join("",arrNumeros));
        return result > 100000000 ? -1 : result ;
    }

}
