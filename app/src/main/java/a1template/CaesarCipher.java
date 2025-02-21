// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

/**
 * With a given offset, encode or decode messages
 * @author Binah, Clara
 */
public class CaesarCipher{
        
    /** Character array to store the letters in the alphabet in order */
    static Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    /** DynamicArray object providing ArrayList-like operations for Characters */
    static DynamicArray<Character> cipher = new DynamicArray(0, alphabet);


    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that defines the instance variables 
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset, Character[] alphabet){
        super(alphabet);
        this.offset = offset;
    }
    
    CaesarCipher(int offset){
        super(alphabet);
        this.offset = offset;
    }

    public char get(int index){
        return alphabet[(index-offset+26)%26];
    }
    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for (int i = 0; i < alphabet.length; i++) { //iterates through each char in the alphabet
            if (alphabet[i] == val)
            {
                return i;
            }
        }
        return -1;
    }



    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        char[] msg = message.toCharArray(); //converts string to an array of characters that can be operated on individually
        boolean isUppercase;
        for (int i = 0; i < msg.length; i++) { //iterates through each char in the message
            isUppercase = false; //resets variable at beginning of loop
            if (msg[i] != Character.toLowerCase(msg[i])){ //if toLowerCase changes the char, it was originally uppercase
                isUppercase = true; //makes note that the character was originally uppercase
            }
            msg[i] = Character.toLowerCase(msg[i]); //converts to lowercase so it can be matched against our lowercase alphabet
            int alphaIndex = this.findIndex(msg[i]); //fetches the index of the char in our alphabet
            if (alphaIndex != -1) //if char is in the alphabet (excludes punctuation, etc)
            {
                msg[i] = alphabet[(alphaIndex - offset+26)%26];
            }
            if (isUppercase)
            {
                msg[i] = Character.toUpperCase(msg[i]);
            }
        }
        return new String(msg); 
     }
    // public String encode(String message){
    //     ArrayList<String> strList = new ArrayList<String>( 
    //         Arrays.asList(message)); 
    //     char[] charArray = new char[message.length];
    //     for (int i=0; i<message.length;i++){ 
    //         newidx=findIndex(message[i])+offset
    //         charArray[i]=alphabet[newidx]
    //     }

    //     // Fill in here and update return statement based on your code
    //     return charArray; 
    //  }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        char[] msg = message.toCharArray(); //converts string to an array of characters that can be operated on individually
        boolean isUppercase;
        for (int i = 0; i < msg.length; i++) { //iterates through each char in the message
            isUppercase = false; //resets variable at beginning of loop
            if (msg[i] != Character.toLowerCase(msg[i])){ //if toLowerCase changes the char, it was originally uppercase
                isUppercase = true; //makes note that the character was originally uppercase
            }
            msg[i] = Character.toLowerCase(msg[i]); //converts to lowercase so it can be matched against our lowercase alphabet
            int alphaIndex = this.findIndex(msg[i]); //fetches the index of the char in our alphabet
            if (alphaIndex != -1) //if char is in the alphabet (excludes punctuation, etc)
            {
                msg[i] = alphabet[(alphaIndex + offset)%26];
            }
            if (isUppercase)
            {
                msg[i] = Character.toUpperCase(msg[i]);
            }
        }
        return new String(msg); 
    }

    public static void main(String[] args) {
        
    }
    
}
