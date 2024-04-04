package project_class.game;

public class player {

public static void main(String[] args) {


    newGame game = new newGame();

    game.name = "UPB Game";
    game.speed = 700;
    game. healthPoin = 0;


    //menjalankan method 
    game.run();

    if(game.isDead()){
        System.out.println("Game Over");
    }
}

}
