import java.util.Scanner;
public class Arrayoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.accessing");
            System.out.println("2.insertion");
            System.out.println("3.deletion");
            System.out.println("4.searching");
            System.out.println("5.sorting");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    accessingArray();
                    break;
                case 2:
                    insertionArray();
                    break;
                case 3:
                    deletionArray();
                    break;
                case 4:
                    searchingArray();
                    break;
                case 5:
                    sortingArray();
                    break;
                default:
                    System.out.println("try again");
            }
        }
    }

    static void accessingArray() {

        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            System.out.println("Element at index " + i + ": " + number[i]);
        }
    }

    static void insertionArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.insertionArrayatbeginning:");
        System.out.println("2.insertionArrayatmiddle:");
        System.out.println("3.insertionArrayatend:");
        System.out.println("enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                insertionArrayAtBeginning();
                break;
            case 2:
                insertionArrayAtMiddle();
                break;
            case 3:
                insertionArrayAtEnd();
                break;
            default:
                System.out.println("try again");
        }
    }

    static void insertionArrayAtBeginning() {
        int[] arr = {1, 2, 3, 4, 5};

        int x = 6;
        int[] newArr = new int[arr.length + 1];
        newArr[0] = x;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }

    static void insertionArrayAtMiddle() {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 3, 45, 64, 54};
        int x = 99;
        System.out.print("Enter position to insert (1 to " + (arr.length + 1) + "): ");
        int pos = sc.nextInt();
        if (pos < 1 || pos > arr.length + 1) {
            System.out.println("invalid syntax");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos - 1] = x;
        for (int i = pos; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }

    static void insertionArrayAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        int value=6;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length]= value;
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }
    static void deletionArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.deletion of Array at beginning:");
        System.out.println("2.deletion of Array at middle:");
        System.out.println("3.deletion  of Array at end:");
        System.out.println("enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                deletionArrayAtBeginning();
                break;
            case 2:
                deletionArrayAtMiddle();
                break;
            case 3:
                deletionArrayAtEnd();
                break;
            default:
                System.out.println("try again");
        }
    }
    static void deletionArrayAtBeginning(){
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        int i;
        for( i=0;i<newArr.length-1;i++){
            newArr[i]=arr[i+1];
        }
        for (i = 0; i < newArr.length-1; i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }
    static void deletionArrayAtMiddle(){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length-1];
        int i;
        System.out.print("Enter position to delete (1 to " + (arr.length) + "): ");
        int pos = sc.nextInt();
        for(i=0;i<pos-1;i++){
            newArr[i]=arr[i];
        }
        for(i=pos-1;i<newArr.length;i++){
            newArr[i]=arr[i+1];
        }
        for (i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }
    static void deletionArrayAtEnd()
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length-1];
        int i;
        for(i=0;i<newArr.length;i++){
            newArr[i]=arr[i];
        }
        for (i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }
    static void searchingArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Linear search");
        System.out.println("2.Binary searsh");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                linearSearch();
                break;
            case 2:
                binarySearch();
                break;
            default:
                System.out.println("try again");
        }
    }
    static void linearSearch(){
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,5,6};
        int key=6;
        int size=sc.nextInt();
        int i;
        boolean found=false;
        for(i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("the element of " +key+ "is found at index " +i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
    static void binarySearch(){
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,5,6};
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int l = 0;
        int h = arr.length - 1;
        boolean found=false;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println("the element is at index " +mid );
                found=true;
                break;
            } else if (arr[mid]<key)
            {
                l=mid+1;
            }else {
                h=mid-1;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
    static void sortingArray(){
        int [] arr={11,45,77,34,76,98};
        int temp;
        int n=arr.length;
        int i;
        for( i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

