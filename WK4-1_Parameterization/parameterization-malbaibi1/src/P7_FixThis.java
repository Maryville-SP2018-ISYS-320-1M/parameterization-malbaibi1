/*
 ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018  
*/

/*
 7. After you fixed the error, why is this an error? Note: do not just repeat Eclipse's error message,
 why did Eclipse have that error message?
 
 The Eclipse does not have any error message. Progrom give the required output. It works well.
 
 
 
 */

public class P7_FixThis {

 public static void main(String[] args) {
  for( int line = 0; line < 10; line++ ) {
   int starsToWrite = line % 5 + 1 ;
   writeChar( '*', starsToWrite );
   System.out.println();
  }

 }
 
 public static void writeChar( char characterToPrint, int numOfTimesToPrint  ) {
  for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numOfTimesToPrint; numOfTimesPrinted++ ) {
   System.out.print( characterToPrint );
  }
 }
}
