package datatype;

public class StringExample {
    public static void main(String[] args) {
        /*String a = "Samad";
        String b = "Samad";
        String c = new String("Samad");
        String d = new String("Samad");

        System.out.println(a == b);
        System.out.println(c == d);*/

        /*String name = "Samad";
        int l = name.length();
        char c = name.charAt(3);

        String name2 = "samad";

        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.equals(name2));
        System.out.println(c);
        System.out.println(l);*/

        /*
        //String str1 = "remote";
        //String str2 = "car";

        String str1 = "remote";
        String str2 = "remate";

        //find ASCI value
        System.out.println('a' + 0);
        System.out.println('o' + 0);

        int i = str1.compareTo(str2);
        System.out.println(i);*/

        /*String str3 = "Samad";
        String str4 = "SAMAD";

        System.out.println(str3.compareToIgnoreCase(str4));*/

        /*String str5 = "Samad Ansari";
        String subString = str5.substring(6, 9);
        System.out.println(subString);
        System.out.println(str5.toUpperCase());
        System.out.println(str5.toLowerCase());
        System.out.println("    asjsfhf".trim());
        //Replace
        String replace = str5.replace("Ansari", "ibn Jabir Ansari");
        System.out.println(replace);

        //Contains
        boolean contains = str5.contains("Ans");
        System.out.println(contains);

        //StartWith
        boolean startsWith = str5.startsWith("Sam");
        System.out.println(startsWith);

        //Index
        System.out.println(str5.indexOf("a"));
        System.out.println(str5.lastIndexOf("a"));

        // isEmpty and Blank
        String str6 = " ";
        System.out.println(str6.isEmpty());
        System.out.println(str6.isBlank());*/

        /*int a = 19;
        String string = String.valueOf(a);
        System.out.println(string);*/

        String name = "Samad Ansari";
        System.out.println(name.substring(2, 8));
        System.out.println(name.subSequence(2, 8));
    }
}
