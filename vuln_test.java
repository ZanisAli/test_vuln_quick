public class VulnerableFunctions {

    //A function that constructs SQL queries by concatenating user input without proper sanitization.
    public void getUserData(String username) {
        String query = "SELECT * FROM users WHERE username = '" + username + "';";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
    }


}
