package Methodology.week10Package;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;
public class week10 {
    // how to read from an existing xml
    public static void readFirstStudent() throws SAXException, IOException {
        try {
            // create a new instance just like how you said its String str= new String its just this is a different form
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("1.xml");

            // put the xml into a normal formonly the structure separate the text 
            doc.normalize();

            // we want to access everything inside <student> </student> and put the element in a list
            NodeList nl = doc.getElementsByTagName("student");

            // get index = 0 get first element in the nl list
            Node n1 = nl.item(0);
            // System.out.println(n1);

            // need to typecast
            Element e = (Element) n1;
            // System.out.println(e);

            // .getTextContent() is like .toString() 
            System.out.println(e.getElementsByTagName("firstname").item(0).getTextContent());
            
        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        }
    }

    // the first method can only read 1 element lets read more now
    public static void readStudents() {
        try {
            // create a new instance just like how you said its String str= new String its just this is a different form
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("1.xml");

            doc.normalize();
            
            System.out.println("Root: " + doc.getDocumentElement().getNodeName());
            System.out.println("Name: " + doc.getDocumentElement().getElementsByTagName("name").item(0).getTextContent());

            // the tag which we want to get access to the list inside
            NodeList nl = doc.getElementsByTagName("student");
            for (int i = 0; i<nl.getLength(); i++) {
                Node n = nl.item(i);
                System.out.println("---------------------");
                // System.out.println("Student " + i + " " + n);

                if (n.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) n;
                    System.out.println("Neptun: " + e.getAttribute("neptun"));
                    System.out.println("First Name: " + e.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name: " + e.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Mark: " + e.getElementsByTagName("mark").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // edit an xml file
    public static void editxml() {
        try {
            // create a new instance just like how you said its String str= new String its just this is a different form
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("edited1.xml");

            doc.normalize();

            // update an attribute value (attribute = id in html)
            Node student = doc.getElementsByTagName("student").item(0);

            // collection of name nodes for student node
            NamedNodeMap attri = student.getAttributes();

            // create a node based on the name of the attrivute
            Node nodeAtrri = attri.getNamedItem("neptun");
            nodeAtrri.setTextContent("New1234");

            // update elment
            NodeList studentList = doc.getElementsByTagName("student");
            for (int i = 0; i< studentList.getLength(); i++) {
                Node n = studentList.item(i);

                // look for a certain info and modify it
                NodeList studentchild = n.getChildNodes();
                for (int j = 0; j< studentchild.getLength(); j++) {
                    Node child = studentchild.item(i);
                    if (child.getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) child;

                        if (childElement.getNodeName().equals("mark")) {
                            if (childElement.getTextContent().equals("100")) {
                                childElement.setTextContent("Excellent");
                            }
                        }
                    }
                }

            }
            // writing to a target
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();

            // holder for transformation source
            DOMSource source = new DOMSource(doc);

            // see the change in console/terminal
            StreamResult target = new StreamResult(System.out);

            // see the change in the same but i dont want to modify the original file so lets put the edited one in a new file
            // StreamResult target = new StreamResult(new File("edited1.xml"));

            t.transform(source, target);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createxml() {
    
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // create element attribute and more ...
            Element root = doc.createElement("class");
            doc.appendChild(root); // append everythingto the doc in order for it to show up

            Element name = doc.createElement("name");
            root.appendChild(name);
            // add the content into the name tag
            name.setTextContent("Elementary Programming II");

            Element students = doc.createElement("students");
            root.appendChild(students);

            Element student = doc.createElement("student");
            students.appendChild(student);
            
            Attr attr = doc.createAttribute("neptun");
            attr.setValue("123");
            // add the attribute to the student tag
            student.setAttributeNode(attr);
            student.setAttribute("id", "1");

            // we can create comment here also
            Comment cm = doc.createComment("this is a comment");
            student.appendChild(cm);

            Element firstname = doc.createElement("firstname");
            student.appendChild(firstname);
            firstname.setTextContent("John");

            Element lastname = doc.createElement("lastname");
            student.appendChild(lastname);
            lastname.setTextContent("JOE");
            
            Element mark = doc.createElement("mark");
            student.appendChild(mark);
            mark.setTextContent("100");

            // second student
            Element student2 = doc.createElement("student");
            students.appendChild(student2);

            Element firstname2 = doc.createElement("firstname");
            student2.appendChild(firstname2);
            firstname2.setTextContent("Alice");

            Element lastname2 = doc.createElement("lastname");
            student2.appendChild(lastname2);
            lastname2.setTextContent("ABC");
            
            Element mark2 = doc.createElement("mark");
            student2.appendChild(mark2);
            mark2.setTextContent("90");
    

            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult target = new StreamResult(new File("createxml.xml"));
            // StreamResult target = new StreamResult(System.out);

            // to make the file pretty and enter properly
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.transform(source, target);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SAXException, IOException {
        // readFirstStudent();
        // readStudents();
        editxml();

        // createxml();

        // how to write from xml to txt
    }
}
