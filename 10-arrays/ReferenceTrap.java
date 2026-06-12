//Trap: setting array variables  equal to each other
//Pitfall: both variables points to the same arra
//Solution: create a new array and copy elements of array
import java.util.Arrays;

public class ReferenceTrap {

    public static void main(String []args){
        int [] arr={1,2,3}; //memory stores a reference of [1,2,3]
        int [] brr=arr; //brr will also point to [1,2,3]
        brr[1]=5; //This will update the array [1,5,3] //reference trap

        System.out.println(Arrays.toString(arr)); //[1,5,3]
        System.out.println(Arrays.toString(brr)); //[1,5,3]

        int [] crr={1,2,3};
        int [] drr=new int[3];
        for(int i=0;i<crr.length;i++){
            drr[i]=crr[i];
        }
        drr[1]=5;
        System.out.println(Arrays.toString(crr)); //[1,2,3]
        System.out.println(Arrays.toString(drr)); //[1,5,3]

        int [] err={1,2,3};
        int [] frr=Arrays.copyOf(err,err.length); //copy one array to another //better option than loop

        frr[1]=5;
        System.out.println(Arrays.toString(err)); //[1,2,3]
        System.out.println(Arrays.toString(frr)); //[1,5,3]
    }
    
}
