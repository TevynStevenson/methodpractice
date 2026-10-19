package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        String names = formatName("Tevyn", "Stevenson");
        System.out.println(names);

    }

public static String formatName(String first, String last){

        return last + " " + first;
}


}
