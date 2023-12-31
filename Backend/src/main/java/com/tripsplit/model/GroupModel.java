package com.tripsplit.model;

import com.tripsplit.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupModel {
    private String grpName;
    private String grpType;
    private Long   grpBudget;
    private List<User> grpUser;
}
