package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);

    }


    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int m=0;
        Integer[]arr=new Integer[array.length];
        for(int i= 0;i<array.length;i++){
            if(getOccurences(array[i])<maxNumberOfDuplications){
                arr[m]=array[i];
                m++;
            }


        }
        int counterNull=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                counterNull++;
            }

        }

        Integer[] arrayPostDuplication=new Integer[arr.length-counterNull];
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                arrayPostDuplication[n]=arr[i];
                n++;
            }
        }
        System.out.println(arrayPostDuplication);
        return  arrayPostDuplication;
    }


    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int k=0;
        Integer[]arr=new Integer[array.length];
        for(int j= 0;j<array.length;j++){
            if(getOccurences(array[j])!=exactNumberOfDuplications){
                arr[k]=array[j];
                k++;
            }

        }

        int counterNull=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                counterNull++;
            }

        }
        Integer[] arrayPostDuplication = new Integer[arr.length-counterNull];
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                arrayPostDuplication[m]=arr[i];
                m++;
            }
        }
        System.out.println(arrayPostDuplication);
        return  arrayPostDuplication;
    }



    public int getOccurences( int objectToCount) {
        int countOccurrence = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] == objectToCount) {
                countOccurrence++;
            }
        }

        return countOccurrence;
    }


}
