class MeleeRobot extends Robot { // kelas melee yang diturunkan dari kelas robot
    private int melee;// field mele (besar tebakan ke musuh)

    public MeleeRobot(String name, String type, int maxHealth, int power, int melee) { // consturctor dari kelas Melee 
        super(name, type, maxHealth, power);
        this.melee = melee;
    }

    public int getMelee() { // method untuk mengambil seberapa besar tembakan ke musuh 
        return melee;
    }

    public void setMelee(int melee) { // method untuk menset seberapa besar tembakan ke musuh 
        this.melee = melee;
    }
    @Override
    public void attack(Robot musuh) { // method untuk menyerang musuh
        System.out.println("Robot" + getName() + " menyerang musuh dengan pedang!");
        musuh.setHealth(musuh.getHealth() - (getPower() - ((MeleeRobot) musuh).getMelee()));
    }

    @Override
    public void defend() { // method untuk bertahan hidup 
        System.out.println("Robot" + getName() + " bertahan dengan perisai!");
    }

    @Override
    public void heal(Robot robot) { // method untuk heal diri sendiri 
        setHealth(getMaxHealth());
        System.out.println("Robot" + getName() + " minum ramuan kesehatan dan sekarang dalam HP anda penuh!");
    }
}
