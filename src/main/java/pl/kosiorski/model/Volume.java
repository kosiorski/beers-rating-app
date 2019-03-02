package pl.kosiorski.model;

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

  @Column(name = "volume_value")
  private Integer value;

  @Column(name = "volume_unit")
  private String unit;

  @OneToOne(mappedBy = "volume")
  private Beer beer;

  public Volume() {}
}
