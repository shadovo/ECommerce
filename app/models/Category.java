package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	private String name;
	private String icon;
	
	public Category(String name, String icon) {
		this.setName(name);
		this.setIcon(icon);	
	}
	
	public Category(){
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getIcon() {
		return icon;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.getName() + ", " + this.getIcon();
	}
	
	@Override
	public int hashCode() {
		return 37*id;
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof Category) {
			Category otherCategory = (Category)other;
			return otherCategory.id == this.id;
		}	
		return false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
