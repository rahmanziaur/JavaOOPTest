import java.util.Collections;
        import java.util.List;
        import java.util.Arrays;

public class ReverseStringArrayExample {

    public static void main(String args[]){

        //String array
        String[] strDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday"};

                /*
                 * There are basically two methods, one is to use temporary array and
                 * manually loop through the elements of an Array and swap them or to use
                 * Arrays and Collections classes.
                 *
                 * This example uses the second approach i.e. without temp variable.
                 *
                 */

        //first create a list from String array
        List<String> list = Arrays.asList(strDays);

        //next, reverse the list using Collections.reverse method
        Collections.reverse(list);

        //next, convert the list back to String array
        strDays = (String[]) list.toArray();

        System.out.println("String array reversed");

        //print the reversed String array
        for(int i=0; i < strDays.length; i++){
            System.out.println(strDays[i]);
        }

    }

}