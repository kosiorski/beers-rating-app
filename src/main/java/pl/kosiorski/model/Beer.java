package pl.kosiorski.model;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.enums.Status;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "beers")
public class Beer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  private Volume volume;
  private BoilVolume boilVolume;
  private Method method;
  private String brewersTips;
  private String contributedBy;
  private String yeast;



  private double rating;

  private int drinking;

  private int notDrinking;

  private Status status;
}
