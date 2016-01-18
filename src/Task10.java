
public class Task10 {
    public static void main(String[] args) {
        double D;
        int a, b, c;
        do {
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
            c = (int) (Math.random() * 10);
            D = b*b - 4*a*c;
        } while (D<0);
        System.out.printf("%d x^2 + %d x + %d = 0",a,b,c);
        System.out.println();
        double x1 = (-b + Math.sqrt(D))/2*a;
        double x2 = (-b - Math.sqrt(D))/2*a;
        System.out.printf("x1, x2 = %.2f  %.2f",x1,x2);
    }
}


/*
* 10. Найти корни квадратного уравнения A·x2 + B·x + C = 0, заданного

своими целыми коэффициентами A, B, C.
* */