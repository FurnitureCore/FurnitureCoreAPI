package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;

public class FurnitureBrokenEvent extends CancellableEvent{

    private final Player player;
    private final ItemDisplay itemDisplay;
    private final FurnitureModel model;
    private final Location location;

    public FurnitureBrokenEvent(Player player, Location location, ItemDisplay itemDisplay, FurnitureModel model) {
        this.player = player;
        this.itemDisplay = itemDisplay;
        this.model = model;
        this.location = location;
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

    public Location getLocation() {
        return location.clone();
    }

}
