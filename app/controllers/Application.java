package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result calendar() {
        return ok(calendar.render("毎日歩いて会社に行く"));
    }

}
