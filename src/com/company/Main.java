package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте! Как вас зовут?");
        Scanner scan = new Scanner(in);
        String name = scan.nextLine();
        System.out.println("Здравствуйте," + name + "! А какая температура на улице");
        int temp = scan.nextInt();
        System.out.println("А сколько вам лет?");
        int age = generateRandomAge();

        if ((temp < 30 || temp > -20) && (age > 20 || age < 45)) {
            System.out.println("Вы идете в гости к другу");
        } else if (age < 20 && (temp > 0 && temp < 28)) {
            System.out.println("Вы идете в гости к другу");
        } else if (age > 45 && (temp > -10 && temp < 25)) {
            System.out.println("Вы идете в гости к другу");
        } else {
            System.out.println("Вы не идете  гулять");
        }


    }


    public static int generateRandomAge() {
        Random Age = new Random();
        int a = Age.nextInt(107);
        System.out.println("Вам - " + a);
        return a;
    }
}


