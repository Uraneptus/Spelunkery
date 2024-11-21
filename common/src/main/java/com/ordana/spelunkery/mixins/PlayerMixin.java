package com.ordana.spelunkery.mixins;

import com.ordana.spelunkery.entities.PickOnAStickEntity;
import com.ordana.spelunkery.utils.IPickHelper;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Player.class)
public class PlayerMixin implements IPickHelper {

    @Unique
    public PickOnAStickEntity spelunkery$pickEntity;


    @Override
    public PickOnAStickEntity spelunkery$getEntity() {
        return spelunkery$pickEntity;
    }

    @Override
    public void spelunkery$setEntity(PickOnAStickEntity entity) {
         this.spelunkery$pickEntity = entity;
    }
}
