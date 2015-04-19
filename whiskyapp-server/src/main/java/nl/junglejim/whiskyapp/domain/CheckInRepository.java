package nl.junglejim.whiskyapp.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInRepository extends PagingAndSortingRepository<CheckIn, Long> {

}
