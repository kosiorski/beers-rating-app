package pl.kosiorski.model.method;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "fermentations")
public class Fermentation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Temp temp;

  @OneToOne(mappedBy = "fermentation")
  private Method method;
}
