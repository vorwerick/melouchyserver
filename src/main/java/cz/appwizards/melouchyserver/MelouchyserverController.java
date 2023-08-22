package cz.appwizards.melouchyserver;

import io.micronaut.http.annotation.*;

@Controller("/melouchyserver")
public class MelouchyserverController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}