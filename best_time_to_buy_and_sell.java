package DSA;

import java.util.Scanner;

public class best_time_to_buy_and_sell {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ans=buy(arr);
        System.out.println(ans);
    }
    public static int buy(int[] arr){
        int minprice=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            int currprice=arr[i];
            minprice=Math.min(minprice,currprice);
            profit=Math.max(profit,currprice-minprice);

        }
        return profit;
    }
}
//Time Complexity :O(n);
//Space Complexity:O(1);