package org.example;

class Kata {
    public static String multiTable(int num) {
        String result = ""; // criando variavel String result e inicializando com espaço vazio
        for (int i = 1 ; i <=10; i++){
            result += i +" * " + num + " = " + (num*i)+"\n";
        } // dentro do for , concatenamos a multiplicação na variavel result
        return result.trim();// trim() remove a linha extra no inicio e/ou final
    }

    public static void main(String[] args) {
        System.out.println(multiTable(10));

    }
}