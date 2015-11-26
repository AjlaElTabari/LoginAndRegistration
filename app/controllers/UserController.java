package controllers;

import helpers.CommonHelperMethods;
import helpers.SessionAndCookies;
import models.AppUser;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;

import views.html.*;
import views.html.user.register;

/**
 * Created by ajla.eltabari on 26/11/15.
 */
public class UserController extends Controller {

    private static final Form<AppUser> userForm = Form.form(AppUser.class);

    public Result registerUser() {
        return ok(register.render(userForm));
    }

    public Result saveUser() {
        Form<AppUser> boundForm = userForm.bindFromRequest();

        String pass1 = boundForm.field("password").value();
        String pass2 = boundForm.field("passwordretype").value();
        String name = boundForm.field("firstname").value();
        String lastname = boundForm.field("lastname").value();
        String email = boundForm.field("email").value();

        Result r = CommonHelperMethods.validateUser(pass1, pass2, name, lastname, email, boundForm);
        if (r != null) {
            return r;
        }

        AppUser user = boundForm.get();

        if (AppUser.saveNewUser(user)) {

            flash("registration-msg", "Thank you for joining us.");
            return ok(register.render(userForm));
        } else {
            flash("error", "Email already exists in our database, please try again!");
            return ok(register.render(boundForm));
        }
    }

    public Result login() {
        Form<AppUser> boundForm = userForm.bindFromRequest();
        String email = boundForm.field("email").value();
        String password = boundForm.field("password").value();

        AppUser user = AppUser.authenticate(email, password);

        if (user == null) {
            flash("login-error", "Incorrect email or password! Try again.");
            return badRequest(register.render(userForm));
        } else {
            SessionAndCookies.setUserSessionSata(user);
            SessionAndCookies.setCookies(user);
            return ok(loggedin.render());
        }
    }


}
