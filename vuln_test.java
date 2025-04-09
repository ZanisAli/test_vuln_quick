public class VulnerableFunctions {

    //  A function that copies data into a fixed-size buffer without checking the length of the input.
    public void copyString(String input) {
        byte[] buffer = new byte[64];
        System.arraycopy(input.getBytes(), 0, buffer, 0, input.length());
    }


}
