package sho9;

/**
 * printArrayを完成させましょう
 */
public class PrintArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 4, 1},
                {5, 9, 2},
                {6, 5,},
                {3,},
        };
        printArray(arr);
    }

    /**
     * 配列の中身を体裁を整えて表示させる
     *
     * @param a 数字が格納された二次元配列
     */
    public static void printArray(int[][] a) {
        System.out.println("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
}
