package com.UsernameGenerator;

import java.util.Locale;

//Q1. a.
public class UsernameGenerator {
    //Declare variable
    private String name;

    public UsernameGenerator() {
    }

    //Constructor
    public UsernameGenerator(String name) {
        this.name = name;
    }

    //getter and setter
    public String getName() {
        String changeName = changeName(this.name);
        return changeName;
    }

    public void setName(String name) {
        this.name = name;
    }

    //User name calculation
    public String changeName(String name) {
        String[] firstAndLastNames = name.split(" ");//Split string
        String first = firstAndLastNames[0];// Get first name
        String last = firstAndLastNames[1];//  Get last name
        String f = String.valueOf(first.charAt(0));  //First letter of name
        String l = String.valueOf(last.charAt(0));  //Last letter of name
        //String replacement
        String reFirst = first.replaceAll("[aeiou]", "");
        String reLast = last.replaceAll("[aeiou]", "");
        char[] chars = name.toCharArray();  //Convert to array
        int count = 0;
        //override
        for (int i = 0; i < chars.length; i++) {
            //Calculate the number
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                count++;
            }
        }
        //Convert to string
        String counts = String.valueOf(count);
        //String Splicing
        String resultName = f + l + reFirst + "%" + reLast + "?" + counts;
        return resultName;
    }

    //Q2. a. Check the validity of the account
    public boolean[] checkAccount(String[] accountNumber) {
        boolean[] result = new boolean[accountNumber.length];
        for (int i = 0; i < accountNumber.length; i++) {
            //To lowercase
            String account = accountNumber[i].toLowerCase(Locale.ROOT);
            //Determine if the user name is valid
            if (account.startsWith("@") && account.length() >= 5 && account.length() <= 16) {
                for (int j = 0; j < account.length(); j++) {
                    if ((account.charAt(j) >= '0' || account.charAt(j) <= '9'|| account.contains("_")) && (account.charAt(j) >= 'a' && account.charAt(j) <= 'z') && !account.contains(".") ) {
                        result[i] = true;
                    } else {
                        result[i] = false;
                    }
                }
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}
