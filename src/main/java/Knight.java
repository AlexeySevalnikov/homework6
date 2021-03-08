class Knight extends Race implements CloseCombat {

    @Override
    public void run() {
        System.out.println(getName() + " Бежит на врага!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Атакует врага мечём!");
    }

    @Override
    public void protection() {
        System.out.println(getName() + " Закрывает атаку врага щитом!");
    }
}
