package pl.kosiorski.model.method;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.Method;


@Getter
@Setter
public class MashTemp {

  private Temp temp;

  private Integer duration;

  private Method method;
}
