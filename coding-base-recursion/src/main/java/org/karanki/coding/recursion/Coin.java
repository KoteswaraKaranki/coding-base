package org.karanki.coding.recursion;

// A Naive recursive JAVA program to find minimum of coins
// to make a given change for money 
class Coin
{
    // m is size of coins array (number of different coins)
    static int minCoins(int coins[], int money)
    {
       // base case
       if (money == 0) return 0;
      
       // Initialize result
       int res = Integer.MAX_VALUE;
      
       // Try every coin that has smaller value than Money
       for (int i = 0; i < coins.length; i++)
       {
         if (coins[i] <= money)
         {
             int sub_res = minCoins(coins, money - coins[i]);
      
             // Check for INT_MAX to avoid overflow and see if
             // result can minimized
             if (sub_res + 1 < res)
                res = sub_res + 1;
         }
       }
       return res;
    }
    public static void main(String args[])
    {
       int coins[] =  {9, 6, 5, 1};       
       int V = 8;
       System.out.println("Minimum coins required is "+ minCoins(coins, V) );
    }
}