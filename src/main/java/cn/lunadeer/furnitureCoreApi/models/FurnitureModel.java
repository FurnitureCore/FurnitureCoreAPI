package cn.lunadeer.furnitureCoreApi.models;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CraftingRecipe;

import java.util.Map;

public interface FurnitureModel {
    /**
     * Get the key of the model.
     * <p>
     * This was used to identify the model.
     */
    NamespacedKey getItemModelKey();

    /**
     * Set the display name of the model, generally used for display.
     * <p>
     * If not set in the json file, the custom name will be the name of the model file.
     *
     * @param displayName the custom name of the model
     */
    void setDisplayName(String displayName);

    /**
     * Get the display name of the model, generally used for display.
     * <p>
     * If not set in the json file, the custom name will be the name of the model file.
     */
    String getDisplayName();

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
     * Register the internal recipe of the model
     * <p>
     * Internal recipes are the recipes that made by the model author and contained in the model zip file.
     */
    void registerInternalRecipe();

    /**
     * Unregister the internal recipe of the model
     * <p>
     * Internal recipes are the recipes that made by the model author and contained in the model zip file.
     */
    void unregisterInternalRecipe();

    /**
     * Get the internal recipe of the model
     * <p>
     * Internal recipes are the recipes that made by the model author and contained in the model zip file.
     */
    Map<NamespacedKey, CraftingRecipe> getInternalRecipes();

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

    /**
     * If the model can rotate
     *
     * @return if the model can rotate
     */
    Boolean canRotate();

    /**
     * If the model can hanging
     *
     * @return if the model can hanging
     */
    Boolean canHanging();
}
