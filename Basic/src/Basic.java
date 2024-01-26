public class Basic {

    public static boolean isNumberPrime(int n){
        for(int div = 2; div * div <= n; div++){
            if(n % div == 0)
                return false;
        }
        return true;
    }

    public static void printAllPrimes(int n){
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int div = 2; div * div <= i; div++){
                if(i % div == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    public static void firstNFibonacciNumbers(int n){
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }

    public static void digitsCount(int n){
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void reverseOfANumber(int n){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }

    public static void inverseOfANumber(int n){
        int inv = 0;
        int place = 1;
        while( n > 0){
            int digit = n % 10;
            n /= 10;
            inv = (int) (inv + place * Math.pow(10, digit-1 ));
            place++;
        }
        System.out.println(inv);
    }

    public static void rotateANumber(int n, int k){
        int temp = n;
        int count = 0;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        if(k > count){
            k = k % count;
        }
        if( k < 0){
            k = count + k;
        }
        int div = (int) Math.pow(10, k);
        int rotatedDigits = n % div;
        n /= div;
        int rotatedNum = rotatedDigits * (int) Math.pow(10, count-k) + n;
        System.out.println(rotatedNum);
    }

    public static void gcdAndLcm(int n, int m){
        int divisor = n;
        int dividend = m;
        while(divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println("GCD: " + dividend);
        int lcm = (n * m) / dividend;
        System.out.println("LCM: " + lcm);
    }

    public static void isPythagoreanTriplet(int a, int b, int c){
        int max = a;
        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }
        boolean isTriplet = false;
        if(max == a){
            isTriplet = b*b + c*c == a*a;
        }
        else if(max == b){
            isTriplet = a*a + c*c == b*b;
        }
        else{
            isTriplet = b*b + a*a == c*c;
        }
        System.out.println(isTriplet);
    }

    public static void benjaminBulbs(int n){
        for(int i = 1; i*i <= n; i++){
            System.out.println(i*i);
        }
    }

    public static void primeFactorization(int n){
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n != 1){
            System.out.print(n);
        }
    }
}
