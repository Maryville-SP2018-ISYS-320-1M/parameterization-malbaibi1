/*
 ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018 
*/

/*
 1. Your output prediction:
     15 42                // sentence(x,42) => sentence(15,42)
     15 25                // sentence(x,x+y)=> sentence(15,15+10) => sentence(15,25)
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
    Prediction was eaxctly correct.
 
 */

public class P1_MysteryNums {

 public static void main(String[] args) {
  int x = 15;
  sentence(x,42);
  
  int y = x - 5;
  sentence(x,x+y);
 }
 
 public static void sentence(int num1, int num2) {
   System.out.println( num1 + " " + num2 );
  }
  
  
}
