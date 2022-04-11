import java.io.*;
 public class Statsp1 {
 public static void main(String[] args) {
 File dataFile = new File("C:\\Users\\1100023209\\Documents\\scores.dat");
 FileReader in;
 BufferedReader readFile;
 String score;
 double avgScore;
 double totalScores = 0;
 int numScores = 0;

 try {
 in = new FileReader(dataFile);
 readFile = new BufferedReader(in);
 while ((score = readFile.readLine()) != null ) {
 numScores += 1;
 System.out.println(score);
 totalScores += Double.parseDouble(score);
 }
 avgScore = totalScores / numScores;
 System.out.println("Average = " + avgScore);
 readFile.close();
 in.close();
 } catch (FileNotFoundException e) {
 System.out.println("File does not exist or couldnot be found.");
 System.err.println("FileNotFoundException: "
 + e.getMessage());
 } catch (IOException e) {
 System.out.println("Problem reading file.");
 System.err.println("IOException: " + e.getMessage());
 }
 }
 }