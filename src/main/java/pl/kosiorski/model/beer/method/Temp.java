package pl.kosiorski.model.beer.method;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Temp {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private double value;
  private String unit;

  @OneToOne(mappedBy = "temp")
  private MashTemp mash_temp;

  public Temp() {}
}
