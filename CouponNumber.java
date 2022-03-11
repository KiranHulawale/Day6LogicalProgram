package com.bridgelabz.LogicalAssignments;

import java.lang.Math;


public class CouponNumber {
        static String usingMath()
        {
        String alphabetsInUpperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String allCharacters=alphabetsInUpperCase+alphabetsInLowerCase+numbers;
        StringBuffer randomString=new StringBuffer();
        for(int i=0;i<10;i++)
        {
            int randomIndex=(int)(Math.random()*allCharacters.length());
            randomString.append(allCharacters.charAt(randomIndex));
        }
         return randomString.toString();
    }
    public static void main(String[] args) {

        String randomString=usingMath();
        //int randomIndex=(int)(Math.random());
        System.out.println("RandomString is:" +randomString);
        }

}
