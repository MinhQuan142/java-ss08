import java.util.*;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try

        {
            //input
            System.out.println("So Nguyen thu nhat");
            int n = sc.nextInt();
            System.out.println("So Nguyen Thu 2: ");
            int m = sc.nextInt();
            //Su lys
            int sum = plus(n, m);
            System.out.println("Ket qua phep cong: " + sum);
        } catch(
                NumberFormatException e){
            System.out.println("Error: Số nhập vào không phải là só Nguyên");}
        catch(
                Exception e)

        {
            System.out.println("Error: đầu vào không hợp lệ");
        }
        finally

        {
            sc.close();
        }

    }
    public static int plus(int n, int m) throws ArithmeticException {
        return n + m;
        }

}

