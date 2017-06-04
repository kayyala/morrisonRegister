import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by Sudhakar on 04/06/2017.
 */
public class RandomEmail {
    public String randomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String emaill = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        emaill = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return emaill;
}
    }