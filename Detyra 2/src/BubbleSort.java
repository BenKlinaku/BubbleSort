public class BubbleSort {
    public static void BubbleSort(int sortingArray[]){
        int length = sortingArray.length;
        int temp = 0;
        for(int i = 0; i < length; i++){
            for (int j = 0; j < length - i - 1; j++){
                if(sortingArray[j]>sortingArray[j+1]){
                    temp = sortingArray[j];
                    sortingArray[j] = sortingArray[j+1];
                    sortingArray[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array = {1,4,2,1,5,10,100,32,4,2,18,20,20,12,13,100,104,232,1,2031,54,76,1032,456,420,2};
        //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,20,25,200};
        long startTime = System.nanoTime();
        BubbleSort(array);
        long stopTime = System.nanoTime();
        for (int i = 0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(stopTime - startTime);
    }
}
