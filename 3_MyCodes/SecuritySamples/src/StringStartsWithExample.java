public class StringStartsWithExample {

    public static void main(String[] args) {

        //declare the original String
        String strOrig = "Hello World";

    /*
    check whether String starts with Hello or not.
    Use startsWith method of the String class to check the same.
    startsWith() method returns true if a string is starting with a given word
    otherwise it returns false
    */
        if(strOrig.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }else{
            System.out.println("String does not start with Hello");
        }

    }
}