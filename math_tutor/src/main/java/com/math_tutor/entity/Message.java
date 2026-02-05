package com.math_tutor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageId;
    private LocalDateTime sentAt;
    @ManyToOne
    @JoinColumn(name = "chatId")
    private Chat chat;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
