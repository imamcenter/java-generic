package app;

import data.MyData;

public class Contravariant {
  public static void main(String[] args) {
    MyData<Object> objectMyData = new MyData<>("imam");

    process(objectMyData);
    System.out.println(objectMyData.getData());
  }

  static void process(MyData<? super String> myData){

    myData.setData("ahmad");
  }
}
