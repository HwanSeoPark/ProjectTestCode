package com.example.post.attachment.repository;

import com.example.post.attachment.domain.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> , CustomAttachmentRepository {

}
