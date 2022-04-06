import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
public class Higgins{
	public void full_arr(ArrayList<String> arr1, ArrayList<String> arr2){
		System.out.println('Yo');
	}

    public static void main(String[] args){
	ArrayList<String> arr1= new ArrayList<String>();
	ArrayList<String> arr2= new ArrayList<String>();
    try {
      File myObj = new File("file1.txt");
      Scanner myReader = new Scanner(myObj);
	  while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        arr1.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	
    try {
      File myObj2 = new File("file2.txt");
      Scanner myReader2 = new Scanner(myObj2);
	  while (myReader2.hasNextLine()) {
        String data = myReader2.nextLine();
        arr2.add(data);
      }
      myReader2.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

	//Print here!
	System.out.println(arr1);
	System.out.println(arr2);
}
}
