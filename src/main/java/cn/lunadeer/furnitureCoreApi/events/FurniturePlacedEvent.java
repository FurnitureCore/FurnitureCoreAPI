package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;

public class FurniturePlacedEvent extends CancellableEvent{

    private final Player player;
    private final BlockFace blockFace;
    private final FurnitureModel model;
    private final Location location;

    public FurniturePlacedEvent(Player player, Location location, BlockFace blockFace, FurnitureModel model) {
        this.player = player;
        this.blockFace = blockFace;
        this.model = model;
        this.location = location;
    }

    public Player getPlayer() {
        return player;
    }

    public BlockFace getBlockFace() {
        return blockFace;
    }

    public FurnitureModel getModel() {
        return model;
    }

    public Location getLocation() {
        return location;
    }

}
