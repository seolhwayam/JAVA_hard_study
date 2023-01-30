import java.util.ArrayList;
import java.util.Scanner;

public class IsanghaeSeed extends Pokemon{
    public IsanghaeSeed(String name, int power, int speed) {
        super(name, power, speed);
        skills = new ArrayList<>();
        skills.add("씨폭탄");
        skills.add("앞날가르기");
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

class IsanghaeGrass extends IsanghaeSeed {
    public IsanghaeGrass(String name, int power, int speed) {
        super(name, power, speed);
        skills.add("오물폭탄");
        skills.add("기가드레인");
    }

}

class IsanghaeFlower extends IsanghaeGrass{
    public IsanghaeFlower(String name, int power, int speed) {
        super(name, power, speed);
        skills.add("솔라빔");
        skills.add("꽃잎댄스");
    }
}
