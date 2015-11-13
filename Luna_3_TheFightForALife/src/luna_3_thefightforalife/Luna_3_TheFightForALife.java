
package luna_3_thefightforalife;

import java.util.Scanner;
import java.util.Random;

public class Luna_3_TheFightForALife {
    
    static String userchoice;
    static int gamestart;
    static int userinput;
    static int A;
    static int B;
    static String username;
    static Random randy = new Random();
    static boolean goon;
    static int pointcounter;
    
    public static void main(String[] args) {
        goon = true;
        System.out.println("Insert yourname to play");
        Scanner userinputname = new Scanner(System.in);
        username = userinputname.nextLine();
        System.out.println("Hello " + username + " Let's go to a new world!");
        System.out.println("Teleporting........");
        System.out.println("You wake up and you walk out into a mess called modern-day america.");
        System.out.println("You are scared and dont have an idea of what is going on.");
        System.out.println("You try asking the people around you but no one replys.");
        System.out.println("You hear someone calling you over, a complete stranger What do you do? Do you follow the guy(A) or keep walking(B)?");
        
        path1();
}
    
    static void path1(){
        Scanner userchoice= new Scanner(System.in);
        userinput = userchoice.nextInt();
        if(userinput == A ) {
            System.out.println("You follow the stranger into an ally and he leads you to the back of a bar.");
            System.out.println("He leads you down stairs and he opens a door leading you into a little room.");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
    }
    }
 
}
