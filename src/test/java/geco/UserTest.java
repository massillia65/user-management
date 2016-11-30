package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marti_000 on 30/11/2016.
 */
public class UserTest {

    private User user;

    @Test
    public void getRandomPassword() throws Exception {
        user = new User();
        String mdp = user.getRandomPassword();
        assertTrue("Génération mdp aléatoire correcte", mdp.length() == 8);
    }

}