package Others.Array;
import java.util.*;
public class PairSum1_2pointer {
    public static Boolean pairSum(ArrayList<Integer>list, int target){
        int lp=0;
        int hp = list.size()-1;
        while(lp<hp){
            if (list.get(hp)+list.get(lp) == target){
                return true;
            }

        if(list.get(lp) + list.get(hp) < target){
            lp++;
        }else{
            hp--;
        }
        }
        return false;
    };

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list,212));
    }
 
}
