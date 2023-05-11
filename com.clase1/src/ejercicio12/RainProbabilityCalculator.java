package com.ejercicio12;

import java.util.Scanner;

public class RainProbabilityCalculator {
    public RainProbabilityCalculator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the probability of rain in your area (0-100): ");
        int rainProbability = scanner.nextInt();
        System.out.print("Enter the size of your territory in square kilometers: ");
        int territorySize = scanner.nextInt();
        System.out.print("Enter the humidity percentage in your area (0-100): ");
        int humidity = scanner.nextInt();
        System.out.print("Enter the temperature in Celsius in your area: ");
        int temperature = scanner.nextInt();
        System.out.print("Enter the wind speed in your area (km/h): ");
        int windSpeed = scanner.nextInt();
        System.out.print("Enter the air pressure in your area (hPa): ");
        int airPressure = scanner.nextInt();
        double probabilityToRainInTerritory = calculateRainProbability(rainProbability, territorySize, humidity, temperature, windSpeed, airPressure);
        System.out.println("The probability of rain in your territory is " + probabilityToRainInTerritory + "%");
    }

    private static double calculateRainProbability(int rainProbability, int territorySize, int humidity, int temperature, int windSpeed, int airPressure) {
        double probabilityToRainInOneSquareKm = (double)rainProbability / 100.0;
        double humidityFactor = Math.min(1.0, (double)humidity / 60.0);
        double temperatureFactor = Math.max(0.0, (double)(20 - temperature) / 10.0);
        double windFactor = Math.min(1.0, (double)windSpeed / 40.0);
        double pressureFactor = Math.max(0.0, (double)(1013 - airPressure) / 20.0);
        double combinedFactor = (humidityFactor + temperatureFactor + windFactor + pressureFactor) / 4.0;
        double probabilityOfNoRainInOneSquareKm = 1.0 - probabilityToRainInOneSquareKm * combinedFactor;
        double probabilityOfNoRainInTerritory = Math.pow(probabilityOfNoRainInOneSquareKm, (double)territorySize);
        double probabilityToRainInTerritory = 100.0 * (1.0 - probabilityOfNoRainInTerritory);
        return probabilityToRainInTerritory;
    }
}
