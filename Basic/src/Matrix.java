import java.util.LinkedList;
import java.util.Queue;

public class Matrix {
    static void display(int[][] a){
        int n = a.length;
        if(n > 0) {
            int m = a[0].length;
            for (int[] ints : a) {
                System.out.print("[ ");
                for (int j = 0; j < m; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println("]");
            }
        }
    }

    static void display(int[] a){
        int n = a.length;
        if(n > 0) {
            System.out.print("[ ");
            for (int ints : a) {
                System.out.print(ints + " ");
            }
            System.out.println("]");
        }
    }

    static void matrixMultiplication(int[][] a, int[][] b){

        int n1 = a.length;
        int m1 = a[0].length;

        int n2 = b.length;
        int m2 = b[0].length;

        if(m1 != n2){
            System.out.println("Invalid input!");
            return;
        }
        int[][] res = new int[n1][m2];

        //res(i, j) += a(i, k) b (k, j)
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m2; j++){
                for(int k = 0; k < m1; k++){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        display(res);
    }

    static void waveTraversal(int[][] a){
        int r = a.length;
        int c = a[0].length;
        boolean downDirection = true;
        for(int i = 0; i < c; i++){
            if(downDirection) {
                for(int j = 0; j < r; j++)
                {
                    System.out.print(a[j][i] + " ");
                }
                downDirection = false;
            }
            else{
                for(int j = r-1; j >= 0; j--)
                {
                    System.out.print(a[j][i] + " ");
                }
                downDirection = true;
            }
        }
    }

    static void spiralTraversal(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        int minr = 0;
        int minc = 0;
        int maxr = r - 1;
        int maxc = c - 1;

        int total = r * c;
        int count = 0;

        while(count < total){
            for(int i = minr, j = minc; i <= maxr && count < total; i++){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minc++;
            for(int i = maxr, j = minc; j <= maxc && count < total; j++){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxr--;
            for(int i = maxr, j = maxc; i >= minr && count < total; i--){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxc--;
            for(int i = minr, j = maxc; j >= minc && count < total; j--){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minr++;
        }
    }

    static void exitPointOfAMatrix(int[][] arr){

        int direction = 0; //e-0, s-1, w-2, n-3
        int i = 0;
        int j = 0;
        int r = arr.length;
        int c = arr[0].length;
        while(true){
            direction = (direction + arr[i][j]) % 4;

            switch(direction){
                case 0:
                    j++;
                    break;

                case 1:
                    i++;
                    break;

                case 2:
                    j--;
                    break;

                case 3:
                    i--;
                    break;
            }

            if(i < 0){
                i++; break;
            }
            else if(j < 0){
                j++; break;
            }
            if(i > r - 1){
                i--; break;
            }
            if(j > c - 1){
                j--; break;
            }

        }

        System.out.println("Exit Point: (" + i + ", " + j + ")");
    }

    static void rotateBy90Degree(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        //Transpose
        for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Reverse the columns
        for(int i = 0; i < r; i++){
            int li = 0;
            int ri = c - 1;

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

        display(arr);
    }

    static void shellRotate(int[][] arr, int shell, int r){
        int[] oneD = fillOneDFromShell(arr, shell);
        if(oneD == null){
            System.out.println("Invalid Shell!");
            return;
        }
        rotateTheArray(oneD, r);
        fillShellFromOneD(arr, shell, oneD);
        display(arr);
    }

    static int[] fillOneDFromShell(int[][] arr, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        if(minr > maxr || minc > maxc){
            return null;
        }
        int n = 2 * ((maxr - minr) + (maxc - minc));
        int[] oned = new int[n];
        int k = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[k] = arr[i][j];
            k++;
        }
        minc++;

        for (int i = maxr, j = minc; j <= maxc; j++) {
            oned[k] = arr[i][j];
            k++;
        }
        maxr--;

        for (int i = maxr, j = maxc; i >= minr; i--) {
            oned[k] = arr[i][j];
            k++;
        }
        maxc--;

        for (int i = minr, j = maxc; j >= minc; j--) {
            oned[k] = arr[i][j];
            k++;
        }
        minr++;
        return oned;
    }
    static void rotateTheArray(int[] a, int r){
        r = r % a.length;

        if(r < 0){
            r += a.length;
        }

        int rp = a.length - r;
        reverseAnArray(a, 0, rp - 1);
        reverseAnArray(a, rp, a.length-1);
        reverseAnArray(a, 0, a.length-1);
    }
    static void reverseAnArray(int[] a, int li, int ri){
        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++; ri--;
        }
    }
    static void fillShellFromOneD(int[][] arr, int s, int[] oneD){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int k = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oneD[k];
            k++;
        }
        minc++;

        for (int i = maxr, j = minc; j <= maxc; j++) {
            arr[i][j] = oneD[k];
            k++;
        }
        maxr--;

        for (int i = maxr, j = maxc; i >= minr; i--) {
            arr[i][j] = oneD[k];
            k++;
        }
        maxc--;

        for (int i = minr, j = maxc; j >= minc; j--) {
            arr[i][j] = oneD[k];
            k++;
        }
        minr++;
    }

    static void printDiagonals(int[][] arr){
        int d = 0;
        int rows = arr.length;
        while(d < rows){
            int i = 0;
            int j = d;
            System.out.print("Diagonal - " + d + ": ");
            while(j < rows){
                System.out.print(arr[i][j] + " ");
                i++; j++;
            }
            System.out.println();
            d++;
        }
    }

    static void saddlePoint(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        boolean isSaddlePoint;
        for (int i = 0; i < rows; i++) {
            int posCol = 0;
            int leastInRow = arr[i][posCol];
            for(int j = 1; j < cols; j++){
                if(leastInRow > arr[i][j]){
                    leastInRow = arr[i][j];
                    posCol = j;
                }
            }
            isSaddlePoint = true;
            for(int k = 0; k < rows; k++){
                if(arr[k][posCol] > leastInRow){
                    isSaddlePoint = false;
                    break;
                }
            }
            if(isSaddlePoint){
                System.out.println("Saddle Point: " + leastInRow + " is at: (" + i + "," + posCol  + ")");
                return;
            }
        }

        System.out.println("No saddle point.");
    }

    static void searchInASortedArray(int[][] arr, int num){
        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0;
        int j =  cols - 1;

        while(i < rows && j >= 0){
            if(arr[i][j] == num){
                System.out.println("Found at index: (" + i + "," + j + ")");
                return;
            }
            else if(arr[i][j] < num){
                i++;
            }
            else{
                j--;
            }
        }

        System.out.println("Not found");
    }

    static void inverse(int[] a){
        int[] inverse = new int[a.length];

        for(int i = 0 ; i < a.length; i++){
            inverse[a[i]] = i;
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(inverse[i] + " ");
        }
    }

    static void subArrays(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int k = i;
                System.out.print("[");
                while(k <= j) {
                    System.out.print(a[k] + " ");
                    k++;
                }
                System.out.println("]");
            }
        }
    }
    
    static void subsets(String a){
        int n = a.length();
        if(n == 0){
            return;
        }
//        List<String> subsets = new ArrayList<>((int) Math.pow(2, n));
//        subsets.add("- ");
//        subsets.add(a.charAt(0) +" ");
        Queue<String> q = new LinkedList<>();
        q.add("- ");
        q.add(a.charAt(0) +" ");
        q.add(null);
        for(int i = 1; i < n ; i++){
            char ch = a.charAt(i);
            while(q.peek() != null){
                String el = q.remove();
                q.add(el + "- ");
                q.add(el + ch + " ");
            }
            q.remove();
            q.add(null);
        }

        while(q.peek() != null){
            System.out.println(q.remove());
        }
    }

    static int binarySearch(int[] a, int l, int h, int data){

        if(l <= h){
            int m = l + (h - l)/2;

            if(a[m] == data){
                return m;
            }
            else if(a[m] > data){
                return binarySearch(a, l, m-1, data);
            }
            else{
                return binarySearch(a, m+1, h, data);
            }
        }
        return -1;
    }

    static void ceilAndFloor(int[] a, int data){
        int l = 0;
        int h = a.length -1;
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        while(l <= h){
            int m = (l+h) / 2;
             if(a[m] == data){
                 System.out.println("Ceil and floor of data " + data + " is: " + a[m] );
                 return;
             }
             else if(a[m] > data){
                 ceil = a[m];
                 h = m-1;
             }
             else{
                 floor = a[m];
                 l = m+1;
             }
        }
        System.out.println("Ceil and floor of data " + data +" are: " + ceil + " and " + floor);
    }

    static void firstAndLastIndex(int[] a, int data){
        int l = 0;
        int h = a.length-1;

        int li = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(a[m] < data){
                l = m+1;
            }
            else if(a[m] > data){
                h = m-1;
            }
            else{
                li = m;
                l = m+1;
            }
        }

        l = 0; h = a.length-1;
        int fi = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(a[m] < data){
                l = m+1;
            }
            else if(a[m] > data){
                h = m-1;
            }
            else{
                fi = m;
                h = m-1;
            }
        }

        System.out.println("Data: " + data);
        System.out.println("First Index: " + fi);
        System.out.println("Last Index: " + li);
    }
}
