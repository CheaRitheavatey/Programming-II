import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class week9 {
    public static void exercise7(Path path) throws IOException{
        // get specific file extension
        // if (!Files.exists(path)) {
        //     throw new FileNotFoundException("");
        // }

        if (!path.toString().toLowerCase().endsWith(".java")) {
            throw new IOException("doesnt end with .java");
        }

        System.out.println("Complete!");

    }
    public static void exercise6() {
        // get a list of file name in the given directory
        File f= new File("/home/students/");
        String[] filelist = f.list();
        for (String name: filelist) {
            System.out.println(name);
        }
    }
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
        Path p = Paths.get("week9File.txt");
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

        // Files.copy(source,target) to copy one file to another
        // Files.move(p3,Paths.get("../"))


        // meta data
        System.out.println(Files.size(p2));  // return 0 if file not exist else it return a byte/bit
        System.out.println(Files.getOwner(p2));  // it get the owner of the file or the directory
        System.out.println(Files.isDirectory(p2)); // get is it a directory or not
        System.out.println(Files.isRegularFile(p)); // Tests whether a file is a regular file with opaque content.


        // read the content of the file
        System.out.println(Files.readAllLines(p2)); // return list where each line is an item
        
        // write to a file
        Files.write(p2, Files.readAllLines(p2)); // so its like copying from one file to another as well
        ArrayList<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "Apple", "Banana");
        Files.write(p2, fruits,StandardOpenOption.APPEND); // StandardOpenOption will have a lot of method like append so its not ging to erase it
        Files.write(p, fruits,StandardOpenOption.CREATE, StandardOpenOption.APPEND); // StandardOpenOption.CREATE = will create a file if it doesnt exist
        // can add many option not just one

    }

    public static void example1(Path path) throws FileNotFoundException, IOException{
        // create a method to count the number of the lines in a text file that its path was passed as an argument

        // check if the file exist
        
        if (!Files.exists(path)) {
           throw new FileNotFoundException();
        }

        // int count = 0;
        System.out.println(Files.readAllLines(path).size());  // return the number of line
        // System.out.println();
        // for (int i = 0; i<Files.readAllLines(path).toArray().length; i++) {
        //     count += i;
        // }
        // System.out.println("Count: " + count);

       
    }

    // create a method that check a file to see if a word was mention inside a file and print the first match
    public static void example2(Path path, String word) throws IOException, FileNotFoundException {
        if (!Files.exists(path)) {
            throw new FileNotFoundException();
        }

        // System.out.println(Files.readString(path));
        List<String> f = Files.readAllLines(path);
        System.out.println(f.toString());

        int count = 0;
        
        for (String i: f) {
                if (i.toLowerCase().contains(word)) {
                    count++;
                    System.out.println(word);
                    // return true;
                }
            
        }
        // return false;
        System.out.println(count);


    }

     // create a method that check a file to see if a word was mention inside a file and print the first match
    public static void example3(Path path, String word) throws IOException, FileNotFoundException {
        if (!Files.exists(path)) {
            throw new FileNotFoundException();
        }
        
        // read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    System.out.println("word " + word + " found in line: " + line);
                    break;
                } else {
                    System.out.println(word + " not found");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            
       


    }
    public static void main(String[] args) throws IOException{
        // fileInput();
        // unichar();
        // path();
        // example1(Paths.get("week8File.txt"));
        example2(Paths.get("week8File.txt"), "word1");
        
        // try {
            //     exercise7(Paths.get("week9.java"));
            // } catch (IOException e) {
                //     System.out.println(e.getMessage());
                // }
                
                
        example3(Paths.get("week8File.txt"), "word1");
    }
}
