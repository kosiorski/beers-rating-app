package pl.kosiorski.model.volume;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.Beer;
import pl.kosiorski.model.volume.BoilVolume;

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

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "boilVolume_id")
  private BoilVolume boilVolume;

  public Volume() {}
}
