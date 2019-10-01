import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ex1{
    public static void main(String []args){
        ArrayList<String>colors=new ArrayList<String>(6);
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
        System.out.println("\n");
        System.out.println(colors+"\n");

        for(String element :colors){
            System.out.println(element+"\n"); //print element by element
        }

        colors.add(0,"Pink"); //add to the front of array

        System.out.println(colors+"\n");

        System.out.println(colors.get(3)); //get from specific index

        colors.set(3,"Purple"); //replace index 3 w purple
        System.out.println(colors+"\n");

        colors.remove(2); //removes 3rd element (Red)
        System.out.println(colors+"\n");

       String search="Red";
        if( colors.contains(search)){ //checks if is present 
            System.out.println("Yes "+search+" white is present!");
        }else System.out.println("Nope, "+search+" not here cheif!\n");

        Collections.sort(colors); //sort accending order
        System.out.println(colors+"\n");

        List<String>colorsCopy=new ArrayList(colors); //copy arr1 to arr2
        System.out.println("This is the copy of colors array: \n");
        System.out.println(colorsCopy+"\n");

        Collections.shuffle(colors); //shuffled array
        System.out.println("\nShuffle:");
        System.out.println(colors+"\n");

        Collections.reverse(colorsCopy);
        System.out.println("\nReverse:");
        System.out.println(colorsCopy+"\n");

        List<String>colors2=new ArrayList(colors); //copy arr1 to arr2

        Collections.copy(colors2,colors);


        List<String>sublist=colors2.subList(0,3);
        System.out.println("\nSublist:");
        System.out.println(sublist+"\n");

        colors.add("Lime Green");

        ArrayList<String>colors3=new ArrayList<String>();//create new list to store yes n no
        for(String e: colors){
            colors3.add(colors2.contains(e)?"Yes":"No"); //store yes if c2 contains elements from c1
        }

        System.out.println(colors3);

        colors.addAll(colors2); //join 2 array tgt
        System.out.println("\nColor 1 array + Color 2 array");
        System.out.println(colors+"\n");

        colors3.clear();
        System.out.println("\nEmptied array");
        System.out.println(colors3);

        if(colors3.isEmpty()){
            System.out.println("Array is empty");
        }else System.out.println("Array is not empty");

       colors.ensureCapacity(10);
       System.out.println(colors);


    }
}