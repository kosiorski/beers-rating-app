package pl.kosiorski.model.method;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Method {

  private List<MashTemp> mashTemp;
  private Fermentation fermentation;

  private boolean twist;
}
