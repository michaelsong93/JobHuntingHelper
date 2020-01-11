import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class AnalysisExport {
	
	public void exportSubmitted(ArrayList<Position> positions) {
		Collections.sort(positions, Position.submittedComparator());
		
		String filename = "sortBySubmitted.csv";
		try {
			PrintWriter pw = new PrintWriter(filename);
            StringBuilder csvHeader = new StringBuilder("");
            
            // header: String dateSubmitted, String companyName, String size, String appLink, String role, String status, String comments
            csvHeader.append("dateSubmitted,companyName,size,appLink,role,status,comments\n");
            pw.write(csvHeader.toString());
            
			for(Position p : positions) {
	            StringBuilder sb = new StringBuilder("");
				sb.append(p.getDateSubmitted());
				sb.append(",");
				sb.append(p.getCompanyName());
				sb.append(",");
				sb.append(p.getSize());
				sb.append(",");
				sb.append(p.getAppLink());
				sb.append(",");
				sb.append(p.getRole());
				sb.append(",");
				sb.append(p.getStatus());
				sb.append(",");
				sb.append(p.getComments());
				pw.println(sb);
				pw.flush();
			}
			
			//Feedback on success
			System.out.println("Exported to file sortBySubmitted.csv succesfully.");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exportDeadline(ArrayList<Position> positions) {
		Collections.sort(positions, Position.deadlineComparator());
		
		String filename = "sortByDeadline.csv";
		try {
			PrintWriter pw = new PrintWriter(filename);
            StringBuilder csvHeader = new StringBuilder("");
            
            // header: String dateDeadline, String companyName, String size, String appLink, String role, String resumeStatus, String coverLetterStatus, String applicationStatus, String comments
            csvHeader.append("dateDeadline,companyName,size,appLink,role,resumeStatus,coverLetterStatus,applicationStatus,comments\n");
            pw.write(csvHeader.toString());
            
			for(Position p : positions) {
	            StringBuilder sb = new StringBuilder("");
				sb.append(p.getDateDeadline());
				sb.append(",");
				sb.append(p.getCompanyName());
				sb.append(",");
				sb.append(p.getSize());
				sb.append(",");
				sb.append(p.getAppLink());
				sb.append(",");
				sb.append(p.getRole());
				sb.append(",");
				sb.append(p.getResumeStatus());
				sb.append(",");
				sb.append(p.getCoverLetterStatus());
				sb.append(",");
				sb.append(p.getApplicationStatus());
				sb.append(",");
				sb.append(p.getComments());
				pw.println(sb);
				pw.flush();
			}
			
			//Feedback on success
			System.out.println("Exported to file sortByDeadline.csv succesfully.");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
