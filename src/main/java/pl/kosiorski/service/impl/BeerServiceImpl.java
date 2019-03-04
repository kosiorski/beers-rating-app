package pl.kosiorski.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kosiorski.model.beer.Beer;
import pl.kosiorski.repository.BeerRepository;
import pl.kosiorski.service.BeerService;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

  private final BeerRepository beerRepository;

  @Autowired
  public BeerServiceImpl(BeerRepository beerRepository) {
    this.beerRepository = beerRepository;
  }

  @Override
  public Beer save(Beer beer) {
    return beerRepository.save(beer);
  }

  @Override
  public Beer rateBeer(Long beerId, double value) {
    // TODO optional
    Beer byId = beerRepository.findById(beerId).get();
    byId.setRating(value);
    return beerRepository.save(byId);
  }

  @Override
  public Beer getBeerById(Long id) {
    // TODO oprional
    return beerRepository.findById(id).get();
  }

  @Override
  public Iterable<Beer> save(List<Beer> beers) {
    return beerRepository.saveAll(beers);
  }

  @Override
  public Iterable<Beer> list() {
    return beerRepository.findAll();
  }
}
