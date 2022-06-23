package com.neoleap.neoleapers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String username;

    private String email;

    private String first_name;

    private String last_name;

    private String password;

    private Date birthday;

    private String gender;

    //FK
    @ManyToOne(optional = false)
    private Country country;

    private String city;

    private String avatar;

    //FK
    @ManyToOne(optional = false)
    private Job job;

    //FK
    @ManyToOne(optional = false)
    private Department depatment;

    private String phone_number;

    //FK
    private long manager;

    private int status;

    //FK
    @ManyToOne(optional = false)
    private Role role;

    private int fa2_enabled;

    private String fa2_key;

    private String password_reset_token;

    private String activation_code;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<SessionLog> sessionLog;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<SessionToken> sessionToken;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;


}
