package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import cn.lunadeer.furnitureCoreApi.models.Rotation;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class RotateFurniturePlacedEvent extends FurniturePlacedEvent {

    private final Rotation yaw;

    public RotateFurniturePlacedEvent(Player player, Location location, FurnitureModel model, Rotation yaw) {
        super(player, location, model);
        this.yaw = yaw;
    }

    public Rotation getRotateDegree() {
        return yaw;
    }

}
