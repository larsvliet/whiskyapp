package nl.junglejim.whiskyapp.user.repository;

import nl.junglejim.whiskyapp.user.model.Group;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDao extends JpaRepository<Group, Long> {

	public abstract Group findByName(String name);
}