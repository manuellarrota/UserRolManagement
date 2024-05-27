package com.l100n.dbpractice.UserRolManagement.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "practice_role")
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
