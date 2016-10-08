package com.cefalo.dp.course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     printHelp();

        User user = new User();

        Scanner scan = new Scanner(System.in);
        String s;
        user.printStatus();
        System.out.println("Do you want to change subscription('u' for upgrade, 'd' for downgrade):");

        while((s = scan.next())!=null){
            if(s.equalsIgnoreCase("u")){
                //upgrade
                user.upgradeSub();
            }
            else if(s.equalsIgnoreCase("d")){
                user.downgradeSub();
            }
            else if(s.equalsIgnoreCase("0")){
                break;
            }
            user.printStatus();
            System.out.println("Do you want to change subscription('u' for upgrade, 'd' for downgrade):");


        }


    }

    static void printHelp(){
        System.out.println("********");
        System.out.println("Welcome to the subscription wizard!");
        System.out.println("User can go through these steps 'Basic' -> 'Trial' -> 'Standard'");
        System.out.println("Press 'u' to upgrade subscription");
        System.out.println("Press 'd' to downgrade subscription");
        System.out.println("Press '0' to exit");
        System.out.println("********");

    }
}
