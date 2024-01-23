package starter.SauceDemo;

public enum User {
    STANDARD_USER("standard_user", "secret_sauce", "A standard user"),
    LOCKED_OUT_USER("locked_out_user", "secret_sauce", "A locked out user"),
    PROBLEM_USER("problem_user", "secret_sauce", "A problem user"),
    PERFORMANCE_GLITH_USER("performance_glitch_user", "secret_sauce", "A performance glitch_user");

    private final String username;
    private final String password;
    private final String description;

    User(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

}
