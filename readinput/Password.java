//Asks for a password without it showing up on the command line

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

public class Password{
    public static void main(String args[]){
        Console c = System.console();
        if(c == null){
            System.err.println("No console");
            System.exit(1);
        }
        String login = c.readLine("Enter a login: ");
        char[] password = c.readPassword("Enter you password");
        String passwordToString = new String(passwords);
        System.out.println(login + "\n" + passwordToString);
    }

}
