import java.util.ArrayList;

public class Recursion {

    public static void printDecreasing(int n){
        if(n == 0){
            System.out.println();
            return;
        }

        System.out.print(n + " ");
        printDecreasing(n-1);
    }

    public static void printIncreasing(int n){
        //base case
        if(n == 0){
            return;
        }

        //recursion
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void printDecreasingIncreasing(int n){
        //base case
        if(n == 0){
            return;
        }

        //recursion
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }

    public static long factorial(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //Recursion
        return n * factorial(n-1);
    }

    public static long power(int x, int n){
        //base case
        if(n == 0 ){
            return 1;
        }

        //Recursion
        return x * power(x,n-1);
    }

    public static long logPower(int x, int n){
        //base case
        if(n == 0 ){
            return 1;
        }
        long xn2 = logPower(x, n/2);
        long xn = xn2 * xn2;
        if(n%2== 1){
            xn *= x;
        }
        return xn;
    }

    public static void printZigZag(int n){
        if(n==0){
            return;
        }

        //Pre
        System.out.print(n + " ");
        printZigZag(n-1);
        //In
        System.out.print(n + " ");
        printZigZag(n-1);
        //Post
        System.out.print(n + " ");
    }

    public static void towerOfHanoi(String A, String B, String C, int disks){
        if(disks == 0){
            return;
        }
        towerOfHanoi(A, C, B, disks -1);
        System.out.println(disks + "[" + A + " -> " + B + "]");
        towerOfHanoi(C, B, A, disks-1);
    }

    public static void displayArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        displayArray(arr, i+1);
    }

    public static void displayArrayInReverse(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        displayArrayInReverse(arr, i+1);
        System.out.println(arr[i]);
    }

    public static int maximum(int[]arr, int i){
        if(i == arr.length-1){
            return arr[i];
        }

        int max = maximum(arr, i+1);
        return Math.max(arr[i], max);
    }

    public static int firstIndex(int[]arr, int num, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == num){
            return i;
        }

