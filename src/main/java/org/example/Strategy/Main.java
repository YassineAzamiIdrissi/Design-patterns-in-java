package org.example.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IChoice choice = null;
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();
        System.out.println("select two numbers : ");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("choose something : ");
        String c = scanner.nextLine();
        if (c.equals("1")) {
            choice = new FirstChoice();
        } else {
            choice = new SecondChoice();
        }
        context.setChoice(choice);
        context.showChoice(a, b);
    }
}
