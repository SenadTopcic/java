/*
Beesly String
Problem Description
Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.

Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.
*/

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String A = "mpampamm";
        System.out.println(solve(A));

    }
    public static int solve(String A) {
        StringBuilder sb;
        int lenStr = A.length();
        boolean cond = false;

        if(lenStr % 2 != 0)
            return 0;
        while(lenStr == 0)
        {

            sb = new StringBuilder(A);
            if( cond == true )
                break;
            cond = true;
            if(A.contains("p") && A.contains("m"))
            {
                sb.delete(A.indexOf('p'), (A.indexOf('p')+1));
                sb.delete(A.indexOf('m'), (A.indexOf('m')+1));
                lenStr-=2;
                cond = false;
                A = new String(sb);
            }
            if(A.contains("a") && A.contains("m"))
            {
                sb.delete(A.indexOf('p'), (A.indexOf('p')+1));
                sb.delete(A.indexOf('m'), (A.indexOf('m')+1));
                lenStr-=2;
                cond = false;
                A = new String(sb);
            }
            System.out.println("duzina" + lenStr);
            // A = new String(sb);
        }
        //System.out.println(lenStr);
        if(lenStr == 0)
            return 1;
        else
            return 0;
    }


}