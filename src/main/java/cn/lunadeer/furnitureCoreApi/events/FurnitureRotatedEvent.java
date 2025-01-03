package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import cn.lunadeer.furnitureCoreApi.models.Rotation;
import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;

public class FurnitureRotatedEvent extends CancellableEvent {

    private final Player player;
    private final ItemDisplay itemDisplay;
    private final FurnitureModel model;
    private final Location location;
    private final Rotation current;
    private final Rotation next;


    public FurnitureRotatedEvent(Player player, Location location, ItemDisplay itemDisplay, FurnitureModel model, Rotation current, Rotation next) {
        this.player = player;
        this.itemDisplay = itemDisplay;
        this.model = model;
        this.location = location;
        this.current = current;
        this.next = next;
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

    public Rotation getCurrentRotation() {
        return current;
    }

    public Rotation getNextRotation() {
        return next;
    }

}
