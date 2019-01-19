package pl.kosiorski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.kosiorski.model.Beer;
import pl.kosiorski.model.enums.Status;
import pl.kosiorski.service.BeerService;

import java.util.List;

@RestController
public class BeerController {
  private final BeerService beerService;

  @Autowired
  public BeerController(BeerService beerService) {
    this.beerService = beerService;
  }

  @GetMapping("/get")
  public List<Beer> getBeer() {

    final String uri = "https://api.punkapi.com/v2/beers";

    RestTemplate restTemplate = new RestTemplate();

    ResponseEntity<List<Beer>> response =
        restTemplate.exchange(
            uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Beer>>() {});
    List<Beer> beers = response.getBody();

    assert beers != null;
    for (Beer beer : beers) {

      beer.setStatus(Status.ACTIVE);
      beer.setDrinking(0);
      beer.setNotDrinking(0);
      beerService.save(beer);
    }

    return beers;
  }
}
