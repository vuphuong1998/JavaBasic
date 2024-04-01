package Phuong.com.javabasic.toantu;

public class ToanTuLogic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean checkvalue1 = (a > 1) & (b > 2);
        boolean checkvalue2 = (a > 1) || (b < 2);

        String expectedText = "Màu hồng";
        String actualText = "Màu xanh";

        System.out.println(checkvalue1);
        System.out.println(checkvalue2);
        System.out.println(expectedText == actualText);
    }
}
