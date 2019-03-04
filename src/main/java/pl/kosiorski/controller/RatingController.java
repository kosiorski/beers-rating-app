package pl.kosiorski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.kosiorski.model.beer.Beer;
import pl.kosiorski.model.beer.enums.Flag;
import pl.kosiorski.model.beer.enums.Status;
import pl.kosiorski.service.BeerService;

@RestController
public class RatingController {

  private final BeerService beerService;

  @Autowired
  public RatingController(BeerService beerService) {
    this.beerService = beerService;
  }

  @GetMapping("/beers/{id}/{rating}")
  public Beer rateBeer(@PathVariable Long id, @PathVariable double rating) {

    if (rating < 1 && rating > 5) {
      return null;
    }

    return beerService.rateBeer(id, rating);
  }

  @GetMapping("/beers/{id}")
  public Beer addFlag(@PathVariable Long id, @RequestParam(required = false) String flag) {

    Beer beerById = beerService.getBeerById(id);

    if (flag.equalsIgnoreCase(Flag.PIJALNE.toString())) {
      beerById.setDrinking(beerById.getDrinking() + 1);

      beerService.save(beerById);
    }
    if (flag.equalsIgnoreCase(Flag.NIEPIJALNE.toString())) {
      beerById.setNotDrinking(beerById.getNotDrinking() + 1);
      //TODO do properies
      if (beerById.getNotDrinking() > 5) {
        beerById.setStatus(Status.INACTIVE);
      }

      beerService.save(beerById);
    }

    return beerById;
  }
}
