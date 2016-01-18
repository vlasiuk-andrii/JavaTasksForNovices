
public class Task2 {
    static public void main(String[] arg){
        int xxx = 444;
        System.out.println("Наше число = "+xxx);
        int x = (int)(xxx/100)+(int)(((xxx%100))%10)+(int)(((xxx%100))/10);
        System.out.println("Сумма цифер: "+x);
        double sqrt= Math.sqrt(xxx);
        System.out.println("Корень квадратный = "+sqrt);
        System.out.println("Корень квадратный (округлен) = "+(Math.round(sqrt)));
    }
}

/*
2. Целой переменной х присвойте сумму цифр трехзначного числа, найдите его

квадратный корень и ближайшее к корню целое.
 */