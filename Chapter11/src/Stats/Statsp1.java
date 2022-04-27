package Stats;


import java.util.Scanner;

import java.io.*;



public class Statsp1 {

	

  public static void main(String[] args) {

  	

    File dataFile = new File("C:\\Users\\1100023209\\Documents\\test2.dat");

    FileReader in;

    BufferedReader readFile;

    String data,name;  

    String score;  

    double score2;  

    double minScore = 100, maxScore = 0;  

    double avgScore;

    double totalScores = 0;

    int numScores = 0;

     

    try {

      in = new FileReader(dataFile);

      readFile = new BufferedReader(in);

      while ((name = readFile.readLine()) != null ) { 

          

        score = readFile.readLine();  

        score2 = Double.parseDouble(score); 

        System.out.println(name + " " + score);   

        totalScores += score2;  

        numScores += 1;     

        if(minScore > score2)   

          minScore = score2;

        if(maxScore < score2)  

          maxScore = score2;

      }

      avgScore = totalScores / numScores;       

      System.out.println("Lowest score = " + minScore);

      System.out.println("Highest score = " + maxScore);

      System.out.println("Average = " + avgScore);

      readFile.close();

      in.close();

    }

     

    catch (FileNotFoundException e) {

      System.out.println("File does not exist or could not be found.");

      System.err.println("FileNotFoundException: " + e.getMessage());

    }

     

    catch (IOException e) {

      System.out.println("Problem reading file.");

      System.err.println("IOException: " + e.getMessage());

    }

     

  }

   

}
/* Screen Dump
Tom 89
Jerry 77
kabir 98
Harjot 79
Jaskaran 68
Lowest score = 68.0
Highest score = 98.0
Average = 82.2


 */