package org.nanda.algorithm;

public class BinarySearch {

  public int execute(int[] list, int target) {
    return -1;
  }

  public int search(int[] list, int start, int end, int target) {
    int length = end - start;
    int middle = start + (length / 2);
    if(list[middle] == target) {
      return middle;
    }
    
    if(list[middle] > target) {
      return search(list, middle, end, target);
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] list = new int[] {1, 3, 5, 7, 8, 9, 10, 15};

    BinarySearch search = new BinarySearch();
    int result = search.execute(list, 9);

    if (result == -1) {
      System.out.println("Result not found");
    } else {
      System.out.println("Found at index " + result);
    }
  }
}
