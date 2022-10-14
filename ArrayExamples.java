public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    // Bugged code:
    // for (int i = 0; i < arr.length; i += 1) {
    //   arr[i] = arr[arr.length - i - 1];
    // }
    for (int i = 0; i < (arr.length) / 2; i++) {
      int temp = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = arr[i];
      arr[i] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    // Bugged code:
    // int[] newArray = new int[arr.length];
    // for (int i = 0; i < arr.length; i += 1) {
    //   arr[i] = newArray[arr.length - i - 1];
    // }
    // return arr;
    int[] newArray = new int[arr.length];
    for (int i = 0; i < arr.length; i += 1) {
      newArray[arr.length - i - 1] = arr[i];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    // Bugged code:
    // if (arr.length < 2) {
    //  return 0.0;
    // }
    // double lowest = arr[0];
    // for (double num : arr) {
    //  if (num < lowest) {
    //    lowest = num;
    //  }
    // }
    // double sum = 0;
    // for (double num : arr) {
    //  if (num != lowest) {
    //    sum += num;
    //  }
    // }
    // return sum / (arr.length - 1);
    if (arr.length < 2) {
      return 0.0;
    }
    double lowest = arr[0];
    for (double num : arr) {
      if (num < lowest) {
        lowest = num;
      }
    }
    int lowestcount = 0;
    for (double num : arr) {
      if (num == lowest) {
        lowestcount += 1;
      }
    }
    double sum = 0;
    for (double num : arr) {
      if (num != lowest) {
        sum += num;
      }
    }
    return sum / (arr.length - lowestcount);
  }
}
