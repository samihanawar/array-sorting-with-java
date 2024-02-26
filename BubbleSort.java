import java.util.Scanner;
public class BubbleSort {
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
        int temp;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if( arr[j]>arr[j+1] ) {
                    temp=arr[j] ;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;       }  } }
        System.out.println("the sorted array is :");
        for(int i=0;i<n;i++)  { System.out.print(arr[i]+" "); }
        System.out.println(" ");

    }
}

