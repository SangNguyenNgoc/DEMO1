import java.util.Scanner;

public class demsv {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Tao sinh vien: ");
        int choice;
        boolean otp = true ; 
        do{
            System.out.println("Nhan 1 de tao tiep, nhan 0 de dung");
            choice = Integer.parseInt(sc.nextLine());
            if(choice >1 || choice <0) {
                otp = false;
                System.out.println("Nhap sai, moi nhap lai");
            }
            else{
                if(choice == 1) {
                    sinhvien1 sv1 = new sinhvien1();
                    sv1.nhap();
                }
            }
        }while(choice == 1 || otp == false );
        System.out.println("So sinh vien da tao: " + sinhvien1.getDem());
    }
}
