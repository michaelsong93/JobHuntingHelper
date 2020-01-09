import java.util.ArrayList;
import java.util.Calendar;

/**
 * Store information for a position applied.
 * Methods are only getters and setters. (Changed setters' return type to void, other detailed modification are commented)
 * Analyzer is built based on field variables of Position class. (But feel free to make changes)
 * @author xueyingli
 *
 */
public class Position {

	String companyName;
	String size;
	String linkToApplication;
	String role;
	String dateDeadline;
	String recruiterName;
	String recruiterToLinkedIn;
//	String dateSubmitted;
	Calendar dateSubmitted; // less error-prone when editing/analyzing?
	String dateToFollowUp;
	String status;
	String comments;
	ArrayList<Requirement> requirements;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLinkToApplication() {
		return linkToApplication;
	}
	public void setLinkToApplication(String linkToApplication) {
		this.linkToApplication = linkToApplication;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDateDeadline() {
		return dateDeadline;
	}
	public void setDateDeadline(String dateDeadline) {
		this.dateDeadline = dateDeadline;
	}
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getRecruiterToLinkedIn() {
		return recruiterToLinkedIn;
	}
	public void setRecruiterToLinkedIn(String recruiterToLinkedIn) {
		this.recruiterToLinkedIn = recruiterToLinkedIn;
	}
	public Calendar getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(Calendar dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	public String getDateToFollowUp() {
		return dateToFollowUp;
	}
	public void setDateToFollowUp(String dateToFollowUp) {
		this.dateToFollowUp = dateToFollowUp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public ArrayList<Requirement> getRequirements() {
		return requirements;
	}
	public void setRequirements(ArrayList<Requirement> requirements) {
		this.requirements = requirements;
	}
	
}
