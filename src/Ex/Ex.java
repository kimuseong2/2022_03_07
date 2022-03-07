package Ex;

import Service.StudentService;
import Service.StudentServiceImpi;

import static Common.Common.nextInt;

public class Ex {
    public static void main(String[] args) {
        StudentService ss = new StudentServiceImpi();
        while (true) {
            try {
                execute(ss);
            } catch (NumberFormatException e) {
                System.out.println("정확한 숫자를 입력하세요.");
                return;
            }

        }

    }

    static void execute(StudentService ss) {

        int input = nextInt("1.입력 2. 조회 3. 삭제");
        switch (input) {
            case 1 : ss.add();
                break;
            case 2 : ss.list();
                break;
            case 3: ss.delete();
                break;
        }


    }
}
