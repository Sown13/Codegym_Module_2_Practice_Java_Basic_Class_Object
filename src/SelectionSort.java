public class SelectionSort {
    public static void main(String[] args) {
        long[] arr = initArray();
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
    public static void sort(long[] arr){
        long[] newArr = new long[arr.length];
        for(int i =0; i < arr.length; i++){
            long min = arr[i];
            for (int j = 0; j < arr.length - 1; j++){
                if (min > arr[j]){
                    min = arr[j];
                }
            }
            newArr[i] = min;
        }
    }
}
