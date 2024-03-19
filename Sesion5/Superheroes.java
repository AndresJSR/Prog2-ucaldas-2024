import java.util.ArrayList;

public class Superheroes {
    ArrayList<Superhero> dc_Superheros = new ArrayList<>();

    public void addSuperheroes() {
        dc_Superheros.add(new Superhero("Batman", 2, new String[] { "Be richest", "Intelligent" }, false, 1));
        dc_Superheros.add(new Superhero("Superman", 3, new String[] { "Fly", "Blows", "SuperStrength" }, true, 1));
    }

    public void showSupereroesInformation() {
        for (int i = 0; i < dc_Superheros.size(); i++) {
            System.out.println(dc_Superheros.get(i).superhero_name);
        }
    }
}