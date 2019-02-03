package pl.kosiorski.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "volumes")
public class Volume {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer value;
  private String unit;

  @OneToOne(mappedBy = "volume")
  private Beer beer;
}
