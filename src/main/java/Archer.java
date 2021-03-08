class Archer extends Race implements DistantBattle {
    @Override
    public void run() {
        System.out.println(getName() + " Бежит на позицию выстрела!");
    }

    @Override
    public void shoot() {
        System.out.println(getName() + " Делает выстрел!");
    }

    @Override
    public void dodge() {
        System.out.println(getName() + " Уклоняется от атаки!");
    }
}
