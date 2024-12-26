package cn.lunadeer.furnitureCoreApi.models;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CraftingRecipe;

import java.util.Map;

public interface FurnitureModel {
    NamespacedKey getItemModelKey();

    /**
     * Set the custom name of the model, generally used for display.
     * <p>
     * If not set in the json file, the custom name will be the name of the model file.
     *
     * @param customName the custom name of the model
     */
    void setCustomName(String customName);

    /**
     * Get the custom name of the model, generally used for display.
     * <p>
     * If not set in the json file, the custom name will be the name of the model file.
     */
    String getCustomName();

    /**
     * Get the name of the model, which is the name of the json file
     */
    String getModelName();

    /**
     * Get the name of the model in the format of path/name
     *
     * @return the name of the model
     */
    String getCallableNameNoNamespace();

    /**
     * Get the name of the model in the format of namespace:path/name
     *
     * @return the name of the model
     */
    String getCallableNameWithNamespace();

    /**
     * Register the recipe of the model
     */
    void registerRecipe();

    /**
     * Unregister the recipe of the model
     */
    void unregisterRecipe();

    /**
     * Get the recipe of the model
     */
    Map<NamespacedKey, CraftingRecipe> getRecipes();

    /**
     * Get if the model is effective
     */
    Boolean isEffect();

    /**
     * Get the path of the prefix
     * <p>
     * e.g. "foo/bar" "foo/foo/bar" "foo/bar/foo"
     *
     * @return the path of the prefix
     */
    String getPrefixPath();
}
