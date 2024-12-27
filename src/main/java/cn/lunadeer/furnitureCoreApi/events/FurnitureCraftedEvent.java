package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.items.FurnitureItemStack;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.NotNull;

public class FurnitureCraftedEvent extends CraftItemEvent {
    private final FurnitureItemStack furnitureItemStack;

    public FurnitureCraftedEvent(@NotNull Recipe recipe, @NotNull InventoryView what, @NotNull InventoryType.SlotType type, int slot, @NotNull ClickType click, @NotNull InventoryAction action, FurnitureItemStack furnitureItemStack) {
        super(recipe, what, type, slot, click, action);
        this.furnitureItemStack = furnitureItemStack;
    }

    public FurnitureItemStack getFurnitureResult() {
        return furnitureItemStack;
    }

}
