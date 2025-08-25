import java.util.*;

public class Heaps {
    public void run(){
        // //1. IPO
        // int[] c = { 1, 2, 1, 7, 2 };
		// int[] k = { 2, 3, 3, 2, 4 };
		// int[][] capitals = {
		// 	{ 1, 2, 2, 3 },
		// 	{ 1, 3, 4, 5, 6 },
		// 	{ 1, 2, 3, 4 },
		// 	{ 6, 7, 8, 10 },
		// 	{ 2, 3, 5, 6, 8, 12 }
		// };
		// int[][] profits = {
		// 	{ 2, 4, 6, 8 },
		// 	{ 1, 2, 3, 4, 5 },
		// 	{ 1, 3, 5, 7 },
		// 	{ 4, 8, 12, 14 },
		// 	{ 1, 2, 5, 6, 8, 9 }
		// };
		// for (int i = 0; i < k.length; i++) {
		// 	maximumCapital(c[i], k[i], capitals[i], profits[i]);
		// 	System.out.println(String.join("", Collections.nCopies(100, "-")));
		// }

        // //2. Median From Data Stream
        // int[] nums = {35, 22, 30, 25, 1};
        // MedianOfStream medianOfAges = null;
        // for(int i=0; i< nums.length; i++){
        //     System.out.print(i+1);
        //     System.out.print(".\tData stream: [");
        //     medianOfAges = new MedianOfStream();
        //     for(int j=0; j<=i; j++){
        //         System.out.print(nums[j]);
        //         if(j != i)
        //             System.out.print(", ");
        //         medianOfAges.insertNum(nums[j]);
        //     }
        //     System.out.println("]");
        //     System.out.println("\tThe median for the given numbers is: " + medianOfAges.findMedian());
        // }
    
        // //3. Sliding window Median
        // int [][]arr = {{3, 1, 2, -1, 0, 5, 8}, {1, 2}, {4, 7, 2, 21}, {22, 23, 24, 56, 76, 43, 121 ,1 ,2 ,0 ,0 ,2 ,3 ,5}, {1, 1, 1, 1, 1}};
        // int[] k = {4, 1, 2, 5, 2};
        // for(int i=0; i<k.length; i++){
        //     System.out.print(i+1);
        //     double[] output = SlidingWindow.medianSlidingWindow(arr[i], k[i]);
        //     System.out.println("\tMedians = " + Arrays.toString(output));
        // }

        // //4. Schedule Tasks on Minimum Machines
        // int[][][] inputTasksList = {
        //     {{1, 1}, {5, 5}, {8, 8}, {4, 4}, {6, 6}, {10, 10}, {7, 7}},
        //     {{1, 7}, {1, 7}, {1, 7}, {1, 7}, {1, 7}, {1, 7}},
        //     {{1, 7}, {8, 13}, {5, 6}, {10, 14}, {6, 7}},
        //     {{1, 3}, {3, 5}, {5, 9}, {9, 12}, {12, 13}, {13, 16}, {16, 17}},
        //     {{12, 13}, {13, 15}, {17, 20}, {13, 14}, {19, 21}, {18, 20}}
        // };
        // for (int i = 0; i < inputTasksList.length; ++i) {
        //     System.out.print((i + 1) + ".\t Tasks: [");
        //     int[][] tasks = inputTasksList[i];
        //     for (int j = 0; j < tasks.length; ++j) {
        //         System.out.print("[" + tasks[j][0] + ", " + tasks[j][1] + "]");
        //         if (j < tasks.length - 1) {
        //             System.out.print(", ");
        //         }
        //     }
        //     System.out.println("]");
        //     System.out.println("\t Minimum number of machines: " + minimumMachines(tasks));
        //     System.out.println(String.join("", Collections.nCopies(100, "-")));
        // }

        // //5. Meeting Rooms-3
        // int[][][] meetings = {
        //     {{0, 10}, {1, 11}, {2, 12}, {3, 13}, {4, 14}, {5, 15}},
        //     {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}},
        //     {{1, 2}, {0, 10}, {2, 3}, {3, 4}},
        //     {{0, 2}, {1, 2}, {3, 4}, {2, 4}},
        //     {{1, 9}, {2, 8}, {3, 7}, {4, 6}, {5, 11}}
        // };
        // int[] rooms = {3, 3, 2, 4, 3};
        // for (int i = 0; i < meetings.length; i++) {
        //     System.out.println("\tRooms: " + rooms[i]);
        //     int bookedRoom = mostBooked(meetings[i], rooms[i]);
        //     System.out.println("\tRoom that held the most meetings: " + bookedRoom);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }
    
        // //6. Largest number after digits swap by parity
        // int[] testCases = {1234, 65875, 4321, 2468, 98123};
        // for (int num : testCases) {
        //     System.out.println("\tInput number: " + num);
        //     System.out.println("\tOutput number: " + largestInteger(num));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }
    
        // //7. Find Right Interval
        // int[][][] testCases = {
        //     {{1, 2}},  
        //     {{3, 4}, {2, 3}, {1, 2}},  
        //     {{1, 4}, {2, 3}, {3, 4}},  
        //     {{5, 6}, {1, 2}, {3, 4}},  
        //     {{1, 3}, {2, 4}, {3, 5}, {4, 6}},  
        // };
        // for (int i = 0; i < testCases.length; i++) {
        //     int[] result = findRightInterval(testCases[i]);
        //     System.out.println("\n\tOutput: " + Arrays.toString(result));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }
    
        // //8. Minimum cost to connect sticks
        // int[][] testCases = {
        //     {2, 4, 3},
        //     {1, 8, 3, 5},
        //     {5},
        //     {1, 2, 3, 4, 5},
        //     {7, 6, 8, 10}
        // };
        // for (int i = 0; i < testCases.length; i++) {
        //     int[] sticks = testCases[i];
        //     System.out.println((i + 1) + ".\tsticks: " + java.util.Arrays.toString(sticks));
        //     System.out.println("\tMinimum cost: " + connectSticks(sticks));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        //8. Longest happy string
        
    }

