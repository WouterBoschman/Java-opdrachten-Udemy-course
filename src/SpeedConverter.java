import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        //leap year
        int year = 2100;
        boolean leapYear = isLeapYear(year);
        System.out.println("is it a leap year " + leapYear);
        //compare decimals
        double getal1 = 3.1673;
        double getal2 = 3.1676;
        boolean threeDecimals = areEqualByThreeDecimalPlaces(getal1, getal2);
        System.out.println("equal by three decimals " + threeDecimals);
        // check sum
        int a = 1;
        int b = 2;
        int c = 3;
        boolean sum = hasEqualSum(a, b, c);
        System.out.println(a + "+" + b + "=" + c + " " + sum);
        // calculate area
        double x = 3;
        double y = 4;
        double circle = area(x);
        double square = area(x, y);
        System.out.println(circle);
        System.out.println(square);
        //minutes to years calculator
        long minutes = 561600;
        printYearsAndDays(minutes);
        //Equality printer (gebruik int van a,b,c)
        printEqual(a, b, c);
        //playing cat
        boolean summer = false;
        int temperature = 30;
        boolean cat = isCatPlaying(summer, temperature);
        System.out.println("is the cat playing " + cat);
        //number in words
        int number = 5;
        printNumberInWord(number);
        //get days in month gebruik year
        int month = 2;
        int days = getDaysInMonth(month, year);
        System.out.println(days);
        //sum odd gebruikt number
        boolean sumodd = isOdd(number);
        System.out.println(sumodd);
        int start = 1;
        int end = 20;
        int Sum = sumOdd(start, end);
        System.out.println(Sum);
        //number palindrome
        int getal = 12345;
        boolean palindrome = isPalindrome(getal);
        System.out.println(palindrome);
        //First And Last Digit Sum, gebruik getal
        int som = sumFirstAndLastDigit(getal);
        System.out.println(som);
        //Even digit sum
        int evenSom = getEvenDigitSum(getal);
        System.out.println(evenSom);
        //shared digit
        int d = 16;
        int e = 40;
        boolean shared = hasSharedDigit(d, e);
        System.out.println(shared);
        //greatest common divisor gebruikt d en e
        int gcd = getGreatestCommonDivisor(d, e);
        System.out.println(gcd);
        //All factors van int d;
        printFactors(d);
        //Perfect number
        boolean perfect = isPerfectNumber(d);
        System.out.println(perfect);
        //Number To Words
        numberToWords(d);
        //flour pack problem
        System.out.println(canPack(1, 0, 5));
        //Largest prime
        System.out.println(getLargestPrime(d));
        //Diagonal star
        printSquareStar(7);
        //scanner
        Scanner scanner = new Scanner(System.in);

    }

    //leap year
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;

        }
        return false;
    }

    //check decimals (iets te uitgebreid gedaan)
    public static boolean areEqualByThreeDecimalPlaces(double getal1, double getal2) {
        double getal3 = 1000 * getal1 - 1000 * getal2;
        int intgetal3 = (int) getal3;
        if (intgetal3 == 0) {
            return true;
        }
        return false;
    }

    //check sum
    public static boolean hasEqualSum(int a, int b, int c) {
        return a + b == c;
    }

    //calculate area
    public static double area(double radius) {
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        return x * y;
    }

    //minutes to years and days calculator
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long year = minutes / 525600;
        long days = (minutes - year * 525600) / 1440;
        System.out.println(minutes + " min = " + year + " y and " + days + " d");
    }

    //Equality printer
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
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

    //Number in Word
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("ohter");
                break;
        }
    }

    //Days in a month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            return 29;
                        }
                        return 28;
                    }
                    return 29;

                }
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }

    }

    //Sum odd
    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start || start < 0 || end < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum = sum + i;
                }
            }
            return sum;
        }

    }

    //Number Palindrome
    public static boolean isPalindrome(int getal) {
        int original = getal;
        int reverse = 0;
        while (getal != 0) {
            int lastDigit = getal % 10;
            reverse = reverse * 10 + lastDigit;
            getal = getal / 10;
        }
        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }

    //First And Last Digit Sum
    public static int sumFirstAndLastDigit(int getal) {
        int som = 0;

        if (getal < 0) {
            return -1;
        } else {
            int LastDigit = getal % 10;
            int reverse = 0;
            while (getal != 0) {
                int lastDigit = getal % 10;
                reverse = reverse * 10 + lastDigit;
                getal = getal / 10;
            }
            int firstDigit = reverse % 10;
            som = LastDigit + firstDigit;
            return som;
        }
    }

    //Even digit sum
    public static int getEvenDigitSum(int getal) {
        int sum = 0;
        int lastDigit = 0;
        if (getal < 0) {
            return -1;
        } else {
            while (getal != 0) {
                lastDigit = getal % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                getal = getal / 10;
            }
            return sum;
        }


    }

    //Shared Digit
    public static boolean hasSharedDigit(int d, int e) {
        if (d >= 10 && d <= 99 && e >= 10 && e <= 99) {
            int firstdigitD = d / 10;
            int lastdigitD = d % 10;
            int firstdigitE = e / 10;
            int lastdigitE = e % 10;
            if (firstdigitD == firstdigitE || firstdigitD == lastdigitE || lastdigitD == firstdigitE || lastdigitD == lastdigitE) {
                return true;
            }
            return false;
        }
        return false;
    }

    //Greatest common divisor
    public static int getGreatestCommonDivisor(int d, int e) {
        if (d < 10 || e < 10) {
            return -1;
        } else {
            int ggd = 0;
            //ga alle getallen af tot de grootste gevonden is
            for (int i = 1; i <= d && i <= e; i++) {
                if (d % i == 0 && e % i == 0) {
                    ggd = i;
                }
            }
            return ggd;
        }
    }

    //All factors
    public static void printFactors(int d) {
        if (d < 0) {
            System.out.println("Invalid number");
        } else {
            for (int i = 1; i <= d; i++) {
                if (d % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    //Perfect number
    public static boolean isPerfectNumber(int d) {
        if (d < 1) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i < d; i++) {
                if (d % i == 0) {
                    sum += i;
                }
            }
            if (sum == d) {
                return true;
            }
            return false;
        }
    }

    //Number to Words
    public static void numberToWords(int number) {
        int digitNumber = getDigitCount(number);
        int reverseNumber = reverse(number);
        int digitReverse = getDigitCount(reverseNumber);
        int digitDifference = digitNumber - digitReverse;
        while (reverseNumber != 0) {
            int lastDigit = reverseNumber % 10;
            printNumberInWord(lastDigit);
            reverseNumber = reverseNumber / 10;
        }
        for (int i = 0; i < digitDifference; i++) {
            printNumberInWord(0);
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
            return count;
        }
    }

    //Flour pack problem (niet van mij)
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalKilos = (5 * bigCount) + smallCount;
        int count = 0;
        int temp = 0;

        if (totalKilos < goal) {                     //Checks if the total number of Kilos is sufficient or not.
            return false;
        } else if (totalKilos == goal) {              //This case will always be true.
            return true;
        } else {                                      //If the total number of kilos is greater than our goal.(Packaging problem)
            for (int i = 0; i < goal; i++) {               //For loop that gets the largest number that is divisible by 5 in the number 'goal'.
                temp = goal - i;
                if (temp % 5 == 0) {
                    break;
                }
            }
            if (bigCount >= temp / 5) {               //If the number of big bags is bigger than the biggest number divisible by 5
                goal -= temp;
                if (smallCount >= goal) {          //Compares the remaining kilos with the small bags
                    return true;
                }
                return false;
            } else {                                   //If the number of big bags is smaller than the biggest number divisible by 5
                goal -= (temp - bigCount * 5);
                if (smallCount >= goal) {
                    return true;
                }
                return false;
            }
        }
    }

    //largest prime
    public static int getLargestPrime(int number) {
        int i;
        if (number < 2) {
            return -1;
        } else {
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }

            }
            return i;
        }
    }
    //Diagonal Star
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        } else {
            for(int i=1; i<=number;i++){
                for(int j=1; j<=number;j++){
                    if(i==1){
                        System.out.print("*");
                    } else if (i==j){
                        System.out.print("*");
                    } else if (i==number){
                        System.out.print("*");
                    } else if (i==(number-j+1)){
                        System.out.print("*");
                    } else if (j==number){
                        System.out.print("*");
                    } else if (j==1){
                        System.out.print("*");
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }
    //

}

