import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester
{
    public static void main( String [] args ) throws IOException
    {
	ArrayList<String> arrlistOne = new ArrayList<String>();
	ArrayList<String> arrlistTwo = new ArrayList<String>();
	int countOne = 0;
	int countTwo = 0;

	System.out.println( "Please enter the first filename: " );
	Scanner scan = new Scanner( System.in );
	String input = scan.nextLine();
	try
	{
		File file = new File( input );
		Scanner fileOne = new Scanner( file );
		while( fileOne.hasNextLine() )
		{
			String line = fileOne.nextLine();
			arrlistOne.add( line );
			countOne++;
		}
		fileOne.close();
	}
	catch( FileNotFoundException e )
	{
		System.out.println( "File not found" );
	}

	System.out.println( "Please enter the second filename: " );
	Scanner scanTwo = new Scanner( System.in );
	String inputTwo = scanTwo.nextLine();
	try
	{
		File file2 = new File( inputTwo );
		Scanner fileTwo = new Scanner( file2 );
		while( fileTwo.hasNextLine() )
		{
			String lineTwo = fileTwo.nextLine();
			arrlistTwo.add( lineTwo );
			countTwo++;
		}
		fileTwo.close();
	}
	catch( FileNotFoundException e )
	{
		System.out.println( "File not found" );
	}


        LCS lcs = new LCS( );
        String[] results = lcs.longestSubsequence( arrlistOne, arrlistTwo, countOne, countTwo );
      
	System.out.println( "# of common lines: " + (results.length - 1) );

	System.out.println( " " );

	System.out.println( "The common lines are " );
	System.out.print( "[" );
	for( int i = 0; i < results.length - 1; i++ )
	{
		System.out.print( results[i] );
		if( i != (results.length - 2) )
			System.out.print( ", " );
	}
	System.out.print( "]" );

	System.out.println( " " );
	System.out.println( " " );

	System.out.print( "Feedback for first file " );
	System.out.print( "[" );

	int count = 0;
	for( int i = 0; i < arrlistOne.size(); i++ )
	{
		System.out.print( arrlistOne.get(i) );
		if( i != (arrlistOne.size() - 1 ) )
				System.out.print( ", " );
	}
	System.out.print( "] is: " );
	System.out.println( " " );

	int number = 0;
	for( int i = 0; i < arrlistOne.size(); i++ )
	{
		if( arrlistOne.get(i).equals( results[number] ) )
		{
			System.out.println( arrlistOne.get(i) + " is in both files" );
			number++;
		}
		else
			System.out.println( arrlistOne.get(i) + " is only in this file" );
	}

	System.out.println( " " );
	System.out.println( " " );

	System.out.print( "Feedback for second file " );
	System.out.print( "[" );

	int secondCount = 0;
	for( int i = 0; i < arrlistTwo.size(); i++ )
	{
		System.out.print( arrlistTwo.get(i) );
		if( i != (arrlistTwo.size() - 1 ) )
			System.out.print( ", " );
	}
	System.out.print( "] is: " );
	System.out.println( " " );

	int numberTwo = 0;
	for( int i = 0; i < arrlistTwo.size(); i++ )
	{
		if( arrlistTwo.get(i).equals( results[numberTwo] ) )
		{
			System.out.println( arrlistTwo.get(i) + " is in both files" );
			numberTwo++;
		}
		else
			System.out.println( arrlistTwo.get(i) + " is only in this file" );
	}
	
	System.out.println( " " );

    }
}

