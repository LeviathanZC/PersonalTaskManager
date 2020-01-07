package by.zercompany.entities;

public interface IAccount {

    boolean logIn(String login, String password);

    boolean logOut(boolean sure);

    boolean changeParams();

}
