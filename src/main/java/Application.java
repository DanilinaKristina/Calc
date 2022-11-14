public class Application {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        if(args[2].equals("+")){
            System.out.println(Sum(a,b));
        }
        if(args[2].equals("*")){
            System.out.println(Multiplier(a,b));
        }
        if(args[2].equals("/")){
            System.out.println(Div(a,b));
        }
        if(args[2].equals("-")){
            System.out.println(Minus(a,b));
        }
        if(args[2].equals("%")){
            System.out.println(Ostatok(a,b));
        }
        if(args[2].equals("^")){
            System.out.println(Stepen(a,b));
        }
    }
    public static double Sum (double a, double b ){
        return a + b;
    }
    public static double Div (double a, double b ){
        return a/b;
    }
    public static double Minus (double a, double b ){
        return a-b;
    }
    public static double Multiplier (double a, double b ){
        return a*b;
    }
    public static double Ostatok (double a, double b){
        return a%b;
    }
    public static double Stepen (double a, double b){
        return Math.pow(a,b);
    }
}
