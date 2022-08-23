package ke.mbote.jsonb;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

//@Copy Chege Kinuthia
/**
 *
 * @author chege
 */
@ApplicationScoped
public class Config {

    @Produces
    @ApplicationScoped
    public Jsonb getJsonb() {
        return JsonbBuilder.create();
    }

}
