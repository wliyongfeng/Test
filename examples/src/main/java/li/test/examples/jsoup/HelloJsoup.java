package li.test.examples.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HelloJsoup {
    private Document doc;

    public static void main(String[] args) {
        HelloJsoup jsoup = new HelloJsoup();
        jsoup.initDocument("http://en.wikipedia.org/");
        jsoup.getElements("body");
    }

    public void initDocument(String url) {
        try {
            doc = Jsoup.connect(url).timeout(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getElements(String elementName) {
        System.out.println(doc.select(elementName));
    }
}
