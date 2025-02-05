package com.ordana.spelunkery.reg;

import com.ordana.spelunkery.Spelunkery;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import org.jetbrains.annotations.NotNull;

public class ModSoundEvents {
    public static void init() {
    }

    public static RegSupplier<SoundEvent> PORTAL_FLUID_AMBIENT = registerSoundEvent("portal_fluid_ambient");
    public static RegSupplier<SoundEvent> PORTAL_FLUID_SUBMERGE = registerSoundEvent("portal_fluid_submerge");
    public static RegSupplier<SoundEvent> PORTAL_FLUID_TELEPORT = registerSoundEvent("portal_fluid_teleport");
    public static RegSupplier<SoundEvent> PORTAL_FLUID_BUCKET_EMPTY = registerSoundEvent("portal_fluid_bucket_empty");
    public static RegSupplier<SoundEvent> PORTAL_FLUID_BUCKET_FILL = registerSoundEvent("portal_fluid_bucket_fill");
    public static RegSupplier<SoundEvent> PORTAL_FLUID_BOTTLE_EMPTY = registerSoundEvent("portal_fluid_bottle_empty");
    public static RegSupplier<SoundEvent> PORTAL_FLUID_BOTTLE_FILL = registerSoundEvent("portal_fluid_bottle_fill");
    public static RegSupplier<SoundEvent> BOAT_PADDLE_PORTAL_FLUID = registerSoundEvent("boat_paddle_portal_fluid");
    public static RegSupplier<SoundEvent> BONK = registerSoundEvent("bonk");
    public static RegSupplier<SoundEvent> KNOB = registerSoundEvent("knob");
    public static RegSupplier<SoundEvent> SPRING_WATER_AMBIENT = registerSoundEvent("spring_water_ambient");
    public static RegSupplier<SoundEvent> SPRING_WATER_POP = registerSoundEvent("spring_water_pop");
    public static RegSupplier<SoundEvent> JANGLE = registerSoundEvent("jangle");


    @NotNull
    private static RegSupplier<SoundEvent> registerSoundEvent(@NotNull String name) {
        ResourceLocation id = Spelunkery.res(name);
        return RegHelper.registerSound(id);
    }
}
