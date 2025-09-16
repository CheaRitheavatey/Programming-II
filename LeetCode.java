import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int count = map.getOrDefault(i, 0) + 1;
            if (count >= 2) {
                count = 2;

                map.put(i, count);
            } else {
                map.put(i, count);
            }

        }
        System.out.println(map);
        int total = 0;
        for (int i : map.values()) {
            total += i;
        }
        System.out.println(total);

        return total;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        System.out.println(removeDuplicates(arr));
    }
}
