package Day_3.Conditionals;

import java.util.Scanner;

// Create a traffic light system using nested if-else
// Determine next light state and waiting time
// Add rush hour logic (longer green times)

public class TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        String currentColor;
        int timeDuration;
        boolean isPedestrianCrossing;
        boolean isEmergencyVehicle;
        boolean isRushHour;
        System.out.println("Select the current color of traffic light: Red , Yellow , Green ");
        currentColor=b.nextLine();
        System.out.println("How long the light has been on (in seconds)\r\n");
        timeDuration = b.nextInt();
        System.out.println("Is a Pedestrian Crossing ?");
        isPedestrianCrossing=b.nextBoolean();
        System.out.println("Is it an Emergency Vehicle?");
        isEmergencyVehicle=b.nextBoolean();
        System.out.println("Is it Rush Hour ?");
        isRushHour=b.nextBoolean();

        




    }
}
