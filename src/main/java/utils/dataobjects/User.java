package utils.dataobjects;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public final class User {

    public String email;
    public String password;

    @Override
    public String toString() {
        return String.format("user (%s / %s)", getEmail(), getPassword());
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLogin() {
        return email.split("@")[0];
    }
}
