import java.util.Arrays;
import java.util.Stack;
import java.lang.*;

public class Stacks {

    public static class Pair implements Comparable<Pair>{
        public int st;
        public int et;

        public Pair(int start, int end){
            st = start;
            et = end;
        }

        @Override
        public int compareTo(Pair otherPair) {
            if(this.st != otherPair.st){
                return this.st - otherPair.st;
            }
            else{
                return this.et - otherPair.et;
            }
        }
    }

    public static boolean isDuplicateBrackets(String exp){
        Stack<Character> st = new Stack<>();
        int n = exp.length();
        for(int i = 0; i < n; i++){
            char ch = exp.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    return true;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }

    public static boolean isBalancedBrackets(String exp){
        Stack<Character> st = new Stack<>();
        int n = exp.length();
        for(int i = 0; i < n; i++){
            char ch = exp.charAt(i);
            switch(ch){
                case '[':
                case '{':
                case '(':
                    st.push(ch);
                    break;

                case ']':
                    if(st.isEmpty() || st.peek() != '[') {
                        return false;
                    }else{
                        st.pop();
                    }
                    break;

                case '}':
                    if(st.isEmpty() || st.peek() != '{') {
                        return false;
                    }else{
                        st.pop();
                    }
                    break;

                case ')':
                    if(st.isEmpty() || st.peek() != '(') {
                        return false;
                    }else{
                        st.pop();
                    }
                    break;
            }
        }
        return st.isEmpty();
    }

    public static int[] nextGreaterElementOnRight(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && (st.peek() <= arr[i])){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return nge;
    }

    public static int[] nextGreaterElementOnRightV2(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && (arr[st.peek()] <= arr[i])){
                nge[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nge[st.peek()] = -1;
            st.pop();
        }
        return nge;
    }

    public static int[] nextSmallerElementOnRight(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = -1;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return nse;
    }

    public static int[] nextSmallerElementOnRightV2(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                int pos = st.pop();
                nse[pos] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse[st.pop()] = -1;
        }
        return nse;
    }

    public static int[] nextGreaterElementOnLeft(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n ; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }

    public static int[] nextGreaterElementOnLeftV2(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                nge[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nge[st.pop()] = -1;
        }
        return nge;
    }

    public static int[] nextSmallerElementOnLeft(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = -1;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
    }

    public static int[] nextSmallerElementOnLeftV2(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                nse[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse[st.pop()] = -1;
        }
        return nse;
    }

    public static int[] stockSpan(int[] arr){
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static int largestAreaInHistogram(int[] arr){
        int[] rb = new int[arr.length]; //next smaller element's indices on the right
        Stack<Integer> st = new Stack<>();
        rb[arr.length - 1] = arr.length;
        st.push(arr[arr.length -1]);
        for(int i = arr.length-2; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rb[i] = arr.length;
            }
            else{
                rb[i] = st.peek();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }

        int[] lb = new int[arr.length]; //next smaller element's indices on the left
        lb[0] = -1;
        st.push(0);
        for(int i = 1; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                lb[i] = -1;
            }
            else{
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int width = arr[i] * (rb[i] - lb[i] - 1);
            if(width > maxArea){
                maxArea = width;
            }
        }
        return maxArea;
    }

    public static int[] maxInSlidingWindow(int[] arr, int k){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length -1);
        nge[arr.length-1] = -1;
        for(int i = arr.length -2 ; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = arr.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int[] max = new int[arr.length - k + 1];
        int j = 0;
        for(int i = 0; i < max.length; i++){
            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }
            max[i] = arr[j];
        }
        return max;
    }

    public static float infixEvaluation(String exp){

        Stack<Float> opnd = new Stack<>();
        Stack<Character> optr = new Stack<>();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == ' '){
                continue;
            }

            if(ch >= '0' && ch <= '9'){
                opnd.push((float)ch - (float)('0'));
            }

            if(ch == '('){
                optr.push(ch);
            }

            if(ch == ')'){
                //pop and evaluate till '(' is encountered
                while(optr.peek() != '(') {
                    float result = calculateExpression(opnd, optr);
                    opnd.push(result);
                }
                optr.pop();
            }

