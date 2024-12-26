//Question Link: https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/description/

//important sidecase => check it  

package ArrayList.Easy;
import java.util.*;
public class MostFrequentNumberFollowingKeyInanArray {

    public static int mostFrequent(ArrayList<Integer> list, int key){
            int count[] = new int[11];
            for(int i=0 ;i<list.size();i++){
                if(list.get(i)==key){
                    count[list.get(i+1)]++;
                }
            } 

            // for(int i=0;i<count.length;i++){
            //     System.out.println(count[i]);
            // }

            int maxValue = 0 ;
            int target =0;
            for(int i =0; i<count.length;i++){
                if(count[i]>maxValue){
                    target = i;
                    maxValue = count[i];
                    
                }
            }
            return target;

    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(2);
        list.add(7);
        System.out.println(list);
        System.out.println(mostFrequent(list,2));
    }
}




/* 
  class Solution {
    public int mostFrequent(int[] nums, int key) {
            int count[] = new int[1001];
            for(int i=0 ;i<nums.length-1;i++){   //important sidecase
                if(nums[i]==key){
                    count[nums[i+1]]++;
                }
            } 
            int maxValue = 0 ;
            int target =0;
            for(int i =0; i<count.length;i++){
                if(count[i]>maxValue){
                    target = i;
                    maxValue = count[i];
                    
                }
            }
            return target;    
    }
}
*/