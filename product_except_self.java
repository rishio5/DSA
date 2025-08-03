package DSA;

import java.util.Scanner;

public class product_except_self {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = product(arr);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " "); 
        }
    }

    public static int[] product(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

      
        prefix[0] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

      
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

       
        for(int i = 0; i < n; i++){
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}

//Time Complexity :O(n);
//Space Complexity:O(n);