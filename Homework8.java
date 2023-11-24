import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap <String, String> abc = new HashMap<>();
        abc.put("myId", "myPass");
        abc.put("myId2", "myPass2");
        abc.put("myId3", "myPass3");
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String inputId = sc.nextLine().trim();

            if(!abc.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password: ");
            String inputPassword = sc.nextLine().trim();
            String password = abc.get(inputId);

            if(inputPassword.equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
