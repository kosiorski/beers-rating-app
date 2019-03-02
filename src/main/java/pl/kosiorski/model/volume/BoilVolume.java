package pl.kosiorski.model.volume;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class BoilVolume {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer value;
  private String unit;

  @OneToOne(mappedBy = "boilVolume")
  private Volume volume;

  public BoilVolume() {}
}
