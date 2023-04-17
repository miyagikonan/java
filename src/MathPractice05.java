import java.util.Scanner;

public class MathPractice05 {
    public static void main(String[] args) {

        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        System.out.print("数値を入力してください：");
        var sc2 = new Scanner(System.in);
        var s2 = sc2.nextLine();
        var num2 = Integer.parseInt(s2);

        System.out.println(Math.min(num1,num2));

    }
}
