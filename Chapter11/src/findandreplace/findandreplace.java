package findandreplace;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class findandreplace {
    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
        System.out.println("What is the search word?");
       
        String search = input.nextLine();
        System.out.println("What is the replacement word?");
       
        String replacementWord = input.nextLine();
        System.out.println("What is the source file?");
       
        String source = input.nextLine();
        System.out.println("What is the destination file?");
       
        String destination = input.nextLine();
        input.close();
        try {
            FileWriter fileOut = new FileWriter(destination);
            BufferedWriter bw = new BufferedWriter(fileOut);
            Scanner fileRead = new Scanner(new File(source));
            while (fileRead.hasNextLine()) {
                String data = fileRead.nextLine();
                bw.write(data.replace(search, replacementWord));
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fileRead.close();
            System.out.println("Data replaced successfully.");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


/* Screen Dump

What is the search word?
Teja
What is the replacement word?
jatt
What is the source file?
C:\\Users\\1100023209\\Documents\\input.txt
What is the destination file?
C:\\Users\\1100023209\\Documents\\output.txt
Data replaced successfully.


 */