package cn.lunadeer.furnitureCoreApi.managers;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import org.bukkit.NamespacedKey;

public abstract class ModelManager {
    protected static ModelManager instance;

    public static ModelManager getInstance() {
        return instance;
    }

    /**
     * Get model by its key
     *
     * @param key model key
     * @return model if found, null if not found
     */
    public abstract FurnitureModel getModel(NamespacedKey key);

    /**
     * Get model by callable name
     * <p>
     * e.g. "namespace:path/name"
     *
     * @param modelName model name
     * @return model if found, null if not found
     */
    public abstract FurnitureModel getModel(String modelName);

    /**
     * Register a model and its recipe
     */
    public abstract void registerModel(FurnitureModel model);

    /**
     * Unregister a model and its recipe
     *
     * @param key model key
     */
    public abstract void unregisterModel(NamespacedKey key);

    /**
     * Unregister all models and their recipes
     */
    public abstract void unregisterAllModels();
}
