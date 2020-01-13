import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Export positions to csv file, sorted by dateSubmitted or dateDeadline.
 * @author xueyingli
 *
 */
public class SortedExport {
	String fileName = "testPositions.csv";
	
	public void exportSubmitted(ArrayList<Position> positions, String sortBy) {
		if (sortBy == "submitted") {
			Collections.sort(positions, Position.submittedComparator());
		} else if (sortBy == "deadline") {
			Collections.sort(positions, Position.deadlineComparator());
		}
		
		try {
			PrintWriter pw = new PrintWriter(fileName);
            StringBuilder csvHeader = new StringBuilder("");
            
            csvHeader.append("companyName,size,role,resumeStatus,coverLetterStatus,applicationStatus,dateDeadline,dateSubmitted,status,comments\n");
            pw.write(csvHeader.toString());
            
			for(Position p : positions) {
	            StringBuilder sb = new StringBuilder("");
				sb.append(p.getCompanyName());
				sb.append(",");
				sb.append(p.getSize());
				sb.append(",");
				sb.append(p.getRole());
				sb.append(",");
				sb.append(p.getResumeStatus());
				sb.append(",");
				sb.append(p.getCoverLetterStatus());
				sb.append(",");
				sb.append(p.getApplicationStatus());
				sb.append(",");
				sb.append(p.getDateDeadline());
				sb.append(",");
				sb.append(p.getDateSubmitted());
				sb.append(",");
				sb.append(p.getStatus());
				sb.append(",");
				sb.append(p.getComments());
				pw.println(sb);
				pw.flush();
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
