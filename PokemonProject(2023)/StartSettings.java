import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyPokemon{
    private static String MyPoName;
    private static int MyPoPower;
    private static int MyPoSpeed;

    private static int exp;

    public static int getExp() {
        return exp;
    }

    public static void setExp(int exp) {
        MyPokemon.exp = exp;
    }

    public static String getMyPoName() {
        return MyPoName;
    }

    public static void setMyPoName(String myPoName) {
        MyPoName = myPoName;
    }

    public static int getMyPoPower() {
        return MyPoPower;
    }

    public static void setMyPoPower(int myPoPower) {
        MyPoPower = myPoPower;
    }

    public static int getMyPoSpeed() {
        return MyPoSpeed;
    }

    public static void setMyPoSpeed(int myPoSpeed) {
        MyPoSpeed = myPoSpeed;
    }

    static List<Pokemon> pokemonList = new ArrayList<>();

    public void startPokemon(){
        pokemonList.add(new Pairi("파이리",80,95));
        pokemonList.add(new Ggobugi("꼬부기",70,75));
        pokemonList.add(new IsanghaeSeed("이상해씨",85,85));
        System.out.println("오박사 :  자네와 함께할 친구는 " + pokemonList.get(StartSettings.getChoice()).getName() + "이다!");
        System.out.println("오박사 :  자! 즐거운 여행을 하고오거라!");
        setMyPoName(pokemonList.get(StartSettings.getChoice()).getName());
        setMyPoPower(pokemonList.get(StartSettings.getChoice()).getPower());
        setMyPoSpeed(pokemonList.get(StartSettings.getChoice()).getSpeed());
        System.out.println("그렇게 " + StartSettings.getOwner() +"는(은) "+ getMyPoName() +"와 함께 여행을 떠나게 되는데...!!!");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
    @Override
    public String toString() {
        return MyPoName;
    }

    public static void attack() {
        System.out.println("============================================");
        System.out.println("어떤 공격을 할 것인가?!");
        int i = 1;
        for (String skill : MyPokemon.pokemonList.get(StartSettings.getChoice()).skills) {
            System.out.println(i + " : " + skill);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        int skillMenu = scanner.nextInt();
        System.out.println("============================================");
        System.out.println(MyPokemon.pokemonList.get(StartSettings.getChoice()).getName() + "가 "+ MyPokemon.pokemonList.get(StartSettings.getChoice()).skills.get(skillMenu - 1) + "을(를) 시전했다!");
    }
}
public class StartSettings {
    Scanner sc = new Scanner(System.in);

    private static String owner;

    private static int choice;

    public static int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice - 1;
    }

    public static String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return owner;
    }

    public void Opacksa(){
        System.out.println("오박사:  왔는가? 자네!! 아차차 자네 이름이 뭐라고 했지?");
        String owner = sc.nextLine();
        setOwner(owner);
        System.out.println("오박사 :  아차차! " + getOwner() + "(이)라고 했지!?!!?");
    }
    public void PokemonChoice(){
        System.out.println("오박사 :  허허허! 참! 시간이 벌써 이렇게! 자자, 초보 트레이너라고 걱정말게나~");
        System.out.println("오박사 :  여기 자네와 같은 초보 트레이너들을 위한 포켓몬들을 준비했다네!");
        System.out.println("오박사 :  누구와 함께 여행을 떠나고 싶은가!?!?");
        System.out.println("============================================");
        System.out.println("[  1  파이리  ::   2  꼬부기   ::  3 이상해씨   ]");
        int choice = sc.nextInt();
        setChoice(choice);
    }



}