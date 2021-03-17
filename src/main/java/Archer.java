class Archer extends Race implements DistantBattle {

    public Archer(String specialization, String name) {
        this.setSpecialization(specialization);
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(getSpecialization() + " " + getName() + " Бежит на позицию выстрела!");
    }

    @Override
    public void shoot() {
        System.out.println(getSpecialization() + " " + getName() + " Делает выстрел!");
    }

    @Override
    public void dodge() {
        System.out.println(getSpecialization() + " " + getName() + " Уклоняется от атаки!");
    }
}
