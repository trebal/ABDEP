package Problem12;

public abstract class NutritionFactsBuilder {

    public int servingSize = -1;
    public int servings = -1;
    public int calories = -1;
    public int fat = -1;
    public int sodium = -1;
    public int carbohydrate = -1;

    public NutritionFactsBuilder(int servingSize, int servings,
                                 int calories, int fat,
                                 int sodium, int carbohydrate) {
        this.setServingSize(servingSize);
        this.setServings(servings);
        this.setCalories(calories);
        this.setFat(fat);
        this.setSodium(sodium);
        this.setCarbohydrate(carbohydrate);
    }


    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public abstract NutritionFacts build() throws BuilderException;
}
