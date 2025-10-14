/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_challenge1_4_;
 import java.io.*;
 
public class Chapter1_challenge_1_4_ {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Try to open config.txt
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line: should be a number
            String versionLine = reader.readLine();
            int configVersion = Integer.parseInt(versionLine);

            // Check config version
            if (configVersion < 2) {
                throw new Exception("Config version too old!");
            }

            // Read second line: should be a file path
            String filePath = reader.readLine();
            File file = new File(filePath);
            if (!file.exists()) {
                throw new IOException("File at path " + filePath + " does not exist.");
            }

            System.out.println("Config read successfully!");
            System.out.println("Version: " + configVersion);
            System.out.println("File path: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt not found!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: First line is not a valid number!");
        } catch (Exception e) {  // This catches our custom Exception for version < 2
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Always executes
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
 
    