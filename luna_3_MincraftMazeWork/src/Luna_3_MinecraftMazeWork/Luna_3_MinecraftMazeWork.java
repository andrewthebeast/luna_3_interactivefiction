package Luna_3_MinecraftMazeWork;

// These will allow me to see what the user picks in the game
//some of this part will control the music and sound effects in the game.
import java.util.Scanner;

public class Luna_3_MinecraftMazeWork {

   static String picked;
   static String name;
   static int userguess;
   static int attempts;
   static int counter;
   static int lives;
   static boolean playagain;
   
   // These will use the playersname keep tract of there lives 
   //and see there choice of the path.
   
    public static void main(String[] args) {
        playagain = true;
       System.out.println("Welcome to the Minecraft maze. Pease enter your name to begin.");
       Scanner username = new Scanner(System.in);
       name = username.nextLine();
       //#hero; you are the hero
        counter = 4;
        //Scanner userlives = new Scanner(System.in);
        //lives = userlives.nextInt();
       
        //this is a while loop it tracks things throught the game
        //it can make things from a counter to a point counter
        //#while
        while (counter > 0 && playagain) {
            guess3Times();
            counter -- ;
            if(counter < 1){
                System.out.println("You have unsucessfuly tried to make it out of the maze.");
                System.out.println("R.I.P." + name + ".");
            }else{
                
            }
        }
        start();
}
    //#method1();
    static void start(){
       //this is the introduction to the game
       System.out.println("Lets get out of here " + name + ".");
       System.out.println("There is three paths do you go to the left or to the middle or turn to the right?");
       System.out.println("You will have to enter your choice twice.");
       Scanner userchoice = new Scanner(System.in); 
        picked = userchoice.nextLine();
        //this is an if statement it will match the users input and see what
       if("left".equalsIgnoreCase(picked)){
           left();
       }else if("middle".equalsIgnoreCase(picked)) {
           middle();
       }else if("right".equalsIgnoreCase(picked)) {
            right();
    }
    }
    //#method2();
    static void left(){
        Scanner userchoice = new Scanner(System.in); 
        picked = userchoice.nextLine(); 
        if("left".equalsIgnoreCase(picked)){
            System.out.println("You go left for a few feet then come up to a split path");
            System.out.println("Do you go to the left or to the right?"); 
                picked = userchoice.nextLine();
                //this picked = userchoice.nextLine(); makes the response go to an if statement which will print a response or ask another question
               if("left".equalsIgnoreCase(picked)){
                   System.out.println("You walk to the left for a few feet and out of no where a skeleton jumps out of no where.");
                   System.out.println("He shoots you with an arrow and you Die.");
                   start();
               } else if("right".equalsIgnoreCase(picked)){
                   System.out.println("You walk to the right and come up to a 3- way split path");
                   System.out.println("Do you go to the left head straight up the middle or turn right?");
                   picked = userchoice.nextLine();
                   if("left".equalsIgnoreCase(picked)){
                      System.out.println("You turn to the left and come up to another split path.");
                      System.out.println("Do you go to the left or continue walking down the middle?");
                      picked = userchoice.nextLine();
                      if("left".equalsIgnoreCase(picked)){
                          System.out.println("You walk to the left and come up to a another split.");
                          System.out.println("Which way will you go this time to the right or continue up the middle?");
                          picked = userchoice.nextLine();
                            if("right".equalsIgnoreCase(picked)){
                                System.out.println("You walk to the right and you come up to a split.");
                                System.out.println("Do you go to the left or continue up the middle?");
                                picked = userchoice.nextLine();
                                    if("left".equalsIgnoreCase(picked)){
                                        System.out.println("You walk to the left and out comes a spider.");
                                        System.out.println("You run but soon come up to a dead end. You died.");
                                        start();
                                    }else if("middle".equalsIgnoreCase(picked)){
                                        System.out.println("You walk up the middle and come up to a dead end.");
                                        System.out.println("A creeper appears next to you and explodes. You die.");
                                        start();
                                    }
                            } else if("middle".equalsIgnoreCase(picked)){
                               System.out.println("You walk for a while until you come up to a split.");
                               System.out.println("Do you go to the left or to the right?");
                               picked = userchoice.nextLine();
                                if("left".equalsIgnoreCase(picked)){
                                    System.out.println("You go to the left and soon come up to a split.");
                                    System.out.println("Do you go to the left or continue on.");
                                    picked = userchoice.nextLine();
                                    if("left".equalsIgnoreCase(picked)){
                                        System.out.println("You walk up to a dead end and a creeper jumps out and explodes.");
                                        System.out.println("You died");
                                        start();
                                    }
                                    }else if("continue".equalsIgnoreCase(picked)){
                                        System.out.println("You walk up to a dead end and a creeper jumps out and explodes.");
                                        System.out.println("You died");
                                        start();
                                    }
                                }else if("right".equalsIgnoreCase(picked)){
                                    System.out.println("Congrats You made it out of the maze!");
                                    System.out.println("Thanks for playing.");
                                    playagain = false;
                                }
                            }
                      }else if("middle".equalsIgnoreCase(picked)){
                          System.out.println("Congrats You made it out of the maze!");
                          System.out.println("Thanks for playing");
                          playagain = false;
                      }
                   }else if("middle".equalsIgnoreCase(picked)){
                       System.out.println("You continue walking until you come up to another split path.");
                       System.out.println("Do you go to the left or continue walking up the middle?");
                       picked = userchoice.nextLine();
                        if("left".equalsIgnoreCase(picked)){
                            System.out.println("You walk to the left and come up to yet another split.");
                            System.out.println("Will you go to the right or keep walking straight?");
                            picked = userchoice.nextLine();
                                if("right".equalsIgnoreCase(picked)){
                                    System.out.println("You walk to the right and out of no where a spider comes and starts to attack you.");
                                    System.out.println("You can't escape the spider. You die.");
                                    start();
                                }else if("straight".equalsIgnoreCase(picked)){
                                    System.out.println("You continue up the middle until you coe up to a dead end.");
                                    System.out.println("Suddenly a creeper comes out a explodes. You died.");
                                    start();
                                }
                        }else if("middle".equalsIgnoreCase(picked)){
                            System.out.println("You walk up the middle and soon come up to a dead end.");
                            System.out.println("Then a zombie starts to attack you. You were killed by a zombie.");
                            start();
                        }
                   }else if("right".equalsIgnoreCase(picked)){
                       System.out.println("You turn to the right and come up to a dead end");
                       System.out.println("A zombie starts to attack you, there is no way to get out.");
                       System.out.println("You die.");
                       start();
                   }
               }

    }
    //#method3();
    static void middle(){
        Scanner userchoice = new Scanner(System.in); 
        picked = userchoice.nextLine(); 
        if("middle".equalsIgnoreCase(picked)){
            System.out.println("You go to the middle then come up to a split.");
            System.out.println("Do you go to the right or continue to walk up the middle path.");
            picked = userchoice.nextLine();
                if("right".equalsIgnoreCase(picked)){
                    System.out.println("You ggo to the right then come up to a split path.");
                    System.out.println("Do you go to the left or continue up the middle?");
                    picked = userchoice.nextLine();
                        if("left".equalsIgnoreCase(picked)){
                            System.out.println("You go to the left and come up on a dead end.");
                            System.out.println("A spider jumps out of no where and attacks you.");
                            System.out.println("You died");
                            start();
                        }else if("middle".equalsIgnoreCase(picked)){
                            System.out.println("You continue down the middle until you come up to another split.");
                            System.out.println("Do you go to the left or to the right.");
                            picked = userchoice.nextLine();
                                if("left".equalsIgnoreCase(picked)){
                                   System.out.println("You go to the left and then come up to a split path");
                                   System.out.println("do you go to the left or tot the right");
                                   if("left".equalsIgnoreCase(picked)){
                                        System.out.println("You go to the left and come up to a dead end.");
                                        System.out.println("A skeleton shoots you from behind and you die.");
                                        start();
                                    }else if("right".equalsIgnoreCase(picked)){
                                        System.out.println("You go to the right and come up to a dead end.");
                                        System.out.println("A skeleton shoots you from behind and you die.");
                                        start();
                                    }

                                }else if("right".equalsIgnoreCase(picked)){
                                   System.out.println("You go to the right and come up to a dead end.");
                                   System.out.println("Then out of nowhere a zombie pops out and attacks you.");
                                   System.out.println("You died.");
                                   start();
                                }

                        }
                }else if("middle".equalsIgnoreCase(picked)){
                    System.out.println("You continue down the middle until you come up to a split path.");
                    System.out.println("Do you go right or turn to the left?");
                    picked = userchoice.nextLine();
                        if("right".equalsIgnoreCase(picked)){
                            System.out.println("You turn right and come up to a dead end.");
                            System.out.println("Suddenly a skeleton appears and shoots you. You die.");
                            start();
                        }else if("left".equalsIgnoreCase(picked)){
                            System.out.println("You go to the left and come up on another split.");
                            System.out.println("Do you go to the right or to the left?");
                            picked = userchoice.nextLine();
                                if("left".equalsIgnoreCase(picked)){
                                    System.out.println("You go to the left and come up to a dead end.");
                                    System.out.println("A zombie comes up behind you and attacks you.");
                                    System.out.println("You died.");
                                    start();
                                }else if("right".equalsIgnoreCase(picked)){
                                    System.out.println("You walk to the right and soon come up to a split path.");
                                    System.out.println("Do you go to the left or to the right?");
                                    picked = userchoice.nextLine();
                                        if("right".equalsIgnoreCase(picked)){
                                            System.out.println("You go to the right and come up to a dead end.");
                                            System.out.println("A creeper comes from behind you and explodes.");
                                            System.out.println("You died.");
                                            start();
                                        }else if("left".equalsIgnoreCase(picked)){
                                            System.out.println("Congrats You made it out of the maze!");
                                            System.out.println("Thanks for playing");
                                            playagain = false;
                                            //#win
                                            //Forthewin
                                        }
                                }
                }
        }
    }
    }
    //#method4();
    static void right(){
        Scanner userchoice = new Scanner(System.in); 
        picked = userchoice.nextLine(); 
        if("right".equalsIgnoreCase(picked)){
            System.out.println("You start out by heading to the right, after walking for a while you come up to a 3-way split.");
            System.out.println("Do you go to the left or continue up the middle or turn right?");
            if("left".equalsIgnoreCase(picked)){
                System.out.println("You go to the left and come up to a dead end, suddenly a zombie comes up from behind you and attacks you.");
                System.out.println("You died.");
                //fortheloss
                start();
            }else if("middle".equalsIgnoreCase(picked)){
                System.out.println("You walk up the middle and come up to another 3-way split.");
                System.out.println("Which way do you go left, to the middle, or to the right");
                picked = userchoice.nextLine();
                    if("left".equalsIgnoreCase(picked)){
                        //#enemyobject
                        System.out.println("You walk to the left and come up to a dead end, then a spider starts to attack you.");
                        System.out.println("You died");
                        start();
                    }else if("middle".equalsIgnoreCase(picked)){
                        System.out.println("You walk up the middle and come up to a dead end, then a zombie comes up and attacks you.");
                        System.out.println("You died");
                        start();
                        
                    }else if("right".equalsIgnoreCase(picked)) {
                        System.out.println("You walk to the left and come up on a dead end, then a creeper jumps uot and explodes.");
                        System.out.println("You died.");
                        //#lose
                        start();
                    }
            }else if("right".equalsIgnoreCase(picked)){
                System.out.println("You head right then come up to a split.");
                System.out.println("Which way do you go right or up the middle?");
                picked = userchoice.nextLine();
                    if("right".equalsIgnoreCase(picked)){
                        right2();
                    }else if("middle".equalsIgnoreCase(picked)){
                        System.out.println("You continue up the middle then come up to another split.");
                        System.out.println("Do you go to the right or to the left.");
                        picked = userchoice.nextLine();
                        if("right".equalsIgnoreCase(picked)){
                            right2();
                        }else if("left".equalsIgnoreCase(picked)){
                            System.out.println("You head left the come up to a split.");
                            System.out.println("Which way do you go left or up the middle?");
                            picked = userchoice.nextLine();
                            if("left".equalsIgnoreCase(picked)){
                                left2();
                            }else if("middle".equalsIgnoreCase(picked)){
                                System.out.println("You continue down the middle and make a turn to the right.");
                                System.out.println("Then you come up to another split.");
                                System.out.println("Do you go to the left or to the right?");
                                picked = userchoice.nextLine();
                                if("left".equalsIgnoreCase(picked)){
                                    left2();
                                }else if("right".equalsIgnoreCase(picked)){
                                    System.out.println("You head right then come up to another split.");
                                    System.out.println("Do you go right or left?");
                                    picked = userchoice.nextLine();
                                    if("right".equalsIgnoreCase(picked)){
                                        right2();
                                    }else if("left".equalsIgnoreCase(picked)){
                                        System.out.println("You head left and come up to a right turn.");
                                        System.out.println("Congrats You made it out of the maze!");
                                        System.out.println("Thanks for playing");
                                        playagain = false;
                                    }
                                }
                            }
                        }
                            
                    }
        }
        }
    }    
//#method5();    
    static void right2(){
        System.out.println("You go to the right and then come up to a dead end, then a skeleton jumps out and shoots you.");
        System.out.println("You died.");
        start();
    }
    //#method6();
    //this is a method it can print out something 
    static void left2(){
        System.out.println("You head left and come up to a dead end, then a spider jumps out and attacks you.");
        System.out.println("You died");
        start();
    }
    static void guess3Times(){
        if(playagain = false){
        counter -- ;
        }
        Scanner userlives = new Scanner(System.in);
        lives = userlives.nextInt();
        //if( counter == userlives){
            
            
        }
        
    }
}
