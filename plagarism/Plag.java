import java.util.Scanner;
import java.io.*;

public class Plag
{
    public static void main(String[] args) 
    {
        System.out.println("Comparing ......");
        System.out.print("The result is ");
        String stringOne = "abcd abcd abbab";
        String stringTwo = "erdtfgyhjuasyu asdasdfgfd abbab";
        if(compareStrings(stringOne,stringTwo))
        {
            System.out.print("Plagiarism detected. !!!!");
        }
        else
        {
            System.out.print("No plagiarism detected");
        }
    }

   
    public static boolean compareStrings(String a,String b)
    {
        boolean checkForPlagiarism = false;
        
        String[] piecesA = a.split("\\s");
        String[] piecesB = b.split("\\s");
        
        int count1 = 0;
        int count2 = 0;
        
        for (int counter = 0; counter <= piecesA.length - 1; counter++)
        {
            for(int counter2 = 0; counter2<= piecesB.length - 1; counter2++)
            {
                if(piecesA[counter].equals(piecesB[counter2]))
                {
                    count1++;
                }
            }
        }
            
        for(int counter=0;counter<=piecesA.length-1;counter++)
        {
            for(int counter2 = 0; counter2 < piecesB.length; counter2++)
            {
                if(piecesA[counter].equals(piecesB[counter2]))
                {
                    count2++;
                }
            }
        }
        if((count1/(int)piecesA.length)*100>=65 && (count2/(int)piecesB.length)*100>=65)
        {
            checkForPlagiarism=true;
        }    
        return checkForPlagiarism;
    }
}