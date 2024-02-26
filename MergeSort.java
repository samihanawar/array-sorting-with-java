import java.util.Scanner;

public class MergeSort {
    public static void conquer (int arr[],int sti, int mid, int endi){
        int merged[]=new int[endi-sti+1];
        int in1=sti;  //as new array ;
        int in2=mid+1;
        int x=0;
        while(in1<=mid && in2<=endi){
            if(arr[in1]<=arr[in2]){
                merged[x++]=arr[in1++];
            }   else { merged[x++]=arr[in2++]; }
        }
        while(in1<=mid){
            merged[x++]=arr[in1++];
        }
        while(in2<=endi){
            merged[x++]=arr[in2++];
        }
        for(int i=0, j=sti;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[],int sti,int endi){
        if(sti>=endi) { return; }
        int mid=(sti+endi)/2;
        divide(arr,sti,mid);
        divide(arr,mid+1,endi);
        conquer(arr,sti,mid,endi);

    }

    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=0;
        if(in.hasNext()) { n=in.nextInt(); }
        /* if we dont use if statement---System.out.println("Enter the size:"); dont initialise n=0; n=in.nextInt();  */
        int []arr= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)  { if(in.hasNext()) {arr[i]=in.nextInt(); }}
        System.out.println("The given array is: ");
        for(int i=0;i<n;i++)  { System.out.print(arr[i]+" "); }
        System.out.println(" ");

        divide(arr,0,n-1);

        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)  { System.out.print(arr[i]+" "); }
        System.out.println(" ");

}
}
