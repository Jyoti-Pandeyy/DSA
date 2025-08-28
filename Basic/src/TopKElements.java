import java.math.BigInteger;
import java.util.*;
import java.util.Arrays;

public class TopKElements {

    public void run(){
        
        // //1. Kth Largest Element in a Stream
        // int[] nums = {3, 6, 9, 10};
        // int[] temp = {3, 6, 9, 10};
        // System.out.print("Initial stream: ");
        // printArray(nums);
        // System.out.println("\nk: " + 3);
        // KthLargest kLargest = new KthLargest(3, nums);
        // int[] val = {4, 7, 10, 8, 15};
        // for (int i = 0; i < val.length; i++) {
        //     System.out.println("\tAdding a new number " + val[i] + " to the stream");
        //     temp = Arrays.copyOf(temp, temp.length + 1);
        //     temp[temp.length - 1] = val[i];
        //     System.out.print("\tNumber stream: ");
        //     printArray(temp);
        //     System.out.println("\n\tKth largest element in the stream: " + kLargest.add(val[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //2. Reorganize String
        // String[] inputs = {
        //     "programming",
        //     "hello",
        //     "fofjjb",
        //     "abbacdde",
        //     "aba",
        //     "awesome",
        //     "aaab",
        //     "aab"
        // };
        // for (int i = 0; i < inputs.length; i++) {
        //     System.out.print(i + 1);
        //     System.out.println(".\tInput string: \"" + inputs[i] + "\"");
        //     String output = reorganizeString(inputs[i]);
        //     output = (output.length() == 0) ? "''" : output;
        //     System.out.println("\tReorganized string: \"" + output + "\"");
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //3. K Closest Points to Origin
        // int[][][] pointsArr = {
        //     {{1, 3}, {3, 4}, {2, -1}},
        //     {{1, 3}, {2, 4}, {2, -1}, {-2, 2}, {5, 3}, {3, -2}},
        //     {{1, 3}, {5, 3}, {3, -2}, {-2, 2}},
        //     {{2, -1}, {-2, 2}, {1, 3}, {2, 4}},
        //     {{1, 3}, {2, 4}, {2, -1}, {-2, 2}, {5, 3}, {3, -2}, {5, 3}, {3, -2}}
        // };
        // int[] kArr = {2, 3, 1, 4, 5};
        // for (int i = 0; i < pointsArr.length; i++) {
        //     System.out.print((i + 1) + ".\tpoints: [");
        //     for (int j = 0; j < pointsArr[i].length; j++) {
        //         System.out.print("[" + pointsArr[i][j][0] + ", " + pointsArr[i][j][1] + "]");
        //         if (j < pointsArr[i].length - 1)
        //             System.out.print(", ");
        //     }
        //     System.out.println("]");
        //     System.out.println("\tk: " + kArr[i] + "\n");
        //     int[][] result = kClosest(pointsArr[i], kArr[i]);
        //     System.out.print("\t" + kArr[i] + " closest point(s) to origin: [");
        //     for (int j = 0; j < result.length; j++) {
        //         System.out.print("[" + result[j][0] + ", " + result[j][1] + "]");
        //         if (j < result.length - 1)
        //             System.out.print(", ");
        //     }
        //     System.out.println("]");
        //     System.out.println("-".repeat(100));
        // }

        // //4. Top K Frequent Elements
        // int[][] inputs = {
        //     {1, 3, 5, 12, 11, 12, 11, 12, 5},
        //     {1, 3, 5, 14, 18, 14, 5},
        //     {2, 3, 4, 5, 6, 7, 7},
        //     {9, 8, 7, 6, 6, 5, 4, 3, 2, 1},
        //     {2, 4, 3, 2, 3, 4, 5, 4, 4, 4},
        //     {1, 1, 1, 1, 1, 1},
        //     {2, 3}
        // };
        // int[] inputK = {3, 2, 1, 1, 3, 1, 2};
        // for (int i = 0; i < inputK.length; i++) {
        //     List<Integer> result = topKFrequent(inputs[i], inputK[i]);
        //     System.out.print(i + 1);
        //     System.out.println(".\tInput: (" + Arrays.toString(inputs[i]) + ", " + inputK[i] + ")");
        //     System.out.println("\n\tTop " + inputK[i] + " frequent elements: " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //5. Kth Largest Element in an Array
        // int[][] inputs = {
        //     {1, 5, 12, 2, 11, 9, 7, 30, 20},
        //     {5, 2, 9, -3, 7},
        //     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        //     {1, 4, 6, 0, 2},
        //     {3, 5, 2, 3, 8, 5, 3}
        // };
        // int[] K = {3, 1, 9, 1, 4};
        // for(int i=0; i<K.length; i++){
        //     System.out.print(i+1);
        //     System.out.println(".\tInput array: "+ Arrays.toString(inputs[i]));
        //     System.out.println("\tValue of k: "+ K[i]);
        //     System.out.println("\tkth largest element: " + findKthLargest(inputs[i], K[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //6. Minimum Cost to Hire K Workers
        // int[][] qualities = {
        //     {10, 20, 5},
        //     {3, 1, 10, 10, 1},
        //     {4, 5, 6},
        //     {2, 3, 1},
        //     {10, 10, 10}
        // };
        // int[][] wages = {
        //     {70, 50, 30},
        //     {4, 8, 2, 2, 7},
        //     {8, 10, 12},
        //     {5, 6, 2},
        //     {50, 60, 70}
        // };
        // int[] k_values = {2, 3, 2, 2, 2};
        // for (int i = 0; i < qualities.length; i++) {
        //     System.out.println((i + 1) + ".\tqualities: " + Arrays.toString(qualities[i]));
        //     System.out.println("\twages: " + Arrays.toString(wages[i]));
        //     System.out.println("\tk: " + k_values[i]);
        //     double result = minCostToHireWorkers(qualities[i], wages[i], k_values[i]);
        //     System.out.println("\n\tMinimum cost to hire " + k_values[i] + " workers = " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //7. Maximal Score After Applying K Operations
        // int[][] testCases = {
        //     {12, 18, 24, 6},
        //     {7, 14, 3},
        //     {50, 20, 15, 10, 5},
        //     {8, 16, 5, 12, 3, 7},
        //     {50, 50, 50, 50, 50, 50, 50, 50}
        // };
        // int[] ks = {3, 2, 4, 3, 5};
        // for (int i = 0; i < testCases.length; i++) {
        //     System.out.println((i + 1) + ".\tnums: " + Arrays.toString(testCases[i]));
        //     System.out.println("\tk: " + ks[i]);
        //     int result = maxScore(testCases[i], ks[i]);
        //     System.out.println("\n\tMaximum Score: " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //8. kth Largest Integer in a Stream
        // String[][] testCases = {
        //     {"3", "6", "7", "10"},
        //     {"2", "21", "12", "1"},
        //     {"0", "0"},
        //     {"100", "200", "300", "400"},
        //     {"10", "100", "1000", "10000"}
        // };
        // int[] kValues = {4, 3, 2, 2, 1};
        // for (int i = 0; i < testCases.length; i++) {
        //     String[] nums = testCases[i]; 
        //     int k = kValues[i];          
        //     String result = kthLargestInteger(nums, k);
        //     System.out.println((i + 1) + ".\t nums: " + Arrays.toString(nums) + ", k: " + k);
        //     System.out.println("\t kth largest integer: " + result);
        //     System.out.println(new String(new char[100]).replace("\0", "-"));
        // }

        // //9. Maximum Performance of a Team
        // int[][][] testCases = {
        //     {{6}, {2, 10, 3, 1, 5, 8}, {5, 4, 3, 9, 7, 2}, {2}},
        //     {{1}, {1}, {1}, {1}},
        //     {{3}, {1, 2, 3}, {3, 2, 1}, {3}},
        //     {{4}, {5, 5, 5, 5}, {1, 2, 3, 4}, {2}},
        //     {{5}, {10, 1, 10, 1, 10}, {9, 1, 9, 1, 9}, {3}}
        // };
        // for (int i = 0; i < testCases.length; i++) {
        //     int n = testCases[i][0][0];
        //     int[] speed = testCases[i][1];
        //     int[] efficiency = testCases[i][2];
        //     int k = testCases[i][3][0];
        //     int result = maxPerformance(n, speed, efficiency, k);
        //     System.out.println((i + 1) + ".\tn: " + n);
        //     System.out.println("\tspeed: " + Arrays.toString(speed));
        //     System.out.println("\tefficiency: " + Arrays.toString(efficiency));
        //     System.out.println("\tk: " + k);
        //     System.out.println("\n\tOutput: " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //10. Smallest Range Covering Elements from K Lists
        // List<List<List<Integer>>> testCases = Arrays.asList(
        //     Arrays.asList(
        //         Arrays.asList(4, 10, 15, 24, 26),
        //         Arrays.asList(0, 9, 12, 20),
        //         Arrays.asList(5, 18, 22, 30)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(1, 2, 3),
        //         Arrays.asList(1, 2, 3),
        //         Arrays.asList(1, 2, 3)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(1, 5),
        //         Arrays.asList(3, 7),
        //         Arrays.asList(4, 6)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(1, 2),
        //         Arrays.asList(3, 4),
        //         Arrays.asList(8, 9)
        //     ),
        //     Arrays.asList(
        //         Arrays.asList(1, 5, 10),
        //         Arrays.asList(2, 4, 6),
        //         Arrays.asList(3, 8, 15)
        //     )
        // );
        // int testCaseNumber = 1;
        // for (List<List<Integer>> nums : testCases) {
        //     System.out.print(testCaseNumber++ + ".\tnums: ");
        //     for (List<Integer> list : nums) {
        //         System.out.print(list + " ");
        //     }
        //     System.out.println();
        //     int[] result = smallestRange(nums);
        //     System.out.println("\tSmallest Range: [" + result[0] + ", " + result[1] + "]");
        //     System.out.println("-".repeat(100));
        // }

        // //11. Maximum Sums of k-length Combinations
        // List<List<Integer>> arr1List = new ArrayList<>();
        // arr1List.add(Arrays.asList(1, 4, 2));
        // arr1List.add(Arrays.asList(10, 15, 30));
        // arr1List.add(Arrays.asList(1, 1, 1));
        // arr1List.add(Arrays.asList(5, 7));
        // arr1List.add(Arrays.asList(1, 2, 3));
        // List<List<Integer>> arr2List = new ArrayList<>();
        // arr2List.add(Arrays.asList(3, 6, 5));
        // arr2List.add(Arrays.asList(20, 25, 10));
        // arr2List.add(Arrays.asList(1, 1, 1));
        // arr2List.add(Arrays.asList(8, 3));
        // arr2List.add(Arrays.asList(4, 5, 6));
        // List<Integer> kList = Arrays.asList(3, 2, 2, 1, 3);  
        // for (int i = 0; i < arr1List.size(); i++) {
        //     List<Integer> arr1 = arr1List.get(i);
        //     List<Integer> arr2 = arr2List.get(i);
        //     int k = kList.get(i);
        //     System.out.println((i + 1) + ".\t arr1: " + arr1 + ", arr2: " + arr2 + ", k: " + k);
        //     List<Integer> result = maxCombinations(arr1, arr2, k);
        //     System.out.println("\n\t Top " + k + " Maximum Sums: " + result);
        //     System.out.println("-".repeat(100));
        // }

        //12. 
    }

