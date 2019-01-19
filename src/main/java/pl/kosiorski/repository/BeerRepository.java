package pl.kosiorski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kosiorski.model.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {

}
