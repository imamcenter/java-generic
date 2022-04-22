package app;

import util.ArrayHelper;

public class ArrayHelperApp {
  public static void main(String[] args) {
    String[] names = new String[]{
        "imam", "ahmad", "fahrezi"
    };

    Integer[] numbers = {1,3,5,2,5,3,6};

    System.out.println(ArrayHelper.count(names));
    System.out.println(ArrayHelper.<Integer>count(numbers));
  }
}
