package app;

public class MultipleConstrainsApp {
  public static void main(String[] args) {
//    var data = new Data<Manager>(new Manager());
    var data1 = new Data<VicePresident >(new VicePresident());

  }


}

class Data<T extends Employe & canSayHello> {
  T data;

  public Data(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
    this.data.sayHello();
  }
}

interface canSayHello {
  void sayHello();
}

class Employe {

}

class Manager extends Employe {

}

class VicePresident extends Employe implements canSayHello {
  @Override
  public void sayHello() {
    System.out.println("hello");
  }
}