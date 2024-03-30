package Phuong.com.javabasic.variables;

public class LearnVariables {
    public String ten;
    public void sayhello(){
        int n = 10; //bien local
        System.out.println("Gía trị của n là:" + n);
    }

    public static void main(String[] args) {
        //System.out.println(age);
        //String FullName = "PhuongVu";
        LearnVariables abc = new LearnVariables();
        abc.sayhello();
        //Cach 2
        //sayhello();
    }
}
