
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int entranceScore;
        double gpa;
        int passingEntranceScore = 70;
        double passingGpa = 3.0;
        
        System.out.println("Entrance Score: ");
        entranceScore = scn.nextInt();
        
        System.out.println("GPA: ");
        gpa = scn.nextDouble();
              
        if(entranceScore > passingEntranceScore){
            System.out.println("\nYou passed the entrance exam since your score of " + entranceScore + 
            " is more than the passing which is " + passingEntranceScore +".");
            if (gpa > passingGpa) {

                System.out.println("\nYou are now eligible for your examination since your GPA of " + gpa +
                " is more than the passing GPA which is " + passingGpa + " GPA.");
            }
            else {
            System.out.println("\nI'm sorry, you might have passed the Entrance exam, but your GPA is less than " + passingGpa +
            " GPA hence you are not eligable for admission.");
            }
            
        }
        else {
            System.out.println("\nI'm sorry, you might have a high GPA, but your Entrance Exam score is less than " + passingEntranceScore +
            " hence you are not eligable for admission.");
        }

        
        
    }
    
}
