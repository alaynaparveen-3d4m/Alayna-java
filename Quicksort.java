public class Quicksort {
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high],i=low-1;
        for(int j=low;j<high;j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr={12,3,44,54,13};
        System.out.println("array before sorting");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println("sorted array");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

}

