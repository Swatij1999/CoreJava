package com.xworkz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Snake {
	private String name;
	@Autowired
	@Qualifier("snakeLength")
	private double length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	private String type;
	private boolean poisonous;

	@Autowired
	public Snake(@Qualifier("snakeName") String name, @Qualifier("snakeType") String type,
			@Qualifier("snakeIsPoisonous") boolean poisonous) {
		super();
		this.name = name;
		this.type = type;
		this.poisonous = poisonous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}


}
