// 1672. Richest Customer Wealth

package leetcode.arrays;

import java.util.Scanner;
// import java.util.Arrays;
public class maximumwealth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of the coloumn: ");
        int col = sc.nextInt();
        int[][] accounts = new int[row][col];

        // Taking inputs
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                accounts[i][j] = sc.nextInt();
            }
        }

        maximumwealth solution = new maximumwealth();
        int ans = solution.maximumWealth(accounts);
        System.out.print(ans);
        sc.close();
    }

    public int maximumWealth(int[][] accounts) {
        int maxwealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int currentsum = 0;
            for(int j=0; j<accounts[i].length; j++){
                currentsum += accounts[i][j];
            }
            maxwealth = Math.max(maxwealth, currentsum);
        }
        return maxwealth;
    }
}
