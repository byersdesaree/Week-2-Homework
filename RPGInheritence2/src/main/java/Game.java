import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game extends Warrior{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Farmer f1 = new Farmer("Bob", 75, 100, 75, 10, 1);

        System.out.println(f1.getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Hi" + " " + f1.getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Are you ready to play?");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Run after the chicken" + " " + f1.getName() + "!!!!");
        } else {
            System.out.println("Game over");
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }

        System.out.println("Oh no!" + " " + f1.getName() + " " + "You fell!");
        f1.decreaseHealth();
        System.out.println("Current health:" + " " + f1.getHealth());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("You should workout more to catch the chicken.");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Enter 'w' to workout");


        if (scanner.nextLine().equalsIgnoreCase("w")) {
            f1.increaseStamina();
            System.out.println("Current Stamina:"+" "+f1.getStamina());
        } else f1.decreaseStamina();
        System.out.println("Game Over");

        Constable c1 = new Constable("Joe", 60, 100, 60, 20, 5, false);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }

        System.out.println(c1.getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Hi" + " " + c1.getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Are you ready to play?");

        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Arrest the robber" + " " + c1.getName() + "!!!!");
        } else {
            System.out.println("Game over");
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }

        System.out.println("Oh no!" + " " + c1.getName() + " " + "The robber hit you with his car!");
        c1.decreaseHealth();
        System.out.println("Current health:" + " " + c1.getHealth());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("You should workout more to catch the robber.");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Enter 'w' to workout");


        if (scanner.nextLine().equalsIgnoreCase("w")) {
            c1.increaseStamina();
            System.out.println("Current Stamina:"+" " +c1.getStamina());
        } else {
            c1.decreaseStamina();
            System.out.println("Game Over");

        }




        Warrior w1 = new Warrior("Sue", 75, 100, 100, 50, 10, 100);



        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
        System.out.println(w1.getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Hi" + " " + w1.getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Are you ready to play?");

        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Your enemy awaits you" + " " + w1.getName() + "!!!!");
        } else {
            System.out.println("Game over");
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }

        System.out.println("Oh no!" + " " + w1.getName() + " " + "You were grazed with your enemy's sword");
        w1.decreaseHealth();
        System.out.println("Current health:" + " " + w1.getHealth());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("You should workout more to defeat your enemy.");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Enter 'w' to workout");


        if (scanner.nextLine().equalsIgnoreCase("w")) {
            w1.increaseStamina();
            System.out.println("Current Stamina:"+" "+w1.getStamina());
        } else w1.decreaseStamina();
        System.out.println("Game Over");

    }
}
