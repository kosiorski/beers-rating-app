package pl.kosiorski.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class Volume {

  @Column(name = "volume_value")
  private Integer value;

  @Column(name = "volume_unit")
  private String unit;

  public Volume() {}
}
