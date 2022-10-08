package com.mouadspring.Models;
import com.mouadspring.sec.entities.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "CNEofStudent")
    private String CNEofStudent;
    @Column(name = "ContactStudent")
    private String ContactStudent;
    @OneToOne(fetch = FetchType.EAGER)
    private AppUser user;
}

