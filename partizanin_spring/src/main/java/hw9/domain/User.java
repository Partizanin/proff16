package hw9.domain;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 15.07.2014
 * Time: 13:59
 * To change this template use File|Setting|File Templates.
 */
@Entity
@Table(name = "Users")
public class User {


    @SequenceGenerator(name = "sequence", sequenceName = "seq_user_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_login")
    private String login;
    @Column(name = "user_id")
    private String password;

    private Map<Product, Integer> basket = new HashMap<Product, Integer>();

    public User() {

    }

    public User(String login, String password) {
        this.password = password;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Map<Product, Integer> getBasket() {
        return basket;
    }

    public void setBasket(Map<Product, Integer> basket) {
        this.basket = basket;
    }
}
