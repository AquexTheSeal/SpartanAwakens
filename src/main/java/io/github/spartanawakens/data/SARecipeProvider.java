package io.github.spartanawakens.data;

import com.oblivioussp.spartanweaponry.api.data.RecipeProviderHelper;
import com.oblivioussp.spartanweaponry.init.ModItems;
import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.CAItems;
import io.github.chaosawakens.common.registry.CATags;
import io.github.chaosawakens.data.CARecipeProvider;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import java.util.function.Consumer;

public class SARecipeProvider extends RecipeProvider {

    public SARecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return SpartanAwakens.MODNAME + ": Recipes";
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        //RecipeProviderHelper.recipeDagger(consumer, ModItems.handle, , SAItems.daggers.amethyst, "has_amethyst_dagger");
    }
}
