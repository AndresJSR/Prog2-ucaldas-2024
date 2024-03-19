public class Main {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Batman", 2, new String[] { "Be richest", "Intelligent" }, false, 1);
        Superhero hero2 = new Superhero("Superman", 3, new String[] { "Fly", "Blows", "SuperStrength" }, true, 1);
        Superheroes superheroes = new Superheroes();
        System.out.println("Batman super powers");
        hero.showSuperpowers();
        System.out.println(" ");
        System.out.println("Superman superpowers");
        hero2.showSuperpowers();
        superheroes.addSuperheroes();
        superheroes.showSupereroesInformation();
    }
}