package nl.junglejim.whiskyapp.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authority extends AbstractEntity {

	private static final long serialVersionUID = -2516625989790572075L;

	@Column(length=64, unique = true, nullable = false)
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}