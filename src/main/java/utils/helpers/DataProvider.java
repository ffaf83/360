package utils.helpers;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public final class DataProvider {

    private static final String EMAIL_DOMAIN = "mailinator.com";
    private static final AtomicLong uniqueTimeStamp = new AtomicLong(System.currentTimeMillis());

    public static String generatePassword(String phrase) {
        try {
            return (new BigInteger(1, (MessageDigest.getInstance("MD5")
                    .digest(phrase.getBytes("UTF-8"))))).toString(28).substring(3, 11);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            throw new Error(ex);
        }
    }

    public static String generateEmail() {
        return generateEmail(EMAIL_DOMAIN);
    }

    public static String generateEmail(String domain) {
        String userNameTemplate = String.valueOf(uniqueTimeStamp.getAndIncrement());

        StringBuilder sb = new StringBuilder(userNameTemplate.length());
        for (int i = 0; i < userNameTemplate.length(); i++) {
            sb.append((char) (userNameTemplate.charAt(i) - '0' + 'a'));
        }
        return String.format("%s@%s", sb.toString(), domain);
    }
}
