public class LoginService {

    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("123");
    }

    public static void main(String[] args) {
        LoginService service = new LoginService();
        boolean result = service.login("admin", "123");
        System.out.println("Login success: " + result);
    }
}
