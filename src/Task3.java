
public class Task3 {
    static public void main(String[] arg){
        int x = (int)(Math.random()*89+10);
        System.out.println("rand = "+x);
        int decade = (int)(x/10);
        int number = (int)(x%10);
        String back = Integer.toString(number)+Integer.toString(decade);
        System.out.println(back);
        int newX = Integer.parseInt(back);
        double sqrt = Math.sqrt(newX);
        System.out.println("Квадратный корень: "+sqrt);
        System.out.println("Квадратный корень (округлен): "+Math.round(sqrt));
    }
}

/*
3.  В двузначном целом числе поменяйте цифры местами, найдите его квадратный

корень и ближайшее к корню целое.
 */