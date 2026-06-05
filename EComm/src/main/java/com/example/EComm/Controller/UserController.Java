@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody User) {
        String result = getUser(User.getName, User.getpassword);
        if ("user found".equals(result)) {
            return "Login Successful";
        }
        return register(user);
    }
}
      