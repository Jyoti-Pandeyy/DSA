import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        //region RECURSION

        //region Print Decreasing using Recursion
//        int n = 10;
//        System.out.println("Print Decreasing for n: " + n );
//        Recursion.printDecreasing(n);
        //endregion

        //region Print Increasing using Recursion
//        int n = 10;
//        System.out.println("Print Increasing for n: " + n );
//        Recursion.printIncreasing(n);
        //endregion

        //region Print Decreasing-Increasing using Recursion
//        int n = 10;
//        System.out.println("Print Decreasing-Increasing for n: " + n );
//        Recursion.printDecreasingIncreasing(n);
        //endregion

        //region Factorial using Recursion
//        int n = 5;
//        System.out.print(n + "!= ");
//        System.out.println(Recursion.factorial(n));
        //endregion

        //region Power of x^n

        // Using simple x * x^n-1 Recursion
//        int x = 2;
//        int n = 30;
//        System.out.print(x + "^" + n + "= ");
//        Instant start = Instant.now();
//        System.out.println(Recursion.power(x,n));
//        Instant end = Instant.now();
//        System.out.println("Time Elapsed: " + Duration.between(start, end).toMillis());
//
//        //Using Log Recursion: x^n/2 * x^n/2
//        System.out.print(x + "^" + n + "= ");
//        Instant start2 = Instant.now();
//        System.out.println(Recursion.logPower(x,n));
//        Instant end2 = Instant.now();
//        System.out.println("Time Elapsed: " + Duration.between(start2, end2).toMillis());
        //endregion

        //region print Zig Zag: to understand the flow of recursion
//        int n = 5;
//        System.out.print("n = " + n);
//        Recursion.printZigZag(n);
        //endregion

        //region Tower Of Hanoi
//        System.out.println("Tower of Hanoi: ");
//        Recursion.towerOfHanoi("towerA", "towerB", "helper", 3);
        //endregion

        //region Display array using recursion
//        //From 0 to n
//        System.out.println("Display Array from 0 to n: ");
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        Recursion.displayArray( arr, 0);
//
//        //From n to 0
//
//        System.out.println("Display Array from n to 0: ");
//        Recursion.displayArrayInReverse( arr, 0);
        //endregion

        //region Maximum in an array
//        System.out.print("Maximum in the array: ");
//        int[] arr = {10, 25, 63, 42, 59, 46};
//
//        System.out.println(Recursion.maximum(arr, 0));
        //endregion

        //region First Index
//        System.out.print("First Index in the array: ");
//        int[] arr = {1, 2, 3, 2, 4, 5, 7, 2, 5, 7, 6, 8, 9};
//
//        System.out.println(Recursion.firstIndex(arr, 7, 0));
        //endregion

        //region Last Index
//        System.out.print("Last Index in the array: ");
//        int[] arr = {1, 2, 3, 2, 4, 5, 7, 2, 5, 7, 6, 8, 9};
//
//        System.out.println(Recursion.lastIndex(arr, 7, 0));
        //endregion

        //region All Indices
//        System.out.print("All indices in the array: ");
//        int[] arr = {1, 2, 3, 2, 4, 5, 7, 2, 5, 7, 6, 8, 9};
//        ArrayList<Integer> indices = new ArrayList<>();
//        Recursion.allIndices(arr, 7, 0, indices);
//        System.out.print(indices);
        //endregion

        //endregion

    }

}

//region BASIC
//region Is Number Prime
//        int n = scn.nextInt();
//        boolean isPrime = Basic.isNumberPrime(n);
//        System.out.print(isPrime);
//endregion

//region All Prime Numbers Till N
//        int n = scn.nextInt();
//        Basic.printAllPrimes(n);
//endregion

//region First n Fibonacci Numbers
//        int n = scn.nextInt();
//        Basic.firstNFibonacciNumbers(n);
//endregion

//region Count the digits of a number
//        int n = scn.nextInt();
//        Basic.digitsCount(n);
//endregion

//region Reverse of a number
//        int n = scn.nextInt();
//        Basic.reverseOfANumber(n);
//endregion

//region Reverse of a number
//        int n = scn.nextInt();
//        Basic.inverseOfANumber(n);
//endregion

//region Rotate a number 'n' by 'k' places
//        int n = scn.nextInt();
//        int k = scn.nextInt();
//        Basic.rotateANumber(n, k);
//endregion

//region Rotate a number 'n' by 'k' places
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//        Basic.gcdAndLcm(n, m);
//endregion

//region Is Pythagorean Triplet
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//        Basic.isPythagoreanTriplet(a, b, c);
//endregion

//region Benjamin Bulbs : Perfect Squares
//        int n = scn.nextInt();
//        Basic.benjaminBulbs(n);
//endregion

//region Prime Factorization
//        int n = scn.nextInt();
//        Basic.primeFactorization(n);
//endregion

//endregion

//region FUNCTIONS

