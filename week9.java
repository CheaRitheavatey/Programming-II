import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class week9 {
    public static void fileInput() throws IOException{
        FileInputStream in = null; // to read file
        FileOutputStream out = null; // to write

        try {
            in = new FileInputStream("week8File.txt"); 
            out = new FileOutputStream("week9File.txt");
            // .read() will return -1 when end of the file has been reach

            while (in.read() != -1) {
                out.write(in.read());
            }
            // return a byte    .read()
        } finally {
            // close stream when we dont need it anymore
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }


    public static void unichar() throws IOException{
        FileReader in = null;
        FileWriter out = null;
        
        try {
            in = new FileReader("week8File.txt"); 
            out = new FileWriter("week9File.txt");
            // .read() will return -1 when end of the file has been reach

            int x = in.read();
            while (x != -1) {
                out.write(x);
            }
            // return a byte    .read()
        } finally {
            // close stream when we dont need it anymore
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }

    }

    public static void path() throws IOException{
        Path p = Paths.get("week0File.txt");
        System.out.println("p.toString(): " + p.toString());

        // string that can be open from a browser
        System.out.println("p.toUri: " + p.toUri());
        System.out.println("p.getFileName: " + p.getFileName());
        System.out.println("p.toAbsolutePath: " + p.toAbsolutePath());


        Path p2 = Paths.get("week8File.txt");
        System.out.println("p2.toAbsolutePath: " + p2.toAbsolutePath());


        System.out.println("is week9file exists? " + Files.exists(Paths.get("week09.txt")));
        System.out.println("is p2 exists? " + Files.exists(p2));


        //
        if (p2.toAbsolutePath().equals(p.toAbsolutePath())) {
            System.out.println("p2 and p are the same file");
        } else if (p2.toAbsolutePath().startsWith(".txt")) {

            System.out.println("p2 is in drive c");
        } else {
            System.out.println("they are not the same file and p2 is not in drive c");
        }

        // some other .operator i should know
        // .endsWith() maybe we can check the extendsion of a file like is it pdf, txt, pptx...
        // for example if (p2.getFileName().toString().endsWith(".txt")) return true;
        

        // remove the file if it exist and empty
        Path p3 = Paths.get("C:\\Users\\Admin\\Documents\\GitHub\\Programming-II\\week9File.txt");
        if (Files.exists(p3)) {
            Files.deleteIfExists(p3);     // .delete() also do the same thing. its just .deleteIfExists() wont throw any exception
            System.out.println("delete succesful");
        } else {
            System.out.println("file already delete or file not found");
        }
    }
    public static void main(String[] args) throws IOException{
        // fileInput();
        // unichar();
        path();

        
    }
}
