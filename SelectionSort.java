public class SelectionSort {
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
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest= j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The sorted array is :");
        pa(arr);
    }
}
