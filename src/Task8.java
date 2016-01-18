
public class Task8 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int buffer = a*a;
        int result = buffer*buffer;
        System.out.println("a = "+a);
        System.out.println("a^2 = "+buffer);
        System.out.println("a^4 = "+result);
        System.out.println("a^8 = "+result*result);
    }
}




/*
* 8. Дано целое число A. Вычислить A8, используя вспомогательную

переменную и три операции умножения. Для этого последовательно

находить A2, A4, A8. Вывести все найденные степени числа A.
* */