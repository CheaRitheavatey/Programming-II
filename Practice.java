import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Practice {
    // practice for xml file: how to read, write into it and modify?
    public static void readxml() throws Exception{
        // read the whole file xml
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.parse("1.xml");

        // get the root element
        Element root = d.getDocumentElement();
        // System.out.println("root: " + root.getTextContent());

        // after getting the root we need access the child element also
        NodeList nodlist = root.getChildNodes();
        System.out.println("length: "+ nodlist.getLength());
        for (int i = 0; i< nodlist.getLength(); i++ ) {
            Node node = nodlist.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element child = (Element) node;
                // System.out.println("child: " + child);
                String name = child.getTagName();
                String content = child.getTextContent();

                System.out.println("name: " + name);
                System.out.println("content: " + content);

            }
        }
        // get a certain thnig from a certain tag ex. get frist name: tom
        NodeList firstname = d.getElementsByTagName("firstname");
        Node tom = firstname.item(0);
        System.out.println("tom: " + tom.getTextContent());

        // print out on terminal
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer();

        // need source and target
        DOMSource source = new DOMSource(d);
        StreamResult target = new StreamResult(System.out);

        tf.transform(source, target);

       
    }
    public static void fullJustify(String[] words, int maxWidth) {
        int count = 0;
        
        for (String w: words) {
           for (char ch : w.toCharArray()) {
            count += 1;
           }
        }
        System.out.println(count);

        System.out.println("divided by 16 "+count/20);
    }

    public static void main(String[] args) throws Exception {
        String[] arr = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        // fullJustify(arr, 0);

        readxml();

        
    }
    
}
