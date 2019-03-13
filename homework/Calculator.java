package homework;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(exponent(4,5));
        System.out.println(addnumber(5,9));
        System.out.println(subtract(9, 8));
        System.out.println(mulitply(5,5));
        System.out.println(divide(6,3));

    }
    public static int addnumber(int x, int y){
        return x + y;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int mulitply(int t, int c){
        return t * c;
    }
    public static int divide(int z , int i){
        return z / i;
    }
    public static double exponent(double l, double d){
       return Math.pow(l,d);
    }
}
