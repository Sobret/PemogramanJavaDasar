package chapter12_exception_handling_taxt.exercise;

public class HexFormatException extends NumberFormatException{
    private String hex;

    public HexFormatException(String hex) {
        super(hex + " is not a hex string");
        this.hex = hex;
    }
    public String getHex() {
        return hex;
    }
}
