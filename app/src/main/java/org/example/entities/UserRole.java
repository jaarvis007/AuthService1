package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.lang.annotation.Repeatable;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")

public class UserRole {

    @Id
    @Column(name="role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;
    private String name;ty
}
