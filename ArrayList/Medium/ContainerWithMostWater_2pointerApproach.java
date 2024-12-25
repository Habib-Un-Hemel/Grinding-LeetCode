//O(n)

import java.util.*;
public class ContainerWithMostWater_2pointerApproach{

    public static int maxxWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int hp = height.size()-1;
        while(lp < hp){
            int width =  hp - lp;
               int h = Math.min(height.get(lp),height.get(hp));
               int water = width * h;
            maxWater = Math.max(maxWater,water); 
        if(height.get(lp)<height.get(hp)){
            lp++;
        }
        else{
            hp--;
        }
        }return maxWater;
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


/* My leetcode's  code
 class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int hp = height.length -1;
        while(lp < hp){
            int width =  hp - lp;
               int h = Math.min(height[lp],height[hp]);
               int water = width * h;
            maxWater = Math.max(maxWater,water); 
        if(height[lp] <height[hp]){
            lp++;
        }
        else{
            hp--;
        }
        }
        return maxWater;    
    }
}
 */