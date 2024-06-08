package Phuong.com.javabasic.DieuKien;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 40;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        String OS = "Win";
        switch (OS){
            case "Win":
                System.out.println("Run test on platform Windows");
                break;
            case "Mac":
                System.out.println("Run test on platform MacOS");
                break;
            default:
                System.out.println("Run test on other platform");
                break;
        }
    }
}
