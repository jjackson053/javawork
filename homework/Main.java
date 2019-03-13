package homework;

public class Main {
    public static void main(String[] args) {
        Calculator home = new Calculator();
        home.addnumber(3,4);
        home.subtract(12,6);
        home.mulitply(5,5);
        home.divide(6,3);
        home.exponent(3,6);
        System.out.println(home.addnumber(3,4));
        System.out.println(home.subtract(12,6));
        System.out.println(home.mulitply(5,5));
        System.out.println(home.divide(6,3));
        System.out.println(home.exponent(3,6));

    }
}
