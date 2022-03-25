package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class Parity {
  @EpiTest(testDataFile = "parity.tsv")
  public static short parity(long x) {
    // 1011 is 1
    // 10001000 is 0
    long count = 0;
    while (x != 0){
      count += x & 1;
      x >>= 1;
    }
    if (count%2==1){
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "Parity.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
