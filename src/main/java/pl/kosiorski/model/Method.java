package pl.kosiorski.model;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.method.Fermentation;
import pl.kosiorski.model.method.MashTemp;

import java.util.List;

@Getter
@Setter
public class Method {

  private List<MashTemp> mashTemp;
  private Fermentation fermentation;

  private boolean twist;
}
