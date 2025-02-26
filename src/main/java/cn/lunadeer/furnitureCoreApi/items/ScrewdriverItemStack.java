package cn.lunadeer.furnitureCoreApi.items;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public class ScrewdriverItemStack extends ItemStack {
    private static final NamespacedKey pdcKey = new NamespacedKey("furniture_core", "tools/screwdriver");

    public static Component displayName = Component.text("Screwdriver");
    public static List<Component> lore = List.of(
            Component.text("Left click to break furniture."),
            Component.text("Right click to rotate furniture.")
    );

    /**
     * Construct a Screwdriver item.
     */
    public ScrewdriverItemStack() {
        super(Material.STICK);
        setItemMeta();
    }

    /**
     * Construct a Screwdriver item with specific amount.
     *
     * @param amount The amount of the item.
     */
    public ScrewdriverItemStack(int amount) {
        super(Material.STICK, amount);
        setItemMeta();
    }

    /**
     * Construct a Screwdriver item from a stick item.
     *
     * @param item The stick item.
     * @throws IllegalArgumentException If the item is not a stick or not a Screwdriver item.
     */
    public ScrewdriverItemStack(ItemStack item) throws IllegalArgumentException {
        super(Material.STICK, item.getAmount());
        if (item.getType() != Material.STICK) {
            throw new IllegalArgumentException("Not a stick.");
        }
        if (item.getItemMeta() == null) {
            throw new IllegalArgumentException("Item meta not found.");
        }
        if (!item.getItemMeta().getPersistentDataContainer().has(pdcKey)) {
            throw new IllegalArgumentException("Not a Screwdriver item.");
        }
        setItemMeta();
    }

    private void setItemMeta() {
        ItemMeta meta = getItemMeta();
        meta.displayName(displayName);
        meta.getPersistentDataContainer().set(pdcKey, PersistentDataType.INTEGER, 1);
        meta.setItemModel(pdcKey);
        meta.lore(lore);
        setItemMeta(meta);
    }

    /**
     * Get the recipe of Screwdriver.
     *
     * @return The recipe of Screwdriver.
     */
    public static ShapelessRecipe getRecipe() {
        ShapelessRecipe recipe = new ShapelessRecipe(pdcKey, new ScrewdriverItemStack());
        recipe.addIngredient(Material.STICK);
        recipe.addIngredient(Material.IRON_BARS);
        return recipe;
    }

}
