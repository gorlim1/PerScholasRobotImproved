public class Robot {

    String robotName = "Roombic"; //Robot's name
    String robotColor = "Black"; //Robot's color
    int robotSpeedKPH = 0; //Robot's speed in kilometers per hour
    int robotBatteryCharge = 100; //Robot's battery charge
    double robotWeightKG = 4.3; //Robot's weight in kilograms
    double robotOSVersion = 7.2; //Robot's OS version


    public void moveUntilZeroCharge() {

        for(int i = robotBatteryCharge; i > 0; i = i - 10) {
            System.out.println(robotName + "'s speed is " + robotSpeedKPH + " kph.");
            System.out.println(robotName + "'s battery charge is " + robotBatteryCharge + "%.");
            System.out.println("Increasing " + robotName + "'s speed...");
            robotSpeedKPH = robotSpeedKPH + 5;
            System.out.println(robotName + "'s speed is " + robotSpeedKPH + " kph.");
            robotSpeedKPH = robotSpeedKPH + 5;
            robotBatteryCharge = robotBatteryCharge - 10;
            }

        System.out.println(robotName + "'s speed is " + robotSpeedKPH + " kph.");
        System.out.println(robotName + "'s battery charge is " + robotBatteryCharge + "%.");
        System.out.println(robotName + " is out of charge, and has now stopped moving.");
        }
    }