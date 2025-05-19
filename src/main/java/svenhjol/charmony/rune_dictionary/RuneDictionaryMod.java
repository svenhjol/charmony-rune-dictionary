package svenhjol.charmony.rune_dictionary;

import net.minecraft.resources.ResourceLocation;
import svenhjol.charmony.api.core.ModDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.api.core.Side;

@ModDefinition(
    id = RuneDictionaryMod.ID,
    sides = {Side.Client, Side.Common},
    name = "Rune Dictionary",
    description = "Library mod to add rune words and player knowledge.")
public final class RuneDictionaryMod extends Mod {
    public static final String ID = "charmony-rune-dictionary";
    private static RuneDictionaryMod instance;

    private RuneDictionaryMod() {}

    public static RuneDictionaryMod instance() {
        if (instance == null) {
            instance = new RuneDictionaryMod();
        }
        return instance;
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}