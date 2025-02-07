package org.example;
/*Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450   -> 145
960000 -> 96
1050   -> 105
-1050  -> -105
0      -> 0
Note: Zero should be left as it is */
public class NoBoring {
    public static int noBoringZeros(int n) {
       if ( n== 0){
           return 0;
       } // caso o numero seja 0, retorna 0

        String nToString = String.valueOf(n); // n é transformado em String para
        while (nToString.endsWith("0")){
            nToString = nToString.substring(0,nToString.length()-1);//enquanto o valor de n termina com 0 o ultimo String será removido, até que este seja diferente de zero
        }
        n = Integer.parseInt(nToString);// n é transformado em Int
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(1050));
    }
}
