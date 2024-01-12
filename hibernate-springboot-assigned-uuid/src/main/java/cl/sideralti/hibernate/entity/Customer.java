package cl.sideralti.hibernate.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "CUSTOMERS")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@Column(columnDefinition = "BINARY(16)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int age;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phono;
    private String genre;


    public Customer() {
    }

    public Customer(Integer id, int age, String firstName, String lastName, String address, String email, String phono, String genre) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phono = phono;
        this.genre = genre;
    }


    public Customer(int age, String firstName, String lastName, String address, String email, String phono, String genre) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phono = phono;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhono() {
        return phono;
    }

    public void setPhono(String phono) {
        this.phono = phono;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phono='" + phono + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
