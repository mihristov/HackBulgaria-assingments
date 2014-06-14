import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Week0 {
    
    public static void main(String[] args) {
        double a = 1.5;
     System.out.println(Math.round(a));
        //System.out.println(canBalance(new int[] { 1, 1, 1, 2, 1 }));
    }

    public static boolean isOdd(int n){
        if (n < 0){
            n *= -1;
        }
        return n % 2 == 1;
    }

    public static boolean isPrime(int N){
        if (N <= 1){
            return false;
        }
        for (int i = 2; i*i < N; i++) {
            if (N % i == 0 && i != N){
                return false;
            }
        }
        return true;
    }
    
    public static int min(int[] array){
        int currentMin = Integer.MAX_VALUE;
        for (int item : array){
            if (item < currentMin){
                currentMin = item;
            }
        }
        return currentMin;
    }
    
    public static int kthMin(int k, int[] array){
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
    
    public static float getAverage(int[] array){
        long sum = 0;
        for (int item : array){
            sum += item;
        }
        return (float) (sum / array.length);
    }
    
    public static long doubleFac(int n){
        long result = 1;
        for (int i = 1; i <= n * 2; i++){
            result *= i;
        }
        return result;
    }

    public static long kthFac(int k, int n){
        long result = 1;
        while (k > 0){
            result *= n;
            n--;
            k--;
        }
        return result;
    }
    
    public static long getSmallestMultiple(int upperBound){
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
    
    public static long getLargestPalindrome(long N){
        
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
    
    int[] histogram(short[][] image){
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
    
    long pow(int a, int b){
        if (b == 0){
            return 1;
        }
        long result = a;
        for (int i = 0; i < b-1; i++){
            result *= a;
        }
        return result;
    }
    
    public static int getOddOccurrence(int... array){
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
    
    public static long maximalScalarSum(int[] a, int[] b){
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
    
    public static int maxSpan(int[] numbers){
        int maxSpan = 1;
        int currentSpan = 1;
        for (int i = 0; i < numbers.length; i++){
            currentSpan = 1;
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    currentSpan = j - i+ 1;
                }
                if (currentSpan > maxSpan){
                    maxSpan = currentSpan;
                }
            }
        }
        return maxSpan;
    }

    public static boolean canBalance(int[] numbers){
        long leftsum = 0;
        long rightsum = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            leftsum += numbers[i];
            rightsum = 0;
            for (int j = i + 1; j < numbers.length; j++){
                rightsum += numbers[j];
            }
            if (leftsum == rightsum){
                return true;
            }
        }
        return false;
    }
    
    int[][] rescale(int[][] original, int newWidth, int newHeight){
        int yHeight = original.length;
        int xWidth = original[0].length;
        float xIndex = (float) Math.floor(xWidth / newWidth);
        float yIndex = (float) Math.floor(yHeight / newHeight);
        for (int i = 0; i < yHeight; i++){
            for (int j = 0; j < xWidth; j++){
                
            }
        }
        return new int[][]{{1}};
    }
}
