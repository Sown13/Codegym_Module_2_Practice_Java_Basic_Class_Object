import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        long[] arr = initArray();
//        long[] testArr = {3,2,1,5,6,135,16,7,1234,56,8,6};
//        long[] newArr = sort(arr);
//        System.out.println(Arrays.toString(newArr));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime() + " milliseconds");
    }
    public static long[] initArray(){
        long[] arr = new long[100000];
        for (int i = 0; i < 100000; i++){
            arr[i] = Math.round(Math.random()*1000);
        }
        return arr;
    }
    public static long[] sort(long[] arr){
        for(int i =0; i < arr.length; i++){
            long min = arr[i];
            int tempIndex = i;
            for (int j = i+1; j < arr.length ; j++){
                if (min > arr[j]){
                    min = arr[j];
                    tempIndex = j;
                }
            }
            arr[tempIndex] = arr [i];
            arr[i] = min;
        }
        return arr;
    }
}
