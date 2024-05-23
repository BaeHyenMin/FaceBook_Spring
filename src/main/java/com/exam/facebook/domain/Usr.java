package com.exam.facebook.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usr {
	@Id
	@Column(length = 150)
	private String memId;
	
	@Column(nullable = false, length = 255)
	private String pwd;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false, length = 11)
	private String phNum;
	
	@OneToMany(mappedBy = "usr")
	private List<Board> boards;
	
	@OneToMany(mappedBy = "usr")
	private List<Cmt> cmts;
}
