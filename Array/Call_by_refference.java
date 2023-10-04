import java.util.Arrays;
import java.util.*;

public class Call_by_refference {
    public static void change(int marks[]){

        //changing marks by 10
        for(int i=0;i<marks.length;i++)
            marks[i]+=10;
    }
    public static void main(String[] args) {
        int marks[]={45,96,53,85,96,71,68,50};
        System.out.println("Original Array: ");
        for(int i=0;i<marks.length;i++)
            System.out.print(marks[i]+" ");
        change(marks);
        System.out.println();
        System.out.println("Updated Array: ");
        for(int i=0;i<marks.length;i++)
            System.out.print(marks[i]+" "); 
        System.out.println();
        int s=Arrays.binarySearch(marks, 1, 4, 85);
        System.out.println(s);
    } 
    
}
