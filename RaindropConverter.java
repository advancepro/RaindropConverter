package sample;

import com.sun.glass.ui.*;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class RaindropConverter {

    String convert(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = result + "Pling";
        }
        if (number % 5 == 0) {
            result = result + "Plang";
        }
        if (number % 7 == 0) {
            result = result + "Plong";
        }
        if (result.equals("")) {
            return number + "";
        } else {
            return result;
        }
    }
}
