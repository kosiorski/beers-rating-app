package pl.kosiorski.model.ingredient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {

  private String name;
  private double amountValue;
  private String amountUnit;

  //  private String add;
  private String attribute;

  //  @ManyToOne
  //  @JoinColumn(name = "beer_id")
  //  private Beer beer;
}
