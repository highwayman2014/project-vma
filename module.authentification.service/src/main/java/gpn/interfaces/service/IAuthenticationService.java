package gpn.interfaces.service;

import gpn.exception.ApplicationException;
import gpn.exception.UserNotFoundException;

import javax.naming.NamingException;
import java.util.Map;

/**Сервис аутентификации пользователей*/
public interface IAuthenticationService {

    /**Получить аутентификационный токен для пользователя
     * @param userName*/
    String getAuthToken(Map<String, String> userName) throws UserNotFoundException, NamingException, ApplicationException;
}
