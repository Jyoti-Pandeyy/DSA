import java.util.*;
import java.util.Arrays;

public class Subsets {
    public void run(){
        // //1. Subsets
        // int[][] inputSets = {
        //     {},
        //     {2, 5, 7},
        //     {1, 2},
        //     {1, 2, 3, 4},
        //     {7, 3, 1, 5}
        // };
        // for (int i = 0; i < inputSets.length; i++) {
        //     int[] set = inputSets[i];
        //     System.out.println((i + 1) + ". Set: " + Arrays.toString(set));
        //     List<List<Integer>> subsets = findAllSubsets(set);
        //     System.out.println("   Subsets: " + subsets);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //2. Permutation
        // String[] inputWord = {"ab", "bad", "abcd"};
        // for (int index = 0; index < inputWord.length; index++)
        // {
        //     ArrayList <String> permutedWords = permuteWord(inputWord[index]);
        //     System.out.println(index + 1 + ".\t Input string: '" + inputWord[index] + "'");
        //     System.out.println("\t All possible permutations are: " + permutedWords);
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }
    
        // //3. Letter Combinations of a Phone Number
        // String[] digitsArray = {"23", "73", "426", "78", "925", "2345"};
        // for(int i = 0; i < digitsArray.length; i++){
        //     System.out.println((i + 1)+ ".\tAll letter combinations for  "+digitsArray[i]+ ": "+ letterCombinations(digitsArray[i]));
        //     System.out.println(new String(new char[100]).replace('\0', '-'));
        // }

        // //4. Generate all combinations of valid balanced parentheses
        // ArrayList<String> result = new ArrayList<String>();
		// int[] n = {1, 2, 3, 4, 5};
		// for (int i = 0; i < n.length; i++) {
		// 	System.out.println (i+1 + ".\tn = "+ n[i]);
		// 	System.out.println ("\tAll combinations of valid balanced parentheses:");
		// 	result = generateCombinations(n[i]);
		// 	for (int j = 0; j < result.size(); j++) {
		// 		System.out.println("\t\t" + result.get(j));
		// 	}
		// 	System.out.println(new String(new char[100]).replace('\0', '-'));
		// }

        //5. 
    }

    public static List<List<Integer>> subsetsUsingBitmask(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int total = 1 << n; // 2^n subsets

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }

    public static List<List<Integer>> findAllSubsets(int[] nums) {
        List<List<Integer>> setsList = new ArrayList<>();
        setsList.add(new ArrayList<>());
        
        for(int num : nums){
           List<List<Integer>> newSubsets = new ArrayList<>();
        
        for (List<Integer> subset : setsList) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(num);  // add current number
            newSubsets.add(newSubset);
        }
           setsList.addAll(newSubsets);
        }
        return setsList;
    }

    // public static ArrayList<String> permuteWord(String word) {
    //     ArrayList<String> result = new ArrayList<>();
    //     permuteHelper(word.toCharArray(), 0, result);
    //     return result;
    // }
    
    public static ArrayList<String> permuteWord(String word) {
        ArrayList<String> result = new ArrayList<>();
        int n = word.length();
        result.add(word);
        for(int i = 0; i < n; i++){
            ArrayList<String> temp = new ArrayList<>();
            for(String w : result){
                char[] arr = w.toCharArray();
                for(int j = i; j < n; j++){
                    swap(arr, i, j);
                    temp.add(new String(arr));
                    swap(arr, i, j);
                }
            }
            result = temp;
        }
        return result;
    }
    
    public static void permuteHelper(char[] word, int idx, ArrayList<String> result){
        if(idx == word.length - 1){
            result.add(new String(word));
            return;
        }
        
        for(int i = idx; i < word.length; i++){
            swap(word, idx, i);
            permuteHelper(word, idx+1, result);
            swap(word, idx, i);
        }
    }
    
    public static void swap(char[] word, int i, int j){
        char c = word[i];
        word[i] = word[j];
        word[j] = c;
    }

    Map<Character, char[]> map;
    public List<String> letterCombinations(String digits){
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        map = new HashMap<>();
        map.put('2', new char[]{'a','b', 'c'});
        map.put('3', new char[]{'d','e', 'f'});
        map.put('4', new char[]{'g','h', 'i'});
        map.put('5', new char[]{'j','k', 'l'});
        map.put('6', new char[]{'m','n', 'o'});
        map.put('7', new char[]{'p','q', 'r', 's'});
        map.put('8', new char[]{'t','u', 'v'});
        map.put('9', new char[]{'w','x', 'y', 'z'});
        
        List<String> letterCombs = letterCombinationsHelper(digits, 0);
        // backtrack(0, new StringBuilder(), digits, digitsMapping, combinations);
        return letterCombs;
    }
    
    public List<String> letterCombinationsHelper(String digits, int idx){
        if(idx == digits.length()){
            List<String> res = new ArrayList<String>();
            res.add("");
            return res;
        }
        
        char digit = digits.charAt(idx);
        List<String> nextResult = letterCombinationsHelper(digits, idx+1);
        List<String> result = new ArrayList<>();
        for(char ch : map.get(digit)){
            for(String r : nextResult){
                result.add(ch + r);
            }
        }
        return result;
    }

    public void backtrack(int index, StringBuilder path, String digits, Map<Character, String[]> letters, List<String> combinations) {
        if (path.length() == digits.length()) {
            
            combinations.add(path.toString());
            return; 
        }
        
        char digit = digits.charAt(index);
        String[] possibleLetters = letters.get(digit);
        for (String letter : possibleLetters) {

            path.append(letter);

            backtrack(index + 1, path, digits, letters, combinations);

            path.deleteCharAt(path.length() - 1);
        }
    }

    public static ArrayList<String> generateCombinations(int n) {
        ArrayList<String> result = new ArrayList<String>();
        generateParenthesis(n, n, new StringBuilder(), result);
		return result;
	}
	
	public static void generateParenthesis(int opened, int closed, StringBuilder sb, ArrayList<String> result){
	    if(opened == 0 && closed == 0){
	        result.add(new String(sb.toString()));
	        return;
	    }
	    if(opened > 0){
	        sb.append("(");
	        generateParenthesis(opened - 1, closed, sb, result);
	        sb.deleteCharAt(sb.length()-1);
	    }
	    if(closed > 0 && closed > opened){
	        sb.append(")");
	        generateParenthesis(opened, closed -1 , sb, result);
	        sb.deleteCharAt(sb.length()-1);
	    }
	}

    
}
