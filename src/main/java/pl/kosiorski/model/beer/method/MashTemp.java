package pl.kosiorski.model.beer.method;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.beer.Method;


@Getter
@Setter
public class MashTemp {

  private Temp temp;

  private Integer duration;

  private Method method;
}
