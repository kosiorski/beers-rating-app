package pl.kosiorski.model;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.enums.Status;
import pl.kosiorski.model.ingredient.Ingredient;
import pl.kosiorski.model.method.Method;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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

  @OneToOne
  @JoinColumn(name = "volume_id")
  private Volume volume;
//
//  @OneToOne
//  @JoinColumn(name = "boil_volume_id")
//  private BoilVolume boilVolume;

//  @OneToOne
//  @JoinColumn(name = "method_id")
//  private Method method;

  private String brewersTips;
  private String contributedBy;
  private String yeast;

//  @OneToMany(mappedBy = "beer")
//  private List<Ingredient> ingredients;

//  @ElementCollection
//  @CollectionTable(name = "foodPairings", joinColumns = @JoinColumn(name = "beer_id"))
//  @Column(name = "foodPairing")
//  private List<String> foodPairing;

  private double rating;

  private int drinking;

  private int notDrinking;

  private Status status;
}
