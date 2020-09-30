import java.util.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {9, 3,6};
        System.out.println(" integer array ");
//   for each loop
    for (int x : intArray){
        System.out.println(x);
    }
        int[] intArrayy = {9, 3,6};
        System.out.println(" integer array sorted ");
      Arrays.sort(intArrayy);
    for (int x : intArrayy){
                System.out.println(x);
      }


    String[] stringArray = {"green", "red", "blue"};
    System.out.println(" string array ");

//      for loop
    for (int i=0; i<stringArray.length; i++){
            System.out.println(stringArray[i]);
        }



    // access array item at specific index
    System.out.println(stringArray[2]);

    System.out.println(" string array element first element is: "+ stringArray[0]);


    // copy array element in new arr
    System.out.println("copy an array element to new array");
    int[] originalArray = {1,2,3,4,5};
    int[] copyArray = new int[3];
//        System.arraycopy(originalArray, startPositionOriginalArray, copyArray, startPositionOriginalArray, numberOfElementToCopy); /
    System.arraycopy(originalArray, 2, copyArray, 0, 3);
    for (int x :copyArray){
        System.out.println(x);
    }


    }
}
