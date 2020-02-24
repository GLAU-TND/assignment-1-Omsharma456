package Execution;

import Client.Client;
import Definition.LinkedListDefinitionClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListDefinitionClass<Client> listContact = new LinkedListDefinitionClass<Client>();
        Scanner sc = new Scanner(System.in);
        boolean turnoff = false;
        int a = 0;
        System.out.println("Welcome to Abhi Contact list \uD83D\uDE01:");
        while (!turnoff) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
        }
        int ch = sc.nextInt();
        switch (ch) {

        }
    }
}
