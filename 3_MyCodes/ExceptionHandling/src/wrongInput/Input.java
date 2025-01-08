package wrongInput;

/**
 * Created by Monir on 9/27/16.
 */
class Input {
    void method() throws WrongInputException {
        throw new WrongInputException("Wrong input");
    }
}