//region Permutation: nPr
//        int n = scn.nextInt();
//        int r = scn.nextInt();
//        long nFact = Functions.factorial(n);
//        long nmrFact = Functions.factorial(n-r);
//        long nPr = nFact / nmrFact;
//        long nPr2 = Functions.permutation(n, r);
//        System.out.println("1:" + n + "P" + r + "=" + nPr);
//        System.out.println("2:" + n + "P" + r + "=" + nPr2);
//endregion

//region Frequency of a digit
//        long num = scn.nextLong();
//        int dig = scn.nextInt();
//        int count = Functions.digitFrequency(num, dig);
//        System.out.println(count);
//endregion

//region Decimal to any base
//        int num = scn.nextInt();
//        int toBase = scn.nextInt();
//        int convertedNum = Functions.decimalToAnyBase(num, toBase);
//        System.out.println(convertedNum);
//endregion

//region Any base to decimal
//        int num = scn.nextInt();
//        int fromBase = scn.nextInt();
//        int convertedNum = Functions.anyBaseToDecimal(num, fromBase);
//        System.out.println(convertedNum);
//endregion

//region Any base to any base
//        int num = scn.nextInt();
//        int fromBase = scn.nextInt();
//        int toBase = scn.nextInt();
//        int convertedNum = Functions.anyBaseToAnyBase(num, fromBase, toBase);
//        System.out.println(convertedNum);
//endregion

//region Any base addition
//        int num1 = scn.nextInt();
//        int num2 = scn.nextInt();
//        int base = scn.nextInt();
//        long convertedNum = Functions.anyBaseAddition(num1, num2, base);
//        int result = Functions.getSum(num1, num2, base);
//        System.out.println("1:" + convertedNum);
//        System.out.println("2:" + result);
//endregion

//region Any base to any subtraction
//        int num1 = scn.nextInt();
//        int num2 = scn.nextInt();
//        int base = scn.nextInt();
//        int convertedNum = Functions.anyBaseSubtraction(num1, num2, base);
//        int result = Functions.getDifference(num1, num2, base);
//        System.out.println("1:" + convertedNum);
//        System.out.println("2:" + result);
//endregion

//region Any base to any multiplication
//        int num1 = scn.nextInt();
//        int num2 = scn.nextInt();
//        int base = scn.nextInt();
//        long convertedNum = Functions.anyBaseMultiplication(num1, num2, base);
//        int result = Functions.getProduct(num1, num2, base);
//        int result3 = Functions.getProductV2(num1, num2, base);
//        System.out.println("1:" + convertedNum);
//        System.out.println("2:" + result);
//        System.out.println("3:" + result3);
//endregion

//endregion

//region ARRAYS

//region Span of an array
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        int span = Arrays.spanOfAnArray(arr);
//        System.out.println(span);
//endregion

//region Get Element's Index
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        int x = scn.nextInt();
//        int index = Arrays.getElementIndex(arr, x);
//        System.out.println(index);
//endregion

//region Print Bar Chart
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        Arrays.printBarChart(arr);
//endregion

//region Sum of 2 arrays
//        int n = scn.nextInt();
//        int[] arr1 = new int[n];
//        for(int i = 0; i < n; i++){
//            arr1[i] = scn.nextInt();
//        }
//        int m = scn.nextInt();
//        int[] arr2 = new int[m];
//        for(int i = 0; i < m; i++){
//            arr2[i] = scn.nextInt();
//        }
//        int sum = Arrays.sumOfTwoArrays(arr1, arr2);
//        System.out.println(sum);
//endregion

//region Difference of 2 arrays
//        int n = scn.nextInt();
//        int[] arr1 = new int[n];
//        for(int i = 0; i < n; i++){
//            arr1[i] = scn.nextInt();
//        }
//        int m = scn.nextInt();
//        int[] arr2 = new int[m];
//        for(int i = 0; i < m; i++){
//            arr2[i] = scn.nextInt();
//        }
//        int[] diff = Arrays.differenceOfTwoArrays(arr1, arr2);
//        for(int j : diff){
//            System.out.print(j);
//        }
//endregion
//endregion

//region STACK

//region Duplicate Brackets
//        String exp = scn.nextLine();
//        boolean flag = Stacks.isDuplicateBrackets(exp);
//        System.out.println(exp + "-> " + flag);
//endregion

//region Balanced Brackets
//        String exp = scn.nextLine();
//        boolean flag = Stacks.isBalancedBrackets(exp);
//        System.out.println(exp + "-> " + flag);
//endregion

//region Next Greater Element to the right
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++)
//        {
//            arr[i] = scn.nextInt();
//        }
//        int[] nge = Stacks.nextGreaterElementOnRight(arr);
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Greater Element for " + arr[i] +" is: " + nge[i]);
//        }

//        int[] nge2 = Stacks.nextGreaterElementOnRightV2(arr);
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Greater Element for " + arr[i] +" is: " + nge2[i]);
//        }
//endregion

