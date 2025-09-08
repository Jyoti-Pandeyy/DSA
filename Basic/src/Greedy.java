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

        //4. 

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

    
}
