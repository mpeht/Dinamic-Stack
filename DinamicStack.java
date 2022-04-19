/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicstack;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class DinamicStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
              StackDin stack = new StackDin();
        int option;
        int insert;
        int withdraw;
        int i = 0;
        int j = 0;
        int num;

        do {
            System.out.println("Enter your option\n"
                    + "1 - Stack data\n"
                    + "2 - Unstack data\n"
                    + "3 - Show the Stack\n"
                    + "4 - Show the top\n"
                    + "5 - Out");
            option = in.nextInt();

            switch (option) {

                case 1:

                    System.out.println("Digite quantos dados desenha inserir:");
                    insert = in.nextInt();

                    while (i < insert) {
                        System.out.println("Digite o dado " + (i));
                        num = in.nextInt();
                        stack.push(num);
                        i++;
                    }
                    break;

                case 2:
                    System.out.println("Enter how much data draws to unstack:");
                    withdraw = in.nextInt();

                    while (j < withdraw) {
                        System.out.println(stack.pop());
                        j++;
                    }
                    break;

                case 3:
                    stack.Display();
                    break;

                case 4:
                    System.out.println(stack.consultTop());
                    break;

            }

        } while (option <= 5);

    }
}
