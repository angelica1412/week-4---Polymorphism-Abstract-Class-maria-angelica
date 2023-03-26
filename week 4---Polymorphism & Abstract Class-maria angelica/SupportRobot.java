public class SupportRobot extends Robot {
    private int healingPower;

    public SupportRobot(String name, String type, int maxHealth, int power, int healingPower) { // constructor kelas Support robot 
        super(name, type, maxHealth, power);
        this.healingPower = healingPower;
    }

    // Getter Setter dari Healing Power
    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public void attack(Robot robot) { // method untuk menyerang
        System.out.println(getName() + " menggunakan stun gun untuk melumpuhkan " + robot.getName());
        robot.setHealth(robot.getHealth() - (getPower() / 2));
    }

    public void heal(Robot robot) { // method untuk penyembuhan support robot 
        System.out.println(getName() + " sedang menyembuhkan " + robot.getName());
        int newHealth = robot.getHealth() + healingPower;
        if (newHealth > robot.getMaxHealth()) {
            newHealth = robot.getMaxHealth();
        }
        robot.setHealth(newHealth);
    }
}
