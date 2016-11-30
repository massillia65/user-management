package geco;


/**
 * Created by Marti_000 on 30/11/2016.
 */
public class User {

    private geco.PasswordGeneration gen = new PasswordGeneration();

    public String getRandomPassword()
    {
        return(gen.getRandomPassword());
    }
}
