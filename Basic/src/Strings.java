import java.util.ArrayList;

public class Strings {
    private static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
    static void printAllPalindromes(String s){
        int slen = s.length();
        for(int i = 0; i < slen; i++){
            for(int j = i+1; j <= slen; j++){
                String ss = s.substring(i, j);
                if(isPalindrome(ss)){
                    System.out.println(ss);
                }
            }
        }
    }

    static String compressStringV1(String s){
        StringBuilder sb = new StringBuilder();
        int k = 0;
        sb.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if( prev != curr){
                sb.append(curr);
            }
        }
        return sb.toString();
    }

    static String compressStringV2(String s){
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if( prev != curr){
                if(count != 1){
                    sb.append(count);
                }
                sb.append(curr);
                count = 1;
            }
            else{
                count++;
            }
        }
        if(count != 1){
            sb.append(count);
        }
        return sb.toString();
    }

    private static boolean isPrime(int num){
        for(int div = 2; div * div <= num; div++){
            if(num % div == 0){
                return false;
            }
        }
        return true;
    }
    static void removePrimeNumbers(ArrayList<Integer> al){
        for(int i = al.size() - 1; i >= 0; i--){
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }
    }

    static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z') //Lowercase to uppercase
            {
                char uch = (char)('A' + ch - 'a');
                sb.setCharAt(i, uch);
            }
            else if(ch >= 'A' && ch <= 'Z')//Uppercase to lower case
            {
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }

    static String stringWithASCIIDifference(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            char curr = s.charAt(i);
            int diff = curr - s.charAt(i-1);
            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }

    private static int getFactorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    static void permutationsOfAString(String s){
        int n = s.length();
        int nFact = getFactorial(n);

        for(int i = 0; i < nFact; i++){
            StringBuilder sb = new StringBuilder(s);
            StringBuilder strPer = new StringBuilder();
            int div = i;
            for(int j = n; j > 0; j--){
                int rem = div % j;
                strPer.append(sb.charAt(rem));
                sb.deleteCharAt(rem);
                div = div / j;
            }
            System.out.print(strPer + " ");
        }
    }
}
