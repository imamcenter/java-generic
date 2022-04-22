
package app;

public class ConstrainsApp {
  public static void main(String[] args) {
    NumberData<Integer> integerNumberData = new NumberData<>(10);
    NumberData<Long> longNumberData = new NumberData<>(20L);

//    NumberData<String> stringNumberData = new NumberData<String>("imam")

    varargs(2,1,2,3,5,5,7);
  }
  static void varargs(int... values){
    System.out.println(values);
  }
}
class NumberData<T extends Number>{

  T data;
  public NumberData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }


}