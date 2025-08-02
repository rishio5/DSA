package DSA;
import java.util.Scanner;
public class remove_duplicates_from_sorted_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ans=removeDuplicates(arr);
        System.out.println(ans);

        }
        public static int removeDuplicates(int[] nums){
            int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    continue;
                }else{
                    i++;
                    nums[i]=nums[j];
                }
            }
            return i+1;
        }

}
//Time Complexity :O(n);
//Space Complexity:O(1);