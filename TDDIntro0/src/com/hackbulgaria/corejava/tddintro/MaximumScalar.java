package com.hackbulgaria.corejava.tddintro;

import java.util.Arrays;

public class MaximumScalar{
        public long maxScalarProduct(int[] a, int[] b){
            Arrays.sort(a);
            Arrays.sort(b);
            
            long result = 0;
            for (int i = a.length - 1; i >= 0; i--){
                result += a[i] * b[i];
            }
            return result;
        }
}
