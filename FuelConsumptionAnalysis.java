public class FuelConsumptionAnalysis {

    public static void main(String[] args) {

        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        int i = 0;
        while (i < fuelConsumption.length) {
            if (fuelConsumption[i] > 20) {
                System.out.println("The fuel consumption is " + fuelConsumption[i] + "and it is High");
            } else if (fuelConsumption[i] >= 10) {
                System.out.println(fuelConsumption[i] + " is Normal");
            } else {
                System.out.println(fuelConsumption[i] + " is Low");
            }
            i++;
        }

    }
}