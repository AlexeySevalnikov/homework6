class Knight extends Race implements CloseCombat {

    public Knight(String specialization, String name) {
        this.setSpecialization(specialization);
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(getSpecialization() + " " + getName() + " Бежит на врага!");
    }

    @Override
    public void attack() {
        System.out.println(getSpecialization() + " " + getName() + " Атакует врага мечём!");
    }

    @Override
    public void protection() {
        System.out.println(getSpecialization() + " " + getName() + " Закрывает атаку врага щитом!");
    }
}
