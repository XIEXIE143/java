// ava_calculate  问题
package sample;

// import java.util.Scanner;

// import javax.net.SocketFactory;

public class CalculateAverage {
    public static void main(String[] args) {

        // // 问题1
        // int hp = 5;
        // hp++;
        // System.out.println(hp);
        // hp -= 4;
        // System.out.println(hp);
        // hp *= 4;
        // System.out.println(hp);
        // hp /= 2;
        // System.out.println(hp);

        // 问题2
        // String user_name;
        // int age;

        // user_name = "xxx";
        // age = 1;
        // System.out.println(user_name + "の年齢は" + age + "歳です");

        // 问题3
        String name1 = "ミネラルウォーター";
        String name2 = "コーヒー";
        int price1 = 88;
        int price2 = 120;
        int amount1 = 5;
        int amount2 = 3;

        int total_price1 = price1 * amount1;
        int total_price2 = price2 * amount2;
        int total_price3 = total_price1 + total_price2;

        String message1 = name1 + ": " + price1 + "円 x" + amount1 + "個";
        String message2 = name2 + ": " + price2 + "円 x" + amount2 + "個";

        System.out.println(message1);
        System.out.println(message2);

        final float TAX_RATE = 0.1f;
        System.out.println("割引 : " + (TAX_RATE * 100) + "%");

        int totalPrice= (int)(total_price3 * TAX_RATE);

        float Tax = total_price3 - totalPrice;
        String message = "合計金額は: " + Tax;
        System.err.println(message);

        // 问题4
        // scnn / scan /new 回车 最下/sys
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Input score of Japanese");
        // int japanese = sc.nextInt();

        // System.out.println("Input score of Mathmatic");
        // int mathmatic = sc.nextInt();

        // System.out.println("Input score of Science");
        // int science = sc.nextInt();

        // System.out.println("Input score of Society");
        // int society = sc.nextInt();

        // // TODO: Calculate average score & output

        // float average = (japanese + mathmatic + science + society) / 4.0f;
        // String message = "Score average is " + average;
        // System.err.println(message);

        // 論理演算 问题1
        // int temperature = 30;
        // boolean is_hot = (temperature > 30);
        // boolean is_cold = (temperature < 10);

        // System.out.println(is_hot);
        // System.out.println(is_cold);




        

    }
}
