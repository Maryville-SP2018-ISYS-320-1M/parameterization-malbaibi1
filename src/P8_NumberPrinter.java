/*
 ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018  
*/

public class P8_NumberPrinter {

 public static void main(String[] args) {
  printNumbers(5);
  System.out.println();
  printStepRange(5,2);
  System.out.println();
 }
 
 public static void printNumbers(int num) {
   for (int i=1; i<=num; i++)
   System.out.print("[" + i + "] " );
  }
  public static void printStepRange(int num1,int num2) {
   int i=1;
   while (i<=num1){
   System.out.print("[" + i + "] " );
   i=i+num2;
   }
  }

}
