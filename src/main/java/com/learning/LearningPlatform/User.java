package com.learning.LearningPlatform;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {

    @Id
    public int id;
    public String username;
    public String password;
}
