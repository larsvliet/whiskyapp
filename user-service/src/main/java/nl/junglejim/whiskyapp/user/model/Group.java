package nl.junglejim.whiskyapp.user.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groups")
public class Group extends AbstractEntity {

	private static final long serialVersionUID = 2534367357455681940L;

	@Column(length = 64, unique = true, nullable = false)
	private String name;

	@Column(length = 256, nullable = true)
	private String description;

	@ManyToMany
	@JoinTable(name = "group_authorities", joinColumns = @JoinColumn(name = "groupid"), inverseJoinColumns = @JoinColumn(name = "authoritiesid"))
	private Set<Authority> authorities;

	@ManyToMany
	private Set<User> users;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Authority> getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
