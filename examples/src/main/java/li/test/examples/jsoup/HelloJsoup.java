package li.test.examples.jsoup;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class HelloJsoup {
    private Document doc;
    private static int count = 1;

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
        Element body = doc.body();
        System.out.println(body.nodeName());
//        printChildNode(body);

    }

    public void printChildNode(Node node) {
        Iterator<Node> nodes = node.childNodes().iterator();
        Node child;
        count++;
        while (nodes.hasNext()) {
            child = nodes.next();
            System.out.println(child.nodeName());
//            printSpace(count);
//            printChildNode(child);
        }
    }

    public void printSpace(int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.print(" ");
        }
    }
}
