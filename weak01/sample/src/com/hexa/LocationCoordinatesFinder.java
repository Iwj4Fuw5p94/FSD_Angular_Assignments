package com.hexa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.Optional;
import java.net.URLEncoder;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;
import org.json.JSONArray;

public class LocationCoordinatesFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the location name: ");
        String locationName = scanner.nextLine();

        try {
            String encodedLocation = URLEncoder.encode(locationName, "UTF-8");
            String urlString = "https://nominatim.openstreetmap.org/search?format=json&q=" + encodedLocation;

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONArray jsonArray = new JSONArray(response.toString());

            if (jsonArray.length() > 0) {
                JSONObject firstResult = jsonArray.getJSONObject(0);
                double latitude = firstResult.getDouble("lat");
                double longitude = firstResult.getDouble("lon");

                System.out.println("Location: " + locationName);
                System.out.println("Latitude: " + latitude);
                System.out.println("Longitude: " + longitude);
            } else {
                System.out.println("Location not found.");
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
