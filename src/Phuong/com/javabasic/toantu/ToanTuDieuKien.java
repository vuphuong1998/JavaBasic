package Phuong.com.javabasic.toantu;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        String expectedText = "Màu hồng";
        String actualText = "Màu xanh";

        String s = (a % b == 0) ? "a chia het cho b" : "a khong chia het cho b";
        String d = (expectedText == actualText) ? "Testcase pass" : "Testcase false";
        System.out.println(s);
        System.out.println(d);
    }
}
