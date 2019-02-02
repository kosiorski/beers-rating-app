package pl.kosiorski.model.method;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "temps")
public class Temp {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "temp_id")
  private Long id;

  private double value;
  private String unit;

}
