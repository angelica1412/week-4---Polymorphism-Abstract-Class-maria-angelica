public class CentralBrain extends Robot implements CombiningRobot {

    private Robot[] componentRobots; // field untuk menyimpan komponen robot dalam array list 

    public CentralBrain(String name, int maxHealth, int power, Robot[] componentRobots) {
        super(name, "Central Brain", maxHealth, power);
        this.componentRobots = componentRobots;
    }

    // Getter dan Setter untuk field componentRobots
    public Robot[] getComponentRobots() {
        return componentRobots;
    }

    public void setComponentRobots(Robot[] componentRobots) {
        this.componentRobots = componentRobots;
    }

    @Override
    public void move() { // method yang digunakan oleh monster besar untuk berpindah
        System.out.println(getName() + " menggerakkan seluruh robot.");
    }

    @Override
    public void attack(Robot robot) { // method yang digunakan oleh monster besar untuk menyerang
        System.out.println(getName() + " menggunakan sinar laser untuk menyerang " + robot.getName());
        robot.setHealth(robot.getHealth() - getPower());
    }

    @Override
    public void defend() { // method yang digunakan oleh monster besar untuk bertahan
        System.out.println(getName() + " sedang mengaktifkan medan kekuatannya untuk mempertahankan diri dari serangan musuh.");
    }

    @Override
    public void heal(Robot robot) { // method untuk heal
        System.out.println(getName() + " sedang memperbaiki komponen robot yang rusak.");
        for (Robot componentRobot : componentRobots) {
            componentRobot.setHealth(componentRobot.getMaxHealth());
        }
    }

    @Override
    public void combine() {// method untuk menggabungkan komponen - komponen robot
        System.out.println(getName() + " menggabungkan komponen robot.");
        setMaxHealth(0);
        setHealth(0);
        setPower(0);
        for (Robot componentRobot : componentRobots) {
            setMaxHealth(getMaxHealth() + componentRobot.getMaxHealth());
            setHealth(getHealth() + componentRobot.getHealth());
            setPower(getPower() + componentRobot.getPower());
        }
    }

    @Override
    public void separated() { // method untuk memisahkan komponen - komponen robot
        System.out.println(getName() + " memisahkan komponen robot.");
        for (Robot componentRobot : componentRobots) {
            componentRobot.setHealth(getHealth() * componentRobot.getMaxHealth() / getMaxHealth());
        }
        setMaxHealth(0);
        setHealth(0);
        setPower(0);
    }

}
