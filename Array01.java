package com.example.priya;

public class Array01 {


    public static void main(String[] args) {
        int ar[] = {0,1,1,1,0,0,1,0};
        int ctr=0;

        for(int i = 0;i<ar.length;i++)
        {
           if(ar[i]==0)
               ctr++;

        }




        for(int i =0;i<ctr;i++)
        {
            ar[i] = 0;
        }

        for(int i=ctr;i<ar.length;i++)
        {
            ar[i] = 1;
        }

    }
}
