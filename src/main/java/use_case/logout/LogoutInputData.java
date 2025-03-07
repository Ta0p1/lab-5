package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {

    private final String username;

    public LogoutInputData(String username) {
        this.username = username;
    }

    String getUsername() {
        return username;
    }
}
