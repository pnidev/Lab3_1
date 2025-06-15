package com.example;

public class TextHandler {
    public String formatText(String input) {
        if (input == null) {
            return "None"; // Code smell: nên ném ngoại lệ?
        }
        return input.trim().toLowerCase();
    }

    public int countLetters(String text) {
        if (text == null) {
            return -1; // Thiếu thông báo lỗi
        }
        return text.replaceAll("[^a-zA-Z]", "").length(); // Có thể bỏ sót ký tự đặc biệt
    }
}