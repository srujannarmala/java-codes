import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
public static void main(String[] args) throws FileNotFoundException {
	String filename = "C:/Users/sruja/Desktop/test.txt";
    File file = new File(filename);
    Scanner input = new Scanner(file);
    
    while (input.hasNextLine()) {
    	
    String inputline =  input.next();
    
    System.out.println(inputline);
	input.close();
   
     }
   }
 }