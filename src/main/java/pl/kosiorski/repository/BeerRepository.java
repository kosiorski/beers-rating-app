package pl.kosiorski.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kosiorski.model.beer.Beer;

@Repository
public interface BeerRepository extends CrudRepository<Beer, Long> {}
