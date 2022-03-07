package Service;

import Vo.Student;
import Vo.StudyStudent;

import java.util.ArrayList;
import java.util.List;

import static Common.Common.nextInt;
import static Common.Common.nextLine;

public class StudentServiceImpi implements StudentService{

    List<Student> students = new ArrayList<>();
    {
        students.add(new StudyStudent(1,"1길동",90,80,70));
        students.add(new StudyStudent(2,"2길동",80,60,60));
        students.add(new StudyStudent(3,"3길동",70,100,50));
    }
    @Override
    public void add() {
        int insert = nextInt("정보를 기입하시겠습니니까? 예 : 1  / 아니오 : 2");
        int no = nextInt("학번을 입력해주세요.");



        switch (insert) {
            case 1:
                students.add(new StudyStudent(
                        no,
                        nextLine("이름을 입력해주세요"),
                        nextInt("국어점수를 입력해주세요."),
                        nextInt("수학점수를 입력해주세요."),
                        nextInt("영어점수를 입력해주세요.")
                ));
                break;
            case 2 :
                add();
                break;


        }

    }

    @Override
    public void list() {
        printArray();
    }

    @Override
    public void delete() {
        printArray();
        int remove = nextInt("학번을 적어주세요.");
        if (students.indexOf(remove) == 0) {
            System.out.println("잘못된 번호입니다.");
            return;
        } else {
            students.remove(remove - 1);
        }


    }


    public void printTitle() {
        System.out.println("=============================================================");
        System.out.println("학번      이름    총점  평균  국어  영어  수학  과목1  과목2");
        System.out.println("=============================================================");
    }

    public void printArray() {
        printTitle();
        for (int i = 0 ; i < students.size() ; i++) {
            System.out.println(students.get(i));
        }
    }
}
