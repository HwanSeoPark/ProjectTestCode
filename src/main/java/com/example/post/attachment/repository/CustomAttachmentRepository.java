package com.example.post.attachment.repository;

import com.example.post.attachment.dto.AttachmentResponse;

import java.util.List;

public interface CustomAttachmentRepository {
    List<AttachmentResponse> findAttachmentsByPostId(long postId);

}
