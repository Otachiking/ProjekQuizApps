package com.sample.multiplechoicequiz;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Apa itu CPU?",
            "2. Berikut adalah penyebab komputer over heat, kecuali?",
            "3. Lampu indikator Harddisk ditujukan dari kabel berwarna?",
            "4. Tipe data apa yang digunakan untuk alamat email?",
            "5. Apa nama fungsi untuk menghasikan nilai sisa pembagian?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Tempat menyimpan data", "Kotak besar yang berisi hardware", "Sebagai pusat pemprosesan data", "Perangkat untuk memasukkan input"},
            {"Debu yang mengumpul", "Panas berlebih", "Produk tidak RGB", "Lubang pembuangan terhambat"},
            {"Hitam-Hitam", "Merah-Putih", "Merah-Hitam", "Hitam-Putih"},
            {"String", "Integer", "Boolean", "Real"},
            {"DIVIDE", "SUM", "IF", "MOD"}
    };

    private String mCorrectAnswers[] = {"Sebagai pusat pemprosesan data", "Produk tidak RGB", "Merah-Putih", "String", "MOD"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}