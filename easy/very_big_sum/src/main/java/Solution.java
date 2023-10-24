import java.util.Arrays;
import java.util.List;

class Result {

  public static long aVeryBigSum(List<Long> ar) {
    return ar.stream().reduce(0L, (a, b) -> Long.sum(a, b));
  }
}

public class Solution {

  public static void main(String[] args) {
    List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
    long aVeryBigSum = Result.aVeryBigSum(ar);
    System.out.printf("aVeryBigSum: %d", aVeryBigSum);
  }
}
