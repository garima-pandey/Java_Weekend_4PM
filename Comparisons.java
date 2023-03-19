class Comparisons {
    public static void main(String[] args) {
        //3.

        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = new String("java");

        System.out.println(str1.compareTo(str2)); //0
        System.out.println(str1.compareTo(str3)); //-2


        //2.
        // String one = "hello";
        // String two = "Hello";

        // if(one.equalsIgnoreCase(two))
        // {
        //     System.out.println("String one is equal to two");
        // }
        // else {
        //     System.out.println("String one is not equal to two");
        // }
        // if(one.equals(two))
        // {
        //     System.out.println("String one is equal to two");
        // }
        // else {
        //     System.out.println("String one is not equal to two");
        // }


        //1.
        // String s1 = new String("Hello");   
        // String s2 = new String("Hello");   

        // System.out.println(s1 == s2); // false - address/reference compare
        // System.out.println(s1.equals(s2)); // true - value/content compare
    }
}
