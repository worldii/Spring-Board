package com.example.comment.dto;

import com.example.comment.domain.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class CommentDto {
	private Long id;
	private User from;
	private String description;
	private int likes;
}
