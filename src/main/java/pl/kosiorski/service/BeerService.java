package pl.kosiorski.service;

import pl.kosiorski.model.Beer;

public interface BeerService {

  Beer save(Beer beer);

  Beer rateBeer(Long beerId, double value);

  Beer getBeerById(Long id);
}
