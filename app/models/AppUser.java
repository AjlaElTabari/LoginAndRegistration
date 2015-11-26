package models;

import com.avaje.ebean.Model;
import play.Logger;
import play.data.validation.Constraints;
import javax.persistence.*;

/**
 * Created by ajla.eltabari on 26/11/15.
 */
@Entity
public class AppUser extends Model {

    public static Finder<String, AppUser> finder = new Finder<>(AppUser.class);

    @Id
    public Integer id;

    @Constraints.Required(message = "Please enter your first name.")
    @Constraints.MinLength(value = 2, message = "First name must be at least 2 letters long.")
    public String firstname;

    @Constraints.Required(message = "Please enter your last name")
    @Constraints.MinLength(value = 2, message = "Last name must be at least 2 letters long.")
    public String lastname;

    @Constraints.Required(message = "Please enter your email.")
    @Column(unique = true)
    public String email;

    @Constraints.Required(message = "Please enter your password.")
    @Constraints.MinLength(6)
    public String password;


    public AppUser(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    /**
     * Checks user's credentials
     * @param email
     * @param password
     * @return
     */
    public static AppUser authenticate(String email, String password) {

        AppUser user = finder.where().eq("email", email.toString()).findUnique();

        if (user != null && user.password.equals(password)) {
            return user;
        } else {
            return null;
        }
    }

    /**
     * Checks if user with provided email already exists in the DB
     * @param email
     * @return
     */
    public static AppUser existsInDB(String email) {
        AppUser user = finder.where().eq("email", email.toString()).findUnique();

        if (user == null) {
            return null;
        } else {
            return user;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s", firstname, lastname);
    }

    /**
     * Saves a new user into the DB
     * @param user
     * @return
     */
    public static boolean saveNewUser(AppUser user) {
        if (user != null) {
            try {
                user.save();
                return true;
            } catch (PersistenceException e) {
                Logger.error("Failed to save user. Possible duplicate email entry.", e.getMessage());
                return false;
            }
        }
        return false;
    }

    public static AppUser getUserByEmail(String email) {
        AppUser user = finder.where().eq("email", email).findUnique();
        return user;
    }

}
