import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/html");
            config.addStaticFiles("/html/css");
            config.addStaticFiles("src/main/resources/html", Location.EXTERNAL);
            config.addStaticFiles("src/main/resources/html/css", Location.EXTERNAL);
        }).start(7000);

        //app.get("/", ctx -> ctx.result("Hello World"));
    }
}
