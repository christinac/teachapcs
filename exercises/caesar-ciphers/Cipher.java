class Cipher {
	public static void main(String[] args) {
        String secret = "The wizard quickly jinxed the gnomes before they vaporized";
        int shift = 12;

        String encoded = Cipher.encode(secret, shift);
        System.out.println(enc);
        System.out.println(Cipher.decode(enc, shift));
    }
 
    public static String encode(String message, int shift) {
            /* Your code here	*/
    }

    public static String decode(String enc_message, int shift) {
            /* Your code here   */
    } 
}