            if( ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!optr.isEmpty() && optr.peek() != '(' && isHigherOrEqualPriorityOperator(ch, optr.peek())){
                    float result = calculateExpression(opnd, optr);
                    opnd.push(result);
                }
                optr.push(ch);
            }
        }

        while(!optr.isEmpty()){
            float result = calculateExpression(opnd, optr);
            opnd.push(result);
        }
        return opnd.pop();
    }

    public static void infixConversions(String exp){
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> optr = new Stack<>();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == ' '){
                continue;
            }
            else if(ch == '('){
                optr.push(ch);
            }
            else if(Character.isDigit(ch) || Character.isAlphabetic(ch)){
                pre.push(ch+"");
                post.push(ch+"");
            }
            else if(ch == ')'){
                while(optr.peek() != '('){
                    UpdatePreAndPostStacks(pre, post, optr);
                }
                optr.pop();
            }
            else{
                while(!optr.isEmpty() && optr.peek() != '(' && precedence(ch) <= precedence(optr.peek())){
                    UpdatePreAndPostStacks(pre, post, optr);
                }
                optr.push(ch);
            }
        }
        while(!optr.isEmpty()){
            UpdatePreAndPostStacks(pre, post, optr);
        }

        System.out.println("Prefix: " + pre.pop());
        System.out.println("Postfix: " + post.pop());
    }

    public static void postfixEvaluationAndConversions(String exp){

        Stack<String> in = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Integer> result = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                in.push(ch+"");
                pre.push(ch+"");
                result.push(ch - '0');
            }
            else{
                CalculatePostfix(in, pre, result, ch);
            }
        }

        System.out.println("Result: " + result.pop());
        System.out.println("Infix: " + in.pop());
        System.out.println("Prefix: " + pre.pop());
    }

    public static void prefixEvaluationAndConversions(String exp){

        Stack<String> in = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Integer> result = new Stack<>();
        for(int i = exp.length() - 1; i >= 0 ; i--){
            char ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                in.push(ch+"");
                post.push(ch+"");
                result.push(ch - '0');
            }
            else{
                CalculatePrefix(in, post, result, ch);
            }
        }

        System.out.println("Result: " + result.pop());
        System.out.println("Infix: " + in.pop());
        System.out.println("Postfix: " + post.pop());
    }

    public static void findCelebrity(int[][] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            st.push(i);
        }

        while(st.size() != 1){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                st.push(j);
            }
            else{
                st.push(i);
            }
        }

        int possibleCeleb = st.pop();
        for(int i = 0; i < n; i++){
            if(possibleCeleb != i && (arr[possibleCeleb][i] == 1 || arr[i][possibleCeleb] == 0)){
                System.out.println("No celebrity!");
                return;
            }
        }
        System.out.println("Celebrity: " + possibleCeleb);
    }

    public static void overlappingIntervals(int[][] arr){
        Pair[] pairs = new Pair[arr.length];
        for(int i = 0; i < arr.length; i++){
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        st.push(pairs[0]);
        for(int i = 1; i < arr.length; i++){
            Pair top = st.peek();
            if(pairs[i].st > top.et){
                st.push(pairs[i]);
            }
            else{
                top.et = Math.max(top.et, pairs[i].et);
            }
        }
        Stack<Pair> result = new Stack<>();

        while(!st.isEmpty()){
            result.push(st.pop());
        }
        while(!result.isEmpty()){
            Pair p = result.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static void smallestNumberFollowingPattern(String pattern){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        int n = pattern.length();
        int start = 0;
        int end = 1;
        for(int i = 0; i < n; i++){
            char ch = pattern.charAt(i);
            if(ch == 'd'){
                end++;
            }
            else if(ch == 'i'){
                for(int j = end; j > start; j--){
                    result.append(j);
                }
                start = end;
                end++;
            }
        }
        while(end > start){
            result.append(end--);
        }
        System.out.println(result);
    }

    private static float calculateExpression(Stack<Float> opnd, Stack<Character> optr){
        float b = opnd.pop();
        float a = opnd.pop();
        char op = optr.pop();
        float result = 0;
        switch(op){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
        }
        return result;
    }

    private static boolean isHigherOrEqualPriorityOperator(char currOp, char lastOp){
        if(currOp == '*' && (lastOp == '+' || lastOp == '-')){
            return false;
        }
        if(currOp == '/' && (lastOp == '+' || lastOp == '-')){
            return false;
        }
        else {
            return true;
        }
    }

    private static void UpdatePreAndPostStacks(Stack<String> pre, Stack<String> post, Stack<Character> optr){
        String preV2 = pre.pop();
        String preV1 = pre.pop();

        String postV2 = post.pop();
        String postV1 = post.pop();

        char op = optr.pop();

        pre.push(op+preV1+preV2);
        post.push(postV1+postV2+op);
    }

    private static int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

    private static void CalculatePostfix(Stack<String> in, Stack<String> pre, Stack<Integer> result, char op){
        //in
        String inV2 = in.pop();
        String inV1 = in.pop();
        String inV = inV1 + " " + op + " " + inV2;
        in.push(inV);

        //pre
        String preV2 = pre.pop();
        String preV1 = pre.pop();
        String preV = op + preV1 + preV2;
        pre.push(preV);

        //in
        int v2 = result.pop();
        int v1 = result.pop();
        int val = 0;
        switch(op){
            case '+':
                val = v1 + v2;
                break;

            case '-':
                val = v1 - v2;
                break;

            case '*':
                val = v1 * v2;
                break;

            case '/':
                val = v1 / v2;
                break;
        }
        result.push(val);
    }

    private static void CalculatePrefix(Stack<String> in, Stack<String> post, Stack<Integer> result, char op){
        //in
        String inV1 = in.pop();
        String inV2 = in.pop();
        String inV = inV1 + " " + op + " " + inV2;
        in.push(inV);

        //pre
        String postV1 = post.pop();
        String postV2 = post.pop();
        String postV = postV1 + postV2 + op;
        post.push(postV);

        //in
        int v1 = result.pop();
        int v2 = result.pop();
        int val = 0;
        switch(op){
            case '+':
                val = v1 + v2;
                break;

            case '-':
                val = v1 - v2;
                break;

            case '*':
                val = v1 * v2;
                break;

            case '/':
                val = v1 / v2;
                break;
        }
        result.push(val);
    }
}