        return firstIndex(arr, num,i+1);
    }

    public static int lastIndex(int[]arr, int num, int i){
        if(i == arr.length){
            return -1;
        }
        int idx =  lastIndex(arr, num,i+1);

        if(arr[i] == num){
            return Math.max(i, idx);
        }
        return idx;
    }

    public static void allIndices(int[] arr, int num, int i, ArrayList<Integer> indices){
        if(i == arr.length){
            return;
        }
        if(arr[i] == num){
            indices.add(i);
        }
        allIndices(arr, num, i+1, indices);
    }

    public static ArrayList<String> getSubsequences(String s){
        if(s.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> allSS = new ArrayList<>();

        char ch = s.charAt(0);
        ArrayList<String> css = getSubsequences(s.substring(1));

        for(String ss : css){
            allSS.add("- "+ ss);
        }
        for(String ss : css){
            allSS.add(ch + " " + ss);
        }
        return allSS;
    }

    public static void printSubsequences(String s, String ss){
        if(s.isEmpty()){
            System.out.println(ss);
            return;
        }

        char ch = s.charAt(0);
        String ros = s.substring(1);
        printSubsequences(ros, ss);
        printSubsequences(ros, ss+ch);
    }
    static String[] codes = {":,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> keyPadCombination(String s){
        if(s.isEmpty()){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }

        int dig = s.charAt(0) -'0';
        ArrayList<String> remStrCombination = keyPadCombination(s.substring(1));
        String code = codes[dig];
        ArrayList<String> allCombinations = new ArrayList<>();
        for(int i = 0; i < code.length(); i++){
            for(String comb : remStrCombination){
                allCombinations.add(code.charAt(i)+comb);
            }
        }
        return allCombinations;
    }
    public static void printKeypadCombinations(String s, String comb){

        if(s.isEmpty()){
            System.out.println(comb);
            return;
        }

        int dig = s.charAt(0) - '0';
        String code = codes[dig];
        String remStr = s.substring(1);
        for(int i = 0; i < code.length(); i++){
            printKeypadCombinations(remStr, comb+code.charAt(i));
        }
    }
    static int[] jumps = {1, 2, 3};
    public static ArrayList<String> getStairsPath(int stairs){
        if(stairs == 0){
            ArrayList<String> dest = new ArrayList<>();
            dest.add("0");
            return dest;
        }
        ArrayList<String> allPaths = new ArrayList<>();
        for(int i = 0; i < jumps.length; i++){
            int nextStair = stairs-jumps[i];
            if(nextStair >= 0) {
                ArrayList<String> recPaths = getStairsPath(nextStair);
                for(String path : recPaths){
                    allPaths.add(stairs+ " -> " + path);
                }
            }
        }
        return allPaths;
    }

    public static void printStairsPath(int stairs, String path){
        if(stairs == 0){
            System.out.println(path+"0");
            return;
        }
        for(int jump : jumps) {
            if (stairs - jump >= 0) {
                printStairsPath(stairs - jump, path + stairs + " -> ");
            }
        }
    }

    public static ArrayList<String> getMazePaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return new ArrayList<>();
        }
        else if(i == n-1 && j == m-1){
            ArrayList<String> path = new ArrayList<>();
            path.add("");
            return path;
        }

        ArrayList<String> hPaths = getMazePaths(i, j+1, n, m);
        ArrayList<String> vPaths = getMazePaths(i+1, j, n, m);

        ArrayList<String> allPaths = new ArrayList<>();
        for(String hPath: hPaths){
            allPaths.add("h"+hPath);
        }

        for(String vPath: vPaths){
            allPaths.add("v"+vPath);
        }
        return allPaths;
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String path){
        if(sr == dr && sc == dc){
            System.out.println(path);
            return;
        }

        if(sc < dc){
            printMazePaths(sr, sc+1, dr, dc, path+"h");
        }

        if(sr < dr){
            printMazePaths(sr+1, sc, dr, dc, path+"v");
        }
    }
    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> path = new ArrayList<>();
            path.add("");
            return path;
        }

        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> dPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        ArrayList<String> allPaths = new ArrayList<>();

        int hJumps = 1;
        while(hJumps < dc && sc < dc){ //hJumps <= dc-sc
            hPaths = getMazePathsWithJumps(sr, sc+hJumps, dr, dc);
            for(String hPath: hPaths){
                allPaths.add(hJumps+"h"+hPath);
            }
            hJumps++;
        }

        int dJumps = 1;
        while(dJumps < dr && sr < dr && sc < dc && dJumps < dc){ //dJumps <= dc-sc && dJumps <= dr-sr
            dPaths = getMazePathsWithJumps(sr+dJumps, sc+dJumps, dr, dc);
            for(String dPath: dPaths){
                allPaths.add(dJumps+"d"+dPath);
            }
            dJumps++;
        }

        int vJumps = 1;
        while(vJumps < dr && sr < dr){ // vJumps <= dr-sr
            vPaths = getMazePathsWithJumps(sr+vJumps, sc, dr, dc);
            for(String vPath: vPaths){
                allPaths.add(vJumps+"v"+vPath);
            }
            vJumps++;
        }
        return allPaths;
    }

    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String path){
        if(sr == dr && sc == dc){
            System.out.println(path);
            return;
        }
        //Horizontal moves
        for(int jump = 1; jump <= dc-sc; jump++){
            printMazePathsWithJumps(sr, sc+jump, dr, dc, path + jump + "h");
        }
        //Diagonal moves
        for(int jump = 1; jump <= dc-sc && jump <= dr-sr; jump++){
            printMazePathsWithJumps(sr+jump, sc+jump, dr, dc, path + jump + "d");
        }
        //Vertical moves
        for(int jump = 1; jump <= dr-sr; jump++){
            printMazePathsWithJumps(sr+jump, sc, dr, dc, path + jump + "v");
        }
    }

    public static void printPermutations(String s, String permutation){
        if(s.isEmpty()){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i+1);
            printPermutations(ros, permutation+ch);
        }
    }

}
