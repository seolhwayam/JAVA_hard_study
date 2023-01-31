public class PokemonGame {
    public static void main(String[] args) {

        StartSettings s1= new StartSettings();
        MyPokemon m1 = new MyPokemon();
        //Adventure a1 = new Adventure();
        s1.Opacksa();
        s1.PokemonChoice();
        m1.startPokemon();
        Menu.menu();
        //a1.WildPoAppear();

        //Menu.menu();
    }
}