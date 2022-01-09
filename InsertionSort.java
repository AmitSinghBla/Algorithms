import java.util.*;
class ArrayLis{
    int arr[];
    public ArrayLis(){
        
    }
    public ArrayLis(int x){
        arr = new int[x];
    }
    public void insertion(){
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter "+arr.length + " elements in array ");
        for(i = 0; i < arr.length ; i++)
            arr[i] = scan.nextInt();
    }
    
    public void printArray(){
        int i;
        for(i = 0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
    }
  //insertion Sort Algorithm
    public void insertionSort(){
            int i,temp,j;
            for(i =1; i < arr.length ; i++){
                j = i;
                while(j>0 && arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    j--;
                }
            }
    }
}

class InsertionSort {
    public static void main(String[] args) {
        ArrayLis ob = new ArrayLis(4);
        ob.insertion();
        ob.insertionSort();
        ob.printArray();
      
    }
}
