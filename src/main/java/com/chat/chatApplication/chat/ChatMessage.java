package com.chat.chatApplication.chat;

import lombok.*;

import com.chat.chatApplication.chat.MessageType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;


}
