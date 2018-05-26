package Problem12;

/**
 * The <p>ForgivingBuilder</p> allows to leave fields empty. It throws a <p>BuilderException</p> in such case.
 */
public class ForgivingBuilder extends NutritionFactsBuilder {

    public ForgivingBuilder(int servingSize, int servings,
                            int calories, int fat,
                            int sodium, int carbohydrate) {
        super(servingSize, servings, calories, fat, sodium,
                carbohydrate);
    }

    @Override
    public NutritionFacts build() {
        if (servingSize < 0) {
            servingSize = 0;
        }
        if (servings < 0) {
            servings = 0;
        }
        if (calories < 0) {
            calories = 0;
        }
        if (fat < 0) {
            fat = 0;
        }
        if (sodium < 0) {
            sodium = 0;
        }
        if (carbohydrate < 0) {
            carbohydrate = 0;
        }

        return new NutritionFacts(servingSize, servings, calories,
                fat, sodium, carbohydrate);
    }
}
