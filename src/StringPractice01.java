import java.util.Scanner;

public class StringPractice01 {
    public static void main(String[] args) {
        System.out.print("文字列を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        s1.toLowerCase();

        System.out.println(s1.toLowerCase());


    }
}
