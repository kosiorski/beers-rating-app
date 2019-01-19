package pl.kosiorski.model;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.enums.Flag;
import pl.kosiorski.model.enums.Status;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "beers")
public class Beer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(length = 2000)
  private String description;

  private double rating;

  private int drinking;

  private int notDrinking;

  private Status status;
}