    public static int maximumCapital(int c, int k, int[] capitals,int[] profits) {
      
      // Replace this placeholder return statement with your code
      PriorityQueue<Integer> capMinHeap = new PriorityQueue<>((a, b) -> Integer.compare(capitals[a], capitals[b]));
      
      for(int i = 0; i < capitals.length; i++){
        capMinHeap.add(i);
      }
      
      PriorityQueue<Integer> profitMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
      while(k > 0){
        while(!capMinHeap.isEmpty() && capitals[capMinHeap.peek()] <= c){
          int i = capMinHeap.poll();
          profitMaxHeap.offer(profits[i]);
        }
        
        if(profitMaxHeap.isEmpty()){
          break;
        }
        
        c += profitMaxHeap.poll();
        k--;
      }
      return c;
   }

    class MedianOfStream {
        PriorityQueue<Integer> firstHalfMax, secondHalfMin;
        
        public MedianOfStream() {
            // Write your code here
            secondHalfMin = new PriorityQueue<>();
            firstHalfMax = new PriorityQueue<>((a, b) -> b-a);
        }

        public void insertNum(int num) {
            // Write your code here
            firstHalfMax.offer(num);
            secondHalfMin.offer(firstHalfMax.poll());
            
            if(secondHalfMin.size() > firstHalfMax.size()){
            firstHalfMax.offer(secondHalfMin.poll());
            }
        }

        public double findMedian() {
            // Replace this placeholder return statement with your code
            return firstHalfMax.size() > secondHalfMin.size() ? firstHalfMax.peek() : (double)(firstHalfMax.peek() + secondHalfMin.peek() ) / 2;
        }
    }

    public class SlidingWindow{
        static PriorityQueue<Integer> leftMax;
        static PriorityQueue<Integer> rightMin;
        
        public static double[] medianSlidingWindow(int[] nums, int k) {
            
            // Replace this placeholder return statement with your code
            Comparator<Integer> comp = (a, b) -> nums[a] != nums[b] ? Integer.compare(nums[a], nums[b]) : a - b;
            leftMax = new PriorityQueue<>(comp.reversed());
            rightMin = new PriorityQueue<>(comp);
            
            double[] res = new double[nums.length - k + 1];
            
            for(int i = 0; i < k; i++){
                addAndBalance(i);
            }
            res[0] = getMedian(k, nums);
            int j = 1;
            for(int i = k; i < nums.length; i++){
                int in = i, out = i-k;
                
                if(!leftMax.remove(out)){
                    rightMin.remove(out);
                }
                addAndBalance(in);
                res[j++] = getMedian(k, nums);
            }
                
            return res;
        }
        
