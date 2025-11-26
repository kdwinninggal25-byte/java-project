
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RickshawFare
{
    public static void main(String[] args)
    {
       // --- Fare rule constants (edit these if assignment gives different numbers) ---
        final double BASE_FARE = 50.0;          // Rs.
        final double PER_KM = 12.0;            // Rs per km
        final double PER_MIN = 2.0;            // Rs per minute
        final double LOCAL_DISCOUNT_PERCENT = 10.0; // 10% discount for locals on long distance
        final double LONG_DISTANCE_THRESHOLD_KM = 10.0; // threshold for "long distance"
        final double NIGHT_SURCHARGE_PERCENT = 20.0; // 20% surcharge for night travel

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km (e.g. 7.5): ");
        double distanceKm = sc.nextDouble();

        System.out.print("Enter time in minutes (e.g. 15): ");
        double timeMin = sc.nextDouble();

        // ask if local (y/n) — using ternary operator to convert input to boolean
        System.out.print("Is the customer local? (y/n): ");
        String localInput = sc.next().trim().toLowerCase();
        boolean isLocal = localInput.equals("y") ? true : false;

        // ask if travel is during night (y/n)
        System.out.print("Is the travel during night? (y/n): ");
        String nightInput = sc.next().trim().toLowerCase();
        boolean isNight = nightInput.equals("y") ? true : false;

        // Calculate base fare
        double subtotal = BASE_FARE + (distanceKm * PER_KM) + (timeMin * PER_MIN);

        // Apply local discount if eligible
        boolean eligibleLocalDiscount = isLocal && (distanceKm >= LONG_DISTANCE_THRESHOLD_KM);
        double discountAmount = 0.0;
        if (eligibleLocalDiscount) {
            discountAmount = subtotal * (LOCAL_DISCOUNT_PERCENT / 100.0);
        }
        double afterDiscount = subtotal - discountAmount;

        // Apply night surcharge if applicable
        double surchargeAmount = 0.0;
        if (isNight) {
            surchargeAmount = afterDiscount * (NIGHT_SURCHARGE_PERCENT / 100.0);
        }
        double finalFare = afterDiscount + surchargeAmount;

        // round to nearest rupee
        long roundedFare = Math.round(finalFare);

        // Display result in Nepali format "Rs. X"
        System.out.println();
        System.out.println("Subtotal (before discounts/surcharges): Rs. " + Math.round(subtotal));
        System.out.println("Local discount applied: Rs. " + Math.round(discountAmount));
        System.out.println("Night surcharge applied: Rs. " + Math.round(surchargeAmount));
        System.out.println("Final fare: Rs. " + roundedFare);

        sc.close();  
    }
    }
