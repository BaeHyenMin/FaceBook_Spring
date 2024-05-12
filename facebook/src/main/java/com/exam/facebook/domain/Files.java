package com.exam.facebook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "file")
@Getter
@Setter
public class Files {
	
	@Id
	@Column(length = 45)
	private String fileId;
	
	@ManyToOne
	@JoinColumn(name = "board_id")
	private Board board;
}
