import java.util.*;

public class GenericTree {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public static Node CreateNode(int val){
            Node nn = new Node();
            nn.data = val;
            return nn;
        }
    }
    Node root;
    public GenericTree(ArrayList<Integer> values){
        if(values.isEmpty()){
            root = null;
        }
        else{
            root  = Node.CreateNode(values.get(0));

            Stack<Node> st = new Stack<>();
            st.push(root);

            for(int i = 1; i < values.size(); i++){
                if(values.get(i) == -1){
                    st.pop();
                }
                else{
                    Node nn = Node.CreateNode(values.get(i));
                    st.peek().children.add(nn);
                    st.push(nn);
                }
            }
        }
    }

    public static void display(Node node){
        StringBuilder str = new StringBuilder(node.data + " -> ");
        for(Node child: node.children){
            str.append(child.data).append(", ");
        }
        str.append(".");
        System.out.println(str);
        for(Node child: node.children){
            display(child);
        }
    }

    public static int size(Node node){
        int s = 0;
        for(Node child: node.children){
            int cs = size(child);
            s += cs;
        }
        s += 1;
        return s;
    }

    public static int maximum(Node node){
        int max = node.data;
        for(Node child: node.children){
            int cmax = maximum(child);
            if(cmax > max){
                max = cmax;
            }
        }
        return max;
    }

    public static int heightWrtNodes(Node node){
        int h = 0;
        for(Node child: node.children){
            int ch = heightWrtNodes(child);
            h = Math.max(h, ch);
        }
        h++;
        return h;
    }

    public static int heightWrtEdges(Node node){
        int h = -1;
        for(Node child: node.children){
            int ch = heightWrtEdges(child);
            h = Math.max(h, ch);
        }
        h++;
        return h;
    }

    public static void prePostTraversal(Node node){
        System.out.println("Node Pre " + node.data);
        for(Node child: node.children){
            System.out.println("Edge Pre " + node.data + "->" + child.data);
            prePostTraversal(child);
            System.out.println("Edge Post " + node.data + "->" + child.data);
        }
        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderTraversal(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(!q.isEmpty()){
            node = q.remove();
            System.out.print(" " + node.data);
            q.addAll(node.children);
        }
        System.out.println(".");
    }

    public static void levelOrderLinewiseTraversal(Node node){
        Queue<Node> parent = new ArrayDeque<>();
        Queue<Node> child = new ArrayDeque<>();
        parent.add(node);
        while(!parent.isEmpty()){
            node = parent.remove();
            System.out.print(node.data + " ");
            child.addAll(node.children);
            if(parent.isEmpty()){
                System.out.println();
                parent = child;
                child = new ArrayDeque<>();
            }
        }
    }

    public static void levelOrderZigZag(Node node){
        Stack<Node> parent = new Stack<>();
        Stack<Node> child = new Stack<>();
        parent.add(node);
        int level = 1;
        while(!parent.isEmpty()){
            node = parent.pop();
            System.out.print(node.data + " ");
            if(level % 2 == 1){
                for(Node c: node.children) {
                    child.push(c);
                }
            }
            else{
                for(int i = node.children.size() -1; i >= 0; i--){
                    child.add(node.children.get(i));
                }
            }
            if(parent.isEmpty()){
                System.out.println();
                level++;
                parent = child;
                child = new Stack<>();
            }
        }
    }

    public static void levelOrderLinewiseTraversal2(Node node){
        List<Node> parent = new LinkedList<>();
        parent.add(node);
        Node nullNode = null;
        parent.add(nullNode);
        while(!parent.isEmpty()){
            node = parent.remove(0);
            if(node != null) {
                System.out.print(node.data + " ");
                parent.addAll(node.children);
            }
            else {
                if(!parent.isEmpty()){
                    parent.add(nullNode);
                    System.out.println();
                }
            }
        }
    }

    public static void levelOrderLinewiseTraversal3(Node node){
        Queue<Node> parent = new ArrayDeque<>();
        parent.add(node);
        while(!parent.isEmpty()){
            int count = parent.size();
            while(count > 0) {
                node = parent.remove();
                System.out.print(node.data + " ");
                parent.addAll(node.children);
                count--;
            }
            System.out.println();
        }
    }

    public static class Pair{
        Node node;
        int level;

        Pair(){}

        Pair(Node n, int l){
            this.node = n;
            this.level = l;
        }
    }
    public static void levelOrderLinewiseTraversal4(Node node){
        Queue<Pair> parent = new ArrayDeque<>();
        int level = 1;
        Pair p = new Pair(node, level);
        parent.add(p);
        while(!parent.isEmpty()){
            p = parent.remove();
            if(p.level > level ){
                System.out.println();
                level = p.level;
            }
            System.out.print(p.node.data + " ");
            for (Node child : p.node.children) {
                parent.add(new Pair(child, p.level + 1));
            }
        }
    }

    public static void getMirrorTree(Node root){
        for(Node child : root.children){
            getMirrorTree(child);
        }
        Collections.reverse(root.children);
    }

    public static void removeLeafNodes(Node root){
        for(int i = root.children.size() - 1; i >= 0; i--){
            Node child = root.children.get(i);
            if(child.children.isEmpty()){
                root.children.remove(i);
            }
            else {
                removeLeafNodes(child);
            }
        }
    }

    public static void linearizeGenericTree(Node root){
        for(Node child: root.children){
            linearizeGenericTree(child);
        }

        while(root.children.size() > 1){
            Node last = root.children.remove(root.children.size()- 1);
            Node secondLast = root.children.get(root.children.size() - 1);

            Node secondLastTail = getTail(secondLast);
            secondLastTail.children.add(last);
        }
    }

    private static Node getTail(Node node){
        while(!node.children.isEmpty()){
            node = node.children.get(0);
        }
        return node;
    }

    public static Node linearizeGenericTree2(Node root){
        if(root.children.isEmpty()){
            return root;
        }
        Node lastTail = linearizeGenericTree2(root.children.get(root.children.size() - 1));
        while(root.children.size() > 1){
            Node last = root.children.remove(root.children.size()- 1);
            Node secondLast = root.children.get(root.children.size() - 1);
            Node secondLastTail = linearizeGenericTree2(secondLast);
            secondLastTail.children.add(last);
        }
        return lastTail;
    }

    public static boolean elementExists(Node root, int val){
        if(root.data == val){
            return true;
        }
        for(Node child: root.children){
            boolean result = elementExists(child, val);
            if(result){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node root, int val){
        if(root.data == val){
            ArrayList<Integer> path = new ArrayList<>();
            path.add(root.data);
            return path;
        }
        for(Node child: root.children){
            ArrayList<Integer> cr = nodeToRootPath(child, val);
            if(!cr.isEmpty()){
                cr.add(root.data);
                return cr;
            }
        }
        return new ArrayList<>();
    }

    public static int lowestCommonAncestor(Node root, int val1, int val2){
        ArrayList<Integer> path1 = nodeToRootPath(root, val1);
        ArrayList<Integer> path2 = nodeToRootPath(root, val2);
        int i = path1.size()-1;
        int j = path2.size()-1;
        if( i < 0 || j < 0){
            return -1;
        }
        while(i >= 0 && j >= 0 && Objects.equals(path1.get(i), path2.get(j))){
            i--; j--;
        }
        return path1.get(i + 1);
    }
    public static ArrayList<Integer> distanceBetweenNodes(Node root, int val1, int val2){
        ArrayList<Integer> path1 = nodeToRootPath(root, val1);
        ArrayList<Integer> path2 = nodeToRootPath(root, val2);
        int i = path1.size()-1;
        int j = path2.size()-1;
        if( i < 0 || j < 0){
            return new ArrayList<>();
        }
        while(i >= 0 && j >= 0 && Objects.equals(path1.get(i), path2.get(j))){
            i--; j--;
        }
        i++;
        int k = 0;
        ArrayList<Integer> distance = new ArrayList<>();
        while(k <= i){
            distance.add(path1.get(k++));
        }
        while(j >= 0){
            distance.add(path2.get(j--));
            k++;
        }
        return distance;
    }

    public static boolean isSimilar(Node root1, Node root2){
        if(root1.children.size() != root2.children.size()){
            return false;
        }
        for(int i = 0; i < root1.children.size(); i++){
            if(!isSimilar(root1.children.get(i), root2.children.get(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isMirrorImage(Node root1, Node root2){
        if(root1.children.size() != root2.children.size()){
            return false;
        }
        for(int i = 0, j = root2.children.size() -1; i < root1.children.size() && j >= 0; i++, j--){
            if(!isMirrorImage(root1.children.get(i), root2.children.get(j))){
                return false;
            }
        }
        return true;
    }

    static Node predecessor;
    static Node successor;
    static int state;
    public static void getPredecessorAndSuccessor(Node root, int val){
        if(state == 0){
            if(root.data == val){
                state = 1;
            }else{
                predecessor = root;
            }
        }
        else if(state == 1){
            successor = root;
            state = 2;
        }
        for(Node child: root.children){
            getPredecessorAndSuccessor(child, val);
        }
    }

    static int ceil;
    static int floor;
    public static void getCeilAndFloor(Node root, int val){
        if(root.data > val) {
            ceil = Math.min(ceil, root.data); //min of the larger
        }
        if(root.data < val) {
            floor = Math.max(floor, root.data);// max of the lower
        }
        for(Node child: root.children){
            getCeilAndFloor(child, val);
        }
    }

    public static int getKthLargest(Node root, int k){
        floor = Integer.MIN_VALUE; //max of the lower
        int kthLargest = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++){
            getCeilAndFloor(root, kthLargest);
            kthLargest = floor;
            floor = Integer.MIN_VALUE;
        }
        return kthLargest;
    }

    static Node maxSubtreeSumNode;
    static int maxSubtreeSum;
    public static int getMaximumSumSubtree(Node root){
        int sum = root.data;
        for(Node child: root.children){
            int cs = getMaximumSumSubtree(child);
            sum += cs;
        }
        if(sum > maxSubtreeSum){
            maxSubtreeSum = sum;
            maxSubtreeSumNode = root;
        }
        return sum;
    }

    static int diameter = 0;

    public static int calculateDiameterAndReturnHeight(Node root){
        int dch = -1;
        int sdch = -1;

        for(Node child: root.children){
            int ch = calculateDiameterAndReturnHeight(child);

            if(ch > dch){
                sdch = dch;
                dch = ch;
            }
            else if(ch > sdch){
                sdch = ch;
            }
        }

        if(dch+sdch+2 > diameter){
            diameter = dch+sdch+2;
        }

        return dch+1;
    }

    public static void iterativePreAndPostOrder(Node root){
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, -1));

        StringBuilder pre = new StringBuilder();
        StringBuilder post = new StringBuilder();

        while(!st.isEmpty()){
            Pair top = st.peek();

            if(top.level == -1){
                pre.append(top.node.data + " ");
                top.level++;
            }
            else if(top.level == top.node.children.size()){
                post.append(top.node.data + " ");
                st.pop();
            }
            else{
                st.push(new Pair(top.node.children.get(top.level), -1));
                top.level++;
            }
        }

        System.out.println("Pre Order: " + pre);
        System.out.println("Post Order: " + post);
    }
}
