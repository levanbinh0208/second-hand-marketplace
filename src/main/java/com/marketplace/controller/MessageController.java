package com.marketplace.controller;

import com.marketplace.domain.Message;
import com.marketplace.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/conversation")
    public List<Message> conversation(
            @RequestParam Long user1,
            @RequestParam Long user2
    ) {
        return messageService.getConversation(user1, user2);
    }

    @GetMapping("/unread/{userId}")
    public List<Message> unread(@PathVariable Long userId) {
        return messageService.getUnread(userId);
    }

    @PostMapping
    public String send(@RequestBody Message message) {
        messageService.send(message);
        return "Message sent";
    }

    @PutMapping("/read/{id}")
    public String markRead(@PathVariable Long id) {
        messageService.markRead(id);
        return "Marked as read";
    }
}