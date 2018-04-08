/**
 * # Credit Card Mask
 *
 * Usually when you buy something, you're asked whether your credit card number,
 * phone number or answer to your most secret question is still correct. However,
 * since someone could look over your shoulder, you don't want that shown on your
 * screen. Instead, we mask it.
 *
 * Your task is to write a function maskify, which changes all but the last four
 * characters into '#'.
 */


public class Maskify {
    public static String maskify(String str) {
        String masked = "";

        for (int el = 0; el < str.length(); el++) {
            if (el < str.length() - 4) {
                masked += "#";
            }
            else {
                masked += str.charAt(el);
            }
        }
        return masked;
    }
}
