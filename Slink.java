//WAP to get the Social Links, Email & Contacts details of a website on user input.

package SocialLink;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class Slink {
	

		public static void main(String[] args) throws IOException
		{	
			getData();
		}
		
		public static void getData() throws IOException {
			String url = "https://ful.io/";
			
			Document doc = Jsoup.connect(url).get();
			
			Pattern p = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
			Matcher matcher = p.matcher(doc.text());
			Set<String> emails = new HashSet<String>();
			while (matcher.find()) {
			   emails.add(matcher.group());
			}
			System.out.println("emails = "+emails);
			
			Set<String> links = new HashSet<String>();

			Elements elements = doc.select("a[href]");
			for (Element e : elements) {
			    links.add(e.attr("href"));
			}
			
			Set<String> link2 = new HashSet<String>();
			for(String s: links )
			{
				if(s.contains("facebook") || s.contains("instagram") || s.contains("linkedin") || s.contains("tel") )
				{
					
					link2.add(s);
				}
			}
			
			System.out.println(link2);
		}

	}
