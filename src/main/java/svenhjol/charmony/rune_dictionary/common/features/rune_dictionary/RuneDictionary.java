package svenhjol.charmony.rune_dictionary.common.features.rune_dictionary;

import svenhjol.charmony.core.annotations.FeatureDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.base.SidedFeature;
import svenhjol.charmony.core.enums.Side;

@SuppressWarnings("unused")
@FeatureDefinition(side = Side.Common, description = """
    Lets mods define rune words and stores player knowledge of words.
    If this is disabled, mods that register and read the player's
    knowledge of runes will not function.""")
public final class RuneDictionary extends SidedFeature {
    public final Handlers handlers;
    public final Registers registers;
    public final Providers providers;
    public final Networking networking;

    public RuneDictionary(Mod mod) {
        super(mod);
        handlers = new Handlers(this);
        registers = new Registers(this);
        providers = new Providers(this);
        networking = new Networking(this);
    }

    /**
     * For other mods to get the instance of this feature.
     * @return RuneDictionary instance.
     */
    public static RuneDictionary feature() {
        return Mod.getSidedFeature(RuneDictionary.class);
    }
}