package org.nanda.leetcode.hard;

import java.util.*;

public class Solution_2081 {


  public static class MirrorNumber {

    int length = 1;
    int halfStart = 0;
    int halfMax = 9;
    int halfCurrent = 0;

    public long next() {

      if (length == 1) {
        return getNextSingleDigit();
      }

      final String halfCurrentString = Integer.toString(halfCurrent);
      StringBuilder builder = new StringBuilder(halfCurrentString);
      if (length % 2 == 0) {
        builder.append(new StringBuilder(halfCurrentString).reverse());
      } else {
        builder.append(new StringBuilder(builder.substring(
          0, halfCurrentString.length() - 1)).reverse());
      }

      halfCurrent++;
      if (halfCurrent == halfMax) {
        increaseLength();
      }

      return Long.parseLong(builder.toString());
    }

    private void increaseLength() {
      length++;
      halfStart = (int) Math.pow(10, ((length - 1) / 2));
      halfMax = (int) Math.pow(10, ((length + 1) / 2));
      halfCurrent = halfStart;
    }

    private long getNextSingleDigit() {
      halfCurrent++;
      long value = (long) halfCurrent;
      if (halfCurrent == 9) {
        length++;
        halfStart=1;
        halfMax=10;
        halfCurrent= halfStart;
      }
      return value;
    }
  }

  public static boolean isKmirror(String number) {
    char[] value = number.toCharArray();
    int length = value.length;
    int halfLength = length / 2;
    for (int i = 0, j = length - 1; i < halfLength; i++, j--) {
      if (value[i] != value[j]) {
        return false;
      }
    }
    return true;
  }

   public long kMirror(int k, int n) {
        MirrorNumber number = new MirrorNumber();
        long sum = 0;
        int i = 0;
        while (i < n) {
            long value = number.next();
            String baseK = Long.toString(value, k);
            if (isKmirror(baseK)) {
                i++;
                sum += value;
            }
        }
        return sum;
    }

  public static void main(String[] args) {
    System.out.println(new Solution_2081().kMirror(5, 25));
  }
}
