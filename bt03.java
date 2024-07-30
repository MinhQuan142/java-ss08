import java.util.*;
public class bt03 {
    public static void main(String[] args) {
        //Tao Array
        List<Integer> integerList = new ArrayList<>();
        //input
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number 1: ");
        integerList.add(sc.nextInt());
        System.out.println("Enter any number 2: ");
        integerList.add(sc.nextInt());
        System.out.println("Enter any number 3: ");
        integerList.add(sc.nextInt());
        System.out.println("Enter any number 4: ");
        integerList.add(sc.nextInt());
        //tinh tong
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer; //( sum = sum + integer )
        }
            System.out.println("Tong cac so ban vua nhap vao: " + sum);
        } catch (Exception e) {
            System.out.println("Error: So nhap vao khonog phai la so nguyen ");
        }
    }
}
