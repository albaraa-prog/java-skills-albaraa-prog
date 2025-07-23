package API;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class API {
    public static void main(String[] args) throws Exception {
        String apiKey = "";
        String urlStr = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash-exp:generateContent?key=" + apiKey;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your query (press enter to continue): \n");
        String query = userInput.nextLine();

        // Escape quotes and newlines in the query to prevent JSON corruption
        query = query.replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r");
        String json = "{\"contents\":[{\"parts\":[{\"text\":\"" + query + "\"}]}]}";

        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        OutputStream os = con.getOutputStream();
        os.write(json.getBytes());
        os.close();

        // Add error handling
        int responseCode = con.getResponseCode();
        InputStream inputStream;
        if (responseCode >= 200 && responseCode < 300) {
            inputStream = con.getInputStream();
        } else {
            inputStream = con.getErrorStream();
            System.out.println("HTTP Error Code: " + responseCode);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            response.append(line);
        }
        br.close();

        // Extract text using regex pattern matching
        String resp = response.toString();

        // Pattern to find "text": "content" allowing for whitespace
        Pattern pattern = Pattern.compile("\"text\"\\s*:\\s*\"([^\"\\\\]*(\\\\.[^\"\\\\]*)*)\"");
        Matcher matcher = pattern.matcher(resp);

        if (matcher.find()) {
            String extractedText = matcher.group(1);
            // Unescape common escape sequences
            extractedText = extractedText.replace("\\n", "\n")
                    .replace("\\r", "\r")
                    .replace("\\t", "\t")
                    .replace("\\\"", "\"")
                    .replace("\\\\", "\\");

            System.out.println(extractedText);
        } else {
            System.out.println("Error: No text content found in response");
        }

        userInput.close();
    }
}