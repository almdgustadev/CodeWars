package org.example;

class Kata {
    public static String multiTable(int num) {
        String result = "";
        for (int i = 1 ; i <=10; i++){
            result += i +" * " + num + " = " + (num*i)+"\n";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(multiTable(10));

    }
}