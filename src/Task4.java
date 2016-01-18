import java.util.Random;

public class Task4 {
    public static void main(String[] arg){
        int abc = (int)(Math.random()*898+101);
        int a = abc/100;
        int b = (abc%100)/10;
        int c = (abc%100)%10;
        System.out.println(abc);
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        String cc = Integer.toString(c);
        int cba = Integer.parseInt(cc+bb+aa);
        System.out.println(cba);
        System.out.println("log = "+Math.log(cba));
    }
}
/*
4. Определите число, полученное выписыванием в обратном порядке цифр

заданного трехзначного числа. Найдите его натуральный логарифм.
 */