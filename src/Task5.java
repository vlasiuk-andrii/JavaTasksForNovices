
public class Task5 {
    public static void main(String[] args){
        int a = 1, b = 1, c = 5;
        while ((a+b<c) || (a+c<b) || (b+c<a)) {
            a = (int) (Math.random() * 99);
            b = (int) (Math.random() * 99);
            c = (int) (Math.random() * 99);
        } //Verify that that are realy sides of the triangle
        double p = (a+b+c)/2.0;
        double s = Math.sqrt((p)*(p-a)*(p-b)*(p-c));
        System.out.println("a, b, c = "+a+' '+b+' '+c);
        System.out.println("p = "+p);
        System.out.println("s = "+s);
    }
}
/*
5. Пусть даны целые длины сторон треугольника. Найдите его площадь и

полупериметр.
 */

