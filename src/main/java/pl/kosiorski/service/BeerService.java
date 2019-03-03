package pl.kosiorski.service;

import pl.kosiorski.model.beer.Beer;

import java.util.List;

public interface BeerService {

  Beer save(Beer beer);

  Beer rateBeer(Long beerId, double value);

  Beer getBeerById(Long id);

  Iterable<Beer> save(List<Beer> beers);

  Iterable<Beer> list();
}
