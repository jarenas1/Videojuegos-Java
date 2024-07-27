import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creacion del arraylist

        List<Game> juegos = new ArrayList<Game>();

        //CREACION DE JUEGOS PARA POBLAR LA ARRAY LIST

        Game g1 = new Game("PS5", 1, 25000, "God of war");
        Game g2 = new Game("PS5", 2, 25000, "Minecraft");
        Game g3 = new Game("XBOX", 3, 25000, "Halo");
        Game g4 = new Game("PS5", 4, 25000, "Need for speed");
        Game g5 = new Game("XBOX", 5, 25000, "NO SE Q MAS PONER");


        //POBLAMOS EL ARRAYLIST
        juegos.add(g1);
        juegos.add(g2);
        juegos.add(g3);
        juegos.add(g4);
        juegos.add(g5);

        //MOSTRAR DATOS DE LOS JUEGOS

        System.out.println("GAMES");

        for(Game game : juegos){
            System.out.println(game.toString());
            System.out.println();
            System.out.println("-----------------------");
        }

        //MOFICIAR LA CANTIDAD DE JUGARDORES DE 2 JUEGOS
        System.out.println("MODIFICAR");
        for (int i = 0; i<juegos.size(); i++){
            if (i == 0 || i == 1){
                juegos.get(i).setPlayers(100);
                System.out.println("Jugadores de "+juegos.get(i).getTitle()+" Fueron cambiados a "+juegos.get(i).getPlayers());
            }
        }

        //MOSTRAR LOS VIDEJUEGOS DE PS5
        System.out.println("JUEGOS DE PS5");
        for(Game game : juegos){
            if (game.getConsole().equals("PS5")){
                System.out.println();
                System.out.println(game.toString());
                System.out.println("--------------------------");
            }
        }
    }
}