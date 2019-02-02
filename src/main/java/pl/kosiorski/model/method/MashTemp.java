package pl.kosiorski.model.method;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "mash_temps")
public class MashTemp {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  @JoinColumn(name = "temp_id")
  private Temp temp;

  private Integer duration;

  @ManyToOne
  @JoinColumn(name = "method_id")
  private Method method;
}
