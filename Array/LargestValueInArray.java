import java.util.Arrays;

public class LargestValueInArray {
    public static int largestValue(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Largest value in array is : "+largestValue(arr));
        System.out.println(Arrays.binarySearch(arr, 9));
        
    }
    
}
