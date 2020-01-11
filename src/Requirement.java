/**
 * This class represents a requirement.
 * @author sivah
 *
 */
public class Requirement {

	private String requirement;
	private boolean isSubmitted;
	
	public Requirement(String requirement, boolean isSubmitted) {
		this.requirement = requirement;
		this.isSubmitted = isSubmitted;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public boolean isSubmitted() {
		return isSubmitted;
	}

	public void setSubmitted(boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
	}
	
	
}
