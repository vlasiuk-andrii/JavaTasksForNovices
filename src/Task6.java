public class Task6 {
    public static void main(String[] args) {
        int a = 0, b = 0, Q = 0;
        a = (int) (Math.random() * 99);
        b = (int) (Math.random() * 99);
        Q = (int) (Math.random() * 181);
        double S = 0.5 * a * b * Math.abs(Math.sin(Math.toDegrees(Q)));
        System.out.println("a, b = "+a+", "+b);
        System.out.println("Q = "+Q+" deg");
        System.out.printf("S = %.3f",S);
    }
}




/*
6. Даны 2 целые длины сторон треугольника и целый угол между ними в

градусах. Найдите площадь.
*/