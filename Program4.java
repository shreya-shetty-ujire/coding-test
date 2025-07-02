import java.util.HashMap;

public class Program4 {
    public static void getCountMap(int[] input) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    map.put(i, map.getOrDefault(i,0) + 1);
                }
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {

        int[] input1 = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        getCountMap(input1);

        int[] input2 = {2, 4 , 9, 18, 27, 36};
        getCountMap(input2);
    }
}
