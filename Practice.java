import java.util.List;

public class Practice {
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

    public static void main(String[] args) {
        String[] arr = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        fullJustify(arr, 0);

        
    }
    
}
