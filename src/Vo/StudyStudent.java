package Vo;

public class StudyStudent extends Student {
    {
        int[] tmp = new int[5];
        System.arraycopy(getScore(), 0 , tmp, 0 , getScore().length);
        setScore(tmp);
    }

    public StudyStudent(int num, String name) {
        super(num, name);
    }

    public StudyStudent(int num, String name, int[] score) {
        super(num, name, score);
    }

    public StudyStudent(int num, String name, int kor, int mat, int eng) {
        super(num, name, kor, mat, eng);
    }

    public StudyStudent() {
    }
}