package pl.kosiorski.model.beer.method;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.beer.Method;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class MashTemp {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mash_temp_id")
  private Long id;

//  @OneToOne
//  @JoinColumn(name = "temp_id")
//  private Temp temp;

  private Integer duration;

  @ManyToOne
  @JoinColumn(name = "method_id")
  private Method method;

  public MashTemp() {}
}
