import java.util.Scanner;

/**
 * @author Brandon Ramos
 * Date Started 2/6/2019
 * Date Completed -/-/2019
 * Homework 1 TicTacToe
 * Teacher Sherri Harms
 * Resources: Learning Commons Tutor: Alex S.
 *
 * Algorithm:
 *
 *
 * 1.) The keyword that is used to create an object variable in memory is C. new
 * 2.) An object is a(n) A. Blueprint
 * 3.) This method that return the value of a class's field is A. accessor
 * 4.) When the value of an item is dependent on other data, and that item is not updated when the other
 * data is changed, what has the value become? C. asynchronous
 * 5.) To prevent other calsses from accessing a class's field at all, which of the following access
 * specifier should be used? A. Private
 * 6.) If you provide any constructor for a class, Java compiler will no olonger provide the default no-arg
 * contructor. Is this statement true or false? B.False
 * 7.) The demo method in the class Demo are an example of overloading. Is this statemetn correct? A. True
 * 8.) A static method cannot access instance fields of a class. Is this statement true or false? B. False
 * 9.) The output will be: E. error
 * 10.) Each object of a class has its own set of fields is A.True
 * 11.) When an object is passed as an argument to a method, this is actually passed B. a reference to the object
 * 12.) Assume that h1 is an object that reference the House class, as defined in our CSIT 150 class, the
 * statemetn to create the h1 object is C. House h1 = new House();
 * 13.private int x;
 *     private double y;
 *     public void setValues(int a, double b){
 *         x=a;
 *         y=b;
 *     }
 *     public int getA(){return x;}
 *     public double getB(){return y;}
 *     public int setA(int x){this.x = x; return x;}
 *     public double setB(double y){this.y = y; return y;}
 */

public class TicTacToeGameDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player playerX = new Player('X',0);
        Player playerO = new Player('O',0);

        //have the player choose if they want to face a computer or another player
        System.out.print("Hello, this is TicTacToe\n" +
                "How many players are there? (1 or 2):");
        int playerCountChoice = scan.nextInt();
        //for bonus, have the user be X and the computer be 0
        //Otherwise have the game alternate players

        //What i am thinking is to do a if statemetn that will determine if the
        //user is playing against a ocmputer or another human.
        try {
            switch(playerCountChoice){
                case 1:
                    System.out.println("Switch 1");
            }
        }catch(Exception e){
            System.out.println("Please enter either 1 or 2");
        }



//        boolean programOver = false;
//        boolean gameWon = false;
//        while(!programOver)//allow the user to play multiple games else exit game
//        {
//            while(!gameWon)//wait til yo find a winner //Switch players around
//            {
//                System.out.println("");
//
//            }
//
//        }
//
//
//        //To decide whos turn it is
//        if(player)

    }
}
