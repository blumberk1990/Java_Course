import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Wykopik {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL oracle = new URL("https://www.wykop.pl/najnowsze/");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream(), "UTF-8"));
		System.out.println("jestem tuaj");
		StringBuilder websiteSource = new StringBuilder();
		String tmp = null;
		while ((tmp = in.readLine()) != null) {
            websiteSource.append(tmp);
        }
        in.close();
        System.out.println("zamykam");
        Document doc = Jsoup.parse(websiteSource.toString());
       // Elements h1Elements = doc.getElementsByTag("h2");
        Elements h1Elements = doc.select("div.lcontrast.m-reset-margin").select("h2");
        
         
        for(Element e: h1Elements) {
            System.out.println(e.text());
        }
	}

}
