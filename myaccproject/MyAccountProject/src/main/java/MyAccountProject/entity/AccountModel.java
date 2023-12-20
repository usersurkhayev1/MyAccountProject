package MyAccountProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "account_table")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, updatable = true, unique = true)
    private String username;

    @Column(nullable = false, updatable = true, unique = true, length = 10)
    private String password;

    @Column(nullable = false, updatable = false, unique = true)
    private String fin_code;

    @Column(nullable = false, updatable = true, unique = true)
    private String email;


    public String getUsername() {
        return username.toUpperCase().replace(" ", "");
    }

    public void setPassword(String password) {
        this.password = password.replace(" ", "");
    }

    public String getPassword() {
        return password.toLowerCase().replace(" ", "");
    }

    public String getFin_code() {
        return fin_code.toUpperCase().replace(" ", "");
    }

    public String getEmail() {
        return email.toLowerCase().replace(" ", "");
    }
}