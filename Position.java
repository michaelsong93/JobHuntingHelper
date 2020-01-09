import java.util.ArrayList;

public class Position {

	String companyName;
	String size;
	String linkToApplication;
	String role;
	String dateDeadline;
	String recruiterName;
	String recruiterToLinkedIn;
	String dateSubmitted;
	String dateToFollowUp;
	String status;
	String comments;
	ArrayList<Requirement> requirements;
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getSize() {
		return size;
	}
	
	public String setSize(String size) {
		this.size = size;
	}
	
	public String getLinkToApplication() {
		return linkToApplication;
	}
	
	public String setLinkToApplication(String linkToApplication) {
		this.linkToApplication = linkToApplication;
	}
	
	public String getRole() {
		return role;
	}
	
	public String setRole(String role) {
		this.role = role;
	}
	
	public String getDateDeadline() {
		return dateDeadline;
	}
	
	public String setDateDeadline(String dateDeadline) {
		this.dateDeadline = dateDeadline;
	}
	
	public String getRecruiterName() {
		return recruiterName;
	}
	
	public String setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	
	public String getRecruiterToLinkedIn() {
		return recruiterToLinkedIn;
	}
	
	public String setRecruiterToLinkedIn(String recruiterToLinkedIn) {
		this.recruiterToLinkedIn = recruiterToLinkedIn;
	}
	
	public String getDateSubmitted() {
		return dateSubmitted;
	}
	
	public String setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	
	public String getDateToFollowUp() {
		return dateToFollowUp;
	}
	
	public String setDateToFollowUp(String dateToFollowUp) {
		this.dateToFollowUp = dateToFollowUp;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String setStatus(String status) {
		this.status = status;
	}
	
	public String getComments() {
		return comments;
	}
	
	public String setComments(String comments) {
		this.comments = comments;
	}
	
	public ArrayList<Requirement> getRequirements(){
		return requirements;
	}
}
