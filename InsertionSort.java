import java.util.*;
class ArrayLis{
    int A[];
    public ArrayLis(){
        
    }
    public ArrayLis(int x){
        A = new int[x];
    }
    public void insertion(){
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter "+A.length + " elements in array ");
        for(i = 0; i < A.length ; i++)
            A[i] = scan.nextInt();
    }
    
    public void printArray(){
        int i;
        for(i = 0; i < A.length ; i++)
            System.out.print(A[i] + " ");
    }
    //Insertion Sort
    public void insertionSort(){
            int i,temp,j;
            for(i =1; i < A.length ; i++){
                j = i;
                while(j>0 && A[j-1] > A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1]= temp;
                    j--;
                }
            }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayLis ob = new ArrayLis(4);
        ob.insertion();
        ob.insertionSort();
        ob.printArray();
      
    }
}
