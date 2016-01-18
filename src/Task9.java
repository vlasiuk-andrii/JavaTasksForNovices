public class Task9 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 5);
        int b1 = a*a;
        int b2 = a*b1*b1;
        int result = b2*b2*b2;
        System.out.println("a = "+a);
        System.out.println("result = "+result);
    }
}

/*
* 9. Дано целое число A. Вычислить A^15, используя две вспомогательные

переменные и пять операций умножения. Для этого последовательно

находить A2, A3, A5, A10, A15. Вывести все найденные степени числа A.
* */