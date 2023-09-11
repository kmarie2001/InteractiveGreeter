package InteractiveGreeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userIntro = new Scanner (System.in);

        System.out.println("What's your name?"); // line 8 & 9 prompt and retrieve user's name
            String name = userIntro.nextLine();
        System.out.println("Where are you from?"); // line 10 & 11 prompt and retrieve where user is from
            String homeTown = userIntro.nextLine();
        System.out.println("How old are you? (Enter answer in years)"); // line 12 & 13 prompt and retrieve user's age
            String age = userIntro.nextLine();

        // line 16 & 17 compiles gathered information and generates a welcome greeting for the user
        System.out.println("Hello and welcome " + name + "! You said you're from " + homeTown +
                "? That's super cool. And now you're " + age + ". Wild stuff bro." );

        // line 20 & 21 prompts and retrieves an activity the user enjoys
        System.out.println("What would you rather be doing right now?");
            String activity = userIntro.nextLine();

        // line 24 & 25 responds to user's chosen activity
        System.out.println("You like " + activity + "? That sounds super fun! Personally, I'd rather be " +
                "stuffing my face with food and taking a nap right now.");

        // line 28 & 29 prompts and retrieves user's donation decision
        System.out.println("How much would you like to donate today?");
            String donation = userIntro.nextLine();

        // line 32 confirms donation and thanks user
        System.out.println("$" + donation + "? Thanks so much!");

        }
    }