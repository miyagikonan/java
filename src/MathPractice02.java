import java.util.Scanner;
public class MathPractice02 {
    public static void main(String[] args) {

        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        System.out.println(Math.sqrt(num1));

    }
}
