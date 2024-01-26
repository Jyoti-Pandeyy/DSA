import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CustomTypes {
    //region Custom stack
    public static class CustomStack {

        private int[] data;
        private int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return tos + 1;
        }

        void display() {
            int i = tos;
            while (i >= 0) {
                System.out.print(data[i] + " ");
                i--;
            }
            System.out.println();
        }

        void push(int val) {
            if (tos == data.length - 1) {
                System.out.println("Stack Overflow!");
                //region Dynamic Stack
                int[] ndata = new int[2 * data.length];
                for(int i = 0; i < data.length; i++){
                    ndata[i] = data [i];
                }
                data = ndata;
                tos++;
                data[tos] = val;
                //endregion
            }
            else {
                tos++;
                data[tos] = val;
            }
        }

        int pop() {
            int val = -1;
            if (tos >= 0) {
                val = data[tos];
                tos--;
            } else {
                System.out.println("Stack is Empty!");
            }
            return val;
        }

        int peek() {
            int val = -1;
            if (tos >= 0) {
                val = data[tos];
            } else {
                System.out.println("Stack Underflow!");
            }
            return val;
        }
    }

    //endregion

    //region Node
    public static class Node{
        int data;
        Node next;
    }
    //endregion

    //region Linked List
    public static class LL{
        Node head;
        Node tail;
        int size;

        public int size(){
            return size;
        }
        public void display(){
            Node temp = head;
            if(size == 0){
                System.out.println("LinkedList is Empty!");
                return;
            }
            while(temp.next != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        public void AddLast(int val){
            Node n = new Node();
            n.data = val;
            n.next = null;
            if(size == 0){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }
            size++;
        }
        public int RemoveFirst(){
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            else if(size > 1){
                int val = head.data;
                head = head.next;
                size--;
                return val;
            }
            else{
                System.out.println("LinkedList is empty.");
                return -1;
            }
        }
        public int GetFirst(){
            if(size == 0){
                System.out.println("LinkedList is empty");
                return -1;
            }
            else
            {
                return head.data;
            }
        }
        public int GetLast(){
            if(size == 0){
                System.out.println("LinkedList is empty");
                return -1;
            }
            else
            {
                return tail.data;
            }
        }
        public int GetAt(int index){
            int val = -1;
            if(size == 0){
                System.out.println("LinkedList is empty");
            }
            else if(index < 0 || index >= size){
                System.out.println("Invalid index.");
            }
            else{
                Node temp = head;
                for(int i = 0; i < index; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
            return val;
        }
        public void AddFirst(int val){
            Node nn = new Node();
            nn.data = val;
            nn.next = null;
            if(size == 0){
                head = tail = nn;
            }
            else{
                Node temp = head;
                head = nn;
                head.next = temp;
            }
            size++;
        }
        public void AddAt(int idx, int val){
            if(idx > size || idx < 0){
                System.out.println("Invalid index!");
                return;
            }
            else if(idx == 0){
                AddFirst(val);
            }
            else if(idx == size){
                AddLast(val);
            }
            else {
                Node nn = new Node();
                nn.data = val;
                nn.next = null;
                Node temp = head;
                for(int i = 1; i < idx ; i++){
                    temp = temp.next;
                }
                nn.next = temp.next;
                temp.next = nn;

                size++;
            }
        }
        public int RemoveLast(){
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            else if(size > 1){
                Node temp = head;
                for(int i = 1; i < size - 1; i++){
                    temp = temp.next;
                }
                int val = temp.next.data;
                temp.next = null;
                tail = temp;
                size--;
                return val;
            }
            else{
                System.out.println("LinkedList is Empty!");
                return -1;
            }
        }
        public int RemoveAt(int idx){
            int val = -1;
            if(size == 0){
                System.out.println("Linked List is Empty!");
            }
            else if(idx < 0 || idx >= size){
                System.out.println("Invalid index!");
            }
            else if(idx == 0 && size == 1){
                val = head.data;
                head = tail = null;
                size--;
            }
            else{
                Node temp = head;
                for(int i = 1; i < idx; i++){
                    temp = temp.next;
                }
                val = temp.next.data;
                temp.next = temp.next.next;
                size--;
            }
            return val;
        }
        private Node getNodeAt(int index){
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
        public void reverseDataIterative(){
            int li = 0;
            int ri = size - 1;
            while(li < ri){
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++; ri--;
            }
        }
        public void reversePointerIterative(){

            Node temp = head;
            Node prev = null;
            Node curr = temp;
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            tail = prev;
            while(temp != null){
                curr = temp;
                temp = temp.next;
                curr.next = prev;
                prev = curr;
            }
            head = curr;
        }
        public void reversePointerRecursive(){
            Node newHead = reverseRecursiveHelper(this.head);
            this.tail = this.head;
            this.head = newHead;
        }

        public Node reverseRecursiveHelper(Node node){
            if(node == null || node.next == null){
                return node;
            }
            Node rest = reverseRecursiveHelper(node.next);
            node.next.next = node;
            node.next = null;
            return rest;
        }
        public void kthElementFromEnd(int k){
            k = k % size;
            if(k < 0){
                k += size;
            }
           Node slow = head;
           Node fast = head;

           for(int i = 0; i < k; i++){
               fast = fast.next;
           }

           while(fast.next != null){
               slow = slow.next;
               fast = fast.next;
           }

           System.out.println("kthElementFromEnd: " + slow.data);
        }

        public Node middleOfLL(){
            if(size == 0){
                return null;
            }
//            else if( size <= 2){
//                return head;
//            }
            else{
                Node slow = head;
                Node fast = head;

                while(fast.next != null && fast.next.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;
            }
        }
        public static LL mergeSortedLLs(LL l1, LL l2){
            LL list = new LL();
            Node temp1 = l1.head;
            Node temp2 = l2.head;

            while(temp1 != null && temp2 != null){
                if(temp1.data < temp2.data){
                    list.AddLast(temp1.data);
                    temp1 = temp1.next;
                }
                else{
                    list.AddLast(temp2.data);
                    temp2 = temp2.next;
                }
            }

            while (temp1 != null) {
                list.AddLast(temp1.data);
                temp1 = temp1.next;
            }

            while (temp2 != null) {
                list.AddLast(temp2.data);
                temp2 = temp2.next;
            }
            return list;
        }
        private static Node getMiddleNode(Node head, Node tail){
            Node slow = head;
            Node fast = head;

            while(fast != tail && fast.next != tail){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public static LL mergeSort(Node head, Node tail){
            if(head == tail){
                LL res = new LL();
                res.AddLast(head.data);
                return res;
            }

            Node midNode = getMiddleNode(head, tail);
            LL list1 = mergeSort(head, midNode);
            LL list2 = mergeSort(midNode.next, tail);
            LL sortedlist = mergeSortedLLs(list1, list2);
            return sortedlist;
        }

        public void removeDuplicatesV1(){
            Node prev = head;
            Node next = head.next;
            while(next != null){
                Node current = next;
                next = next.next;
                if(current.data == prev.data){
                    prev.next = next;
                }
                else{
                    prev = current;
                }
            }
        }

        public LL removeDuplicatesV2(){
            LL result = new LL();
            Node temp = this.head;
            result.AddLast(temp.data);
            temp = temp.next;
            while(temp != null) {
                if(result.tail.data != temp.data){
                    result.AddLast(temp.data);
                }
                temp = temp.next;
            }
            return result;
        }

        public void oddEvenList() {
            if (this.size > 0) {
                LL odd = new LL();
                LL even = new LL();

                while (this.size > 0) {
                    int data = this.RemoveFirst();
                    if (data % 2 == 0) {
                        even.AddLast(data);
                    } else {
                        odd.AddLast (data);
                    }
                }

                if(odd.size > 0) {
                    odd.tail.next = even.head;
                    this.head = odd.head;
                }else{
                    this.head = even.head;
                }

                if(even.size > 0){
                    this.tail = even.tail;
                }
                else{
                    this.tail = odd.tail;
                }

                this.size = odd.size + even.size;
            }
        }

        public void kReverseLL(int k){
            LL result = new LL();
            LL br = new LL();
            int count = 0;
            int loopEnd = this.size - (k * (this.size/k));
            while(this.size > loopEnd){
                if(count == k){
                    if(result.size == 0){
                        result = br;
                    }
                    else{
                        result.tail.next = br.head;
                        result.tail = br.tail;
                        result.size += br.size;
                    }
                    br = new LL();
                    count = 0;
                }
                int data = this.RemoveFirst();
                br.AddFirst(data);
                count++;
            }
            if(br.size > 0){
                result.tail.next = br.head;
                result.tail = br.tail;
                result.size += br.size;
            }

            if(this.size > 0){
                result.tail.next = this.head;
                result.tail = this.tail;
                result.size += this.size;
            }

            this.head = result.head;
            this.tail = result.tail;
            this.size = result.size;
        }

        public void displayReverseRecursively(){
            if(this.size ==  0){
                return;
            }
            else if(this.size == 1){
                System.out.print(this.head.data + " ");
            }
            else{
                int data = this.RemoveFirst();
                this.displayReverseRecursively();
                System.out.print(data + " ");
            }
        }
        private void displayRecursiveHelper(Node node){
            if(node == null){
                return;
            }
            displayRecursiveHelper(node.next);
            System.out.print(node.data + " ");
        }
        public void displayReverseRecursivelyV2(){
            displayRecursiveHelper(this.head);
            System.out.println();
        }
    }

    //endregion

    //region LLToStackAdapter

    public static class LLtoStack{
        LinkedList<Integer> list;

        public LLtoStack(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }
        void push(int val){
            list.addFirst(val);
        }
        int pop(){
            if(list.isEmpty()){
                System.out.println("Stack underflow!");
                return -1;
            }
            return list.removeFirst();
        }
        int top(){
            if(list.isEmpty()){
                System.out.println("Stack underflow!");
                return -1;
            }
            return list.getFirst();
        }
    }

    //endregion

    //region LLToQueueAdapter

    public static class LLtoQueue{
        LinkedList<Integer> list;

        public LLtoQueue(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }
        void enqueue(int val){
            list.addLast(val);
        }
        int deque(){
            if(list.isEmpty()){
                System.out.println("Queue underflow!");
                return -1;
            }
            return list.removeFirst();
        }
        int peek(){
            if(list.isEmpty()){
                System.out.println("Queue underflow!");
                return -1;
            }
            return list.getFirst();
        }
    }

    //endregion

    //region QueueToStackAdapter

    public static class QueueToStack{
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStack(){
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size(){
            return mainQ.size();
        }

        void pushV1(int val){
            helperQ = mainQ;
            mainQ = new ArrayDeque<>();
            mainQ.add(val);

            while(!helperQ.isEmpty()){
                mainQ.add(helperQ.remove());
            }
        }

        int popV1(){
            if(size() == 0){
                System.out.println("Stack underflow!");
                return -1;
            }
            return mainQ.remove();
        }

        int topV1(){
            if(size() == 0){
                System.out.println("Stack underflow!");
                return -1;
            }
            return mainQ.peek();
        }

        void pushV2(int val){
            mainQ.add(val);
        }

        int popV2(){
            if(size() == 0){
                System.out.println("Stack underflow!");
                return -1;
            }

            while(mainQ.size() > 1){
                helperQ.add(mainQ.remove());
            }
            int value = mainQ.remove();
            mainQ = helperQ;
            helperQ = new ArrayDeque<>();
            return value;
        }

        int topV2(){
            if(size() == 0){
                System.out.println("Stack underflow!");
                return -1;
            }

            while(mainQ.size() > 1){
                helperQ.add(mainQ.remove());
            }
            int value = mainQ.remove();
            helperQ.add(value);
            mainQ = helperQ;
            helperQ = new ArrayDeque<>();
            return value;
        }
    }

    //endregion
}
