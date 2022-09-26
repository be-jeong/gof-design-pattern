package strategy;

import strategy.example.Axe;
import strategy.example.GameCharacter;
import strategy.example.Knife;
import strategy.example.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }
}
