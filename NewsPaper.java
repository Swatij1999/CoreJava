package com.xworkz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NewsPaper {
	@Autowired
	@Qualifier("newsPaperId")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("newsPaperLanguage")
	private String language;
	private double price;

	@Autowired
	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("newsPaperOwnerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Autowired
	@Qualifier("newsPaperPrice")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

}
