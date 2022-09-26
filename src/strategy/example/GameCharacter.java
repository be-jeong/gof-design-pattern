package strategy.example;

public class GameCharacter {

    //접근점
    private Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if(weapon == null) {
            System.out.println("무기 없이 공격 호출 완료");
        } else {
            weapon.attack();
        }
        //delegate
    }
}
