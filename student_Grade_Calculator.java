import java.sql.Array;
import java.util.Scanner;
public class student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Number Of Subjects");
        int sub = scanner.nextInt();
        String [] subjects = new String[sub];
        for (int i=0;i<subjects.length;i++){
            System.out.println("Enter The Name of Subject");
            String sb = scanner.next();
            subjects[i] = sb;
        }
            int t_marks = 0;

        for (String val:subjects) {
            System.out.println("Make Sure To Enter The Marks Out Of 100 ");
            System.out.println("Please Enter The Marks Of the" + " "+ val);
            double marks = scanner.nextDouble();
            t_marks+=marks;

        }
       double avg_per = (t_marks/(sub * 100.0)) * 100.0;
        if (avg_per> 80.0){
            System.out.println("You have Gain A+ Grade! CONGRATULATIONS");
            System.out.println("Your Total Marks are " + " " + t_marks);
        } else if (avg_per>70.0) {
            System.out.println("You have Gain A Grade! CONGRATULATIONS");
            System.out.println("Your Total Marks are " + " " + t_marks);

        } else if (avg_per>60.0) {
            System.out.println("You have Gain B+ Grade! CONGRATULATIONS");
            System.out.println("Your Total Marks are " + " " + t_marks);

        } else if (avg_per>50.0) {
            System.out.println("You have Gain B Grade! CONGRATULATIONS");
            System.out.println("Your Total Marks are " + " " + t_marks);

        } else if (avg_per>40.0) {
            System.out.println("You have Gain C Grade! CONGRATULATIONS");
            System.out.println("Your Total Marks are " + " " + t_marks);

        } else if (avg_per>30.0) {
            System.out.println("You have Gain D Grade! CONGRATULATIONS");
            System.out.println("Your Total Marks are " + " " + t_marks);

        } else if (avg_per>20.0) {
            System.out.println("You have Gain F Grade! OOPS");
            System.out.println("Your Total Marks are " + " " + t_marks);

        }
    }
}
