public class GamePlay {
    public static void main(String[] args) {
        // Komponen - komponen yang ada pada robot yang disimpan dalam array list
        Robot[] componentRobots = {
                new MeleeRobot("Melee 1", "melee", 100, 50, 10),
                new MeleeRobot("Melee 2", "melee", 100, 50, 10),
                new RangedRobot("Ranged 1", "ranged", 80, 50, 20, 100),
                new RangedRobot("Ranged 2", "ranged", 80, 50, 20, 100),
                new SupportRobot("Support 1", "support", 120, 50, 50)
        };

        // Objek baru dari kelas CentralBrain dengan parameter yang sudah ditentukan
        CentralBrain centralBrain = new CentralBrain("Robot Besar", 500, 200, componentRobots);

        // Combine semua komponent yang ada pada robot menjadi robot besar
        centralBrain.combine();// pemanggilan method combine untuk object centralBrain

        // Mendemonstrasikan gerakan dan komunikasi robot yang lebih kecil:
        System.out.println("Mendemonstrasikan gerakan dan komunikasi robot yang lebih kecil:");
        for (Robot componentRobot : componentRobots) {
            componentRobot.move();
            if (componentRobot instanceof MeleeRobot) { // untuk mengecek apakah component robot sudah sesuai dengan meleerobot
                ((MeleeRobot) componentRobot).useAbility();
            } else if (componentRobot instanceof RangedRobot) {
                ((RangedRobot) componentRobot).useAbility();
            } else if (componentRobot instanceof SupportRobot) {
                ((SupportRobot) componentRobot).useAbility();
            }
        }

        centralBrain.defend();// pemanggilan method defend oleh object central brain

        centralBrain.heal(centralBrain); // pemanggilan method heal oleh object central brain

        // demonstrate movement and attack of larger robot
        System.out.println("Mendemonstrasikan gerakan dan serangan robot yang lebih besar:");
        centralBrain.move(); // pemanggilan method move oleh object central brain
        centralBrain.attack(centralBrain); // pemanggilan method attack oleh object central brain

        // Memisahkan robot besar menjaid komponen - komponen robot
        System.out.println("Mendemonstrasikan pemisahan robot yang lebih besar menjadi komponen - komponen robot:");
        centralBrain.separated(); // pemanggilan method separated oleh object central brain
    }
}
