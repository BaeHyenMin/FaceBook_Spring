package com.exam.facebook.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Board {
	
	@Id
	@Column(length = 9)
	private String boardId;
	
	@Column(length = 3000)
	private String des;
	
	@ManyToOne
	@JoinColumn(name ="usr_id")
	private Usr usr;

	@OneToMany(mappedBy = "board")
	private List<Files> files;
	
	@OneToMany(mappedBy = "board")
	private List<Cmt> cmts;
}
