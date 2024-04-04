package project_class.game;

public class newGame {
        // Defenisi atribut
        String name;
        int speed;
        int healthPoin;

        //defenisi method run    

    void run()
    {
        System.out.println(name+ "is running...");
        System.out.println("Speed :" + speed);
    }

    //defenisi method isDead untuk mengecek nilai kesehatan(healthPoin)
    boolean isDead(){
        if (healthPoin <= 0)
            return true;
        return false;
    }
}
