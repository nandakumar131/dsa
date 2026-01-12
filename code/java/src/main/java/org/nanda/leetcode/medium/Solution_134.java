package org.nanda.leetcode.medium;

public class Solution_134 {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    for (int i = 0; i < gas.length; i++) {
      if(isPossible(i, gas, cost)) {
        return i;
      }
    }
    return -1;
  }

  public boolean isPossible(int start, int[] gas, int[] cost) {
    int fuelAvailable = gas[start];
    int fuelRequired = cost[start];
    int index = start == gas.length - 1 ? 0 : start + 1;

    while (fuelAvailable >= fuelRequired) {

      if (index == start) {
        return true;
      }
      fuelAvailable = fuelAvailable + gas[index];
      fuelRequired = fuelRequired + cost[index];
      index = index == gas.length - 1 ? 0 : index + 1;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] gas = new int[]{1,2,3,4,5};
    int[] cost = new int[]{3,4,5,1,2};
    System.out.println(new Solution_134().canCompleteCircuit(gas, cost));
  }

}
