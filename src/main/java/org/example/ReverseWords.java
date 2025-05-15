package org.example;

public class ReverseWords {
    public static String reverseWords(final String original) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder palavra = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);

            if (c != ' ') {
                palavra.append(c);
            } else {
                if (!palavra.isEmpty()) {
                    resultado.append(palavra.reverse());
                    palavra.setLength(0);
                }
                resultado.append(' ');
            }
        }

        if (!palavra.isEmpty()) {
            resultado.append(palavra.reverse());
        }

        return resultado.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("  double  spaced  words  "));
    }
}
