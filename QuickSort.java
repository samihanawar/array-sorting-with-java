public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //pivot_index
    }

    public static void qs(int arr[], int low, int high){
        if(low<high){
            int pivot_index=partition(arr,low,high);
            qs(arr,low,pivot_index-1);
            qs(arr,pivot_index+1,high);
        }
    }

    public static void main(String [] args ){
        int []arr={3,36,3,4,5,15,95,5};
        int n=arr.length;
        System.out.print("\nThe given array is: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " "); }
        qs(arr,0,  n-1);
        System.out.print("\nThe sorted array is:");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
