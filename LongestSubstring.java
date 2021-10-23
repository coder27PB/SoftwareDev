package com.example.priya.model.enums;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubstring {

    /**
     * static
     * atic
     * codingisawesome
     * ngisawe
     **/

    public static void main(String[] args) {
        String str = "codingisawesome";
        LinkedHashSet<Character> tracker = new LinkedHashSet<>();
        int max = 0;
        String answer = "";
        System.out.println("This Question was asked by McAffee");
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (!tracker.contains(str.charAt(i))) {
                    tracker.add(str.charAt(i));
                } else {
                    if (tracker.size() > max) {
                        max = tracker.size();
                        answer = tracker.toString();

                    }

                }
            }
        }
    }

}
