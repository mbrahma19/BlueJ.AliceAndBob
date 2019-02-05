/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Hello! What is your name?");
        
        String username = userInput.nextLine();
        
        if (username.equals("Alice") || username.equals("Bob")){
            System.out.println("Great to see you " + username + "!");
        }
        else{
            System.out.println("I am not looking for you");
        }

    }
}