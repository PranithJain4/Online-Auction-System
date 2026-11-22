/**
 * Represents a registered user in the Online Auction System.
 * Encapsulates credentials and personal information.
 *
 * @author Chandan D K
 * @version 1.0
 */
public class User {

    // Stores the user's full name
    private String name;

    // Stores the user's login username
    private String username;

    // Stores the user's password
    private String password;

    /**
     * Initializes a new User instance.
     *
     * @param name     the full name of the user
     * @param username the unique login handle
     * @param password the secret authentication password
     */
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * Retrieves the user's full name.
     *
     * @return the full name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the user's username.
     *
     * @return the unique username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Verifies if entered credentials match the user's stored account details.
     * Demonstrates encapsulation by validating without leaking the password.
     *
     * @param username the entered username
     * @param password the entered password
     * @return true if credentials match; false otherwise
     */
    public boolean checkLogin(String username, String password) {

        // Compares entered username and password with stored credentials
        if (this.username.equals(username) && this.password.equals(password)) {
            return true; // Returns true if both match
        }

        return false; // Returns false if credentials do not match
    }
}
