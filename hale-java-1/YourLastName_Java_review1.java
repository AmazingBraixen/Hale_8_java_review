import java.util.Arrays;



public class YourLastName_Java_review1 {
  //I suspect you don't read these comments. I type them so that you'll read them.

   public static void main(String[] args) {

          //look and consider how it's different than our prior examples
          Hedgehog sonic = new Hedgehog(0, 0, 100);  //what are the numbers doing?

          //Now we'll create an array

          char [] landscape = new char[10];
          //this is a char array. It is a lot of characters - e.g. letters, punctuation, etc.

          //Now let's iterate through a for loop to move sonic

          for (int i = 0; i < 10; i++){

            //Set all the array values to '.';
            Arrays.fill(landscape, '.');

            //set sonic's location -- notice we're only using x
            landscape[sonic.getX()] = sonic.getSymbol();

            System.out.println(Arrays.toString(landscape));
            //draw the array

            sonic.moveX();
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
// Hedgehog ends here


//Now:
/*
1. Add another class e.g. Fox
2. Create an abject from class Fox using a class constructor i.e. passing values as with the hedgehog example presented here.
3. Set the fox's symbol different.
4. Move the fox behind the hedgehog
5. Once you finish - be sure to submit -

****IF you believe you are done - begin work on a 2D array i.e. char [] [] landscape = new char[10][10];
Then move the characters through x and y



*/

//ONCE YOU HAVE DONE THIS REMOVE THE INSTRUCTIONS!!!! Be sure to git add, git commit, git push!!!