public class Task7 {
    public static void main(String[] args) {
        int S = (int) (Math.random() * 99);
        double a = Math.sqrt(S);
        int aMin = (int) (Math.ceil(a));
        System.out.println("S = "+S);
        System.out.println("a = "+a);
        System.out.println("aMin = "+aMin+"   S(aMin)="+aMin*aMin);
    }
}

/*
* 7. Дана целая площадь квадрата. Найти сторону данного квадрата и минимальную

целую сторону квадрата, в который исходный квадрат может быть вписан.
* */