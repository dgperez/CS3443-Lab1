import java.io.File;
import java.util.Scanner;

public class Lab1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in;
		try {
		    in = new Scanner(new File("data.txt"));
		    
		    int numCount = 0;
		    double numSum = 0;
		    int stringCount = 0;
		    
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
		    System.out.printf("%d %d %f\n", numCount, stringCount, numSum);
		    
		} catch (Exception FileNotFoundException) {
		    System.err.println("failed to open data.txt");
		    System.exit(1);
		}

		
	}

}
