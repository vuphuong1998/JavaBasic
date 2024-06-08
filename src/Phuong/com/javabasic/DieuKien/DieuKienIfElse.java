package Phuong.com.javabasic.DieuKien;

public class DieuKienIfElse {
    public static void main(String[] args) {

        //Điều kiện If
        int Age = 30;
        String Name = "Dương hâm";
        String Message = "Add category successful";

        if (Age > 20 && (Name.equals("Dương NGỘ") || Message.contains("success"))){
            System.out.println("Thỏa điều kiện");
        }

        //Điều kiện If Else
        int number = 14;
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }
    }
}
