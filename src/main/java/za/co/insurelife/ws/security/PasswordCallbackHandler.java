package za.co.insurelife.ws.security;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PasswordCallbackHandler implements CallbackHandler {
    Map<String, String> passwordMap = new HashMap<>();

    public PasswordCallbackHandler(){
        passwordMap.put("insurelife-service-user", "insurelife-service-pass");
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback : callbacks) {
            WSPasswordCallback passwordCallBack = (WSPasswordCallback) callback;
            String username = passwordCallBack.getIdentifier();
            String password = passwordMap.get(username);
            passwordCallBack.setPassword(password);
            return;
        }
    }
}
