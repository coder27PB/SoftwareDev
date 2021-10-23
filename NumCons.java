package com.example.priya.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**{23,5,11,27,4,15,10,6,12,25}



 4,5,6

 10,11,12

 WAP all subsets of consecutive num


 class Test{


 public
 }
 **/
public class NumCons {




    public static void main(String[] args) {

        int ar[] = {23,5,11,27,4,15,10,6,12,25};
        Arrays.sort(ar);
        //System.out.println(4,5,6,10,11,12,15,23,25,27);

        for(int i=1;i<ar.length;i++)
        {
            List<Integer> tempList = new ArrayList<>();
            if(ar[i]-ar[i-1]==1)
            {
                tempList.add(ar[i]);
                if(!tempList.contains(ar[i-1]))
                    tempList.add(ar[i-1]);
            }else{
                System.out.println(tempList);
                tempList = new ArrayList<>();
                break;
            }
        }


    }
}
