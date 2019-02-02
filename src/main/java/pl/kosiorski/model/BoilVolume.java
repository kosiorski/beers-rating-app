package pl.kosiorski.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "boil_volumes")
public class BoilVolume {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "boil_volume_id")
  private Long id;

  private Integer value;
  private String unit;
}
