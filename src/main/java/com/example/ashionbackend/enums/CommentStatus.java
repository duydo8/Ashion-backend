package com.example.ashionbackend.enums;

public enum CommentStatus {
	DELETE(-1),
	PENDING(1),
	ACTIVE(0),
	UPDATED(2),
	UPDATED_ACTIVE(3);
	private int value;

	private CommentStatus(int value) {
		this.value = value;
	}
}
