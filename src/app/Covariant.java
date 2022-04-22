package app;

import data.MyData;

public class Covariant {
  public static void main(String[] args) {
    MyData<String> stringMyData = new MyData<>("imam");
    process(stringMyData);
    MyData<? extends Object> myData = stringMyData;
  }

  static void process(MyData<? extends Object> myData){
    System.out.println(myData.getData());

  }
}
