package hw9.domain;

import javax.persistence.*;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 21.07.2014
 * Time: 16:18
 * To change this template use File|Setting|File Templates.
 */
@Entity
@Table(name = "User_Products")
public class User_Products {


    private static final User_Products INSTANCE = new User_Products();
    @SequenceGenerator(name = "sequence", sequenceName = "User_Products_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")

    @Id
    @Column(name = "User_Products_Id")
    private Long id;
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "number")
    private int number;

    public User_Products() {

    }

    public static synchronized User_Products getInstance() {

        return INSTANCE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
