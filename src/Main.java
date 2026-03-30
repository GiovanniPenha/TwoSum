import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] resultado = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(Arrays.toString(resultado));
    }
}
