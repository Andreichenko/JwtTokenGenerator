import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtTokenGenerator {
    private static final String jwtSecret = "token";  

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))  
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }

    public static void main(String[] args) {
        String token = generateToken("user");
        System.out.println("Generated JWT Token: " + token);
    }
}
