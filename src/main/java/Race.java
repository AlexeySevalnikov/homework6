public abstract class Race extends Battle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();

    public void die() {
        System.out.println(name + " Погиб");
    }
}
