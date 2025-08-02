import java.util.Scanner;

public class maximum_sum_subarray {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ans=maximumSumSuarray(arr);
        System.out.println(ans);

        }
        public static int maximumSumSuarray(int[] nums){
            int curr=nums[0];
            int max=nums[0];
            for(int i=0;i<nums.length;i++){
                if(curr<0){
                    curr=0;
                }
                curr+=nums[i];
                max=Math.max(curr,max);
            }
            return max;

        }
}
//Time Complexity :O(n);
//Space Complexity:O(1);
