package sho14;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyFileReader extends FileReader implements DebugPrintable {
    String fileName = null;

    public MyFileReader(String fileName) throws FileNotFoundException {
        super(fileName);
        this.fileName = fileName;
    }

    @Override
    public void debugPrint() {
    }

    public static void main(String[] args) {
        try {
            MyFileReader reader = new MyFileReader("input.txt");
            reader.debugPrint();
        } catch (FileNotFoundException e) {

        }
    }
}
