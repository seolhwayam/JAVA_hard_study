import java.util.ArrayList;
import java.util.Scanner;

public class Pairi extends Pokemon{
    public Pairi(String name, int power, int speed) {
        super(name, power, speed);
        skills = new ArrayList<>();
        skills.add("불꽃 세계!");
        skills.add("할퀴기");
    }


    @Override
    public void attack() {
        int i = 1;
        for (String skill : skills) {
            System.out.println(i + " : " + skill);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        System.out.println(getName() + "가 "+ skills.get(menu-1) + "을(를) 시전했습니다.");

    }
}

class Lizard extends Pairi {
    public Lizard(String name, int power, int speed) {
        super(name, power, speed);
        skills.add("불꽃엄니");
        skills.add("화염방사");
    }


}

class Lizamong extends Lizard{
    public Lizamong(String name, int power, int speed) {
        super(name, power, speed);
        skills.add("회오리 불꽃");
        skills.add("블라스트번");
    }
}