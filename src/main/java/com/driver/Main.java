package com.driver;

public class Main {
  static class A{
    public void meth(){
        System.out.println("Invoking method from class A");
    }
  }
  static class B extends A{
     public void meth() {
            System.out.println("Method is overridden in Extended class B");
    }
  }
  public static void main(String[] args){
    B obj = new B();
    obj.meth();
  }
}