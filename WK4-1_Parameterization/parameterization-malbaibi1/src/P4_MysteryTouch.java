/*
 ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018  
*/

/*
 4. Your output prediction:
     touch your eye to your head                      //touch(ear, elbow) =>touch(eye, head)
     touch your head to your eye                      //touch(elbow, ear) => touch(head, eye)
     touch your shoulders to your elbow               //touch(head, "elbow") => touch(shoulders, elbow)
     touch your eyes and ears to your eyes and ears   //touch(eye, eye) => touch(eyes and ears, eyes and ears)
     touch your toes to your Toes                     //touch(knees, "Toes") => touch(toes, Toes)
     touch your knees to your toes                    //touch("knees", knees) => touch(knees, toes);
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
    Prediction was entirely correct.
 
 */

public class P4_MysteryTouch {

 public static void main(String[] args) {
  String head = "shoulders";
  String knees = "toes";
  String elbow = "head";
  String eye = "eyes and ears";
  String ear = "eye";
  
  touch(ear, elbow);
  touch(elbow, ear);
  touch(head, "elbow");
  touch(eye, eye);
  touch(knees, "Toes");
  touch("knees", knees);
 }
 
 public static void touch(String elbow, String ear) {
   System.out.println( "touch your " + elbow + " to your " + ear );
  }

}
