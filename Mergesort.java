public class Mergesort {
    static void merge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] larr=new int[n1];
        int[] rarr=new int[n2];
        for(int i=0;i<n1;i++)
            larr[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            rarr[j]=arr[m+1+j];
        int i=0,j=0,k=l;
        while (i < n1 && j < n2) {
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args){
        int[] arr={12,3,44,54,13};
        System.out.println("array before sorting");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        System.out.println("sorted array");
        for(int x:arr){
            System.out.println(x+" ");
        }
    }

}
