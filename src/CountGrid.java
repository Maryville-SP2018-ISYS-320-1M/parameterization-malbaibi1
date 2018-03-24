/*
 ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018  
*/

public class CountGrid {

 public static void main(String[] args) {
  printGrid(4,6);
 }
 
  public static void printGrid(int num1,int num2) {
   for (int i=1; i<=num1; i++){
     int num=i;
     for (int j=1; j<=num2; j++){
     System.out.print( num + " " );
     num=num+4;
     }
     System.out.println();
   }
  }

}
