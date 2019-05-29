package sho18;

import java.io.*;

/**
 * list18-8 ファイルの内容を16進で表示する
 */
public class FileDump1 {
    public static void main(String[] args) {
        DataInputStream in = null;
        if (args.length != 1) {
            System.out.println("使用法：java FileDump1 ファイル名");
            System.exit(0);
        }
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(args[0])));
            int offset = 0;
            while (true) {
                byte b = in.readByte();
                if (offset % 16 == 0) {
                    System.out.println(intToHexString(offset) + " : ");
                } else if (offset % 8 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
                System.out.print(byteToHexString(b));
                if (offset % 16 == 15) {
                    System.out.println();
                }
                offset++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(args[0] + "が見つかりません。");
        } catch (EOFException e) {
            System.out.println();
        } catch (IOException e) {
            System.out.println("" + e);
        }
    }

    public static String intToHexString(int nmber) {
        return byteToHexString((byte) (nmber >>> 24))
                + byteToHexString((byte) (nmber >>> 16))
                + byteToHexString((byte) (nmber >>> 8))
                + byteToHexString((byte) nmber);
    }

    public static String byteToHexString(byte b) {
        int n = (int) b;
        if (n < 0) {
            n = 256 + n;
        }
        if (n < 16) {
            return "0" + Integer.toHexString(n).toUpperCase();
        } else {
            return Integer.toHexString(n).toUpperCase();
        }
    }
}
