public class Arrays {

    public static int spanOfAnArray(int[] arr){

        if(arr.length == 0){
            return -1;
        }
        if(arr.length == 1){
            return 0;
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static int getElementIndex(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void printBarChart(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int j = max; j > 0 ; j--){
            for (int k : arr) {
                if (k >= j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static int sumOfTwoArrays(int[] num1, int[] num2){
        int sum = 0;
        int place = 1;
        int c = 0;
        int i = num1.length - 1;
        int j = num2.length - 1;
        while(i >= 0 && j >= 0){
            int d = num1[i] + num2[j] + c;
            c = d / 10;
            d = d % 10;
            sum += d * place;
            place *= 10;
            i--; j--;
        }

        while(i >= 0){
            int d = num1[i] + c;
            c = d / 10;
            d = d % 10;
            sum += d * place;
            place *= 10;
            i--;
        }

        while(j >= 0){
            int d = num2[j] + c;
            c = d / 10;
            d = d % 10;
            sum += d * place;
            place *= 10;
            j--;
        }
        return sum;
    }

    public static int[] differenceOfTwoArrays(int[] num1, int[] num2){
        int n = num1.length - 1;
        int m = num2.length - 1;
        int k = Math.max(n, m);
        int[] res = new int[k + 1];
        int c = 0;
        while(k >= 0){
            int d = c;
            if(m >= 0){
                d += num2[m];
                m--;
            }
            if(n >= 0){
               if(d >= num1[n]){
                   d = d - num1[n];
                   c = 0;
               }
               else{
                   d = d + 10 - num1[n];
                   c = -1;
               }
               n--;
            }
            res[k] = d;
            k--;
        }
        return res;
    }
}
