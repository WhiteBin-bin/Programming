import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> abc = new HashMap<>();

        String filePath = "db.txt";

        try {
            // 파일 객체 생성
            File file = new File(filePath);

            // Scanner를 사용하여 파일 읽기 시도
            Scanner scanner = new Scanner(file);

            // 파일에서 데이터를 읽어와 해시맵에 저장
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                // split으로 나눈 문자열이 두개의 요소로 이루어졌을때 ID와 비밀번호를 해시맵에 저장
                if (parts.length == 2) {
                    abc.put(parts[0], parts[1]);
                }
            }

            // Scanner 닫기
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + filePath);
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String inputId = sc.nextLine().trim();

            if (!abc.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password: ");
            String inputPassword = sc.nextLine().trim();
            String password = abc.get(inputId);

            if (inputPassword.equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
