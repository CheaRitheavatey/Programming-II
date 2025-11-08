import java.util.*;

public class LeetCode {
    public static int[][] merge(int[][] intervals) {
        // sort array
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] result = new int[intervals.length][2];

        // flatten the nested array
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                list.add(intervals[i][j]);
            }
                System.out.println(list);
        }
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i+1) -list.get(i) <= 0) {

            } else {
                merged.add(new int[]{list.get(i), list.get(i+1)});
            }
        }
//        for (int i = 0; i < intervals.length-1; i++) {
//            for (int j = 0; j <intervals[i].length; j++) {
//                if (intervals[i+1][0] - intervals[i][1] <=0) {
//                    result[i] = new int[]{intervals[i][0], intervals[i+1][1]};
//                }
//                System.out.print(intervals[i][j] );
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
        return intervals;
    }
    public static int romanToInt(String s) {
        // sth to store the symbol and value
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // store the number
        int[] array = new int[s.length()];
        int i = 0;
        while (i < s.length()) {
            if (i < s.length() - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    array[i] = 4;
                    i+=2;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    array[i] = 9;
                    i+=2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    array[i] = 40;
                    i+=2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    array[i] = 90;
                    i+=2;
                    continue;
                }  else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    array[i] = 400;
                    i+=2;
                    continue;
                }  else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    array[i] = 900;
                    i+=2;
                    continue;
                }
            }


            array[i] = map.get(s.charAt(i));
            i++;

        }
        System.out.println(Arrays.toString(array));

        // sum all the number inside array
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;

    }
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
//        System.out.println(removeDuplicates(arr));

        String s =  "LVIII";
//        System.out.println(romanToInt(s));

        int[][] interval = {{4,7}, {1,4}};
        System.out.println(merge(interval));
    }
}
