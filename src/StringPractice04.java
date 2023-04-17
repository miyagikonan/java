import java.util.Scanner;

public class StringPractice04 {
    public static void main(String[] args) {
        System.out.print("文字列を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        System.out.println(s1.matches("^[1-9]\\d{2}$"));
//

//        ^ : 行の先頭を表します。
//         [1-9] : 1から9のいずれかの数字を表します。
//         \d : 任意の数字を表します。
//        {2} : 直前の要素（\d）の繰り返し回数を指定します。ここでは2を指定しているため、直前の数字が2回繰り返されることを表します。
//        $ : 行の末尾を表します。

    }
}
