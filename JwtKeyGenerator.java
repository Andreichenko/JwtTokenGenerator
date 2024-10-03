import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Base64;

public class JwtKeyGenerator {
    public static void main(String[] args) {
        // Generate a secret key
        byte[] key = Keys.secretKeyFor(SignatureAlgorithm.HS512).getEncoded();

        // Convert to a string using Base64 for storage in a file
        String base64Key = Base64.getEncoder().encodeToString(key);

        // We display the result
        System.out.println("Generated key: " + base64Key);
    }
}
