import java.io.*;
import java.io.FileReader;

public class Higgins{
    public static void main(String[] args){
		// File path is passed as parameter
		File file = new File("file1.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while (st = br.readLine() != null){System.out.println(st);}
	}
    }
