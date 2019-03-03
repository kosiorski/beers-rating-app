package pl.kosiorski.model.beer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.beer.method.Fermentation;
import pl.kosiorski.model.beer.method.MashTemp;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Method {


  @OneToMany
  @JoinColumn(name="mas")
  private List<MashTemp> mash_temp;

  //  private Fermentation fermentation;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String twist;

  @OneToOne(mappedBy = "method")
  private Beer beer;

  public Method() {}
}
