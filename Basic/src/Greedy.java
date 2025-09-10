import java.util.*;
import java.util.Arrays;

public class Greedy {
    public void run(){
        // //1. Jump Game
        // int[][] nums = {
        //     {3, 2, 2, 0, 1, 4},
        //     {2, 3, 1, 1, 9},
        //     {3, 2, 1, 0, 4},
        //     {0},
        //     {1},
        //     {4, 3, 2, 1, 0},
        //     {1, 1, 1, 1, 1},
        //     {4, 0, 0, 0, 1},
        //     {3, 3, 3, 3, 3},
        //     {1, 2, 3, 4, 5, 6, 7}
        // };
        // for (int i = 0; i < nums.length; i++) {
        //     if (jumpGame(nums[i]))
        //         System.out.println("\tCan we reach the very last index? True");
        //     else
        //         System.out.println("\tCan we reach the very last index? False");
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //2. Boats to save people
        // int[][] people = {{1, 2}, {3, 2, 2, 1}, {3, 5, 3, 4}, {5, 5, 5, 5}, {1, 2, 3, 4}, {1, 2, 3}, {3, 4, 5}};
        // int[] limit = {3, 3, 5, 5, 5, 3, 5};
        // for (int i = 0; i < people.length; i++) {
        //     System.out.println("\tWeight Limit = " + limit[i]);
        //     System.out.println("\tThe minimum number of boats required to save people are "
        //             + rescueBoats(people[i], limit[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //3. Gas Station Journey
        // int[][] gas = {
        //     {1, 2, 3, 4, 5},
        //     {2, 3, 4},
        //     {1, 1, 1, 1, 1},
        //     {1, 1, 1, 1, 10},
        //     {1, 1, 1, 1, 1},
        //     {1, 2, 3, 4, 5}
        // };
        // int[][] cost = {
        //     {3, 4, 5, 1, 2},
        //     {3, 4, 5},
        //     {1, 2, 3, 4, 5},
        //     {2, 2, 1, 3, 1},
        //     {1, 0, 1, 2, 3},
        //     {1, 2, 3, 4, 5}
        // };
        // for (int i = 0; i < cost.length; i++) {
        //     System.out.print(i + 1);
        //     System.out.println(".\tGas: " + Arrays.toString(gas[i]));
        //     System.out.println("\tCost: " + Arrays.toString(cost[i]));
        //     System.out.println("\tThe index of the gas station we can start our journey from is "+ gasStationJourney(gas[i], cost[i])+ " (If it's -1, then that means no solution exists)");
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //4. Two City Scheduling
        // int[][][] inputCosts = {{{10, 20}, {30, 200}, {400, 50}, {30,20}},
        // {{259,770}, {448,54}, {926,667}, {184,139}, {840,118}, {577,469}},
        // {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779},{457, 60}, {650, 359}, {631, 42}},
        // {{1, 2}, {3, 4}, {5, 6}, {7,8}},
        // {{1, 2}, {1, 2}, {1, 2}, {1, 2}},
        // {{10, 100}, {10, 1000}, {50, 500}, {1,100}}};
        // for(int i=0;i < inputCosts.length;i++){
        //     System.out.println((i + 1)+ "\tcosts"+ Arrays.deepToString(inputCosts[i]));
        //     System.out.println("\n\tThe minimum cost to send people equally into city A and B is: "+ twoCityScheduling(inputCosts[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //5. Minimum Refuel Stops
        // int[] target = {120, 15, 570, 1360};
        // int[] startFuel = {10, 3, 140, 380};
        // int[][][] stations = {
        //                     {{10, 60},{20, 25},{30, 30},{60, 40}},
        //                     {{2, 5},{3, 1},{6, 3},{12,6 }},
        //                     {{140, 200}, {160, 130}, {310, 200}, {330, 250}},
        //                     {{310, 160}, {380, 620}, {700, 89}, {850, 190}, {990, 360}}
        //                     };
        // for(int i=0;i<target.length;i++){
        //     System.out.print(i+1);
        //     System.out.println(".\tStations: "+Arrays.deepToString(stations[i]));
        //     System.out.println("\tTarget fuel: "+target[i]);
        //     System.out.println("\tStart fuel: "+startFuel[i]);
        //     System.out.println("\tMinimum number of Refueling stops: "+minRefuelStops(target[i], startFuel[i],stations[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //6. Largest Palindrome
        // String[] numbers = {"00001", "1234287", "9876545367282", "000000", "146"};
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println((i + 1) + ".\tGiven number: \"" + numbers[i] + "\"");
        //     String result = largestPalindrome(numbers[i]);
        //     System.out.println("\n\tThe largest palindromic number: \"" + result + "\"");
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //7. Assign Cookies
        // int[][] greedFactors = {
        //     {1, 2, 3},
        //     {10, 20, 30, 40 ,50 ,60 ,70, 80},
        //     {3, 4, 5, 6, 7, 8},
        //     {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
        //     {10, 9, 8, 7},
        //     {1000, 996, 867, 345, 23, 12}
        // };
        // int[][] cookieSizes = {
        //     {1, 1},
        //     {10, 20, 30, 40 ,50 ,60 ,70, 80, 90, 100},
        //     {1, 2},
        //     {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
        //     {5, 6, 7, 8},
        //     {}
        // };
        // for (int i = 0; i < greedFactors.length; i++) {
        //     int result = findContentChildren(greedFactors[i], cookieSizes[i]);
        //     System.out.println((i + 1) + ".\tGreed factors: " + Arrays.toString(greedFactors[i]));
        //     System.out.println("\tCookie sizes: " + Arrays.toString(cookieSizes[i]));
        //     System.out.println("\n\tResult: " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //8. Min Cost to Rearrange Fruits - https://leetcode.com/problems/rearranging-fruits/solutions/7030240/rearranging-fruits/
        // int[][] basket1List = {
        //     {4,1,3},
        //     // {4, 2, 2, 2},
        //     // {2, 3, 4, 1},
        //     // {84, 80, 43, 8, 80, 88, 43, 14, 100, 88},
        //     // {1, 2, 2, 3, 3, 4},
        //     // {4, 4, 4, 4, 3}
        // };
        // int[][] basket2List = {
        //     {4, 2, 3},
        //     {1, 4, 1, 2},
        //     {3, 2, 5, 1},
        //     {32, 32, 42, 68, 68, 100, 42, 84, 14, 8},
        //     {1, 1, 2, 3, 4, 4},
        //     {5, 5, 5, 5, 3}
        // };
        // for (int i = 0; i < basket1List.length; i++) {
        //     System.out.print((i + 1) + ".\t Basket 1 = " + Arrays.toString(basket1List[i]));
        //     System.out.print("\n\t Basket 2 = " + Arrays.toString(basket2List[i]));
        //     long result = minCostToRearrangeFruits(basket1List[i], basket2List[i]);
        //     System.out.println("\n\n\t Minimum cost to rearrange fruits in the two baskets is " + result);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //9. Number of Steps to Reduce a Number to Zero
        // List<String> strings = Arrays.asList(
        //     "1011",
        //     "111",
        //     "100",
        //     "1",
        //     "10"
        // );
        // for (int i = 0; i < strings.size(); ++i) {
        //     System.out.println((i + 1) + ".\tstr: " + strings.get(i));
        //     System.out.println();
        //     System.out.println("\tsteps: " + numSteps(strings.get(i)));
        //     System.out.println(new String(new char[100]).replace("\0", "-"));
        // }
    }  

