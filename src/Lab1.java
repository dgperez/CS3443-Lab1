import java.io.File;
import java.util.Scanner;


/**
 * The task is to read the tokens from a file and print out three values: the number of tokens that 
 * are numbers (doubles), the number of tokens that are not numbers, and the sum of the numbers.<br/>
 * <br/>
 * For example, if this is the contents of the file being processed:
 * <pre>1 2 3 one two three </pre>
 * <pre>z 1.1 zz 2.2 zzz 3.3 zzzz </pre> 
 * Your program should print out:
 * <pre>6 7 12.6 </pre> 
 * and nothing else.
 * 
 * @author Daria Perez Alonso
 * @since 2015-08-20
 */
public class Lab1 {

	/**
	 * main entry point to application
	 * @param args ignored
	 */
	public static void main(String[] args) {
		
		Scanner in;
		try {
		    in = new Scanner(new File("data.txt"));
		    
		    int numCount = 0; 		// variable to count tokens that are numbers
		    double numSum = 0;		// variable to store the sum of the numbers
		    int stringCount = 0;	// variable to count tokens that are not numbers
		    
			while (in.hasNext()) {
			    String token = in.next();
			    
			    if (new Scanner(token).hasNextDouble()) {
				    numCount++;
				    numSum += Double.parseDouble(token);
				} else {
					stringCount++;
				}
			}
			
		    in.close();
		  
		    System.out.printf("%d %d %.1f\n", numCount, stringCount, numSum);
		    
		} catch (Exception FileNotFoundException) {
		    System.err.println("failed to open data.txt");
		    System.exit(1);
		}

		
	}

}
