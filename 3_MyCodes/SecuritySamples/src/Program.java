
public class Program {

    static String caesar(String value, int shift) {
        // Convert to char array.
        char[] buffer = value.toCharArray();

        // Loop over characters.
        for (int i = 0; i < buffer.length; i++) {

            // Shift letter, moving back or forward 26 places if needed.
            char letter = buffer[i];
            letter = (char) (letter + shift);
            if (letter > 'z') {
                letter = (char) (letter - 26);
            } else if (letter < 'a') {
                letter = (char) (letter + 26);
            }
            buffer[i] = letter;
        }
        // Return final string.
        return new String(buffer);
    }

    public static void main(String[] args) {

        // Test the cipher method.
        String a = "test";
        System.out.println(a);
        System.out.println();

        String b = caesar(a, 18);
        String c = caesar(b, -18);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        String d = caesar(a, 1);
        String e = caesar(d, -1);
        System.out.println(d);
        System.out.println(e);
        System.out.println();

        String f = "exxegoexsrgi";
        String g = caesar(f, -4);
        System.out.println(f);
        System.out.println(g);
    }
}