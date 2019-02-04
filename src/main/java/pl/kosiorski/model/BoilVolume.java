package pl.kosiorski.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class BoilVolume {

  private Integer value;
  private String unit;
}
