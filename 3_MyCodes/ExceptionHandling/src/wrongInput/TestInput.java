package wrongInput;

/**
 * Created by Monir on 9/27/16.
 */
class TestInput {
    public static void main(String[] args){
        try {
            new Input().method();
        }
        catch(WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }
}
