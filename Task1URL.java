
import java.io.IOException;
//javax.swing provides a variety of usefullcomponents//
//Imports a text component that can edit various kinds of content//
import javax.swing.JEditorPane;
//Adds atop-level window with th an title and a border (a frame basicaly) to your content//
import javax.swing.JFrame;
//Converts the browsers scrollbar into your content projection//
import javax.swing.JScrollPane;

public class Task1URL  {
	public static void main(String[] args) {
		JEditorPane jep = new JEditorPane();
		jep.setEditable(false);
		try {
		  jep.setPage("http://en.wikipedia.org/wiki/Java_(programming_language)");
		}
		catch (IOException e) {
		  jep.setContentType("text/html");
		  jep.setText("<html>Could not load</html>");
		} //the condition of the exception//
		JScrollPane scrollPane = new JScrollPane(jep);
		JFrame f = new JFrame("Site Projection");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(scrollPane);
		//creates projection window whith the scrollpane wher jep=jEditorpane//
		
		f.setSize(800, 450);
		f.setVisible(true);
    }
}
