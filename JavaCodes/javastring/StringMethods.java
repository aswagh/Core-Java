package javastring;

import javax.management.StringValueExp;

/**
 * StringMethods
 */
public class StringMethods {
    public static String stringVar = "  Playing with Strings ";

    public static void main(String[] args) {
        System.out.println("working fine");
        System.out.println("char at pos 6 = " + stringVar.charAt(6));
        System.out.println("String lenght" + stringVar.length());
        System.out.println(String.format("Formating String : %f.2f Unicode of 97: %c", 32.2342356234, 97));
        System.out.println("Substring :" + stringVar.substring(2, 8));
        System.out.println("String contains 'str'" + stringVar.contains("Str"));
        String v = String.join("-", "summer", " Chaughule");
        System.out.println("String join : " + v);
        System.out.println(stringVar.isEmpty());
        System.out.println(stringVar.concat("ConcatenatedString"));
        System.out.println(stringVar.replace('i', 'e'));
        String str[] = stringVar.split("\\s");
        for (String i : str)
            System.out.print(" - spilt - " + i);
        System.out.println("\nWithout trim :" + stringVar + "Java");
        System.out.println("With trim :" + stringVar.trim() + "Java");

    }

}