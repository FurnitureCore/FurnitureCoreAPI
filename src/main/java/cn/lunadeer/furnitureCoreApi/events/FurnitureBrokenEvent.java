package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;

public class FurnitureBrokenEvent extends CancellableEvent{

    private final Player player;
    private final ItemDisplay itemDisplay;
    private final FurnitureModel model;

    public FurnitureBrokenEvent(Player player, ItemDisplay itemDisplay, FurnitureModel model) {
        this.player = player;
        this.itemDisplay = itemDisplay;
        this.model = model;
    }

    public Player getPlayer() {
        return player;
    }

    public ItemDisplay getItemDisplay() {
        return itemDisplay;
    }

    public FurnitureModel getModel() {
        return model;
    }

}
