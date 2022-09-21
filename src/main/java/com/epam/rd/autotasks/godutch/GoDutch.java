package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int billAmount = 0;
        int numberFriends = 0;
        int totalToPay = 0;
        int oneShare = 0;


         billAmount = scanner.nextInt();
        if(billAmount < 0){
            System.out.println("Bill total amount cannot be negative");
        }
        else{
             numberFriends = scanner.nextInt();
            if(numberFriends <= 0){
                System.out.println("Number of friends cannot be negative or zero");
            }
            else{
                totalToPay = billAmount + (billAmount / 10);
                oneShare = totalToPay / numberFriends;
                System.out.println(oneShare);
            }
        }

    }
}
