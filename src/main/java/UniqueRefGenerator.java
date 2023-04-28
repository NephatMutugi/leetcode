import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Author Nephat Muchiri
 * Date 27/04/2023
 */
public class UniqueRefGenerator {

    /*--------------------- Generate unique ref -------------------------*/

    public String generateUniqueRef() {
        String timestamp = new SimpleDateFormat("yymmssSSS").format(new Date()); // 9 character timestamp

        char[] characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        Random random = new SecureRandom();
        char[] result = new char[5];

        for (int i = 0; i < result.length; i++) {
            int randomCharIndex = random.nextInt(characterSet.length);
            result[i] = characterSet[randomCharIndex];
        }
        return new String(result).concat(timestamp); // 14 character length
    }
}
