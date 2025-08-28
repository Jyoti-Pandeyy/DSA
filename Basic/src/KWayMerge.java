import java.util.Arrays;
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int value) {
        val = value;
        next = null;
    }
}
class LinkedList {
    ListNode head;

    // Default constructor
    public LinkedList() {
        head = null;
    }

    // Constructor to initialize from a list of values
    public LinkedList(List<Integer> values) {
        head = null;
        createLinkedList(values);
    }

    // Function to create a linked list from a list of values
    private void createLinkedList(List<Integer> values) {
        if (values.isEmpty()) {
            head = null;
            return;
        }

        head = new ListNode(values.get(0));
        ListNode current = head;
        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }
    }

}

class PrintList{
  // Function to display the linked list
    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
}
public class KWayMerge {
    public void run(){
        // //1. Merge Sorted Arrays
        // int[] m = {9, 2, 3, 1, 8};
        // int[] n = {6, 1, 4, 2, 1};
        // int[][] nums1 = {
        // {23, 33, 35, 41, 44, 47, 56, 91, 105, 0, 0, 0, 0, 0, 0},
        // {1, 2, 0},
        // {1, 1, 1, 0, 0, 0, 0},
        // {6, 0, 0},
        // {12, 34, 45, 56, 67, 78, 89, 99, 0}
        // };
        // int[][] nums2 = {
        // {32, 49, 50, 51, 61, 99},
        // {7},
        // {1, 2, 3, 4},
        // {- 45, -99},
        // {100}
        // };
        // int k = 1;
        // for (int i = 0; i < m.length; i++) {
        //     System.out.print(k + ".\tnums1: [");
        //     for (int j = 0; j < nums1[i].length - 1; j++) {
        //         System.out.print(nums1[i][j] + ", ");
        //     }
        //     System.out.println(nums1[i][nums1[i].length - 1] + "], m: " + m[i]);
        //     System.out.print("\tnums2: [");
        //     for (int j = 0; j < nums2[i].length - 1; j++) {
        //         System.out.print(nums2[i][j] + ", ");
        //     }
        //     System.out.println(nums2[i][nums2[i].length - 1] + "], n: " + n[i]);
        //     System.out.println("\tMerged list:" + Arrays.toString(mergeSorted(nums1[i], m[i], nums2[i], n[i])));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        //     k += 1;
        // }

        // //2. Kth Smallest Number in M Sorted Lists
        // List<List<List<Integer>>> lists = Arrays.asList(
        //     Arrays.asList(
        //         Arrays.asList(2, 6, 8),
        //         Arrays.asList(3, 6, 10),
        //         Arrays.asList(5, 8, 11)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(1, 2, 3),
        //         Arrays.asList(4, 5),
        //         Arrays.asList(6, 7, 8, 15),
        //         Arrays.asList(10, 11, 12, 13),
        //         Arrays.asList(5, 10)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(),
        //         Arrays.asList(),
        //         Arrays.asList()
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(1, 1, 3, 8),
        //         Arrays.asList(5, 5, 7, 9),
        //         Arrays.asList(3, 5, 8, 12)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(5, 8, 9, 17),
        //         Arrays.asList(),
        //         Arrays.asList(8, 17, 23, 24)
        //     )
        // );
        // int[] k = {5, 50, 7, 4, 8};
        // for (int i = 0; i < k.length; i++) {
        //     System.out.println(i + 1 + ".\t Input lists: " + lists.get(i) +
        //         "\n\t K = " + k[i] +
        //         "\n\t " + k[i] + "th smallest number from the given lists is: " +
        //         kSmallestNumber(lists.get(i), k[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //3. K Smallest Pairs
        // int[][]list1 = {{2, 8, 9},
        //       {1, 2, 300},
        //       {1, 1, 2},
        //       {4, 6},
        //       {4, 7, 9},
        //       {1, 1, 2}
        //       };    
        // int[][]list2 = {
        //     {1, 3, 6},
        //     {1, 11, 20, 35, 300},
        //     {1, 2, 3},
        //     {2, 3},
        //     {4, 7, 9},
        //     {1}
        //     };
        // int[] k = {9, 30, 1, 2, 5, 4};
        // for(int i=0; i<k.length; i++){
        //     List<List<Integer>> result = kSmallestPairs(list1[i], list2[i], k[i]);
        //     System.out.print(i+1);
        //     System.out.println(".\tInput lists: "+Arrays.toString(list1[i])+ ", "+ Arrays.toString(list2[i]));
        //     System.out.println("\tK = "+k[i]);
        //     System.out.print("\tPairs with smallest sum are: "+ result);
        //     System.out.println("\n");
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //4. Merge K Sorted Lists
        // List<List<List<Integer>>> inputLists = Arrays.asList(
        //     Arrays.asList(Arrays.asList(21, 23, 42), Arrays.asList(1, 2, 4)),
        //     Arrays.asList(Arrays.asList(11, 41, 51), Arrays.asList(21, 23, 42)),
        //     Arrays.asList(Arrays.asList(2), Arrays.asList(1, 2, 4), Arrays.asList(25, 56, 66, 72)),
        //     Arrays.asList(Arrays.asList(11, 41, 51), Arrays.asList(2), Arrays.asList(2), Arrays.asList(2), Arrays.asList(1, 2, 4)),
        //     Arrays.asList(Arrays.asList(10, 30), Arrays.asList(15, 25), Arrays.asList(1, 7), Arrays.asList(3, 9), Arrays.asList(100, 300), Arrays.asList(115, 125), Arrays.asList(10, 70), Arrays.asList(30, 90))
        // );
        // for (int i = 0; i < inputLists.size(); i++) {
        //     System.out.println((i + 1) + ".\tInput lists:");
        //     ListNode[] listNodes = new ListNode[inputLists.get(i).size()];
        //     for (int j = 0; j < inputLists.get(i).size(); j++) {
        //         List<Integer> x = inputLists.get(i).get(j);
        //         LinkedList a = new LinkedList(x); // assuming this builds the linked list from List<Integer>
        //         listNodes[j] = a.head;
        //         System.out.print("\t");
        //         PrintList.display(a.head);
        //         System.out.println();
        //     }
        //     System.out.print("\tMerged list: \n\t");
        //     PrintList.display(mergeKLists(listNodes));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //5. Kth Smallest Element in a Sorted Matrix
        // int[][][] matrix = {{{2, 6, 8}, 
        //         {3, 7, 10}, 
        //         {5, 8, 11}}, 
        //         {{1, 2, 3}, 
        //         {4, 5, 6}, 
        //         {7, 8, 9}},  
        //         {{5}},
        //         {{2, 5, 7, 9, 10},
        //         {4, 6, 8, 12, 14},
        //         {11, 13, 16, 18, 20},
        //         {15, 17, 21, 24, 26},
        //         {19, 22, 23, 25, 28}},
        //         {{3, 5, 7, 9, 11, 13},
        //         {6, 8, 10, 12, 14, 16},
        //         {15, 17, 19, 21, 23, 25},
        //         {18, 20, 22, 24, 26, 28},
        //         {27, 29, 31, 33, 35, 37},
        //         {30, 32, 34, 36, 38, 40}}};
        // int [] k = {3, 4, 1, 10, 15};
        // for(int i=0; i<k.length; i++){
        //     System.out.print(i+1);
        //     System.out.println(".\tInput matrix: "+ Arrays.deepToString(matrix[i]));
        //     System.out.println("\tK =  "+k[i]);
        //     System.out.println("\tKth smallest number in the matrix is: "+kthSmallestElement(matrix[i], k[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //6. Kth Smallest Prime Fraction
        // int[][] testCases = {
        //     {1, 3, 5, 7, 9, 11},
        //     {1, 7, 23, 29, 47},
        //     {1, 2, 3, 5},
        //     {1, 2, 3, 5},
        //     {1, 13, 17, 19, 23, 29, 31}
        // };
        // int[] ks = {2, 3, 3, 1, 4};
        // for (int i = 0; i < testCases.length; i++) {
        //     System.out.println((i + 1) + ".\tArray: " + Arrays.toString(testCases[i]) + ", k: " + ks[i]);
        //     int[] result = kthSmallestPrimeFraction(testCases[i], ks[i]);
        //     System.out.println("\tKth smallest prime fraction is: [" + result[0] + ", " + result[1] + "]");
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //7. Super Ugly Number
        // int[] nValues = {12, 1, 15, 10, 8};
        // int[][] primesList = {
        //     {2, 7, 13, 19},
        //     {2, 3, 5},
        //     {3, 5, 7},
        //     {2, 5, 11},
        //     {3, 11, 17}
        // };
        // for (int i = 0; i < nValues.length; i++) {
        //     System.out.println((i+1)+ ".\tn: " + nValues[i]);
        //     System.out.println("\tprimes: "+ Arrays.toString(primesList[i]));
        //     int result = nthSuperUglyNumber(nValues[i], primesList[i]);
        //     System.out.println("\n\t" + nValues[i] + "th super ugly number is " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }
    }

