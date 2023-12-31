package com.tripsplit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expName;

    private Long expAmt;
    private Long expPaidBy;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "exp_user",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "`exp_id`")})
    @JsonIgnore
    private List<User> usrSplitBtw;

    @ManyToOne
    @JoinColumn(name = "exp_list")
    private Group expGrp;
}
