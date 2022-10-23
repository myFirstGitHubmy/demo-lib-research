package example;

import com.domain.Object;
import com.domain.User;
import com.example.CollectorsImpl;
import com.example.service.CollectorsService;
import com.utils.GenerateUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CollectorsTest {
    private final List<User> users = GenerateUtil.initUsers(15);

    @Test
    public void groupingTest() {

    }

    @Test
    public void joiningTest() {
        CollectorsService collections = new CollectorsImpl(users);
        String result = users.stream()
                .map(Object::getName)
                .collect(java.util.stream.Collectors.joining(", "));
        Assertions.assertNotNull(collections);
        Assertions.assertEquals(collections.joining(), result);
    }

    @Test
    public void joiningFailTest() {
        CollectorsService collections = new CollectorsImpl(null);
        Assertions.assertThrows(NullPointerException.class, collections::joining);
    }
}
