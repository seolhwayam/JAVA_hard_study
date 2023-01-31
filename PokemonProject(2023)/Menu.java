import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Adventure a1 = new Adventure();
        List<String> showMenu = new ArrayList<>();
        showMenu.add("★ 모험하기 ☆");
        showMenu.add("★ 종료하기(단, 세이브 안됨) ☆");
        while (true) {
            System.out.println("============================================");
            System.out.println("        1. menu ::  2. continue");
            Scanner sc = new Scanner(System.in);
            int pick = sc.nextInt();
            System.out.println("============================================");
            if (pick == 1) {
                int i = 1;
                for (String menu : showMenu) {
                    System.out.println(i + " : " + menu);
                    i++;
                }
                int menuPick = sc.nextInt();
                if(menuPick == 1){
                    System.out.println("★☆★☆★☆★☆★☆★☆모험하기★☆★☆★☆★☆★☆★☆");
                    System.out.println("디지털 요정 : 몇 번 여행을 떠날까요? ");
                    int trip = sc.nextInt();
                    for(int x =0 ; x<trip ; x++){
                        a1.WildPoAppear();
                    }
                } else if (menuPick == 2) {
                    System.out.println("   종료하겠습니다^^ 정말로 종료하실 건가요?");
                    System.out.println("   이것은 세이브가 안되는 1회용 게임입니다.");
                    System.out.println("★★★★★★★★★★★종료합니다★★★★★★★★★★★");
                    break;

                }

            } else if (pick ==2) {
                System.out.println("디지털 요정 : 아직 준비중입니다^^");
            } else {
                System.out.println("제대로 입력하시겠요?^^ (★garbage in garbage out★)");
            }
        }
    }
}



