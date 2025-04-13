package Methodology.week10Package;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class practice {
    public static void readxml() throws ParserConfigurationException, SAXException, IOException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("1.xml");

        // extract root node from xml doc
        Element root = doc.getDocumentElement();
        System.out.println("root: " + root.getTextContent());

        NodeList nodelist = root.getChildNodes();
        System.out.println("length of nodelist: "+ nodelist.getLength());

        for (int i = 0; i<nodelist.getLength(); i++) {
            Node node = nodelist.item(i);
            // System.out.println("node.getTextcontent: " + node.getTextContent());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String tagName = element.getTagName();
                String content = element.getTextContent();

                System.out.println("Tage Name: " + tagName);
                System.out.println("content: " + content);
            }
        }

         TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();

            // holder for transformation source
            DOMSource source = new DOMSource(doc);

            // see the change in console/terminal
            StreamResult target = new StreamResult(System.out);

            // see the change in the same but i dont want to modify the original file so lets put the edited one in a new file
            // StreamResult target = new StreamResult(new File("edited1.xml"));

            t.transform(source, target);

    }
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        readxml();
        
    }
    
}
