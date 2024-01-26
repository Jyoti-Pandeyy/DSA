public class Sorting {
    public static void PrintArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    public static void bubbleSort(int[] arr, int n){

        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.print("Bubble Sort result: " );
        PrintArray(arr);
        System.out.println();
    }

    public static void selectionSort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int t = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = t;
        }
        System.out.print("Selection Sort result: " );
        PrintArray(arr);
        System.out.println();
    }

    public static void insertionSort(int[] arr, int n){
        for(int i = 1; i < n ; i++){
            int k = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
        System.out.print("Insertion Sort result: " );
        PrintArray(arr);
        System.out.println();
    }

    public static void quickSort(int[] arr, int l, int h){
        if(l < h){
            int pi = partition(arr, l, h);

            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, h);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int pi = l;
        int pivot = arr[h];

        for(int i = l; i < h; i++){
            if(arr[i] < pivot){
                swap(arr, i, pi);
                pi++;
            }
        }
        swap(arr, pi, h);
        return pi;
    }

    public static void mergeSort(int[] arr, int l, int h){
        if(l < h){
            int m = (l + h - 1)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, h);

            merge(arr, l, m , h);
        }
    }

    public static void merge(int[] arr, int l, int m, int h){
        int n1 = m - l + 1;
        int n2 = h - m;

        int[] t1 = new int[n1];
        int[] t2 = new int[n2];

        for(int i = 0; i < n1; i++){
            t1[i] = arr[l+i];
        }

        for(int i = 0; i < n2; i++){
            t2[i] = arr[m+1+i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(t1[i] <= t2[j]){
                arr[k] = t1[i];
                i++;
            }
            else{
                arr[k] = t2[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = t1[i];
            i++; k++;
        }
        while(j < n2){
            arr[k] = t2[j];
            j++; k++;
        }
    }

    public static void minHeapSort(int[] arr, int n){
        for(int i = n/2-1; i >= 0; i--){
            minHeapify(arr, n, i);
        }

        for(int i = n-1 ; i >= 0; i--){
            swap(arr, 0, i);
            minHeapify(arr, i, 0);
        }

        System.out.print("Heap Sort(min heap) result in decreasing order: " );
        PrintArray(arr);
        System.out.println();
    }

    public static void minHeapify(int[] arr, int n, int i){
        if(i < n/2 && i >= 0){
            int swapPos = i;
            int l = 2*i + 1;
            int r = 2*i + 2;
            if(l < n && arr[l] < arr[swapPos]){
                swapPos = l;
            }
            if(r < n && arr[r] < arr[swapPos]){
                swapPos = r;
            }
            if(swapPos != i){
                swap(arr, i, swapPos);
                minHeapify(arr, n, swapPos);
            }
        }
    }

    public static void maxHeapSort(int[] arr, int n){
        for(int i = n/2 -1; i >= 0; i--){
            maxHeapify(arr, n , i);
        }

        for(int i = n-1; i > 0; i--){
            swap(arr, 0, i);
            maxHeapify(arr, i, 0);
        }

        System.out.print("Heap Sort(max heap) result in increasing order: " );
        PrintArray(arr);
        System.out.println();
    }

    public static void maxHeapify(int[] arr, int n, int i){
        if(i < n/2 && i >= 0){
            int l = 2*i + 1;
            int r = 2*i + 2;
            int swapPos = i;
            if(l < n && arr[l] > arr[swapPos]){
                swapPos = l;
            }
            if( r < n && arr[r] > arr[swapPos]){
                swapPos = r;
            }
            if(swapPos != i){
                swap(arr, i, swapPos);
                maxHeapify(arr, n, swapPos);
            }
        }
    }
    private static void swap(int[] arr, int i , int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
