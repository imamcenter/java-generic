package app;

import data.MyData;

public class InvariantApp {
  public static void main(String[] args) {
//    tidak bisa karena invarian
    MyData<String> stringMyData = new MyData<>("imam");
//    MyData<Object> objectMyData = stringMyData;
//      doIt(stringMyData);


    MyData<Object> objectMyData = new MyData<>(100);
//    MyData<Integer> integerMyData = stringMyData;
//    doItInteger(objectMyData);

  }

  static void doIt(MyData<Object> objectMyData) {

  }

  static void doItInteger(MyData<Integer> objectMyData) {

  }
}
