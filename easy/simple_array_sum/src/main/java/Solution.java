import java.util.Arrays;
import java.util.List;

class Result {

  public static int simpleArraySum(List<Integer> ar) {
    return ar.stream().reduce(0, (a, b) -> Integer.sum(a, b));
  }
}

public class Solution {

  public static void main(String[] args) {
    List<Integer> ar = Arrays.asList(1, 2, 3, 4, 10, 11);
    int sum = Result.simpleArraySum(ar);
    System.out.printf("sum: %d", sum);
  }
}
