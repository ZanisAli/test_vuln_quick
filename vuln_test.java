public class VulnerableFunctions {

    //A function that constructs SQL queries by concatenating user input without proper sanitization.
    public void getUserData(String username) {
        String query = "SELECT * FROM users WHERE username = '" + username + "';";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
    }

    // A function that executes OS commands using user input without proper validation.
    public void pingHost(String host) throws IOException {
        Runtime.getRuntime().exec("ping -c 4 " + host);
    }

    // A function that accesses files using user input without proper validation.
    public String readFile(String filename) throws IOException {
        String path = "/var/www/html/" + filename;
        return new String(Files.readAllBytes(Paths.get(path)));
   }


}
