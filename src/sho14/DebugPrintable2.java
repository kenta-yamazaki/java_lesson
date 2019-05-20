package sho14;

/**
 * インタフェースのフィールド
 */
interface DebugPrintable2 {
    int NO_ERROR = 0;
    int FILE_ERROR = 1;
    int MEMORY_ERROR = 2;
    String PREFIX = "ERROR";
    void debugPrint();
}
