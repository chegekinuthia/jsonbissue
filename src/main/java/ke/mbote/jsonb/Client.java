package ke.mbote.jsonb;

import javax.inject.Inject;
import javax.inject.Named;
import javax.json.bind.Jsonb;

/**
 *
 * @author chege
 */
@Named
public class Client {

    @Inject
    private Jsonb jsonb;

    public Book getBook() {
        String book = "{\"id\":\"20\",\"published\":\"true\"}";
        return jsonb.fromJson(book, Book.class);

    }

}