    public boolean jumpGame(int[] nums) {
        if(nums.length == 1){
           return true;
        }
        int target = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
           if(i + nums[i] >= target){
              target = i;
           }
        }
        return target == 0;
    }

    public static int rescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int l = 0, r = people.length-1;
        
        while(l <= r){
           if(people[r] + people[l] <= limit){
              l++;
              r--;
           }
           else{
              r--;
           }
           boats++;
        }
         
        return boats;
     }

    public static int gasStationJourney(int[] gas, int[] cost) //Global Minima
    {
        int currentGas = 0;
        int minGas = 0;
        int startIndexCandidate = -1;
        
        for(int i = 0; i < gas.length; i++){
           currentGas += gas[i] - cost[i];
           if(currentGas < minGas){
              minGas = currentGas;
              startIndexCandidate = i;
           }
        }
        
        if(currentGas < 0){
           return -1;
        }
        return (startIndexCandidate + 1) % gas.length;
    }

    public static int gasStationJourney2(int[] gas, int[] cost) //Greedy “reset when tank < 0” solution feels like Kadane’s algorithm
    {
        int total = 0, tank = 0, start = 0;
        
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            
            // If tank goes negative, reset starting point
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        
        return total < 0 ? -1 : start;
    }

    public static int twoCityScheduling(int[][] costs) 
    {
        int i = 0 , n = costs.length;
        int[][]diff = new int[n][2];
        for(int[] cost: costs){
            diff[i][0] = cost[0] - cost[1];
            diff[i][1] = i;
            i++;
        }
        // Arrays.sort(diff, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(diff, (a, b) -> a[0]-b[0]);
        int totalCost = 0;
        i = 0;
        while(i < n/2){
            int idx = diff[i][1];
            totalCost += costs[idx][0];
            i++;
        }
        while(i < n){
            int idx = diff[i][1];
            totalCost += costs[idx][1];
            i++;
        }
        return totalCost;
    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel >= target){
            return 0;
        }
        int stops = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        int i = 0;
        while(startFuel < target){
            if(i < stations.length && stations[i][0] <= startFuel){
                maxHeap.add(stations[i][1]);
                i++;
            }
            else if(maxHeap.isEmpty()){
                return -1;
            }
            else{
                startFuel += maxHeap.poll();
                stops++;
            }
        }
        return stops;
    }

    public static String largestPalindrome(String num) {
        int[] count = new int[10];
        for(char ch : num.toCharArray()){
            int idx = ch -'0';
            count[idx]++;
        }
        StringBuilder sb = new StringBuilder();
        int largestOdd = -1;
        for(int i = 9; i >= 0; i--){
            if(count[i] == 0){
                continue;
            }
            if(i == 0 && sb.isEmpty()){
                count[i] = 1;
            }
            int numPairs = count[i] / 2;
            for(int j = 0; j < numPairs; j++){
                sb.append(i);
            }
            if(count[i] % 2 == 1 && largestOdd == -1){
                largestOdd = i;
            }
        }
        
        if(sb.isEmpty()){
            if(largestOdd != -1){
                sb.append(largestOdd);
                return sb.toString();
            }
        }
        else{
            StringBuilder secondHalf = new StringBuilder(sb);
            if(largestOdd != -1) sb.append(largestOdd);
            return sb.append(secondHalf.reverse().toString()).toString();
        }
        return "";
    }

    public static int findContentChildren(int[] greedFactors, int[] cookieSizes) {
        Arrays.sort(greedFactors);
        Arrays.sort(cookieSizes);
        
        int count = 0;
        int i = 0, n = greedFactors.length;
        int j = 0, m = cookieSizes.length;
        while(i < n && j < m){
            if(greedFactors[i] <= cookieSizes[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static long minCostToRearrangeFruits(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(var b1 : basket1){
            min = Math.min(min, b1);
            freq.put(b1, freq.getOrDefault(b1, 0)+1);
        }
        for(var b2 : basket2){
            min = Math.min(min, b2);
            freq.put(b2, freq.getOrDefault(b2, 0)-1);
        }
        
        List<Integer> merge = new ArrayList<>();
        
        for(var entry : freq.entrySet()){
            int count = entry.getValue();
            
            if(count % 2 != 0) return -1;
            count /= 2;
            for(int i = 0; i < count; i++){
                merge.add(entry.getKey());
            }
        }
        Collections.sort(merge);
        int len = merge.size()/2;
        long total = 0;
        for(int i = 0; i < len; i++){
            total += Math.min(2 * min, merge.get(i));
        }
        return total;
    }

    public static int numSteps (String str) {
        int c = 0, total = 0;
        for(int i = str.length()-1; i > 0 ; i--){
            int digit = (str.charAt(i)-'0') + c;
            if(digit % 2 == 0){
                total += 1;
            }
            else{
                total += 2;
                c = 1;
            }
        }
        return total + c;
    }
}
