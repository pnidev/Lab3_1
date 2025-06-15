package com.example;

public class MathUtility {
    public long calculateProduct(int a, int b) {
        return (long) a * b; // Có thể tràn số với giá trị lớn
    }

    public int divideValues(int numerator, int denominator) {
        return numerator / denominator; // Thiếu kiểm tra chia cho 0
    }
}