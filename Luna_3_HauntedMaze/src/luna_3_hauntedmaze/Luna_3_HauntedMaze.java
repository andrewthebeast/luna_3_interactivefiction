package luna_3_hauntedmaze;

import java.util.Scanner;

public class Luna_3_HauntedMaze {

    static String username;
    static boolean playagain;
    static String userpath;
    static int l;
    static int m;
    static int r;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Haunted Corn Maze!");
        System.out.println("Please enter your name to begin (fyi: use lowercase letters only!)");
        Scanner userinputname = new Scanner(System.in);
        username = userinputname.nextLine();
        System.out.println("Hello " + username + " let's start in the middle of the maze");
        System.out.println("There is three ways to get out of here which one do you pick? Left(l), Middle(m), or up the Right(r)");
        
        left();
        middle();
        right();
        
    }
    static void left(){
        Scanner userchoice = new Scanner(System.in);
        userpath = userchoice.nextLine();
        if("l".equals(userpath)){
            System.out.println("You walk for 20 meters and the path splits in half do you go left(l) or right(r)");
            if("l".equals(userpath)){
                System.out.println("You notice that someone is following you you look back and its a creeper!");
                System.out.println("You take off running and turn right you keep running and end up comming to a dead end");
                System.out.println("The creeper explodes You did not make it out alive Sorry You died!");
                playagain = false;
            }else if("r".equals(userpath)){
                System.out.println("You notice that someone is following you, you look back and its a creeper!");
                System.out.println("You take off running and come up on a left turn that splits into three paths");
                System.out.println("Do you go to the left(l) or up the middle(m) or right(r)?");
                
        }
        }
    }
    static void middle(){
        
    }
    static void right(){
        
    }
}
