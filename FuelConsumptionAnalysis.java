public class FuelConsumptionAnalysis {

    public static void main(String[] args) {
       double total = 0;
       int countHigh = 0;
       int countLow = 0;
       int countNorm = 0;
       double highest = 0;
       int highestConsumptionDay = 0;
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        int i = 0;
        while (i < fuelConsumption.length) {

            if(highest < fuelConsumption[i]){
                highest = fuelConsumption[i];
                highestConsumptionDay = i + 1;
            }


            if (fuelConsumption[i] > 20) {
                System.out.println("This is day " + (i + 1) + " and the fuel consumption is " + fuelConsumption[i] + " and it is High");
                countHigh++;


            } else if (fuelConsumption[i] >= 10) {
                System.out.println("This is day " + (i + 1) + " and the fuel consumption is " + fuelConsumption[i] + " and it is Normal");
                countNorm++;

            } else {
                System.out.println("This is day " + (i + 1) + " and the fuel consumption is " + fuelConsumption[i] + " and it is Low");
                countLow++;
            }

            total += fuelConsumption[i];
            i++;

        }

        double average = total/fuelConsumption.length;
        System.out.printf("The total consumption for the week is: %.2f\n", total);
        System.out.printf("The average consumption for the week is: %.2f\n ", average);
        System.out.println("The highest consumption day is day " + highestConsumptionDay );


    }
}