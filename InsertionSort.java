public class InsertionSort {
    public static void pa(int arr[]){
        for(int i=0;i< (arr.length);i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[]={6,5,8,2,4,3,1};
        System.out.println("The given array is :");
        pa(arr);
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("The sorted array is :");
        pa(arr);
    }
}
