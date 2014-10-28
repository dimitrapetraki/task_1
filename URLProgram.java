import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class URLProgram {
	public static void main(String[] args) throws Exception {
		URL programmingWikipedia = new URL("http://el.wikipedia.org/wiki/Java");
		BufferedReader in = new BufferedReader(new InputStreamReader(programmingWikipedia.openStream()));
		String input;
		while ((input = in.readLine()) != null)
            System.out.println(input);
        in.close();
		//test commit
		//test back...
	}

}
