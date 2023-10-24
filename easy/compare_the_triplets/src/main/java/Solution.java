import java.util.Arrays;
import java.util.List;

class Result {

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> comparisonPoints = Arrays.asList(0, 0);
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        comparisonPoints.set(0, comparisonPoints.get(0) + 1);
      }
      if (a.get(i) < b.get(i)) {
        comparisonPoints.set(1, comparisonPoints.get(1) + 1);
      }
    }
    return comparisonPoints;
  }
}

public class Solution {

  public static void main(String[] args) {
    List<Integer> aliceScores = Arrays.asList(1, 2, 3);
    List<Integer> bobScores = Arrays.asList(3, 2, 1);
    List<Integer> comparisonPoints = Result.compareTriplets(aliceScores, bobScores);
    System.out.printf("comparison points: %d, %d", comparisonPoints.get(0),
        comparisonPoints.get(1));
  }
}
