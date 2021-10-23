package com.example.priya.model.enums;

public class RunLengthEncoding {

    //wwwweeeebbaaddw
    // w4e4b2a2d2w1

    public static void main(String[] args) {

        int ctr=1;
        String str = "wwwweeeebbaaddw";
        StringBuilder strAnswer = new StringBuilder();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                ctr++;
            }else
            {

                strAnswer.append(str.charAt(i));
                strAnswer.append(String.valueOf(ctr));
                ctr=1;

            }
        }
        strAnswer.append(str.charAt(str.length()-1));
        strAnswer.append(String.valueOf(ctr));
        System.out.println(strAnswer.toString());

    }
}
