package fhb.app.login

import org.springframework.stereotype.Component

@Component
class LoginService {
    static final AUTHENTICATED = true
    static final NOT_AUTHENTICATED = false

    Boolean login(String username, String password) {
        if (username == 'hans' && password == 'wurst') {
            AUTHENTICATED
        } else {
            NOT_AUTHENTICATED
        }
    }
}