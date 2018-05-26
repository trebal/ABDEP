package Problem12;

/**
 * The <p>UnforgivingBuilder</p> does not allow to leave fields empty. It throws a <p>BuilderException</p> in such case.
 */
public class UnforgivingBuilder extends NutritionFactsBuilder {

    public UnforgivingBuilder(int servingSize, int servings,
                              int calories, int fat,
                              int sodium, int carbohydrate) {
        super(servingSize, servings, calories, fat, sodium,
                carbohydrate);
    }

    @Override
    public NutritionFacts build() throws BuilderException {
        if(servingSize < 0)
        {
            throw new BuilderException("servingSize");
        }
        if(servings < 0)
        {
            throw new BuilderException("serving");
        }
        if(calories < 0)
        {
            throw new BuilderException("calories");
        }
        if(fat < 0)
        {
            throw new BuilderException("fat");
        }
        if(sodium < 0)
        {
            throw new BuilderException("sodium");
        }
        if(carbohydrate < 0)
        {
            throw new BuilderException("carbohydrate");
        }

        return new NutritionFacts(servingSize,servings,calories,
                fat, sodium,carbohydrate);
    }
}
