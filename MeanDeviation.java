import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class MeanDeviation {
    public static void main(String[] args) {
        ArrayList<Double> userInput = new ArrayList<Double>();
        double numbers, distance, mean = 0, meanDeviation = 0, inputTotal = 0,
                totalDistance=0;
        int numberCount = 0, index = 0;
        DecimalFormat roundNumbers = new DecimalFormat("0.###");
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Enter ONLY Numbers: (Enter any letter to exit " +
                "loop)");

        while (inputNumbers.hasNextDouble()) {
            numbers = inputNumbers.nextDouble();
            userInput.add(numbers);
            inputTotal += numbers;
            numberCount += 1;
            mean = inputTotal / numberCount;
        }
        while (index < numberCount) {
            distance = Math.abs((userInput.get(index)) - mean);
            index++;
            totalDistance += distance;
            meanDeviation = totalDistance/numberCount;
        }

        System.out.println("The count for the number of numbers " +
                "inputted is: " + numberCount);
        System.out.println("The average/mean of the " +
                "data is: " + roundNumbers.format(mean));
        System.out.println("The Mean Deviation " +
                "is " + roundNumbers.format(meanDeviation));
    }
}













