//brute force O(n^2)

import java.util.*;
public class ContainerWithMostWater{

    public static int maxxWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0; i <height.size();i++){
            for(int j= i+1;j<height.size();j++){
               int width =  j-i;
               int h = Math.min(height.get(i),height.get(j));
               int water = width * h;
            maxWater = Math.max(maxWater,water);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxxWater(height));

    }

}


/*  TLE in leetcode -> hehe!!!
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        for(int i=0; i <height.length;i++){
            for(int j= i+1;j<height.length;j++){
               int width =  j-i;
               int h = Math.min(height[i],height[j]);
               int water = width * h;
            maxWater = Math.max(maxWater,water);
            }
        }
        return maxWater;    
    }
}
*/