import java.util.Arrays; //Array utility class

class IntroToArrays{
    
    public static void main(String[]args){
        int [] arr={1,2,3}; //intialization of literal array

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //System.out.println(arr[3]); //index out of bounds exception
        System.out.println(arr); //print reference that points to array

        int n=arr.length; //length method is used to  get size of the array

        for(int i=0;i<n;i++){ 
            System.out.println(arr[i]);
        }

        for(int i:arr){ //for-each loop 
            System.out.println(i); //represents arr[i]
        }

        String [] brr={"Iced Coffee","espresso","Macchiato"};
        String str=Arrays.toString((brr)); //convert array into string
        System.out.println(str);

        String [] crr= new String[5]; //declaration of array
        for(int i=0;i<brr.length;i++){
            crr[i]=brr[i];
        }
        System.out.println(Arrays.toString(crr));

        int [] drr=new drr[] {1,2,3}; //anonymous array creation //can be reassigned later //more flexible
        // int [] drr;
        // drr=new drr[] {1,2,3}; //Assignment of array
        //arrays are mutable objects
    }
}
