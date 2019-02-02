package pl.kosiorski.model.method;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "methods")
public class Method {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "method")
  private List<MashTemp> mashTemp;

  @OneToOne
  @JoinColumn(name = "fermentation_id")
  private Fermentation fermentation;

  private boolean twist;
}
