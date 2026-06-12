package oops.immutableObjects;

public class ImmutableObjects {
    public static void main(String[] args) {
        //very primtive type has a immutable object

        int apples=5; //primitive data type
        Integer applesWrapper=5; //immutable object of class Integer 
        //stores reference //can be null
        
        System.out.println(apples);
        System.out.println(applesWrapper);
        System.out.println();
        
        String str=applesWrapper.toString(); //method can be called using immutable obejcts
        System.out.println(str);
        System.out.println();

        long stars=1000_000_000_000L;
        Long starsWrapper=1000_000_000_000L;

        System.out.println(stars);
        System.out.println(starsWrapper);
        System.out.println();

        Integer applesWrapper2=applesWrapper; //safe in case of immutable object //cannot be modified
        //shares the same refernce as applesWrapper

        applesWrapper2=10; //stores a unique reference 

        System.out.println(applesWrapper);
        System.out.println(applesWrapper2);
        System.out.println();

        String text="hi"; //Immutable object as String is a class
        System.out.println(text);
        
    }
}
