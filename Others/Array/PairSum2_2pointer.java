// [11,15,6,8,9,10]
//Sorted and rotated array => use modular arthematic 


import java.util.*;
public class PairSum2_2pointer {
    public static boolean check(ArrayList<Integer> list,int target){
        int breakPoint = -1;
        for(int i =0 ; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                breakPoint = i;
                break;
            }
        }
        int rp = breakPoint;
        int lp = breakPoint+1;

        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
        if(list.get(lp)+list.get(rp) < target){
            lp = (lp + 1)% list.size();
        }else{
            rp = (list.size()+rp-1) % list.size();
        }
        }return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(check(list,169));
    } 
}




