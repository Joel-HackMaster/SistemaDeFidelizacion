/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jwsb1
 */
public class BcryptUtil {
        // Genera un hash bcrypt de una contraseña
    public static String hashPassword(String password) {
        String salt = BCrypt.gensalt(12); // El "coste" 12 es un valor razonable de seguridad
        return BCrypt.hashpw(password, salt);
    }

    // Verifica una contraseña en texto plano contra un hash bcrypt
    public static boolean checkPassword(String password, String hashed) {
        return BCrypt.checkpw(password, hashed);
    }
}
