import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ggobugi extends Pokemon{
    public Ggobugi(String name, int power, int speed) {
        super(name, power, speed);
        skills = new ArrayList<>();
        skills.add("몸통 박치기");
        skills.add("거품 광선");
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

class anibugi extends Ggobugi {
    public anibugi(String name, int power, int speed) {
        super(name, power, speed);
        skills.add("물기");
        skills.add("물대포");
    }

}

class gabuckking extends anibugi{
    public gabuckking(String name, int power, int speed) {
        super(name, power, speed);
        skills.add("하이드로펌프");
        skills.add("로케트박치기");
    }
}