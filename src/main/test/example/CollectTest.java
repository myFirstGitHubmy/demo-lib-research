package example;


import com.domain.User;
import com.utils.GenerateUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CollectTest {

    @Test
    public void collectTest() {
        List<User> users = GenerateUtil.initUsers(15);
    }
}
