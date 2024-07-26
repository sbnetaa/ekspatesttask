package ru.terentev.ekspatesttask;

public class Harvesting {

	public static void main(String[] args) {
		int[] carrots = {1, 2, 3, 4, 5}; 
		final int MAX_WEIGHT = 5; 
		final int MAX_TRIPS = 10; 
		int totalCarrots = 0; 
		
		for (int trip = 0; trip < MAX_TRIPS; trip++) {
			int currentCarrots = 0;
			for (int i = 0; i < carrots.length; i++) {
				if (carrots[i] > 0 && (currentCarrots + carrots[i] <= MAX_WEIGHT)) {
					currentCarrots += carrots[i];
					carrots[i] = 0;
				}
			}
			totalCarrots += currentCarrots;
		}
		System.out.println("Всего унесено моркови - " + totalCarrots + "кг");
	}
}
