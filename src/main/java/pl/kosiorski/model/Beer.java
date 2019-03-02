package pl.kosiorski.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.enums.Status;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "beers")
public class Beer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "beer_id")
  private Long id;

  private String name;

  private String tagline;

  private String firstBrewed;

  @Column(length = 2000)
  private String description;

  private String imageUrl;
  private Double abv;
  private Double ibu;
  private Double targetFg;
  private Double targetOg;
  private Double ebc;
  private Double srm;
  private Double ph;
  private Double attenuationLevel;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "volume_id")
  private Volume volume;

  //  @Embedded private BoilVolume boilVolume;

  //  @Embedded private Method method;

  private String brewersTips;
  private String contributedBy;
  private String yeast;

  //  private List<Ingredient> ingredients;

  //  private List<String> foodPairing;

  private double rating;

  private int drinking;

  private int notDrinking;

  private Status status;

  public Beer() {
  }
}
