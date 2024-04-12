package de.dennisguse.opentracks.data.models;
import java.util.List;
import de.dennisguse.opentracks.data.models.SkiRun;

public class CalorieCalculator {
double caloriesBurned=0;
private List<TrackPoint> trackPoint;
double weightInKg;
SkiRun sr=new SkiRun("name",trackPoint,weightInKg);
    // Method to calculate calories burned during skiing
    public double calculateCalories(double weightInKg, double durationInHours, double metValue) {
        double caloriesBurned = metValue * weightInKg * durationInHours; //MET (Metabolic Equivalent of Task) value is a unit used to measure the intensity of physical activities.
        return caloriesBurned;
    }

    // Overloaded method that uses other methods fromSkiRun class
    public double calculateCalories() {

        double durationInHours = convertMilliToHours(sr.getDuration().toMillis());
        // Call the main calculateCalories method with the default MET value
        return calculateCalories(sr.getUserWeight(), durationInHours, sr.calculateMET());
    }

    // method to convert weight from pounds to kilograms
    public double convertPoundsToKg(double weightInPounds) {
        return weightInPounds * 0.453592;
    }

    // method to convert duration from milli seconds to hours
    public double convertMilliToHours(double durationInMinutes) {
        return durationInMinutes / 3600000.0;
    }
//method to print calories burned value
    public String toString() {
        return "CalorieCalculator=" +caloriesBurned;
    }

}