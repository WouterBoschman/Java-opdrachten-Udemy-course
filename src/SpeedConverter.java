public class SpeedConverter {
    public static void main(String[] args) {
        //leap year
        int year = 2100;
        boolean leapYear = isLeapYear(year);
        System.out.println("is it a leap year "+leapYear);
        //compare decimals
        double getal1=3.1673;
        double getal2=3.1676;
        boolean threeDecimals =areEqualByThreeDecimalPlaces(getal1, getal2);
        System.out.println("equal by three decimals "+threeDecimals);
        // check sum
        int a =1;
        int b =2;
        int c =3;
        boolean sum=hasEqualSum(a,b,c);
        System.out.println(a+"+"+b+"="+c+" "+sum);
        // calculate area
        double x = 3;
        double y = 4;
        double circle = area(x);
        double square = area(x,y);
        System.out.println(circle);
        System.out.println(square);
        //minutes to years calculator
        long minutes= 561600;
        printYearsAndDays(minutes);
        //Equality printer (gebruik int van a,b,c)
        printEqual(a,b,c);
        //playing cat
        boolean summer=false;
        int temperature=30;
        boolean cat=isCatPlaying(summer, temperature);
        System.out.println("is the cat playing "+cat);
        //


    }
//leap year
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year%4==0) {
            if (year%100==0){
                if (year%400==0){
                    return true;
                }
                return false;
            }
            return true;

        }
      return false;
    }
//check decimals (iets te uitgebreid gedaan)
    public static boolean areEqualByThreeDecimalPlaces(double getal1, double getal2){
        double getal3=1000*getal1-1000*getal2;
        int intgetal3 = (int) getal3;
        if(intgetal3==0){
            return true;
        }
        return false;
    }
//check sum
    public static boolean hasEqualSum(int a, int b, int c){
        return a+b==c;
    }
//calculate area
    public static double area(double radius){
        return radius*radius*Math.PI;
    }
    public static double area(double x, double y){
        return x*y;
    }
//minutes to years and days calculator
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        long year= minutes/525600 ;
        long days= (minutes-year*525600)/1440;
        System.out.println(minutes+" min = "+year+" y and "+days+" d");
    }
//Equality printer
    public static void printEqual(int a, int b, int c){
        if(a<0||b<0||c<0){
            System.out.println("Invalid Value");
        } else {
            if (a == b && a == c) {
                System.out.println("All numbers are Equal");
            } else if (a != b && a != c && b != c) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
//Playing cat
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else if (summer = true && temperature >= 25 && temperature <= 45) {
            return true;
        } else {
        return false;
        }
    }
}
