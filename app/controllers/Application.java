package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result register() {
        return ok(register.render());
    }

    public static Result calendar() {
        return ok(calendar.render("毎日歩いて会社に行く"));
    }

    public static Result dashboard() {
        return ok(dashboard.render());
    }

    public static Result setting() {
        return ok(setting.render());
    }
}
