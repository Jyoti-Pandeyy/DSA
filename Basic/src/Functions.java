public class Functions {

    public static long factorial(int x){
        long fact = 1;
        for(int i = 2; i <= x; i++){
            fact *= i;
        }
        return fact;
    }

    public static long permutation(int x, int y ){
        long fact = 1;
        for(int i = 1; i <= y; i++){
            fact *= x;
            x--;
        }
        return fact;
    }

    public static int digitFrequency(long num, int digit){
        int count = 0;
        while(num != 0){
            if(num % 10 == digit){
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static int decimalToAnyBase(int num, int toBase){
        int multiplier = 1;
        int result = 0;
        while(num != 0){
            int rem = num % toBase;
            result += rem * multiplier;
            multiplier *= 10;
            num /= toBase;
        }
        return result;
    }

    public static int anyBaseToDecimal(int num, int fromBase){
        int multiplier = 1;
        int result = 0;
        while(num != 0){
            int rem = num % 10;
            result += rem * multiplier;
            multiplier *= fromBase;
            num /= 10;
        }
        return result;
    }

    public static int anyBaseToAnyBase(int num, int fromBase, int toBase){
        int result = 0;
        int decimalNum = 0;

        if(fromBase == toBase){
            return num;
        }
        decimalNum = anyBaseToDecimal(num, fromBase);
        result = decimalToAnyBase(decimalNum, toBase);
        return result;
    }

    public static long anyBaseAddition(int num1, int num2, int base){
        if(base == 10){
            return num1 + num2;
        }
        int decimalNum1 = anyBaseToDecimal(num1, base);
        int decimalNum2 = anyBaseToDecimal(num2, base);
        return decimalToAnyBase(decimalNum1 + decimalNum2, base);
    }

    public static int getSum(int num1, int num2, int base){
        int res = 0;
        int place = 1;
        int c = 0;

        while(num1 > 0 || num2 > 0 || c > 0){
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            int d = d1 + d2 + c;
            c = d / base;
            d %= base;

            res += d * place;
            place *= 10;

            num1 /= 10;
            num2 /= 10;
        }
        return res;
    }

    public static int anyBaseSubtraction(int num1, int num2, int base){
        if(base == 10){
            return num1 - num2;
        }
        int decimalNum1 = anyBaseToDecimal(num1, base);
        int decimalNum2 = anyBaseToDecimal(num2, base);
        return decimalToAnyBase(decimalNum1 - decimalNum2, base);
    }

    public static int getDifference(int num2, int num1, int base){
        if(base == 10){
            return num2 - num1;
        }
        int c = 0;
        int place = 1;
        int res = 0;
        while(num2 > 0){
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            d2 += c;
            int d = 0;
            if(d2 >= d1){
                c = 0;
                d = d2 - d1;
            }
            else{
                c = -1;
                d = d2 + base - d1;
            }
            res += d * place;
            place *= 10;

            num1 /= 10;
            num2 /= 10;
        }
        return res;
    }

    public static long anyBaseMultiplication(int num1, int num2, int base){
        if(base == 10){
            return (long) num1 * num2;
        }
        int decimalNum1 = anyBaseToDecimal(num1, base);
        int decimalNum2 = anyBaseToDecimal(num2, base);
        return decimalToAnyBase(decimalNum1 * decimalNum2, base);
    }

    public static int getProduct(int num1, int num2, int base){
        if(base == 10){
            return  num1 * num2;
        }
        int res = 0;
        int p = 1;
        while(num2 > 0){
            int d2 = num2 % 10;
            int n1 = num1;
            int place = p;
            int ires = 0;
            int c = 0;
            while(n1 > 0 || c > 0){
                int d1 = n1 % 10;
                int sum = (d1 * d2) + c;
                c = sum / base;
                sum %= base;
                ires += sum * place;
                place *= 10;
                n1 /= 10;
            }
            num2 /= 10;
            p *= 10;
            res = getSum(res, ires, base);
        }
        return res;
    }

    public static int getProductV2(int num1, int num2, int base){
        if(base == 10){
            return  num1 * num2;
        }
        int res = 0;
        int p = 1;
        while(num2 > 0) {
            int d2 = num2 % 10;
            num2 /= 10;
            int sdp = getSingleDigitProduct(num1, d2, base);
            res = getSum(res, sdp * p, base);
            p *= 10;
        }
        return res;
    }

    public static int getSingleDigitProduct(int num1, int d2, int base){
        int c = 0;
        int p = 1;
        int rv = 0;
        while(num1 > 0 || c > 0){
            int d1 = num1 % 10;
            num1 /= 10;
            int d = d1 * d2 + c;
            c = d / base;
            d %= base;
            rv += d * p;
            p *= 10;
        }
        return rv;
    }
}
