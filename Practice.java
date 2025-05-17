import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Practice {
    public static void exercise1() throws Exception{
        // write a product 
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.newDocument();

        Element products = d.createElement("products");
        d.appendChild(products);

        Element product = d.createElement("product");
        products.appendChild(product);

        Element name = d.createElement("name");
        name.setTextContent("Widget");
        product.appendChild(name);

        Element price = d.createElement("price");
        price.setTextContent("19.99");
        product.appendChild(price);

        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer();

        DOMSource source = new DOMSource(d);
        StreamResult target = new StreamResult(new File("createxml.xml"));
            // StreamResult target = new StreamResult(System.out);

            // to make the file pretty and enter properly
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.transform(source, target);

    }
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

        // edit xml
        Node student = d.getElementsByTagName("student").item(0);
        student.getAttributes().getNamedItem("neptun").setTextContent("old111");


        // look for a certain thing to change 
        NodeList n = d.getElementsByTagName("student");
        for (int i = 0; i < n.getLength(); i++) {
            Node nodes = n.item(i);
            if (nodes.getNodeType() == Node.ELEMENT_NODE) {
                Element el = (Element) nodes;
                NodeList marks = el.getElementsByTagName("mark");
                if (marks.getLength() > 0) {
                    Element markel = (Element) marks.item(0);
                    markel.setTextContent("wow amazing");
                }
            }
        }
        // print out on terminal
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer();

        // need source and target
        DOMSource source = new DOMSource(d);
        StreamResult target = new StreamResult(new File("2.xml"));
        tf.setOutputProperty(OutputKeys.INDENT, "yes");

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

        // readxml();
        exercise1();
        
    }
    
}
