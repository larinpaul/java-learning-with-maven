package org.example.generics.genericclasses;

import java.util.ArrayList;
import java.util.HashMap;

class Main {

    public static void main(String[] args) {

        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        System.out.println("Me generic Class instances:");

        MyGenericClass<Integer> myIntGen = new MyGenericClass(1);
        MyGenericClass<Double> myDoubleGen = new MyGenericClass(3.14);
        MyGenericClass<Character> myCharGen = new MyGenericClass('@');
        MyGenericClass<String> myStringGen = new MyGenericClass("Hello");

        ArrayList<String> myFriends = new ArrayList<>();
        ArrayList<Object> myObjects = new ArrayList<>();
        ArrayList<Integer> myIntegers = new ArrayList<>();

        System.out.println(myIntGen.getValue());
        System.out.println(myDoubleGen.getValue());
        System.out.println(myCharGen.getValue());
        System.out.println(myStringGen.getValue());

        MyGenericClassTV<Integer, Integer> myIntInt = new MyGenericClassTV(1, 9);
        MyGenericClassTV<Double, Integer> myDoubleInt = new MyGenericClassTV(3.14, 1.01);
        MyGenericClassTV<Character, Character> myCharChar = new MyGenericClassTV('@', '$');
        MyGenericClassTV<String, Character> myStringChar = new MyGenericClassTV("Hello", "!");

        System.out.println(myIntInt.getValue());
        System.out.println(myDoubleInt.getValue()); // It does print out the Double though // 1.01
        System.out.println(myCharChar.getValue());
        System.out.println(myStringChar.getValue());

        HashMap<Integer, String> users = new HashMap<>();

        // Bounded types
        // You can create the objects of a generic class to have data
        // of specific derived types ex.Number

        MyGenericClassBounded<Integer, Integer> myIntBounded = new MyGenericClassBounded<>(1, 19);
        MyGenericClassBounded<Double, Double> myDoubleBounded = new MyGenericClassBounded<>(3.14, 1.02);
//        MyGenericClassBounded<Double, Double> myDoubleBounded = new MyGenericClassBounded(3.14, 1.02);
                                                                                //       ^^^^ This also works 0_0
        System.out.println(myIntBounded.getValue());
        System.out.println(myDoubleBounded.getValue());

    }

}
