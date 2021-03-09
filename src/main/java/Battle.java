import java.util.Random;

class Battle {

    public void start() {
        Knight knight = new Knight();
        knight.setName("Крестоносец");
        Archer archer = new Archer();
        archer.setName("Сьюзан");
        int queue = new Random().nextInt(2);  //очередь, если 0, то первым ходит рыцарь, инаяче лучник
        int luck = new Random().nextInt(2);   //везение, если 0, то везет рыцарью, иначе лучнику
        if (queue == 0) {
            knight.run();
            archer.run();
            knight.attack();
            if (luck == 1) {
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
            if (luck == 0) {
                knight.protection();
                knight.attack();
                archer.die();
            } else {
                knight.die();
            }
        }
    }
}
