/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hale_8_java_review_1;
import java.util.Arrays;
/**
 *
 * @author xfennekinx
 */
public class Hale_8_Java_review_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //look and consider how it's different than our prior examples
          Hedgehog sonic = new Hedgehog(0, 0, 100);  //what are the numbers doing?

          //Now we'll create an array
          Fox tails = new Fox(0,0,100);
          char [] landscape = new char[10];
          //this is a char array. It is a lot of characters - e.g. letters, punctuation, etc.

          //Now let's iterate through a for loop to move sonic

          for (int i = 0; i < 10; i++){

            //Set all the array values to '.';
            Arrays.fill(landscape, '.');

            //set sonic's location -- notice we're only using x
            landscape[sonic.getX()] = sonic.getSymbol();
            
            landscape[tails.getX()] = tails.getSymbol();
            
            System.out.println(Arrays.toString(landscape));
            //draw the array

            sonic.moveX();
            
            tails.moveX();
            //move the hedgehog
          }


   }
}

//Hedgehog begins here
class Hedgehog{
  char symbol = '@';    // NOTICE chars use single quotes
  int x;
  int y;
  int health;

  //Now we'll add a class constructor
  public Hedgehog(int a, int b, int h ){
    x = a;
    y = b;
    health= h;
  }
//We use the class constructor to create a hedgehog and set values at the same time.
  //some getters and setters

  //It's void because you aren't returning anything!
  void setX(int a){
    this.x= a;
  }
  void setY(int a){
    this.y= a;
  }
  void moveX(){
    this.x += 1;
    //we set the value of x to it's current value plus 1
  }
  char getSymbol(){
    return this.symbol;
  }
  int getX(){
    return this.x;
  }
}
  class Fox{
  char symbol = '$';    // NOTICE chars use single quotes
  int x;
  int y;
  int health;

  //Now we'll add a class constructor
  public Fox(int c, int d, int h ){
    x = c;
    y = d;
    health= h;
  }
//We use the class constructor to create a hedgehog and set values at the same time.
  //some getters and setters

  //It's void because you aren't returning anything!
  void setX(int c){
    this.x= c;
  }
  void setY(int c){
    this.y= c;
  }
  void moveX(){
    this.x += 1;
    //we set the value of x to it's current value plus 1
  }
  char getSymbol(){
    return this.symbol;
  }
  int getX(){
    return this.x;
  }
  
  }
  