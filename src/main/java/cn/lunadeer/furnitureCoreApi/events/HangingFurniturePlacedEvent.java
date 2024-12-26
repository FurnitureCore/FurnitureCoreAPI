package cn.lunadeer.furnitureCoreApi.events;

import cn.lunadeer.furnitureCoreApi.models.FurnitureModel;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;

public class HangingFurniturePlacedEvent extends FurniturePlacedEvent {

    private final BlockFace blockFace;

    public HangingFurniturePlacedEvent(Player player, Location location, FurnitureModel model, BlockFace blockFace) {
        super(player, location, model);
        this.blockFace = blockFace;
    }

    public BlockFace getHangingonBlockFace() {
        return blockFace;
    }

}
