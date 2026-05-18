public class LoginService {

    public boolean login(String username, String password) {
        if(username == null || password == null) {
            return false;
        }
        System.out.println("Login attempt: " + username);
        return username.equals("admin") && password.equals("123");
    }

    public static void main(String[] args) {
        LoginService service = new LoginService();
        boolean result = service.login("admin", "123");
        System.out.println("Login success: " + result);
    }
}