//region Next Smaller Element to the right
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++)
//        {
//            arr[i] = scn.nextInt();
//        }
//        int[] nge = Stacks.nextSmallerElementOnRight(arr);
//        System.out.println();
//        System.out.println("-----------------------Approach 1-----------------------------");
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Smaller Element for " + arr[i] +" is: " + nge[i]);
//        }
//
//        int[] nge2 = Stacks.nextSmallerElementOnRightV2(arr);
//        System.out.println("-----------------------Approach 2-----------------------------");
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Smaller Element for " + arr[i] +" is: " + nge2[i]);
//        }
//endregion

//region Next Greater Element to the left
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++)
//        {
//            arr[i] = scn.nextInt();
//        }
//        int[] nge = Stacks.nextGreaterElementOnLeft(arr);
//        System.out.println();
//        System.out.println("-----------------------Approach 1-----------------------------");
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Greater Element for " + arr[i] +" is: " + nge[i]);
//        }
//
//        int[] nge2 = Stacks.nextGreaterElementOnLeftV2(arr);
//        System.out.println("-----------------------Approach 2-----------------------------");
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Greater Element for " + arr[i] +" is: " + nge2[i]);
//        }
//endregion

//region Next Smaller Element to the left
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++)
//        {
//            arr[i] = scn.nextInt();
//        }
//        int[] nse = Stacks.nextSmallerElementOnLeft(arr);
//        System.out.println();
//        System.out.println("-----------------------Approach 1-----------------------------");
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Smaller Element for " + arr[i] +" is: " + nse[i]);
//        }
//
//        int[] nse2 = Stacks.nextSmallerElementOnLeftV2(arr);
//        System.out.println("-----------------------Approach 2-----------------------------");
//        for(int i = 0; i < n ; i++){
//            System.out.println("Next Smaller Element for " + arr[i] +" is: " + nse2[i]);
//        }
//endregion

//region Stock Span
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        int[] span = Stacks.stockSpan(arr);
//        for(int i = 0; i < n; i++){
//            System.out.println("Span of " + arr[i] + " is: " + span[i]);
//        }
//endregion

//region Largest Area In Histogram
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        int maxArea = Stacks.largestAreaInHistogram(arr);
//        System.out.println("Largest area in histogram is:  " + maxArea);
//endregion

//region Largest Area In Histogram
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        int k = scn.nextInt();
//        int[] maxInSlidingWindow = Stacks.maxInSlidingWindow(arr, k);
//        for(int i = 0; i < maxInSlidingWindow.length; i++){
//            System.out.println("Maximum for " + arr[i] + " is: " + maxInSlidingWindow[i]);
//        }
//endregion

//region Infix Evaluation
//        String exp = scn.nextLine();
//        float result = Stacks.infixEvaluation(exp);
//        System.out.println(result);
//endregion

//region Infix Conversions
//        String exp = scn.nextLine();
//        Stacks.infixConversions(exp);
//endregion

//region Postfix Evaluations and Conversions
//        String exp = scn.nextLine();
//        Stacks.postfixEvaluationAndConversions(exp);
//endregion

//region Prefix Evaluations and Conversions
//        String exp = scn.nextLine();
//        Stacks.prefixEvaluationAndConversions(exp);
//endregion

//region Celebrity Problem

//        int n = scn.nextInt();
//        int[][] arr = new int[n][n];
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                arr[i][j] = scn.nextInt();
//            }
//        }
//
//        Stacks.findCelebrity(arr);
//endregion

