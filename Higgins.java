// Feedback for 1st file
// [Spring 2022, Hi, Spring 2022, After Spring break, Masks 
// are optional, Starting March 18, 2022, Until the end of, 
// May] is:
// Spring 2022 is only in this file
// Hi is in both files
// Spring 2022 is in both files
// After Spring break is in both files
// Masks are optional is in both files
// Starting March 18, 2022 is only in this file
// Until the end of is only in this file
// May was in both files
// Feedback for 2nd file
// [Hi, This is, Spring 2022, Maybe, After Spring break, Masks 
// are optional, Up To, May, Until the end of the semester, 
// Then it is summer?] is:
// Hi is in both files
// This is is only in this file
// Spring 2022 is in both files
// Maybe is only in this file
// After Spring break is in both files
// Masks are optional is in both files
// Up To is only in this file
// May is in both files
// Until the end of the semester is only in this file
// Then it is summer? is only in this file
import java.io.*;


public class Higgins{
    public static void main(String[] args){
        System.out.println("# of common lines:");
        System.out.println("The common lines are"); 
        FileReader f1 = new FileReader("file1.txt");
        File f2 = new File("file2.txt");
        BufferedReader br = new BufferedReader(f1);
        
    }
}