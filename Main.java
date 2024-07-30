import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
    //input
    System.out.println("Nhập số bị chia: ");
    int sbc = sc.nextInt();
    System.out.println("Nhập số chia: ");
    int divisor = sc.nextInt();
    // sử lý
    int kq = divide(sbc, divisor);
    System.out.println("Kết quả: " + kq);
} catch (ArithmeticException e) {
    System.out.println(" Error: Không thể chia cho 0");
}catch (Exception e){
    System.out.println("Error: input không hợp lệ");
} finally {
    sc.close();
}
    }
    //kiểm tra
    public static int divide(int sbc, int divisor) throws ArithmeticException {
        return sbc / divisor;
    }
}