package com.vinayak;

public class MatchingRule {
    // Question link -> https://leetcode.com/problems/count-items-matching-a-rule/
    public static void main(String[] args) {
       String[][] arr = {
               {"phone","blue","pixel"},
               {"computer","silver","lenovo"},
               {"phone","gold","iphone"}
       };
       String rulekey = "color";
       String ruleValue = "silver";
       int productsMatchingRules = checkRules(arr, rulekey, ruleValue);
        System.out.println(productsMatchingRules);
    }

    static int checkRules(String arr[][], String ruleKey, String rulevalue) {
        int index = 0;
        int count = 0;
        if(ruleKey.equals("type")) {
            index = 0;
        } else if(ruleKey.equals("color")) {
            index = 1;
        } else if(ruleKey.equals("name")) {
            index = 2;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i][index].equals(rulevalue)) {
                count++;
            }
        }
        return count;
    }
}
