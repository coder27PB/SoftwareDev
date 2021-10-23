package com.example.priya;

import java.util.HashMap;

public class Anagram {


    static boolean check(String s,HashMap<Character,Integer> lookup)
    {
        for(int i=0;i<s.length();i++){
            if(lookup.containsKey(s.charAt(i)))
            {
                lookup.put(s.charAt(i),lookup.get(s.charAt(i))-1);
            }
        }

        for(Character c : lookup.keySet())
        {
            if(lookup.get(c)>0)
            {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String str = "postm";

        HashMap<Character,Integer> lookup = new HashMap<>();

        for(int i =0;i<str.length();i++)
        {

                lookup.put(str.charAt(i),lookup.getOrDefault(str.charAt(i),0)+1);

        }


        //boolean ans = check("tops",lookup);
        //System.out.println(ans);



        boolean ans1 = check("topls",lookup);
        System.out.println(ans1);







    }
}
