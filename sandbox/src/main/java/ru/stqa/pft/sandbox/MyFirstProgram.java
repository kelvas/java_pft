package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    System.out.println("Hello, World!");

    Point p1 = new Point(1,3);
    Point p2 = new Point(3,4);
    System.out.println("Дистанция между точками равна = " + p1.distance(p2));
  }

}