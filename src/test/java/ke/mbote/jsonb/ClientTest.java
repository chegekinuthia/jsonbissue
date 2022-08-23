package ke.mbote.jsonb;

import javax.inject.Inject;
import junit.framework.TestCase;
import org.apache.openejb.testing.Classes;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author chege
 */
@Classes(cdi = true, value = {Client.class, Book.class, Config.class})
@RunWith(org.apache.openejb.junit.ApplicationComposer.class)
public class ClientTest extends TestCase {

    @Inject
    private Client client;

    @Test
    public void test() throws Exception {

        Book book = client.getBook();
        assertEquals(20, book.getId());
        assertTrue(book.isPublished());

    }
}
