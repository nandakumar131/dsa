package org.nanda.algorithm;

public class LinearSearch {

  public int execute(int[] list, int target) {
    for (int i = 0; i < list.length; i++) {
      if(list[i] == target) {
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    int[] list = new int[] {1, 3, 5, 7, 8, 9, 10, 15};
    LinearSearch search = new LinearSearch();

    int result = search.execute(list, 10);
    if (result == -1) {
      System.out.println("Item not found!");
    } else {
       System.out.println("Item found at index " + search.execute(list, 10));
    }
    
  }


}
