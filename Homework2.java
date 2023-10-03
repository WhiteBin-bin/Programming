import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] arr = new Student[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            arr[i].getInformation();
            arr[i].setPhoneNumber();
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생:" + " " + arr[0].StudentInformation);
        System.out.println("두번째 학생:" + " " + arr[1].StudentInformation);
        System.out.println("세번째 학생:" + " " + arr[2].StudentInformation);
    }

    static class Student {
        int StudentID;
        String StudentName;
        String StudentMajor;
        int phoneNumber;
        String strPhoneNumber;
        String StudentInformation;
        Student() {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        }

        void getInformation() {
            Scanner sc = new Scanner(System.in);
            StudentID = sc.nextInt();
            StudentName = sc.next();
            StudentMajor = sc.next();
            phoneNumber = sc.nextInt();
        }

        void setPhoneNumber() {
            strPhoneNumber = Integer.toString(phoneNumber);
            strPhoneNumber = "0" + strPhoneNumber.substring(0, 2) + "-" + strPhoneNumber.substring(2, 6) + "-" + strPhoneNumber.substring(6, 10);
            StudentInformation = StudentID + " " + StudentName + " " + StudentMajor + " " + strPhoneNumber;
        }
    }
}
