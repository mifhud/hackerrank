import java.util.Arrays;
import java.util.List;

class Result {

  public static int diagonalDifference(List<List<Integer>> arr) {
    int firstDiagonalSum = 0, secondDiagonalSum = 0;
    for (int i = 0; i < arr.size(); i++) {
      firstDiagonalSum += arr.get(i).get(i);
      secondDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
    }

    return Math.abs(firstDiagonalSum - secondDiagonalSum);
  }

}

public class Solution {

  public static void main(String[] args) {
    List<List<Integer>> lists = Arrays.asList(
        Arrays.asList(11, 2, 4),
        Arrays.asList(4, 5, 6),
        Arrays.asList(10, 8, -12)
    );
    int diagonalDifference = Result.diagonalDifference(lists);
    System.out.printf("diagonalDifference: %d", diagonalDifference);
  }
}
