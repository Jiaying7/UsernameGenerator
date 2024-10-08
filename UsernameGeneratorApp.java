package com.UsernameGenerator;

import java.util.Scanner;
//Q1. b.
public class UsernameGeneratorApp {
    public static void main(String[] args) {
        System.out.println("Please select the service you need: 1. Generate username 2. Check the validity of the account");
        Scanner scanner = new Scanner(System.in);
        int flag = scanner.nextInt();
        if (flag == 1){
            checkName();
        }else if (flag == 2){
            checkAccount();
        }
    }

    public static void checkName(){
        System.out.println("Please enter the number of usernames required");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(); //number
        for (int j = 0; j < i; j++) {
            UsernameGenerator usernameGenerator = new UsernameGenerator();
            System.out.println("Please enter " + (j + 1) + " user names");
            scanner.useDelimiter("\n");
            String name = scanner.next();
            usernameGenerator.setName(name);
            String resultName = usernameGenerator.getName();
            System.out.println(resultName);
        }
    }

    //Q2. b. Store the number of accounts/usernames verified by the user in an array and display the computed value
    public static void checkAccount(){
        System.out.println("Please enter the number of handle/usernames you want to verify");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(); //number
        UsernameGenerator usernameGenerator = new UsernameGenerator();
        String[] accountNumber = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.println("Please enter " + (j + 1) + " handle/usernames");
            scanner.useDelimiter("\n");
            String account = scanner.next();
            accountNumber[j]=account;
        }
        boolean[] booleans = usernameGenerator.checkAccount(accountNumber);
        for (boolean result : booleans) {
            System.out.println(result);
        }
    }
}
