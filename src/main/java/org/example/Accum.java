package org.example;

public class Accum {
    public static String accum(String s){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            c = Character.toUpperCase(c);
            for (int j = 0; j<= i; j++){
                result.append(c);
                c = Character.toLowerCase(c);
            }
            if (i<s.length() -1){
                result.append("-");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {

        System.out.println(accum("abc"));


    }
}
