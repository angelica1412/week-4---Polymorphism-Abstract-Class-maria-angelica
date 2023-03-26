abstract class Robot {
    // Deklarasi Variabel yang digunakan pada kelas robot (pakai protected, supaya
    // variabelnya dapat diakses oleh kelas turunan lainnya
    // yang di mana hanya bisa dalam satau package)
    protected String name;
    protected String type;
    protected int health;
    protected int maxHealth;
    protected int power;

    public Robot(String name, String type, int maxHealth, int power) { // consturctor untuk kelas robot
        this.name = name;
        this.type = type;
        this.maxHealth = maxHealth;
        this.power = power;
    }

    public String getName() { // method untuk mengambil nama robot
        return name;
    }

    public int getHealth() { // method untuk mengambil HP robot
        return health;
    }

    public int getMaxHealth() { // method untuk mengambil max HP robot
        return maxHealth;
    }

    public int getPower() { // method untuk mengambil power robot
        return power;
    }

    // Setter dari kelas Robot 
    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void move() { // method untuk berpindah tempat
        System.out.println("Robot " + name + " sedang berpindah tempat");
    }

    public void attack(Robot musuh) { // method untuk menyerang musuh
        System.out.println("Robot " + name + " sedang menyerang musuh");
    }

    public void defend() { // method untuk bertahan
        System.out.println("Robot " + name + " sedang bertahan");
    }

    public void heal(Robot robot) { // method untuk heal
        System.out.println("Robot "+ name + " sedang sembuh");
        this.health = maxHealth;
    }

    public void useAbility(){ //method yang mengatur kemampuan robot  
    }

}
