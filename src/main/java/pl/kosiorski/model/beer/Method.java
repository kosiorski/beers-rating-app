package pl.kosiorski.model.beer;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.beer.method.Fermentation;
import pl.kosiorski.model.beer.method.MashTemp;

import java.util.List;

@Getter
@Setter
public class Method {

  private List<MashTemp> mashTemp;
  private Fermentation fermentation;

  private boolean twist;
}
