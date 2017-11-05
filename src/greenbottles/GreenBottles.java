package greenbottles;

/**
 * @author Imran Aziz 17:50 10/10/17
 */

import java.util.*;

public class GreenBottles {
    
    public static void main (String[] args) {
            
            int beerNum=0; //declares and initialises the all important BeerNum
            System.out.println("How many bottles of beer?");
            Scanner howmany = new Scanner(System.in); //takes input to assign beerNum variable
            try{ //blocks answers that aren't integers
                    beerNum = Integer.parseInt(howmany.nextLine());
            }
            catch(IllegalArgumentException ex) {
                System.out.println("Nope, use a number, and a sensible one at that"
                        + "; nobody likes this song anyway.");
            }
            
            
            String word = "bottles";
  
        while (beerNum > 0) { //while loop provided beerNum isn't 0
 
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
                beerNum = beerNum - 1;
                         
            if (beerNum == 1) { 
                word = "bottle";  // singular, as in ONE bottle.
            }                        
  
            if (beerNum > 0) { //keeps the song going as long as beerNum is more than 0
                System.out.println(beerNum + " " + word + " of beer on the wall");
        
            }    
        } // end while loop
        System.out.println("No more bottles of beer on the wall"); //finally this stupid song can end
    }  // end main method
}  // end class
