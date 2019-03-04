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

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "method_id")
  private Long id;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "method")
  //  @JoinTable(
  //      name = "mash_temps",
  //      joinColumns = @JoinColumn(name = "method_id"),
  //      inverseJoinColumns = @JoinColumn(name = "mash_temp_id"))
  private List<MashTemp> mash_temp;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fermentation_id")
  private Fermentation fermentation;

  private String twist;

  @OneToOne(mappedBy = "method")
  private Beer beer;

  public Method() {}
}
