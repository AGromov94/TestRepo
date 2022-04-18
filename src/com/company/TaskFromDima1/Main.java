package com.company.TaskFromDima1;

public class Main {

    public static void main(String[] args) {

        int[] A = {4, 5, 7, 10};
        int[] B = {5, 8, 10, 11};
        int[] C = {7, 9, 12, 15};

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < B.length - 1; j++) {
                for (int k = 0; k < C.length - 1; k++) {
                    if (A[i] + B[j] == C[k]) {
                        System.out.println(A[i] + " and " + B[j]);
                    }
                }
            }
        }
    }
}
