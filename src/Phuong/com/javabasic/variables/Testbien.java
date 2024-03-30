package Phuong.com.javabasic.variables;

public class Testbien {
    static int age = 26;//bien static
    int tuoi = 30;//bien toan cuc

    public static void main(String[] args) {
        System.out.println("Tuổi của bạn là:" + age);
        Testbien abc = new Testbien();
        System.out.println("Tuổi của bạn là:" + abc.tuoi);
    }
}
