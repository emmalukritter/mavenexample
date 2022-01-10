public class testsample {

    int speedc = 0;

    public int pressAccelerator() {
        System.out.println(
                "Accelerator pressed "
                        + "to increase speed");
        int speed = 50;
        speedc = speedc + speed;
        return speed;
    }

    // Driver code
    public int speed() {
        System.out.println(
                "Driving with speed = "
                        + speedc
                        + "km/hr");

        if (speedc < 200) {
            speedc = pressAccelerator();
            System.out.println(
                    "Driving with speed = "
                            + speedc
                            + "km/hr");

            return speedc;
        } else {
            System.out.println(
                    "Speed Limit Reached! "
                            + "Drive Slow. Stay safe.");
            System.out.println(
                    "Driving with speed = "
                            + speedc
                            + "km/hr");
            return speedc;
        }
    }
}
