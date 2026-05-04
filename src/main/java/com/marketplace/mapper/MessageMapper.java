package com.marketplace.mapper;

import com.marketplace.domain.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MessageMapper {

    Message findById(Long messageId);

    List<Message> getConversation(
            @Param("user1") Long user1,
            @Param("user2") Long user2
    );

    List<Message> getUnreadMessages(Long receiverId);

    void markAsRead(Long messageId);

    void insert(Message message);

    void delete(Long messageId);
}