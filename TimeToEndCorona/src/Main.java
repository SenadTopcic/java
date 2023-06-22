/*
* Time to end Corona
Problem Description
Given three integers, A, B and C. You have to find the number of days it will take to reach zero cases of Corona in a city.

A - Average cases recovered in a day of the corona.
B - Number of new cases of corona daily.
C - Current active cases of the corona.

Return the minimum number of days it will take to reach 0 active cases of Covid.
* Input Format

The first argument will be integer A, which denotes the recovered cases in a day.
The second argument will be integer B, which denotes the new cases in a day.
The third argument will be integer C, which denotes the currently active cases.
* */



public class Main
{
    //A represent recveredCasesInDay,B represent newCasesInDay,C represent currentlyActiveCases
    public static int solve(int A, int B, int C)
     {
         int days = 0;
         while (C > 0) {
             C = (C + B) - A;
             days++;
         }
         return days;
     }

    public static void main(String[] args)
    {

        int recveredCasesInDay = 50;
        int newCasesInDay =49;
        int currentlyActiveCases=8;
        System.out.println(solve(recveredCasesInDay,newCasesInDay,currentlyActiveCases));

    }
}