package FTDay02Code;

import java.util.Arrays;

public class Ex06Array {

    public static void main(String[] args) {

        // instead of multiple variables

        int a = 4;
        int b = 1;
        int c = 24;

        // an array can group all the information into one object
        
        int[] nums = { 4, 1, 24 };
        int[] nums1 = { a, b, c };
        System.out.println(Arrays.toString(nums1));

        System.out.println("----------------------------------------");

        // There is multiple ways to create array objects
        // when declaring an array the size must be defined, and it cannot be changed
        // after creation

        int[] n1 = { 1, 2, 3 };             // giving the value of the elements
        int[] n2 = new int[4];              // creating a new array with a specific number of elements
        int[] n3 = new int[] { 10, 9, 8 };  // another syntax often seen without the reference. used to quickly define an array type
        System.out.println(Arrays.toString(n1) + " " + Arrays.toString(n2) + " " + Arrays.toString(n3));

        // arrays can hold both primitive types and object types
        String[] words = new String[3]; // this String array has space to hold three String elements
        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------");

        // Arrays have a default value for the elements when defined
        System.out.println(Arrays.toString(new int[4]));
        System.out.println(Arrays.toString(new String[4]));
        System.out.println(Arrays.toString(new double[4]));
        System.out.println(Arrays.toString(new boolean[4]));

        System.out.println("----------------------------------------");

        // Reminder: the square brackets can be defined in different places, but
        // preferred is after the datatype and before the reference name

        int[] z = new int[1]; // preferred
        int y[] = new int[1]; // valid array, but not preferred
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.toString(y));

        System.out.println("----------------------------------------");

        // array objects are mutable. only the size is fixed
        int[] num2 = { 4, 21, 5 };
        nums[2] = 100;
        nums[1] = -51;
        System.out.println(Arrays.toString(num2));
        System.out.println(nums[0]);

    }
}
