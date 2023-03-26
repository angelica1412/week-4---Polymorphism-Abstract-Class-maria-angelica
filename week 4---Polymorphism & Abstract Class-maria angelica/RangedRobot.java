class RangedRobot extends Robot { // kelas ranged robot yang merupaka turunan dari kelas robot 
    
    private int ammoCount; // jumlah peluru yang tersisa
    private int maxAmmoCount; // jumlah max peluru yang dapat disimpan

    public RangedRobot(String name, String type, int maxHealth, int power, int ammoCount, int maxAmmoCount) { // constructor dair kelas ranged robot
        super(name, type, maxHealth, power);
        this.ammoCount = ammoCount;
        this.maxAmmoCount = maxAmmoCount;
    }

    @Override
    public void attack(Robot musuh) { // method untuk menyerang musuh 
        if (ammoCount > 0) {
            System.out.println("Robot" + getName() + " serangan dengan senjata jarak jauh!");
            ammoCount--;
            musuh.setHealth(musuh.getHealth() - (getPower() - ((MeleeRobot) musuh).getMelee()));
        } else {
            System.out.println("Robot" + getName() + " kehabisan peluru");
        }
    }

    public void mundur() { // method untuk menghindar dari musuh 
        // implementation for ranged robot retreat
        System.out.println("Robot" + getName() + " menghindar dari musuh.");
    }

    public void reload() { // method untuk memuat ulang peluru yang sudah habis
        ammoCount = maxAmmoCount;
    }

}
