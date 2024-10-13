package user;

public interface UserInterface extends ReadOnlyUserInterface {
    void setName(String name);
    void setUserName(String userName);
    void setEmail(String email);
}
