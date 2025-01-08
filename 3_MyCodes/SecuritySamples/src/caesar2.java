public class caesar2{
    public static void main(String args[]){
        String phrase = args[0];
        //First Argument
        String k = args[1];
        //Second argument
        //The shift of the letters in the caesar Cipher
        char characters[] = phrase.toCharArray();
        //Sending the input characters into a character array
        int shift = Integer.parseInt(k);
        int remainder = shift % 26;
        //The shift = value K
        for( int i=0; i < characters.length; i++)
        {
            if ((Character.isUpperCase(characters[i]))== true)
            {
                if((int)(characters[i]) + remainder >= 90)
                {
                    characters[i] = (char)(characters[i]-(26-remainder));
                }
                else
                {
                    characters[i] = (char)(characters[i]+remainder);
                }
            }
            else if (Character.isLowerCase(characters[i])==true)
            {
                if ((int)(characters[i] + remainder) >= 122)
                {
                    characters[i] = (char)(characters[i] - (26-remainder));
                }
                else
                {
                    characters[i] = (char)(characters[i]+remainder);
                }
            }
        }
        for(int i =0; i< characters.length;i++)
        {   System.out.println (characters[i]);
        }
    }
}