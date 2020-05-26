package util;

import java.util.Arrays;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getDouble(21.1, 22.3));
        System.out.println(input.getInt(1,1));
        System.out.println(input.yesNo());
        System.out.println(input.getString());
    }
}
