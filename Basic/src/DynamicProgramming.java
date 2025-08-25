public class DynamicProgramming {

    public static int Fibonacci(int n, int[] memo){
        if(n == 0 || n == 1){
            return n;
        }

        if(memo[n] != 0){
            return memo[n];
        }

        int fibn = Fibonacci(n-1, memo) + Fibonacci(n-2, memo);
        memo[n] = fibn;
        return fibn;
    }

    public static int climbStairsMemoization(int n, int[] memo){
        if(n == 0){
            return 1;
        }
        else if( n < 0){
            return 0;
        }
        if(memo[n] != 0){
            return memo[n];
        }

        int paths = climbStairsMemoization(n-1, memo) + climbStairsMemoization(n-2, memo) + climbStairsMemoization(n-3, memo);
        memo[n] = paths;
        return paths;
    }

    public static int climbStairsTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            if(i-1 >= 0){
                dp[i] += dp[i-1];
            }
            if(i-2 >= 0){
                dp[i] += dp[i-2];
            }
            if(i-3 >= 0){
                dp[i] += dp[i-3];
            }
        }
        return dp[n];
    }

    public static int climbStairsWithJumps(int n, int[] jumps){
        int[] dp = new int[n+1];
        dp[n] = 1;

         for(int i = n-1; i >= 0; i--){
             int jump = 1;
             while(jump <= jumps[i] && jump + i <= n){
                 dp[i] += dp[jump+i];
                 jump++;
             }
         }
         return dp[0];
    }

    public static int climbStairsWithMinimumJumps(int n, int[] jumps){
        int[] dp = new int[n+1];

        for(int i = 0; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[n] = 0;

        for(int i = n-1; i >= 0; i--){
            for(int j = 1; j <= jumps[i] && i+j <= n; j++){
                dp[i] = Math.min(dp[i], dp[i+j]);
            }
            if(dp[i] != Integer.MAX_VALUE)
                dp[i]++;
        }
        return dp[0];
    }

    public static int minimumCostPath(int[][] cost){
        int n = cost.length;
        int m = cost[0].length;
        int[][] dp = new int[n][m];

        for(int r = n-1; r >= 0; r--){
            for(int c = m-1; c >= 0; c--){
                dp[r][c] = cost[r][c];
                if(c+1 < m && r+1 < n){
                    dp[r][c] += Math.min(dp[r+1][c], dp[r][c+1]);
                }
                else if(r+1 < n){
                    dp[r][c] += dp[r+1][c];
                }
                else if(c+1 < m){
                    dp[r][c] += dp[r][c+1];
                }
            }
        }
        return dp[0][0];
    }

    public static int maxGoldInGoldMine(int[][] goldmine){
        int n = goldmine.length;
        int m = goldmine[0].length;
        int[][] dp = new int[n][m];

        for(int i = 0; i < n; i++){
            dp[i][m-1] = goldmine[i][m-1];
        }

        for(int c = m-2; c >= 0; c--){
            for(int r = 0; r < n; r++){
                dp[r][c] = dp[r][c+1];
                if(r-1 >= 0){
                    dp[r][c] = Math.max(dp[r][c], dp[r-1][c+1]);
                }
                if(r+1 < n){
                    dp[r][c] = Math.max(dp[r][c], dp[r+1][c+1]);
                }
                dp[r][c] += goldmine[r][c];
            }
        }
        int maxGold = Integer.MIN_VALUE;
        for(int r = 0; r < n ; r++){
            maxGold = Math.max(maxGold, dp[r][0]);
        }
        return maxGold;
    }

    public static boolean targetSumSubset(int[] nums, int target){
        int n = nums.length;

        boolean[][] dp = new boolean[n+1][target+1];
        dp[0][0] = true;
        for(int i = 1; i <= n; i++){
            dp[i][0] = true;
        }
        if(nums[0] <= target){
            dp[1][nums[0]] = true;
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= target; j++){
                dp[i][j] = dp[i-1][j];
                if(!dp[i][j] && j-nums[i-1] >= 0){
                    dp[i][j] = dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][target];
    }

    public static int coinChangeCombination(int[] coins, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for(int coin: coins){
            for(int t = coin; t <= target; t++){
                dp[t] += dp[t-coin];
            }
        }
        return dp[target];
    }

    public static int coinChangePermutations(int[] coins, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for(int t = 1; t <= target; t++){
            for(int coin: coins){
                if(t >= coin) {
                    dp[t] += dp[t - coin];
                }
            }
        }
        return dp[target];
    }

    public static int zeroOneKnapsack(int[] weights, int[] values, int cap){
        int n = weights.length;

        int[][] dp = new int[n][cap+1];

        for(int i = weights[0]; i <= cap; i++){
            dp[0][i] = values[0];
        }

        for(int i = 1; i < n; i++){
            for(int c = 1; c <= cap; c++){
                if(c >= weights[i]){
                    dp[i][c] = Math.max(dp[i-1][c], dp[i-1][c-weights[i]] + values[i]);
                }
            }
        }
        return dp[n-1][cap];
    }

    public static int unboundedKnapsack(int[] weights, int[] values, int cap){
        int n = weights.length;

        int[] dp = new int[cap+1];

        for(int i = 1; i < n; i++){
            for(int c = weights[i]; c <= cap; c++){
                dp[c] = Math.max(dp[c], dp[c-weights[i]] + values[i]);
            }
        }
        return dp[cap];
    }

    public static int countBinaryStrings(int n){
        int curr_0, curr_1, next_0, next_1;
        curr_0 = curr_1 = next_0 = next_1 = 0;
        if(n >= 1){
            curr_0 = 1;
            curr_1 = 1;
        }

        for(int i = 2; i <= n; i++){
            next_0 = curr_1;
            next_1 = curr_0 + curr_1;

            curr_0 = next_0;
            curr_1 = next_1;
        }

        return curr_0 + curr_1;
    }

    public static long arrangeBuildings(int n){
        int curr_s, curr_b, next_s, next_b;
        curr_s = curr_b = next_s = next_b = 0;
        if(n >= 1){
            curr_s = 1;
            curr_b = 1;
        }

        for(int i = 2; i <= n; i++){
            next_s = curr_s + curr_b;
            next_b = curr_s;

            curr_s = next_s;
            curr_b = next_b;
        }

        return (long)Math.pow(curr_s + curr_b, 2) ;
    }
}
