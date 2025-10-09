 import java.io.*;

class InvalidConfigVersionException extends Exception {
    public InvalidConfigVersionException(String message) {
        super(message);
    }
}

public class Chapter1_Challenge_1_4 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line (config version)
            String versionLine = reader.readLine();
            int version = Integer.parseInt(versionLine);

            if (version < 2) {
                throw new InvalidConfigVersionException("Config version too old!");
            }

            // Read second line (file path)
            String filePath = reader.readLine();
            File file = new File(filePath);

            if (!file.exists()) {
                throw new IOException("Error: File path does not exist!");
            }

            System.out.println("Config read successfully!");
            System.out.println("Version: " + version);
            System.out.println("Path: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt file not found!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Config version is not a valid number!");
        } catch (InvalidConfigVersionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
import java.io.*;

class InvalidConfigVersionException extends Exception {
    public InvalidConfigVersionException(String message) {
        super(message);
    }
}

public class Chapter1_Challenge_1_4 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line (config version)
            String versionLine = reader.readLine();
            int version = Integer.parseInt(versionLine);

            if (version < 2) {
                throw new InvalidConfigVersionException("Config version too old!");
            }

            // Read second line (file path)
            String filePath = reader.readLine();
            File file = new File(filePath);

            if (!file.exists()) {
                throw new IOException("Error: File path does not exist!");
            }

            System.out.println("Config read successfully!");
            System.out.println("Version: " + version);
            System.out.println("Path: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt file not found!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Config version is not a valid number!");
        } catch (InvalidConfigVersionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
import java.io.*;

class InvalidConfigVersionException extends Exception {
    public InvalidConfigVersionException(String message) {
        super(message);
    }
}

public class Chapter1_Challenge_1_4 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line (config version)
            String versionLine = reader.readLine();
            int version = Integer.parseInt(versionLine);

            if (version < 2) {
                throw new InvalidConfigVersionException("Config version too old!");
            }

            // Read second line (file path)
            String filePath = reader.readLine();
            File file = new File(filePath);

            if (!file.exists()) {
                throw new IOException("Error: File path does not exist!");
            }

            System.out.println("Config read successfully!");
            System.out.println("Version: " + version);
            System.out.println("Path: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt file not found!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Config version is not a valid number!");
        } catch (InvalidConfigVersionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
import java.io.*;

class InvalidConfigVersionException extends Exception {
    public InvalidConfigVersionException(String message) {
        super(message);
    }
}

public class Chapter1_Challenge_1_4 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line (config version)
            String versionLine = reader.readLine();
            int version = Integer.parseInt(versionLine);

            if (version < 2) {
                throw new InvalidConfigVersionException("Config version too old!");
            }

            // Read second line (file path)
            String filePath = reader.readLine();
            File file = new File(filePath);

            if (!file.exists()) {
                throw new IOException("Error: File path does not exist!");
            }

            System.out.println("Config read successfully!");
            System.out.println("Version: " + version);
            System.out.println("Path: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt file not found!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Config version is not a valid number!");
        } catch (InvalidConfigVersionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