        public static double getMedian(int k, int[] nums){
            return k % 2 == 0 ? ((double)nums[leftMax.peek()])/2.0 + ((double)nums[rightMin.peek()])/2.0 : (double)nums[leftMax.peek()];     
        }
        
        public static void addAndBalance(int i){
      leftMax.offer(i);
      rightMin.offer(leftMax.poll());
      
      if(rightMin.size() > leftMax.size()){
         leftMax.offer(rightMin.poll());
      }
   }
    }

    public static int minimumMachines(int[][] tasks) {
      
        // Replace this placeholder return statement with your code
        Arrays.sort(tasks, (a, b) -> a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] task : tasks){
            int start = task[0], end = task[1];
            if(!pq.isEmpty() && start >= pq.peek()){
                pq.poll();
            }
            pq.offer(end);
        }
        return pq.size();
    }

    public static int mostBooked(int[][] meetings, int rooms) {

        // Replace this placeholder return statement with your code
        int[] count = new int[rooms];
        //{roomNum, endTime}
        PriorityQueue<int[]> usedRooms = new PriorityQueue<>((a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer>availableRooms = new PriorityQueue<>();
        
        for(int i = 0; i < rooms; i++){
            availableRooms.offer(i);
        }
        
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        
        for(int[] meet : meetings){
            int start = meet[0], end = meet[1];
            
            while(!usedRooms.isEmpty() && start >= usedRooms.peek()[1]){
                availableRooms.offer(usedRooms.poll()[0]);
            }
            
            if(availableRooms.isEmpty()){
                int room = usedRooms.peek()[0];
                int currEnd = usedRooms.poll()[1];
                end = currEnd + (end - start);
                availableRooms.offer(room);
            }
            int roomNum = availableRooms.poll();
            count[roomNum]++;
            usedRooms.offer(new int[]{roomNum, end});
        }
        int result = 0;
        for(int i = 1; i < rooms; i++){
            if(count[i] > count[result]){
                result = i;
            }
        }
        return result;
    }

    public static int largestInteger (int num) {
      
        // Replace this placeholder return statement with your code
        PriorityQueue<Integer> evenNums = new PriorityQueue<>(), oddNums = new PriorityQueue<>();
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            if(digit % 2 == 0){
                evenNums.offer(digit);
            }
            else{
                oddNums.offer(digit);
            }
            temp /= 10;
        }
        int result = 0, power = 0, base = 10;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 == 0){
                result = evenNums.poll() * (int)Math.pow(base, power) + result;
            }
            else{
                result = oddNums.poll() * (int)Math.pow(base, power) + result;
            }
            power++;
            num /= 10;
        }
        return result;
    }

    public static int[] findRightInterval (int[][] intervals) {
        // Replace this placeholder return statement with your code
        //{time, idx}
        PriorityQueue<int[]> endTimes = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]); 
        PriorityQueue<int[]> startTimes = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            
        int[] result = new int[intervals.length];
        Arrays.fill(result, -1);
        
        for(int i = 0; i < intervals.length; i++){
            startTimes.offer(new int[]{intervals[i][0], i});
            endTimes.offer(new int[]{intervals[i][1], i});
        }
        
        while(!endTimes.isEmpty()){
            int idx = endTimes.peek()[1], end = endTimes.poll()[0];
            while(!startTimes.isEmpty() && startTimes.peek()[0] < end){
                startTimes.poll();
            }
            if(startTimes.isEmpty()){
                break;
            }
            int rightIdx = startTimes.peek()[1];
            result[idx] = rightIdx;
        }
        
        return result;
    }

    public static int connectSticks (int[] sticks) {
        int totalCost = 0;
        if(sticks.length == 1){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int st : sticks){
            pq.offer(st);
        }
        
        while(pq.size() > 1){
            int newStick = pq.poll() + pq.poll();
            totalCost += newStick;
            pq.offer(newStick);
        }
        return totalCost;
    }


}
