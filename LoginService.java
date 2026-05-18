public class LoginService {

    public boolean login(String username, String password) {
        if(username == null || password == null) {
            System.out.println("Invalid input");
            return false;
        }
        System.out.println("Login attempt: " + username);
        return username.equals("admin") && password.equals("123");
    }

    public void logout(String username) {
        System.out.println(username + "logged out.");
    }

    public static void main(String[] args) {
        LoginService service = new LoginService();
        boolean result = service.login("admin", "123");
        System.out.println("Login success: " + result);
    }
}
