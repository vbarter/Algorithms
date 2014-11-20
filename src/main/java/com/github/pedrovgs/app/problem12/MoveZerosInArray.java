/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.app.problem12;

/**
 * Given an array full of integers, can you write a method to move every zero to the right side of
 * the array? The result order of non zero element is not important. Take into account you can find
 * negative numbers inside the array. For example:
 *
 * Input: [1,2,0,4,3] Output: [1,2,3,4,0]
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class MoveZerosInArray {

  /**
   * Algorithm implementation based on a sorting algorithm named "Bubble Sorting" modified to work
   * with this problem requirements. Using this sorting algorithm we get a complexity order in time
   * terms equals to O(N) where N is the number of elements in the array. In space terms, the
   * complexity order of this algorithm is O(1).
   */
  public void moveSorting(int[] array) {
    if (array == null) {
      throw new IllegalArgumentException("You can't pass a null array as argument.");
    }

    boolean swap = true;
    while (swap) {
      swap = false;
      for (int i = 0; i < array.length - 1; i++) {
        if ((array[i] < array[i + 1] && array[i + 1] > 0) || (array[i] == 0 && array[i + 1] != 0)) {
          swap(array, i, i + 1);
          swap = true;
        }
      }
    }
  }

  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}
