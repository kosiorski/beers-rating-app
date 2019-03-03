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

  private String first_brewed;

  @Column(length = 2000)
  private String description;

  private String image_url;

  private Double abv;
  private Double ibu;

  // TODO how to map this?
  private Double target_fg;
  private Double target_og;

  private Double ebc;
  private Double srm;
  private Double ph;
  private Double attenuation_level;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "volume_id")
  private Volume volume;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "boilVolume_id")
  private BoilVolume boil_volume;

  //  @Embedded private Method method;

  @Column(length = 2000)
  private String brewers_tips;

  private String contributed_by;
  private String yeast;

  //  private List<Ingredient> ingredients;

  //  private List<String> foodPairing;

  private double rating;

  private int drinking;

  private int notDrinking;

  private Status status;

  public Beer() {}
}
