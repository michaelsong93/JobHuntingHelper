import java.io.*;
import java.util.*;

/**
 * Load company info from csv file maintained
 * @author xueyingli
 *
 */
public class Loader {
	
	private String fileName = "testPositions.csv";
	private double userIncome;
	private double userSavings;
	
	public ArrayList<Position> load() {
		ArrayList<Position> positions = new ArrayList<>();
		Scanner in;
		try {
			in = new Scanner(new File(fileName));
			in.nextLine();
			while(in.hasNextLine()) {
				String[] content = in.nextLine().split(",");
				
				String companyName = content[0];
				String size = content[1];
				String role = content[2];
				String resumeStatus = content[3];
				String coverLetterStatus = content[4];
				String applicationStatus = content[5];
				String dateDeadline = content[6];
				String dateSubmitted = content[7];
				String status = content[8];
				String comments = content[9];
				
				Position p = new Position(companyName, size, role, resumeStatus, coverLetterStatus, applicationStatus,
						dateDeadline, dateSubmitted, status, comments);
				positions.add(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return positions;
	}
	
	//Getter for user income
	public double getUserIncome() {
		return userIncome;
	}

	//Getter for users savings
	public double getUserSavings() {
		return userSavings;
	}
}