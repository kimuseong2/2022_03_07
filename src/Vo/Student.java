package Vo;

import java.util.Arrays;

public class Student {

    private int no;

    private  String name;

    private int[] score = new int[3];

    public Student(int no, String name, int[] score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(int no, String name , int kor, int mat, int eng) {
        this.no = no;
        this.name = name;
        score[0] = kor;
        score[1] = mat;
        score[2] = eng;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public Student() {
    }

    public int getTotal() {
        int total = 0;
        for (int i : score) {
            total += i;

        }
        return total;
    }

    public double getAvg() {
        return (int)(getTotal() * 100 / score.length) / 100d;
    }

    @Override
    public String toString() {
        String str =  String.format("%4d  %8s  %4d  %.2f",
                no, name, getTotal(), getAvg());
        for(int s : score) {
            str += String.format("  %4d", s);
        }
        return str;
    }
}
