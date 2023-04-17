import java.util.Scanner;

public class StringPractice03 {
    public static void main(String[] args) {
        System.out.print("文字列を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        //str.indexOf(s);

        var num = s1.indexOf("s");

        System.out.println(num);


    }
}
