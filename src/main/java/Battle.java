import java.util.Random;

class Battle {

    public void start() {
        Knight knight = new Knight();
        knight.setName("Крестоносец");
        Archer archer = new Archer();
        archer.setName("Сьюзан");
        int n = new Random().nextInt(3);
        int m = new Random().nextInt(3);
        if (n == 1) {
            knight.run();
            archer.run();
            knight.attack();
            if (m == 2) {
                archer.dodge();
                archer.shoot();
                knight.die();
            } else {
                archer.die();
            }
        } else {
            archer.run();
            knight.run();
            archer.shoot();
            if (m == 1) {
                knight.protection();
                knight.attack();
                archer.die();
            } else {
                knight.die();
            }
        }
    }
}
