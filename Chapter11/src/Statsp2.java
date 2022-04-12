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
        String fileName;
        String studentName;
        String studentGrade;
        int numberOfGrades;
        System.out.print("Enter File Name : ");
        fileName = sc.nextLine();
        dataFile = new File(fileName);
        System.out.print("Enter The Number Of Students Grades That Will Be Entered : ");
        numberOfGrades = Integer.parseInt(sc.nextLine());

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
                if (minScore > score2) {
                    minScore = score2;
                }

                if (maxScore < score2) {
                    maxScore = score2;
                }

            }

            avgScore = totalScores / numScores;

            System.out.println("Lowest score = " + minScore);

            System.out.println("Highest score = " + maxScore);

            System.out.println("Average = " + avgScore);

            readFile.close();

            in.close();

        } catch (FileNotFoundException e) {

            System.out.println("File does not exist or could not be found.");

            System.err.println("FileNotFoundException: " + e.getMessage());

        } catch (IOException e) {

            System.out.println("Problem reading file.");

            System.err.println("IOException: " + e.getMessage());

        }
    }

}


