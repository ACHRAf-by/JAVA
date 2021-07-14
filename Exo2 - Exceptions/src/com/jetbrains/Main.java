package com.jetbrains;

public class Main {

    public static void main(String[] args) {
        int[] tab = null;
        try {
            System.out.println(tab[2]); // NullPointerException
        }catch (NullPointerException e){
            System.out.println("Pointeur nul \n");
        }
    }
}
