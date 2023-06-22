/*
* Problem Description:

Write a program to return a string from a given string s where all occurrences of
the first char of the string except the first occurrence have been changed to '$'.
*
* */

import java.util.Scanner;

public class Main {

    public static String change_char(String s)
    {
        char[] charArr = s.toCharArray();
        for(int i = 1; i < charArr.length; i++)
        {
            if(charArr[0] == charArr[i]) {
                charArr[i] = '$';
            }
        }
        String result = new String(charArr);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        System.out.println(change_char(word));
        }

}