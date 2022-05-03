/*
Program: statsp2.java          Last Date of this Revision: March 5 , 2022




Purpose:Modify the Stats application to allow the user to enter the names and grades of the students. The user should
be prompted for the name of the file to create and for the number of student grades that will be entered.
After the data has been entered and the written to a file, the file should be read and the lowest, highest, and
average score displayed

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

package Stats;

import java.util.Scanner;

import java.io.*;

import java.lang.*;



public class Statsp2 {
	
	public static void main(String[] args) {
        // TODO code application logic here

        //Writing To A File.
        File dataFile;
        FileWriter out;
        BufferedWriter writeFile;
        Scanner sc = new Scanner(System.in);
        
        //made string for name and gardes
        String fileName;
        String studentName;
        String studentGrade;
       
        int numberOfGrades;
        
        //promote user to make a file name 
        System.out.print("Enter File Name : ");
       
        fileName = sc.nextLine();
        dataFile = new File(fileName);
         
        //asks the user to the total number of students 
        System.out.print("Enter The Number Of Students Grades That Will Be Entered : ");
        numberOfGrades = Integer.parseInt(sc.nextLine());
       
        //read file
        try {
            out = new FileWriter(dataFile, true);
            writeFile = new BufferedWriter(out);

            for (int j = 0; j < numberOfGrades; j++) {
                System.out.print("Enter Student Name : ");
                studentName = sc.nextLine();
                System.out.print("Enter Test Scores : ");
                studentGrade = sc.nextLine();
                writeFile.write(studentName);
                writeFile.newLine();
                writeFile.write(studentGrade);
                writeFile.newLine();
            }
            //check the file for errors
            writeFile.close();
            out.close();
            System.out.println("Data Written to a file.");
            System.out.println("");
        } catch (IOException e) {
	            System.out.println("Problem Writing To file.");
	            System.out.println("iOException : " + e.getMessage());
        }

        //Reading From A File
        FileReader in;
        BufferedReader readFile;
        String name;
        String score;
        double score2;
        double minScore = 100, maxScore = 0;
        double avgScore;
        double totalScores = 0;
        int numScores = 0;

        try {

            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            while ((name = readFile.readLine()) != null) {
              
            	score = readFile.readLine();
                score2 = Double.parseDouble(score);
               
                System.out.println(name + " " + score);
                totalScores += score2;
                numScores += 1;
               
                // calculate the highest and lowest score 
                if (minScore > score2) {
                    minScore = score2;
                }

                if (maxScore < score2) {
                    maxScore = score2;
                }

            }
            // Display average ,lowest and highest score to the user 
            avgScore = totalScores / numScores;

            System.out.println("Lowest score = " + minScore);

            System.out.println("Highest score = " + maxScore);

            System.out.println("Average = " + avgScore);

            readFile.close();

            in.close();
           
            
            // show errors if file is not found 
        } catch (FileNotFoundException e) {

            System.out.println("File does not exist or could not be found.");

            System.err.println("FileNotFoundException: " + e.getMessage());
        
            //problem reading files form the user 
        } catch (IOException e) {

            System.out.println("Problem reading file.");

            System.err.println("IOException: " + e.getMessage());

        }
    }

}

/* Screen Dump
Enter File Name : data5
Enter The Number Of Students Grades That Will Be Entered : 2
Enter Student Name : Jerry
Enter Test Scores : 79
Enter Student Name : tom
Enter Test Scores : 89
Data Written to a file.

Jerry 79
tom 89
Lowest score = 79.0
Highest score = 89.0
Average = 84.0



 */
