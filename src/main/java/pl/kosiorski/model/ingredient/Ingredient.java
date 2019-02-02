package pl.kosiorski.model.ingredient;

import lombok.Getter;
import lombok.Setter;
import pl.kosiorski.model.Beer;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Ingredient {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private double amountValue;
  private String amountUnit;

//  private String add;
  private String attribute;

//  @ManyToOne
//  @JoinColumn(name = "beer_id")
//  private Beer beer;
}
