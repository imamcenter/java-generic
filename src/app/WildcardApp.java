package app;

import data.MyData;

public class WildcardApp {
  public static void main(String[] args) {
    print(new MyData<>("imam"));
    print(new MyData<Integer>(10));

  }

  static void print(MyData<?> myData) {
    System.out.println(myData.getData());
  }
}


