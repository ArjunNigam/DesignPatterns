package DesignPatterns.Strategy;

public class LoginFactory {

    public static LoginStrategy createLoginStrategy(String loginType) {
        if(loginType.equals("Google")){
            return new GoogleLogin();
        }
        else if(loginType.equals("Email"))
        {
            return new EmailLogin();
        }
        else if(loginType.equals("OTP"))
        {
            return new OTPLogin();
        }
        throw new IllegalArgumentException("Invalid Login Type");
    }
}
