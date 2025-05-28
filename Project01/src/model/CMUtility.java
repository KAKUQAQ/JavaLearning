package model;

import java.util.Scanner;

public class CMUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (;;) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println("输入错误，请重新输入");
            } else {
                break;
            }
        }
        return c;
    }

    public static char readConfirmSelection() {
        char c;
        for (;;) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("请重新输入");
            }
        }
        return c;
    }

    public static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) {
                    return line; 
                }else {
                    continue;
                }
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
