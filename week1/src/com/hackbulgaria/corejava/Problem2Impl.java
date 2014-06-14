package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problem2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        if (number < 0){
            number *= -1;
        }
        return number % 2 == 1;
    }

    @Override
    public boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        for (int i = 2; i*i < number; i++) {
            if (number % i == 0 && i != number){
                return false;
            }
        }
        return true;
    }

    @Override
    public int min(int... array) {
        int currentMin = Integer.MAX_VALUE;
        for (int item : array){
            if (item < currentMin){
                currentMin = item;
            }
        }
        return currentMin;
    }

    @Override
    public int kthMin(int k, int[] array) {
        for (int i = 0; i < k; i++){
            int minIndex = i;
            int minValue = array[i];
            for (int j = i+1; j < array.length; j++){
                if (array[j] < minValue){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array[k-1];
    }

    @Override
    public float getAverage(int[] array) {
        float sum = 0;
        for (int item : array){
            sum += item;
        }
        return (sum / array.length);
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        long result = 1;
        for (int i = 2; i <= upperBound; i++)
        {
            int hcf = 1;
            for (int j = 2; j <= i; j++)
            {
                if (i % j == 0 && result % j == 0)
                {
                    hcf = j;
                }
            }
            result = (result * i) / hcf;
        }
        return result;
    }

    @Override
    public long getLargestPalindrome(long N) {
        while(true){
            long currentN = N;
            long currentNumber = currentN;
            long reverse = 0;
            while(currentN != 0){
                long remainder = currentN % 10;
                reverse = reverse * 10 + remainder;
                currentN /= 10;
            }
            if (reverse == currentNumber){
                return reverse;
            }
            N--;
        }
    }

    @Override
    public int[] histogram(short[][] image) {
        int[] result = new int[256];
        int rowLen = image.length;
        int colLen = image[0].length;
        for (int i = 0; i < rowLen; i++){
            for (int j = 0; j < colLen; j++){
                result[image[i][j]]++;
            }
        }
        return result;
    }

    @Override
    public long doubleFac(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long kthFac(int k, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        int result = 0;
        Arrays.sort(array);
        int minNumber = array[0];
        int maxNumber = array[array.length - 1];
        int[] numCount = new int[maxNumber - minNumber + 1];
        for (int i = 0; i < array.length; i++){
            numCount[array[i] - minNumber]++;
        }
        for (int i = 0; i < numCount.length; i++){
            if (numCount[i] % 2 != 0){
                result = i + minNumber;
            }
        }
        return result;
    }

    @Override
    public long pow(int a, int b) {
        if (b == 0){
            return 1;
        }
        long result = a;
        for (int i = 0; i < b-1; i++){
            result *= a;
        }
        return result;
    }
    

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        long result = 0;
        for (int i = a.length - 1; i >= 0; i--){
            for (int j = b.length - 1; j >= 0; j--){
                if (i == j){
                    result += a[i] * b[j];
                }
            }
        }
        return result;
    }

    @Override
    public int maxSpan(int[] array) {
        int maxSpan = 1;
        int currentSpan = 1;
        for (int i = 0; i < array.length; i++){
            currentSpan = 1;
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    currentSpan = j - i+ 1;
                }
                if (currentSpan > maxSpan){
                    maxSpan = currentSpan;
                }
            }
        }
        return maxSpan;
    }

    @Override
    public boolean canBalance(int[] array) {
        long leftsum = 0;
        long rightsum = 0;
        for (int i = 0; i < array.length - 1; i++){
            leftsum += array[i];
            rightsum = 0;
            for (int j = i + 1; j < array.length; j++){
                rightsum += array[j];
            }
            if (leftsum == rightsum){
                return true;
            }
        }
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
