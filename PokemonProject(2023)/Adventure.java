import java.util.Scanner;

public class Adventure {
    Scanner sc = new Scanner(System.in);
    String[] wildPokemon = {"라이츄","갸랴도스","팬텀","아보크","식스테일","디그다","코뿌리","라프라스"};
    String[] wildPokemonSkill = {"몸통 박치기", "돌 던지기", "바람 가르기", "근원의파동", "기가임팩트", "속임수", "냉동펀치", "자이로볼"};
    int RanNum;

    public void setRanNum(int ranNum) {
        RanNum = ranNum;
    }

    public void WildPoAppear(){
        int oneRanNum = (int)(Math.random() * 7) + 0;
        setRanNum(oneRanNum);
        System.out.println("야생 포켓몬 " + wildPokemon[RanNum]+"이/가 나타났다!!");
        System.out.println(StartSettings.getOwner() +" : 앗! 어떡하지?!" );
        System.out.println("============================================");
        System.out.println("     [  1  싸운다.   ::   2  도망친다.   ]");
        int fightChoice = sc.nextInt();

        if (fightChoice == 1){
            fight();
        } else if (fightChoice == 2){
            Run();
        } else {
            System.out.println("Garbage in, Garbage out. 당신은 이 게임을 할 자격이 없습니다. ^^");
        }
    }
    public void fight(){
        int RanSkill = (int)(Math.random() * 6 ) + 0;
        int wildPower = (int)(Math.random() * 30 ) + 50;
        MyPokemon.attack();
        System.out.println(wildPokemon[RanNum] + "이(가) " + wildPokemonSkill[RanSkill] + "을/를 시전했다!!");
        System.out.println("============================================");
        if(wildPower>=MyPokemon.getMyPoPower()){
            System.out.println(MyPokemon.getMyPoName()+ "이(가) "+ wildPokemon[RanNum] +"에게 [패배]했다!");
        }else if(wildPower<MyPokemon.getMyPoPower()){
            System.out.println(MyPokemon.getMyPoName()+ "이(가) "+ wildPokemon[RanNum] +"에게 [승리]했다!");
            MyPokemon.setExp(MyPokemon.getExp()+10);
            if(MyPokemon.getExp()==30){
                Evolution_level2();
            } else if (MyPokemon.getExp()==60) {
                Evolution_level3();
            }
        }

    }

    public void Run(){
        int wildSpeed = (int)(Math.random() * 30 ) + 70;

        if (wildSpeed <= MyPokemon.getMyPoSpeed()){
            System.out.println("도망에 [성공]했다!");
        } else {
            System.out.println("도망에 [실패]했다...! 전투에 돌입한다!");
            fight();
        }
    }

    public void Evolution_level2(){
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println(MyPokemon.getMyPoName()+" : 어?!?!? 어어!?!!! "+StartSettings.getOwner()+"! 내 몸이 이상해!!");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        MyPokemon.setMyPoName(MyPokemon.pokemonList_level2.get(StartSettings.getChoice()).getName());
        MyPokemon.setMyPoPower(MyPokemon.pokemonList_level2.get(StartSettings.getChoice()).getPower());
        MyPokemon.setMyPoSpeed(MyPokemon.pokemonList_level2.get(StartSettings.getChoice()).getSpeed());
        System.out.println("★"+MyPokemon.getMyPoName()+"★"+"로 진화하였다!!!");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    public void Evolution_level3(){
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("어?!?!? 어어!?!!!");
        System.out.println(MyPokemon.getMyPoName()+" : "+StartSettings.getOwner()+"! 내 몸이 이상해!!!!!");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        MyPokemon.setMyPoName(MyPokemon.pokemonList_level3.get(StartSettings.getChoice()).getName());
        MyPokemon.setMyPoPower(MyPokemon.pokemonList_level3.get(StartSettings.getChoice()).getPower());
        MyPokemon.setMyPoSpeed(MyPokemon.pokemonList_level3.get(StartSettings.getChoice()).getSpeed());
        System.out.println("★"+MyPokemon.getMyPoName()+"★"+"로 진화하였다!!!");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");

    }


}