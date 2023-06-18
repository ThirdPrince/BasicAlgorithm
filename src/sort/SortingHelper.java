package sort;

/**
 * @author dhl
 */
public class SortingHelper {

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static<E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1])>0) {
                return false;
            }
        }
        return true;
    }


  public static <E extends Comparable<E>> void sortTest(String sortName,E[] arr){
        long startTime = System.nanoTime();
        if(sortName.equals("SelectionSort")){
            SelectionSort.sort(arr);
        }else if(sortName.equals("InsertionSort")){
            InsertionSort.sortAdvance(arr);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if(!isSorted(arr)){
            throw new RuntimeException("sortTime failed");
        }
      System.out.println(String.format("%s,n= %d:%f s",sortName,arr.length,time));

  }

}
