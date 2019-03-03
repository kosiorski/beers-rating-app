package pl.kosiorski.model.beer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Volume {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "volume_id")
  private Long id;

  private Integer value;

  private String unit;

  @OneToOne(mappedBy = "volume")
  private Beer beer;

  public Volume() {}
}
