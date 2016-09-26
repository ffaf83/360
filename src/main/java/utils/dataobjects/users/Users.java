package utils.dataobjects.users;

import utils.dataobjects.User;
import utils.helpers.DataProvider;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class Users {

    public static User getUnique() {
        String uniqueEmail = DataProvider.generateEmail();

        return new User()
                .withEmail(uniqueEmail)
                .withPassword(DataProvider.generatePassword(uniqueEmail));
    }
}
