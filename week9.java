import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class week9 {
    public static void fileInput() throws IOException{
        FileInputStream in = null; // to read file
        FileOutputStream out = null; // to write

        try {
            in = new FileInputStream("week8File.txt"); 
            out = new FileOutputStream("week9File.txt");
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


    public static void unichar() throws IOException{
        FileReader in = null;
        FileWriter out = null;
        
        try {
            in = new FileReader("week8File.txt"); 
            out = new FileWriter("week9File.txt");
            // .read() will return -1 when end of the file has been reach

            // int x = in.read();
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
    public static void main(String[] args) {
        
    }
}
