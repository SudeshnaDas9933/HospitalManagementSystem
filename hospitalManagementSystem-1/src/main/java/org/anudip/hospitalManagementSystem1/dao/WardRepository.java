package org.anudip.hospitalManagementSystem1.dao;
import java.util.List;

import org.anudip.hospitalManagementSystem1.bean.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WardRepository extends JpaRepository<Ward, String> {
	@Query("select count(wardId) from Ward")
	public int getWardCount();

	@Query("select wardId from Ward")
	public List<String> getAllWardIds();
}

