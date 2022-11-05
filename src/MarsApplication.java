public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();

        System.out.println("-------------------");

        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("-------------------");

        System.out.println("Zmiana temperatury do -90.");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("-------------------");

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("-------------------");

        // Laboratorium nr 2
        System.out.println("MarsRobot: opportunity");


        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "praca badawcza";
        opportunity.speed = 4;
        opportunity.temperature = -30;

        opportunity.showAttributes();

        System.out.println("-------------------");

        System.out.println("Zmniejszanie prędkości do 3.");
        opportunity.speed = 3;
        opportunity.showAttributes();

        System.out.println("-------------------");

        System.out.println("Zmiana temperatury do -70.");
        opportunity.temperature = -70;
        opportunity.showAttributes();


        System.out.println("-------------------");
        System.out.println("Status robota opportunity");


        opportunity.checkStatus();

        System.out.println("Status robota spirit");

        spirit.checkStatus();




    }
}
