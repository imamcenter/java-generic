package app;

import data.Person;

import java.util.Arrays;

public class ComparableApp {
  public static void main(String[] args) {
    Person[] people = {
        new Person("bmam", "indonesi"),
        new Person("ardi", "indonesi"),
        new Person("chab", "indonesi"),
    };

   Arrays.sort(people);
    System.out.println(Arrays.toString(people));

  }
}