    public void printArray(int[] arr) {
		System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
		System.out.print("]");
    }

    class KthLargest {
        PriorityQueue<Integer> minHeap;
        int k;
        
        public KthLargest(int k, int[] nums) {
            this.k = k;
            minHeap = new PriorityQueue<>();
            for(int i = 0; i < nums.length; i++){
            add(nums[i]);
            }
        }
        // adds element in the topKHeap
        public int add(int val) {
            if(minHeap.size() < this.k){
                minHeap.offer(val);
            }
            else if(minHeap.peek() < val){
                minHeap.poll();
                minHeap.offer(val);
            }
            return minHeap.peek();
        }	
    }

    public String reorganizeString(String string1) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1]-a[1]);
        int[] charCount = new int[26];
        for(char ch : string1.toCharArray()){
            int idx = ch - 'a';
            charCount[idx]++;
        }
        for(int i = 0; i < 26; i++){
            if(charCount[i] > 0){
                maxHeap.offer(new int[]{i, charCount[i]});
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!maxHeap.isEmpty()){
            int[] top = maxHeap.poll();
            char ch = (char)(top[0] + 97);
            
            if(!sb.isEmpty() && ch == sb.charAt(sb.length()-1)){
                if(maxHeap.isEmpty()) break;
                int[] next = maxHeap.poll();
                char nCh = (char)(next[0] + 97);
                sb.append(nCh);
                if(next[1] > 1){
                    next[1]--;
                    maxHeap.offer(next);
                }
                maxHeap.offer(top);
            }
            else{
                sb.append(ch);
                if(top[1] > 1){
                    top[1]--;
                    maxHeap.offer(top);
                }
            }
        }
        return sb.length() == string1.length() ? sb.toString() : "";
    }

    public int[][] kClosest(int[][] points, int k) {
        //{x, y, distance}
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[2],a[2]));
        
        for(int i = 0; i < k; i++){
            double x = points[i][0], y = points[i][1];
            double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            maxHeap.offer(new double[]{x, y, dist});
        }
        
        for(int i = k; i < points.length; i++){
            double x = points[i][0], y = points[i][1];
            double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            if(maxHeap.peek()[2] > dist){
                maxHeap.poll();
                maxHeap.offer(new double[]{x, y, dist});
            }
        }
        int[][] result = new int[k][2];
        int ptr = 0;
        while(!maxHeap.isEmpty()){
            double[] point = maxHeap.poll();
            result[ptr][0] = (int) point[0];
            result[ptr][1] = (int) point[1];
            ptr++;
        }
        return result;
    }

    public List<Integer> topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll().getKey());
        }
        return result;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
           minHeap.offer(num);
           if(minHeap.size() > k){
              minHeap.poll();
           }
        }
        return minHeap.peek();
     }

     public double minCostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] workers = new double[n][2];
        
        for(int i = 0; i < n; i++){
          workers[i][0] = (double) wage[i]/quality[i];
          workers[i][1] = quality[i];
        }
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        double totalQuality = 0;
        double minCost = Double.MAX_VALUE;
        for(int i = 0; i < n; i++){
          double ratio = workers[i][0];
          totalQuality += workers[i][1];
          maxHeap.offer(workers[i][1]);
          
          if(maxHeap.size() > k){
            totalQuality -= maxHeap.poll();
          }
          
          if(maxHeap.size() == k){
            minCost = Math.min(minCost, ratio * totalQuality);
          }
        }
        return minCost;
    }

    public int maxScore (int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            maxHeap.offer(num);
        }
        int score = 0;
        while(k-- > 0 && !maxHeap.isEmpty()){
            int top = maxHeap.poll();
            score += top;
            int ceil = (int) (Math.ceil((double)top/3)); // int ceil = (largest + 2) / 3;
            if(ceil > 0) maxHeap.offer(ceil);
        }
        return score;
    }

    public static String kthLargestInteger(String[] nums, int k) {
        PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();

        for (String num : nums) {
            BigInteger val = new BigInteger(num);
            minHeap.add(val);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek().toString(); 
    }

    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        final int MOD = (int)1e9 + 7;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<int[]> engineers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            engineers.add(new int[]{efficiency[i], speed[i]});
        }
        engineers.sort((a, b) -> b[0] - a[0]);

        long maxPerf = 0, speedSum = 0;

        for (int[] eng : engineers) {
            int eff = eng[0];
            int spd = eng[1];

            // // Add current speed
            // minHeap.add(spd);
            // speedSum += spd;

            // // If team too big, remove slowest
            // if (minHeap.size() > k) {
            //     speedSum -= minHeap.poll();
            // }

            // // Compute performance with current efficiency
            // maxPerf = Math.max(maxPerf, speedSum * eff);

            if (minHeap.size() == k) {
                speedSum -= minHeap.poll();
            }

            minHeap.offer(spd);
            speedSum += spd;

            long perf = speedSum * eff;

            maxPerf = Math.max(maxPerf, perf);
        }

        return (int)(maxPerf % MOD);
    }

    public int[] smallestRange(List<List<Integer>> nums) 
    {
        //{num, listIdx, numIdx}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        int maxValue = Integer.MIN_VALUE, start = 0, end = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++){
            if(!nums.get(i).isEmpty()){
                int val = nums.get(i).get(0);
                maxValue = Math.max(maxValue, val);
                minHeap.add(new int[] {val, i, 0});
            }
        }
        
        while(minHeap.size() == nums.size()){
            int[] top = minHeap.poll();
            int minValue = top[0];
            int listIdx = top[1], numIdx = top[2];
            if(maxValue - minValue < end - start){
                end = maxValue;
                start = minValue;
            }
            int nextIdx = numIdx + 1;
            if(nextIdx < nums.get(listIdx).size()){
                int nextNum = nums.get(listIdx).get(nextIdx);
                maxValue = Math.max(maxValue, nextNum);
                minHeap.offer(new int[]{ nextNum, listIdx, numIdx + 1});
            }
        }
      return new int[]{start, end};
    }

    public List<Integer> maxCombinations(List<Integer> arr1, List<Integer> arr2, int k) 
    {
        // Replace this placeholder return statement with your code
        arr1.sort(Collections.reverseOrder());
        arr2.sort(Collections.reverseOrder());
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0]-a[0]); //{sum, list1Idx, list2Idx}
        List<Integer> result = new ArrayList<>();
        maxHeap.add(new int[] {arr1.get(0) + arr2.get(0), 0, 0});
        int n = arr1.size();
        Set<String> seen = new HashSet<>();
        seen.add("0,0");
        
        while(k-- > 0 && !maxHeap.isEmpty()){
            int[] top = maxHeap.poll();
            result.add(top[0]);
            
            int i = top[1], j = top[2];
            if(i+1 < n && !seen.contains((i+1) +","+ j)){
                maxHeap.add(new int[]{arr1.get(i+1) + arr2.get(j), i+1, j});
                seen.add(i+1+","+j);
            }
            if(j+1 < n && !seen.contains(i +","+ (j+1))){
                maxHeap.add(new int[]{arr1.get(i) + arr2.get(j+1), i, j+1});
                seen.add(i +","+ (j+1));
            }
        }
        return result;  
    }
}