    public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, ptr = m + n - 1;
        while(p1 >= 0 && p2 >= 0){
           if(nums1[p1] >= nums2[p2]){
              nums1[ptr--] = nums1[p1--];
           }
           else{
              nums1[ptr--] = nums2[p2--];
           }
        }
        while(p1 >= 0){
           nums1[ptr--] = nums1[p1--];
        }
        
        while(p2 >= 0){
           nums1[ptr--] = nums2[p2--];
        }
        return nums1;
     }

    public static int kSmallestNumber(List<List<Integer>> lists, int k) {
        //{listIdx, numIdx, num}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2]-b[2]);
        int kSmallest = 0, i = 0;
        for(List<Integer> list : lists){
            if(!list.isEmpty()){
                minHeap.add(new int[]{i, 0, list.get(0)});
            }
            i++;
        }
        
        for(i = 0; i < k; i++){
            if(minHeap.isEmpty()) break;
            int[] top = minHeap.poll();
            int listIdx = top[0], numIdx = top[1];
            kSmallest = top[2];
            if(numIdx + 1 < lists.get(listIdx).size()){
                minHeap.add(new int[]{listIdx, numIdx + 1, lists.get(listIdx).get(numIdx + 1)});
            }
            
        }
        return kSmallest;
    }

    public static List<List<Integer>> kSmallestPairs(int[] list1, int[] list2, int target) {
        //{sum, list1Idx, list2Idx}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        for(int i = 0; i < list1.length; i++){
            minHeap.add(new int[]{ list1[i]+list2[0], i, 0 });
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        while(!minHeap.isEmpty() && target-- > 0){
            int[] top = minHeap.poll();
            int sum = top[0], list1Idx = top[1], list2Idx = top[2], next2Idx = list2Idx + 1;
            result.add(Arrays.asList(list1[list1Idx], list2[list2Idx]));
            
            if(next2Idx < list2.length){
                minHeap.add(new int[]{ list1[list1Idx]+list2[next2Idx], list1Idx, next2Idx });
            }
        }
        return result;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode head2 = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        while(!pq.isEmpty()){
           ListNode top = pq.poll();
           if(top.next != null){
              pq.add(top.next);
           }
           head.next = top;
           head = head.next;
        }
         return head2.next;
     }
     
    public static int kthSmallestElement(int[][] matrix, int k) {
        int rowCount = matrix.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for (int i = 0; i < Math.min(rowCount, k); i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0});
        }
        
        int numbersChecked = 0;
        int smallestElement = 0;

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            smallestElement = curr[0];
            int rowIndex = curr[1];
            int colIndex = curr[2];
            numbersChecked++;

            if (numbersChecked == k) {
                break;
            }
            if (colIndex + 1 < matrix[rowIndex].length) {
                minHeap.offer(new int[]{matrix[rowIndex][colIndex + 1], rowIndex, colIndex + 1});
            }
        }
        return smallestElement;
    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<double[]> minHeap = new PriorityQueue<>(Comparator.comparingDouble(a -> a[0]));

        for (int j = 1; j < n; j++) {
            minHeap.offer(new double[]{(double) arr[0] / arr[j], 0, j});
        }

        for (int i = 0; i < k - 1; i++) {
            double[] top = minHeap.poll();
            int numIdx = (int) top[1];
            int denIdx = (int) top[2];

            if (numIdx + 1 < denIdx) {
                minHeap.offer(new double[]{(double) arr[numIdx + 1] / arr[denIdx], numIdx + 1, denIdx});
            }
        }

        double[] top = minHeap.poll();
        return new int[]{arr[(int) top[1]], arr[(int) top[2]]};
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        ArrayList<Integer> ugly = new ArrayList<>();
        ugly.add(1); 
        //{nextUgly, prime, index}
        PriorityQueue<long[]> minHeap = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        for (int prime : primes) {
            minHeap.offer(new long[]{prime, prime, 0});
        }

        while (ugly.size() < n) {
            long[] entry = minHeap.poll();
            long nextUgly = entry[0];
            long prime = entry[1];
            int index = (int) entry[2];

            if (nextUgly != ugly.get(ugly.size() - 1)) {
                ugly.add((int) nextUgly);
            }

            minHeap.offer(new long[]{prime * ugly.get(index + 1), prime, index + 1});
        }

        return ugly.get(n - 1);
    }
}
