import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * This class contains all methods that allows the user to
 * add, delete, edit, and read information about a position.
 * @author sivah
 *
 */
public class Actions {
	
	public ArrayList<Position> positions = new ArrayList<>(); // an arrayList that stores all positions
	
	/**
	 * This method adds a position to the arrayList.
	 * @param companyName
	 * @param size
	 * @param appLink
	 * @param role
	 * @param dateDeadline
	 * @param requirements
	 * @param recruiterName
	 * @param recruiterLinkedIn
	 * @param dateSubmitted
	 * @param status
	 * @param comments
	 */
	public void addPosition(String companyName, String size, String appLink, String role, 
			String dateDeadline, String resumeStatus, String coverLetterStatus, String applicationStatus, String recruiterName, String recruiterLinkedIn,
			String dateSubmitted, String status, String comments) {
		
		String followUpDate = "";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(dateFormat.parse(dateSubmitted));
		} catch(ParseException e) {
			followUpDate = "Incorrect date format!";
		}
		
		calendar.add(Calendar.DAY_OF_MONTH, 7);
		
		followUpDate = dateFormat.format(calendar.getTime());
		
		
		Position newPosition = new Position(companyName, size, appLink, role, dateDeadline, resumeStatus, coverLetterStatus, applicationStatus, recruiterName, recruiterLinkedIn, dateSubmitted, followUpDate, status, comments);
		
		positions.add(newPosition);
	}
	
	/**
	 * This method checks which document is missing for each position.
	 * @param companyName
	 * @return a String that states which document is missing
	 */
	public String checkMissing(String companyName) {
		
		String missingDocuments = "Missing: ";
		
		for (Position pos : positions) {
			
			if (pos.getResumeStatus().equals("not submitted")) {
				missingDocuments += "-Resume-";
			} else if (pos.getCoverLetterStatus().equals("not submitted")) {
				missingDocuments += "-Cover Letter-";
			} else if (pos.getApplicationStatus().equals("not submitted")) {
				missingDocuments += "-Application-";
			}
		}
		
		return missingDocuments;
	}
	
	/**
	 * This method deletes a position in the arrayList.
	 * @param companyName
	 * @return a String that indicates whether a position is successfully deleted
	 */
	public String deletePosition(String companyName) {
		
		String indicator = "";
		
		for (Position pos : positions) {
			if (pos.getCompanyName().toLowerCase().equals(companyName.toLowerCase())) {
				positions.remove(pos);
				indicator = "Position is deleted!";
			}
			else {
				indicator = "Company not found!";
			}
		}
		
		return indicator;
	}

	/**
	 * This method edits information about a position in the arrayList
	 * @param companyName
	 * @param itemToBeEdited
	 * @param newInfo
	 * @return an String that indicates whether a position is successfully edited
	 */
	public String edit(String companyName, String itemToBeEdited, String newInfo) {
		
		String indicator = "Information is updated!";
		
		for (Position pos : positions) {
			if (pos.getCompanyName().toLowerCase().equals(companyName.toLowerCase())) {
				
				switch(itemToBeEdited.toLowerCase()) {
				case "company name":
					pos.setCompanyName(newInfo);
					break;
					
				case "size":
					pos.setSize(newInfo);
					break;
				
				case "app link":
					pos.setAppLink(newInfo);
					break;
					
				case "role":
					pos.setRole(newInfo);
					break;
					
				case "date deadline":
					pos.setDateDeadline(newInfo);
					break;
				
				case "resume status":
					pos.setResumeStatus(newInfo);
					break;
					
				case "cover letter status":
					pos.setCoverLetterStatus(newInfo);
					
				case "application status":
					pos.setApplicationStatus(newInfo);
					
				case "recruiter name":
					pos.setRecruiterName(newInfo);
					break;
					
				case "recruiter linkedIn":
					pos.setRecruiterLinkedIn(newInfo);
					break;
					
				case "date submitted":
					pos.setDateSubmitted(newInfo);
					break;
					
				case "status":
					pos.setStatus(newInfo);
					break;
					
				case "comments":
					pos.setComments(newInfo);
					break;
					
				default:
					indicator = "Item not found!";
				}
			}
			else {
				indicator = "Company not found!";
			}
		}
		
		return indicator;
	}
	
	/**
	 * This method returns information about a position stored in the arrayList.
	 * @param companyName
	 * @param itemToBeChecked
	 * @return information about a position or a statement that indicates whether
	 * the item to be checked is found
	 */
	public String displayInfo(String companyName, String itemToBeChecked) {
		
		String content = "";
		
		for (Position pos : positions) {
			if (pos.getCompanyName().toLowerCase().equals(companyName.toLowerCase())) {
				
				switch(itemToBeChecked.toLowerCase()) {
				
				case "company name":
					content = pos.getCompanyName();
					break;
					
				case "size":
					content = pos.getSize();
					break;
				
				case "app link":
					content = pos.getAppLink();
					break;
					
				case "role":
					content = pos.getRole();
					break;
					
				case "date deadline":
					content = pos.getDateDeadline();
					break;
				
				case "resume status":
					content = pos.getResumeStatus();
					break;
					
				case "cover letter status":
					content = pos.getCoverLetterStatus();
					break;
					
				case "application status":
					content = pos.getApplicationStatus();
					break;
					
				case "recruiter name":
					content = pos.getRecruiterName();
					break;
					
				case "recruiter linkedIn":
					content = pos.getRecruiterLinkedIn();
					break;
					
				case "date submitted":
					content = pos.getDateSubmitted();
					break;
					
				case "status":
					content = pos.getStatus();
					break;
					
				case "comments":
					content = pos.getComments();
					break;
					
				default:
					content = "Item not found!";
				}
			}
			else {
				content = "Company not found!";
			}
		}
		
		return content;
	}
	
}
