package com.light.yardsale.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.entity.PostComment;

@Component
public interface PostCommentRepository extends JpaRepository<PostComment, Long>{

}
