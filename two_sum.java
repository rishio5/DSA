package DSA;
import java.util.*;

public class two_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        List<int[]> ans = twosum(arr, target);

        for(int[] pair : ans){
            System.out.println(pair[0] + " " + pair[1]);
        }
    }

    public static List<int[]> twosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                list.add(new int[]{map.get(complement), i}); 
            }
            map.put(nums[i], i); 
        }

        return list;
    }
}
//Time Complexity :O(n);
//Space Complexity:O(n);