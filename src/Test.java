import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long[] testArr = {3,2,1,5,6,135,16,7,1234,56,8,6};
        long[] newArr = sort(testArr);
        System.out.println(Arrays.toString(newArr));
    }
    public static long[] sort(long[] arr){
        for(int i =0; i < arr.length; i++){
            long min = arr[i];
            int tempIndex = i;
            System.out.println("min " + min + " " );
            System.out.println("i  = " + i);
            for (int j = i + 1; j < arr.length; j++){
                System.out.println("length = "+ (arr.length - i));
                System.out.println("arr"+ "[" + j + "] = " + arr[j]);
                if (min > arr[j]){
                    min = arr[j];
                    tempIndex = j;
//                    System.out.println("change" + min + " " + arr[tempIndex]);
                }
            }
            arr[tempIndex] = arr [i];
            arr[i] = min;
//            System.out.println("result " + min + " " + arr[tempIndex]);
        }
        return arr;
    }
}
