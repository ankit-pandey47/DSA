public // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class AllSorting {
    public static void selectionSort(int arr[]){
         for(int i=0 ; i<arr.length ; i++){
            int min_idx = i;
            
            for(int j=i+1 ; j<arr.length;j++){
                if(arr[j]<arr[min_idx])
                    min_idx = j;
                
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }
    
    
    public static void bubbleSort(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[i]){
                    int  temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int partition(int arr[] , int start , int end){
        int pivot = arr[end];
        int j = start;
        int i = start-1;
        
        while(j<end){
            if(arr[j]<pivot){
                i++;
                swap(arr , i  , j);
            }
            j++;
        }
        swap(arr , i+1 , end);
        return i+1;
    }
    
    public static void quickSort(int arr[] , int start , int end){
        if(start>end) return;
        
        int pi = partition(arr , start , end);
        quickSort(arr,  start , pi-1);
        quickSort(arr , pi+1 , end);
    }
    
    public static void main(String[] args) {
        System.out.println("Selection Sorting");
        
        int arr[] = {2,6,3,8,4,3};
        
        //selectionSort(arr);
        
        //bubbleSort(arr);
        
        quickSort(arr, 0 , arr.length-1);
       
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}{

}
