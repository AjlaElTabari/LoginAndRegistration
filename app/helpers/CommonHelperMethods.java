package helpers;

import models.AppUser;
import play.mvc.Result;

import java.util.regex.Pattern;
import static play.mvc.Controller.flash;
import static play.mvc.Results.ok;
import play.data.Form;

import views.html.*;

/**
 * Created by ajla.eltabari on 26/11/15.
 */
public class CommonHelperMethods {

    public static Result validateUser(String pass1, String pass2, String name, String lastname, String email, Form<AppUser> boundForm) {
        if (!pass1.equals(pass2)) {
            flash("error", "Passwords don't match!");
            return ok(views.html.user.register.render(boundForm));

        } else if (pass1.length() < Constants.MIN_PASSWORD_LENGTH || pass2.length() < Constants.MIN_PASSWORD_LENGTH) {
            flash("error", "Password must be at least 6 characters long!");
            return ok(views.html.user.register.render(boundForm));

        } else if ((!name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*")) || (!lastname.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*"))) {
            flash("error", "Name and last name must contain letters only!");
            return ok(views.html.user.register.render(boundForm));

        } else if (name.length() < Constants.MIN_NAME_LENGTH || lastname.length() < Constants.MIN_NAME_LENGTH) {
            flash("error", "Name and last name must be at least 2 letters long!");
            return ok(views.html.user.register.render(boundForm));

        } else if (!validateEmail(email)) {
            flash("error", "Email is wrong!");
            return ok(views.html.user.register.render(boundForm));

        }
        return null;
    }

    public static boolean validateEmail(String email) {
        final Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");
        if (!pattern.matcher(email).matches()) {
            return false;
        }
        return true;
    }
}
