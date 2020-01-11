import java.util.ArrayList;
/**
 * This class represents a position.
 * @author sivah
 *
 */
public class Position {
	
	private String companyName;
	private String size; // number of employee (small: 0-49, mid: 50-199, large: 200+)
	private String appLink; // link to application
	private String role; // software engineer, internship, full-time, co-op
	private String resumeStatus;
	private String coverLetterStatus;
	private String applicationStatus;
	private String dateDeadline;
	private String recruiterName;
	private String recruiterLinkedIn;
	private String dateSubmitted; // date the application is submitted
	private String dateToFollowUp;
	private String status; // status of the application (applied, take home, on-site, phone screen, rejected, offer, no longer interested)
	private String comments; // record the status of the application (dates followed up, what you learned, etc)
	
	public Position (String companyName, String size, String appLink, String role, 
			String dateDeadline, String resumeStatus, String coverLetterStatus, String applicationStatus, String recruiterName, String recruiterLinkedIn,
			String dateSubmitted, String dateToFollowUp, String status, String comments)
	{
		this.companyName = companyName;
		this.size = size;
		this.appLink = appLink;
		this.role = role;
		this.dateDeadline = dateDeadline;
		this.resumeStatus = resumeStatus;
		this.coverLetterStatus = coverLetterStatus;
		this.applicationStatus = applicationStatus;
		this.recruiterName = recruiterName;
		this.recruiterLinkedIn = recruiterLinkedIn;
		this.dateSubmitted = dateSubmitted;
		this.dateToFollowUp = dateToFollowUp;
		this.status = status;
		this.comments = comments;
	}
	
	public String getDateDeadline() {
		return dateDeadline;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getDateToFollowUp() {
		return dateToFollowUp;
	}

	public void setDateToFollowUp(String dateToFollowUp) {
		this.dateToFollowUp = dateToFollowUp;
	}

	public String getSize() {
		return size;
	}

	public String getAppLink() {
		return appLink;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setAppLink(String appLink) {
		this.appLink = appLink;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setDateDeadline(String dateDeadline) {
		this.dateDeadline = dateDeadline;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRole() {
		return role;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public String getResumeStatus() {
		return resumeStatus;
	}

	public void setResumeStatus(String resumeStatus) {
		this.resumeStatus = resumeStatus;
	}

	public String getCoverLetterStatus() {
		return coverLetterStatus;
	}

	public void setCoverLetterStatus(String coverLetterStatus) {
		this.coverLetterStatus = coverLetterStatus;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public String getRecruiterLinkedIn() {
		return recruiterLinkedIn;
	}

	public void setRecruiterLinkedIn(String recruiterLinkedIn) {
		this.recruiterLinkedIn = recruiterLinkedIn;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public String getStatus() {
		return status;
	}

	public String getComments() {
		return comments;
	}
	
	
}
