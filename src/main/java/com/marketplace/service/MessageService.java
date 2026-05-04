package com.marketplace.service;

import com.marketplace.domain.Message;
import com.marketplace.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageMapper messageMapper;

    public List<Message> getConversation(Long user1, Long user2) {
        return messageMapper.getConversation(user1, user2);
    }

    public List<Message> getUnread(Long userId) {
        return messageMapper.getUnreadMessages(userId);
    }

    public void send(Message message) {
        messageMapper.insert(message);
    }

    public void markRead(Long messageId) {
        messageMapper.markAsRead(messageId);
    }
}