package org.example.methodreferencetelusko;

// call by value
// CALL BY METHOD

interface Parser {
    String parse(String str);
}

class StringParser {
//    public String convert(String s) {
    public static String convert(String s) {
        if (s.length() <= 3)
            s = s.toUpperCase();
        else
            s = s.toLowerCase();

        return s;
    }
}

class MyPrinter {
    public void print(String str, Parser p) {
        str = p.parse(str);
        System.out.println(str);
    }
}

public class FirstCode {

    public static void main(String[] args) {


        String str = "Nav";
        String strFull = "Navin Reddy";
        MyPrinter mp = new MyPrinter();
//        mp.print(str, new Parser() {
//            @Override
//            public String parse(String s) {
//                return StringParser.convert(s);
//            }
//        });
        mp.print(str, (StringParser::convert));
        // If your method is not static,
        // mp.print(str,(sp::convert));
//        mp.print(str,(s -> StringParser.convert(s)));


//        List<String> names = Arrays.asList("Navin", "Manoj", "Priya", "Anto");
//
//        names.forEach(System.out::println);

//        Consumer<String> con = new Consumer<String>() {
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//
//        names.forEach(con);

//        names.forEach(s -> System.out.println(s));


    }


}