//region Overlapping Intervals
//        int n = scn.nextInt();
//        int[][] arr = new int[n][2];
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < 2; j++){
//                arr[i][j] = scn.nextInt();
//            }
//        }
//
//        Stacks.overlappingIntervals(arr);
//endregion

//region Overlapping Intervals
//        String pattern = scn.nextLine();
//        Stacks.smallestNumberFollowingPattern(pattern);
//endregion
//endregion

//region OOPS

//region Reference and Instance

//        Oops.Person p1 = new Oops.Person();
//        p1.age = 10;
//        p1.name = "A";
//        p1.saysHi();
//
//        Oops.Person p2 = new Oops.Person();
//        p2.age = 20;
//        p2.name = "B";
//        p2.saysHi();
//
//        Oops.Person p3 = p1;
//        p3.age = 30;
//        p1.saysHi();
//        p3.saysHi();

//endregion

//region Swap Game 1: Passing reference - swapping reference does not swap the memory or the member values
//        Oops.Person p1 = new Oops.Person();
//        p1.age = 10;
//        p1.name = "A";
//        Oops.Person p2 = new Oops.Person();
//        p2.age = 20;
//        p2.name = "B";
//
//        p1.saysHi();
//        p2.saysHi();
//        Oops.Person.Swap1(p1, p2);
//        p1.saysHi();
//        p2.saysHi();
//endregion

//region Swap Game 2: Passing reference - swapping the members does not swap the memory address, but the values are swapped
//        Oops.Person p1 = new Oops.Person();
//        p1.age = 10;
//        p1.name = "A";
//        Oops.Person p2 = new Oops.Person();
//        p2.age = 20;
//        p2.name = "B";
//
//        p1.saysHi();
//        p2.saysHi();
//        Oops.Person.Swap2(p1, p2);
//        p1.saysHi();
//        p2.saysHi();
//endregion

//region Swap Game 3: Passing reference - swapping the members does not swap the memory address, but the values are swapped
//        Oops.Person p1 = new Oops.Person();
//        p1.age = 10;
//        p1.name = "A";
//        Oops.Person p2 = new Oops.Person();
//        p2.age = 20;
//        p2.name = "B";
//
//        p1.saysHi();
//        p2.saysHi();
//        Oops.Person.Swap3(p1, p2);
//        p1.saysHi();
//        p2.saysHi();
//endregion


//endregion

//region CUSTOM STACK

//region Build Normal/Dynamic stack when capacity is given

//        int cap = scn.nextInt();
//        CustomTypes.CustomStack st = new CustomTypes.CustomStack(cap);
//
//        st.display();
//        st.push(1);
//        st.push(2);
//        System.out.println("Value at top: " + st.peek());
//        System.out.println("Size: " + st.size());
//        st.display();
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Size: " + st.size());
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println("Value at top: " + st.peek());
//        System.out.println("Size: " + st.size());
//        st.push(6);
//        st.push(7);
//        st.display();
//        System.out.println("Value at top: " + st.peek());
//        System.out.println("Size: " + st.size());
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Popped Value: " + st.pop());
//        System.out.println("Size: " + st.size());
//endregion

//endregion

//region GENERIC TREE

//region Constructor

//    ArrayList<Integer> values = new ArrayList<>(
//            Arrays.asList(10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1)
//    );
//
//    GenericTree gt = new GenericTree(values);
//    GenericTree.Node root = gt.root;
//
//        ArrayList<Integer> values2 = new ArrayList<>(
//                Arrays.asList(1, 2, 5, -1, 6, -1, -1, 3, 7, -1, 8, 11, -1, 12, -1, -1, 9, -1, -1, 4, 10, -1, -1, -1)
//        );
//
//        GenericTree gt2 = new GenericTree(values2);
//        GenericTree.Node root2 = gt2.root;
//
//        ArrayList<Integer> values3 = new ArrayList<>(
//                Arrays.asList(1, 4, 10, -1, -1, 3, 9, -1, 8, 12, -1, 11, -1, -1, 7, -1, -1, 2, 6, -1, 5, -1, -1, -1)
//        );
//
//        GenericTree gt3 = new GenericTree(values3);
//        GenericTree.Node root3 = gt3.root;

//endregion

//region Display

//        GenericTree.display(root);

//endregion

//region Size

//        System.out.println("Size: " + GenericTree.size(root));

//endregion

//region Maximum

//        System.out.println("Maximum in a tree: " + GenericTree.maximum(root));

//endregion

//region Height

//        System.out.println("Height(Nodes) of a tree: " + GenericTree.heightWrtNodes(root));
//        System.out.println("Height(Edges) of a tree: " + GenericTree.heightWrtEdges(root));

//endregion

//region Pre Post Traversal

//        GenericTree.prePostTraversal(root);

//endregion

//region Level Order Traversal

//        GenericTree.levelOrderTraversal(root);

//endregion

//region Level Order Linewise Traversal
//        System.out.println("--------------Line Wise Traversal-----------------");
//        GenericTree.levelOrderLinewiseTraversal(root);

//endregion

//region Level Order Zig Zag Traversal
//        System.out.println();
//        System.out.println("--------------Zig Zag Traversal-----------------");
//        GenericTree.levelOrderZigZag(root);

//endregion

//region Level Order Linewise Traversal Approach 2
//        System.out.println();
//        System.out.println("--------------Line Wise Traversal 2-----------------");
//        GenericTree.levelOrderLinewiseTraversal2(root);

//endregion

//region Level Order Linewise Traversal Approach 3
//        System.out.println();
//        System.out.println("--------------Line Wise Traversal 3-----------------");
//        GenericTree.levelOrderLinewiseTraversal3(root);

//endregion

//region Level Order Linewise Traversal Approach 4
//        System.out.println();
//        System.out.println("--------------Line Wise Traversal 3-----------------");
//        GenericTree.levelOrderLinewiseTraversal4(root);

//endregion

//region Mirror Tree
//        System.out.println("-------------Mirror Tree------------------");
//        GenericTree.getMirrorTree(root);
//        GenericTree.display(root);

//endregion

//region Remove leaves
//        System.out.println("-------------Remove Leaf Nodes------------------");
//        GenericTree.removeLeafNodes(root);
//        GenericTree.display(root);

//endregion

//region Linearize Generic Tree
//        System.out.println("-------------Linearize Generic Tree------------------");
//        GenericTree.linearizeGenericTree(root);
//        GenericTree.display(root);

//endregion

//region Linearize Generic Tree 2
//        System.out.println("-------------Linearize Generic Tree 2------------------");
//        GenericTree.linearizeGenericTree2(root);
//        GenericTree.display(root);

//endregion

//region Element Exists
//        System.out.println("-------------Find an element------------------");
//        int val = scn.nextInt();
//        System.out.println(GenericTree.elementExists(root, val));

//endregion

//region Node to root path
//        System.out.println("-------------Node to root path------------------");
//        int val = scn.nextInt();
//        System.out.println(GenericTree.elementExists(root, val));
//        System.out.println(GenericTree.nodeToRootPath(root, val));

//endregion

//region Lowest Common Ancestor
//        System.out.println("-------------Lowest Common Ancestor------------------");
//        int val1 = scn.nextInt();
//        int val2 = scn.nextInt();
//        System.out.println(GenericTree.nodeToRootPath(root, val1));
//        System.out.println(GenericTree.nodeToRootPath(root, val2));
//        System.out.println(GenericTree.lowestCommonAncestor(root, val1, val2));

//endregion

//region Distance between nodes
//        System.out.println("-------------Distance between nodes------------------");
//        int val1 = scn.nextInt();
//        int val2 = scn.nextInt();
//        System.out.println(GenericTree.nodeToRootPath(root, val1));
//        System.out.println(GenericTree.nodeToRootPath(root, val2));
//        System.out.println(GenericTree.distanceBetweenNodes(root, val1, val2));

//endregion

//region Are trees similar
//        System.out.println("-------------Are trees similar------------------");
//        System.out.println(GenericTree.isSimilar(root, root2));

//endregion

//region Are trees mirror images
//        System.out.println("-------------Are trees mirror images------------------");
//        System.out.println(GenericTree.isMirrorImage(root2, root));
//        System.out.println(GenericTree.isMirrorImage(root2, root3));

//endregion

//region Is tree symmetric
//        System.out.println("-------------Is tree symmetric?------------------");
//        System.out.println(GenericTree.isMirrorImage(root2, root2));
//        System.out.println(GenericTree.isMirrorImage(root3, root3));

//endregion

//region Get predecessor and successor
//        System.out.println("-------------Get predecessor and successor------------------");
//        GenericTree.predecessor = null;
//        GenericTree.successor = null;
//        GenericTree.state = 0;
//        int val = scn.nextInt();
//        GenericTree.getPredecessorAndSuccessor(root, val);
//        if(GenericTree.predecessor == null){
//            System.out.println("Predecessor: NOT FOUND");
//        }
//        else {
//            System.out.println("Predecessor: " + GenericTree.predecessor.data);
//        }
//        if(GenericTree.successor == null){
//            System.out.println("Successor: NOT FOUND");
//        }
//        else {
//            System.out.println("Successor: " + GenericTree.successor.data);
//        }

//endregion

//region Get ceil and floor
//        System.out.println("-------------Get ceil and floor------------------");
//        GenericTree.ceil = Integer.MAX_VALUE;
//        GenericTree.floor = Integer.MIN_VALUE;
//        int val = scn.nextInt();
//        GenericTree.getCeilAndFloor(root, val);
//        System.out.println("Ceil: " + GenericTree.ceil);
//        System.out.println("Floor: " + GenericTree.floor);

//endregion

//region Get Kth Largest
//        System.out.println("-------------Get Kth Largest------------------");
//        GenericTree.ceil = Integer.MAX_VALUE;
//        GenericTree.floor = Integer.MIN_VALUE;
//        System.out.print("k: ");
//        int k = scn.nextInt();
//        System.out.println("kth Largest: " + GenericTree.getKthLargest(root, k));

//endregion

//region Get Maximum sum subtree
//        ArrayList<Integer> values4 = new ArrayList<>(
//                Arrays.asList(10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1, -1, 90, -1, -1, 40, -100, -1, -1, -1)
//        );
//
//        GenericTree gt4 = new GenericTree(values4);
//        GenericTree.Node root4 = gt4.root;
//        System.out.println("-------------Get Maximum Sum Subtree Node------------------");
//        GenericTree.maxSubtreeSumNode = null;
//        GenericTree.maxSubtreeSum = Integer.MIN_VALUE;
//        GenericTree.getMaximumSumSubtree(root4);
//        System.out.println("Node with Maximum Sum of Subtree is: " + GenericTree.maxSubtreeSumNode.data + "@" +GenericTree.maxSubtreeSum);

//endregion

//region Get Diameter
//        ArrayList<Integer> values4 = new ArrayList<>(
//                Arrays.asList(10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1, -1, 90, -1, -1, 40, -100, -1, -1, -1)
//        );
//
//        GenericTree gt4 = new GenericTree(values4);
//        GenericTree.Node root4 = gt4.root;
//        System.out.println("-------------Get Diameter------------------");
//        int ht = GenericTree.calculateDiameterAndReturnHeight(root4);
//        System.out.println("Height of the generic tree is : " + ht);
//        System.out.println("Diameter of the generic tree is : " + GenericTree.diameter);

//endregion

//region Iterative pre and post order

//        System.out.println("-------------Iterative pre and post order------------------");
//        GenericTree.iterativePreAndPostOrder(root);

//endregion

//endregion

//region SORTING

//region Input
//        int n = scn .nextInt();
//        int [] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//endregion

//region BubbleSort
//        int[] bubbleArr = Arrays.copyOf(arr, n);
//        Sorting.bubbleSort(bubbleArr, n);
//endregion

//region SelectionSort
//        int[] selectionArr = Arrays.copyOf(arr, n);
//        Sorting.selectionSort(selectionArr, n);
//endregion

//region InsertionSort
//        int[] insertionArr = Arrays.copyOf(arr, n);
//        Sorting.insertionSort(insertionArr, n);
//endregion

//region QuickSort
//        int[] quickArr = Arrays.copyOf(arr, n);
//        Sorting.quickSort(quickArr, 0, n-1);
//        System.out.print("Quick Sort result: " );
//        Sorting.PrintArray(quickArr);
//        System.out.println();
//endregion

//region MergeSort
//        int[] mergeArr = Arrays.copyOf(arr, n);
//        Sorting.mergeSort(mergeArr, 0, n-1);
//        System.out.print("Merge Sort result: " );
//        Sorting.PrintArray(mergeArr);
//        System.out.println();
//endregion

//region Min Heap Sort
//        int[] minHeapArr = Arrays.copyOf(arr, n);
//        Sorting.minHeapSort(minHeapArr, n);
//endregion

//region Max Heap Sort
//        int[] maxHeapArr = Arrays.copyOf(arr, n);
//        Sorting.maxHeapSort(maxHeapArr, n);
//endregion

//endregion

//region STRING, STRING BUILDER & ARRAYLIST

//region Print All Palindromes
//        String s = scn.nextLine();
//        Strings.printAllPalindromes(s);

//endregion

//region Compress string

//        String s = scn.nextLine();
//        System.out.println("Compression V1: " + Strings.compressStringV1(s));
//        System.out.println("Compression V2: " + Strings.compressStringV2(s));

//endregion

//region Remove Prime Numbers

//        int n = scn.nextInt();
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            al.add(scn.nextInt());
//        }
//
//        Strings.removePrimeNumbers(al);
//        for(int val : al){
//            System.out.print(val + " ");
//        }
//endregion

//region Toggle case

//        String s = scn.nextLine();
//        System.out.println("Toggled string; " + Strings.toggleCase(s));

//endregion

//region String with ASCII difference

//        String s = scn.nextLine();
//        System.out.println("String with ASCII difference " + Strings.stringWithASCIIDifference(s));

//endregion

//region Print all Permutations of a string

//        String s = scn.nextLine();
//        System.out.print("String Permutations: ");
//        Strings.permutationsOfAString(s);
//endregion

//endregion

//region CUSTOM LINKED LIST
//        CustomTypes.LL ll = new CustomTypes.LL();
//        System.out.println(ll.size);

//region AddLast

//        ll.AddLast(10);
//        ll.AddLast(20);
//        ll.AddLast(30);
//        ll.AddLast(40);
//        ll.AddLast(50);

//endregion

//region Display and Size
//        System.out.println("Size: " + ll.size());
//        ll.display();
//endregion

//region RemoveFirst
//        System.out.println("Removed node from start: " + ll.RemoveFirst());
//        System.out.println("Size: " + ll.size());
//        ll.display();
//endregion

//region GetFirst, GetLast, GetAt
//        System.out.println("Value at first index is " + ll.GetFirst());
//        System.out.println("Value At last index is " + ll.GetLast());
//        int idx = scn.nextInt();
//        ll.display();
//        int val = ll.GetAt(idx);
//        if(val != -1) {
//            System.out.println("Value At index " + idx + " is " + val);
//        }
//endregion

//region AddFirst

//        ll.AddFirst(10);
//        ll.display();
//        ll.AddFirst(20);
//        ll.AddFirst(30);
//        ll.AddFirst(40);
//        ll.AddFirst(50);
//        ll.display();
//endregion

//region AddAt

//        ll.AddAt(0,10);
//        ll.display();
//        ll.AddAt(1, 20);
//        ll.display();
//        ll.AddLast(20);
//        ll.display();
//        ll.AddAt(1,30);
//        ll.display();
//        ll.AddAt(2,40);
//        ll.display();
//        ll.AddAt(2,50);
//        ll.display();
//endregion

//region RemoveLast
//        System.out.println("Last Removed Value: " + ll.RemoveLast());
//        ll.AddLast(10);
//        ll.display();
//        System.out.println("Last Removed Value: " + ll.RemoveLast());
//        ll.AddLast(20);
//        ll.AddLast(30);
//        ll.AddLast(40);
//        ll.display();
//        System.out.println("Last Removed Value: " + ll.RemoveLast());
//        ll.AddLast(50);
//        ll.display();
//        System.out.println("Last Removed Value: " + ll.RemoveLast());
//        ll.display();
//endregion

//region RemoveAt
//        int idx = 1;
//        System.out.println("Removed Value at index " + idx + " : " + ll.RemoveAt(idx));
//        ll.AddLast(10);
//        ll.display();
//        idx = -1;
//        System.out.println("Removed Value at index " + idx + " : " + ll.RemoveAt(idx));
//        ll.display();
//        idx = 0;
//        System.out.println("Removed Value at index " + idx + " : " + ll.RemoveAt(idx));
//        ll.display();
//        ll.AddLast(20);
//        ll.AddLast(30);
//        ll.AddLast(40);
//        ll.display();
//        idx = 1;
//        System.out.println("Removed Value at index " + idx + " : " + ll.RemoveAt(idx));
//        ll.display();
//        ll.AddLast(50);
//        ll.AddLast(40);
//        ll.display();
//        idx = 1;
//        System.out.println("Removed Value at index " + idx + " : " + ll.RemoveAt(idx));
//        ll.display();
//endregion

//region Reverse a LL - Data Iterative

//        ll.reverseDataIterative();
//        ll.display();
//endregion

//region Reverse a LL - Pointer Iterative
//        ll.reversePointerIterative();
//        ll.display();
//        System.out.println("Tail: " + ll.tail.data);
//        System.out.println("Head: " + ll.head.data);
//endregion

//region Reverse a LL - Pointer Recursive
//        ll.reversePointerIterative();
//        ll.display();
//        System.out.println("New Tail: " + ll.tail.data);
//        System.out.println("New Head: " + ll.head.data);
//endregion

//region kthElementFromEnd
//        System.out.print("Kth position: ");
//        int k = scn.nextInt();
//        ll.kthElementFromEnd(k);
//endregion

//region middle of a linked list
//        CustomTypes.Node mid = ll.middleOfLL();
//        if(mid != null){
//            System.out.println("Middle of LL: " + mid.data);
//        }
//endregion

//region Merge Sorted LLs
//        CustomTypes.LL l2 = new CustomTypes.LL();
//        l2.AddLast(1);
//        l2.AddLast(12);
//        l2.AddLast(13);
//        l2.AddLast(32);
//        l2.AddLast(34);
//        l2.AddLast(41);
//        l2.AddLast(52);
//
//        System.out.println("Size of LL2: " + l2.size());
//        l2.display();
//
//        CustomTypes.LL mergedList = CustomTypes.LL.mergeSortedLLs(ll, l2);
//        System.out.println("Size of merged list: " + mergedList.size());
//        mergedList.display();
//        System.out.println("Merged List Head: " + mergedList.head.data);
//        System.out.println("Merged List Tail: " + mergedList.tail.data);
//endregion

//region Merge Sort

//        CustomTypes.LL l1 = new CustomTypes.LL();
//        l1.AddLast(10);
//        l1.AddLast(2);
//        l1.AddLast(67);
//        l1.AddLast(45);
//        l1.AddLast(19);
//        l1.AddLast(11);
//        l1.AddLast(98);
//        l1.AddLast(34);
//        l1.AddLast(65);
//        l1.AddLast(51);
//        l1.AddLast(3);
//        l1.AddLast(1);
//
//        System.out.println("Size of LL1: " + l1.size());
//        l1.display();
//
//        CustomTypes.LL sortedList = CustomTypes.LL.mergeSort(l1.head, l1.tail);
//        System.out.println("Size of sorted list: " + sortedList.size());
//        sortedList.display();
//        System.out.println("Sorted List Head: " + sortedList.head.data);
//        System.out.println("Sorted List Tail: " + sortedList.tail.data);

//endregion

//region Remove Duplicates

//        CustomTypes.LL l1 = new CustomTypes.LL();
//        l1.AddLast(1);
//        l1.AddLast(2);
//        l1.AddLast(2);
//        l1.AddLast(2);
//        l1.AddLast(2);
//        l1.AddLast(3);
//        l1.AddLast(3);
//        l1.AddLast(4);
//        l1.AddLast(4);
//        l1.AddLast(4);
//        l1.AddLast(4);
//        l1.AddLast(5);
//
//        System.out.println("Size of LL1: " + l1.size());
//        l1.display();
//        l1.removeDuplicatesV1();
//        System.out.print("LL after duplicates removal (V1): ");
//        l1.display();
//
//        CustomTypes.LL l2 = new CustomTypes.LL();
//        l2.AddLast(1);
//        l2.AddLast(1);
//        l2.AddLast(2);
//        l2.AddLast(2);
//        l2.AddLast(2);
//        l2.AddLast(2);
//        l2.AddLast(3);
//        l2.AddLast(3);
//        l2.AddLast(3);
//        l2.AddLast(4);
//        l2.AddLast(5);
//        l2.AddLast(5);
//
//        System.out.println("Size of LL2: " + l2.size());
//        l2.display();
//        CustomTypes.LL res = l2.removeDuplicatesV2();
//        System.out.print("LL after duplicates removal (V2): ");
//        res.display();

//endregion

//region Odd Even List
//        CustomTypes.LL l1 = new CustomTypes.LL();
//        l1.AddLast(1);
//        l1.AddLast(2);
//        l1.AddLast(2);
//        l1.AddLast(2);
//        l1.AddLast(2);
//        l1.AddLast(3);
//        l1.AddLast(3);
//        l1.AddLast(4);
//        l1.AddLast(4);
//        l1.AddLast(4);
//        l1.AddLast(4);
//        l1.AddLast(5);
//
//        System.out.println("Size of LL1: " + l1.size());
//        l1.display();
//        l1.oddEvenList();
//        l1.display();
//endregion

//region K reverse in  a LL

//        CustomTypes.LL l1 = new CustomTypes.LL();
//        l1.AddLast(1);
//        l1.AddLast(2);
//        l1.AddLast(3);
//        l1.AddLast(4);
//        l1.AddLast(5);
//        l1.AddLast(6);
//        l1.AddLast(7);
//        l1.AddLast(8);
//        l1.AddLast(9);
//        l1.AddLast(10);
//
//        System.out.println("Size of LL1: " + l1.size());
//        l1.display();
//        System.out.print("Value of k for K-Reverse: ");
//        int k = scn.nextInt();
//        l1.kReverseLL(k);
//        l1.display();
//endregion

//region display reverse recursively
//        ll.displayReverseRecursively();
//        System.out.println();
//        ll.displayReverseRecursivelyV2();
//endregion

//endregion

//region QUEUE TO STACK

//        CustomTypes.QueueToStack st = new CustomTypes.QueueToStack();
//
//        //region Pop efficient - O(1)
//        st.pushV1(10);
//        System.out.println("Top: " + st.topV1());
//        st.pushV1(20);
//        System.out.println("Top: " + st.topV1());
//        st.pushV1(30);
//        System.out.println("Top: " + st.topV1());
//        st.pushV1(40);
//        System.out.println("Top: " + st.topV1());
//        st.pushV1(50);
//        System.out.println("Top: " + st.topV1());
//
//        while(st.size() > 0){
//            System.out.print(st.popV1() + " ");
//        }
//        System.out.println();
//endregion

//region 2-D MATRIX

//region Input

//        int n1 = scn.nextInt();
//        int m1 = scn.nextInt();
//
//        int[][] a = new int[n1][m1];
//        for(int i = 0; i< n1; i++){
//            for(int j = 0; j < m1; j++){
//                a[i][j] = scn.nextInt();
//            }
//        }

//        int n2 = scn.nextInt();
//        int m2 = scn.nextInt();
//
//        int[][] b = new int[n2][m2];
//        for(int i = 0; i< n2; i++){
//            for(int j = 0; j < m2; j++){
//                b[i][j] = scn.nextInt();
//            }
//        }
//endregion

//region Matrix Multiplication

//        System.out.println("Matrix Multiplication: ");
//        Matrix.matrixMultiplication(a, b);

//endregion

//region wave Traversal

//        System.out.print("Wave Traversal: ");
//        Matrix.waveTraversal(a);

//endregion

//region Spiral Traversal
//        System.out.print("Spiral Traversal: ");
//        Matrix.spiralTraversal(a);

//endregion

//region Exit Point Of A Matrix

//        Matrix.exitPointOfAMatrix(a);

//endregion

//region Rotate by 90 degree
//        System.out.println("After Rotation by 90: ");
//        Matrix.rotateBy90Degree(a);

//endregion

//region Shell rotate
//        System.out.print("Shell: ");
//        int s = scn.nextInt();
//        System.out.print("Rotate By: ");
//        int r = scn.nextInt();
//        System.out.println("After Shell Rotation(anticlockwise) by: " + r);
//        Matrix.shellRotate(a, s, r);

//endregion

//region Print diagonals
//        Matrix.printDiagonals(a);
//endregion

//region Saddle Point
//        Matrix.saddlePoint(a);
//endregion

//region Find In A Sorted Array
//        System.out.print("Number to find: ");
//        int num = scn.nextInt();
//        Matrix.searchInASortedArray(a, num);
//endregion

//region Inverse of an array

//        System.out.print("Sub arrays of the array: ");
//        int[] a = new int[]{2, 1, 3, 0, 4};
//        Matrix.inverse(a);
//endregion

//region Sub arrays of an array

//        System.out.print("Inverse of the array: ");
//        int[] a = new int[]{2, 1, 3, 0, 4};
//        Matrix.subArrays(a);
//endregion

//region Subsets of string

//        System.out.print("Subsets of the string: ");
//        String s = "abcd";
//        Matrix.subsets(s);
//endregion

//region Binary Search

//        System.out.print("Binary search in the sorted array: ");
//        int[] a = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};
//        Matrix.display(a);
//        int data = 110;
//        int idx = Matrix.binarySearch(a, 0, a.length-1, data);
//        System.out.println("Element " + data + " found at index: " + idx);
//endregion

//region Ceil and floor using Binary Search
//        int[] a = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};
//        Matrix.display(a);
//        int data = 131;
//        Matrix.ceilAndFloor(a, data);
//endregion

//region Ceil and floor using Binary Search
//        int[] a = new int[] {10, 20, 20, 20, 20, 20, 30, 30, 40, 50, 50, 50, 60};
//        Matrix.display(a);
//        int data = 61;
//        Matrix.firstAndLastIndex(a, data);
//endregion

//endregion