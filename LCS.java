import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.ArrayList;

public class LCS
{
    public int max( int a, int b )
    {
        if( a > b || a == b)
            return a;
        else
            return b;
    }

    public String[] longestSubsequence( ArrayList<String> a1, ArrayList<String> a2, int x, int y )
    {
        int doubleArray[][] = new int[x+1][y+1];

        ArrayList<String> lcsArray = new ArrayList<String>();

        for( int i = 0; i <= x; i++ )
        {
            for( int j = 0; j <= y; j++ )
            {
                if( i == 0 || j == 0 )
                    doubleArray[i][j] = 0;
                else if( a1.get(i-1).equals( a2.get(j-1) ) )
                {
                    doubleArray[i][j] = doubleArray[i-1][j-1] + 1;
                }
                else
                    doubleArray[i][j] = max( doubleArray[i-1][j], doubleArray[i][j-1] );
            }
        }

        int index = doubleArray[x][y];
        int temp = index;

        String resultArray[] = new String[index+1];

        int a = x;
        int b = y;

        while( a > 0 && b > 0 && index > 0 )
        {
            if( a1.get(a-1).equals(a2.get(b-1)) )
            {
                resultArray[index-1] = a1.get(a-1);
                a--;
                b--;
                index--;
            }

            else if( doubleArray[a-1][b] > doubleArray[a][b-1] )
                a--;
            else
                b--;
        }

        return resultArray;
    }
}

