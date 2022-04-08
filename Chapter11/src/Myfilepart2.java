import java.io.*;
import java.util.Scanner;
public class Myfilepart2 {
public static void main(String[] args) {

	File textFile = new File("C:\\Users\\1100023209\\Documents\\zzz.txt");

	if (textFile.exists()) {

		System.out.println("File already exists.");

	} 

	else {

		try {

			textFile.createNewFile();
			System.out.println("zzz.txt created.");
		} 		
		catch (IOException e) {
		
			System.out.println("File could not be created.");
			
			System.err.println("IOException: " + e.getMessage());

		}//end catch
}//end else
		Scanner SC=new Scanner(System.in);
		
		//prompt the user to type D to delete file
		System.out.println("\n Type D to delete the file. Type any other character to keep the file: ");
		
		//input stored in CH
		char CH=SC.next().charAt(0);
		
		
		//if CH is D
		if(CH=='D')
{
 
			if(textFile.delete())//if file is deleted successfully
       
			{
           
				System.out.println("File deleted successfully");
       
			}
       
			else
       
			{
           
				System.out.println("Failed to delete the file");
       
			}  
}

		else//if CH is not D

		{
  
			System.out.println("File kept because you did not type D");

		}


     }//end main
}//end class