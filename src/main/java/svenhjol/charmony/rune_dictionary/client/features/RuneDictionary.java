package svenhjol.charmony.rune_dictionary.client.features;

import svenhjol.charmony.core.annotations.FeatureDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.base.SidedFeature;
import svenhjol.charmony.core.enums.Side;

import java.util.function.Supplier;

@FeatureDefinition(side = Side.Client, canBeDisabledInConfig = false)
public final class RuneDictionary extends SidedFeature {
    public final Supplier<Common> common;
    public final Registers registers;
    public final Handlers handlers;

    public RuneDictionary(Mod mod) {
        super(mod);
        common = Common::new;
        registers = new Registers(this);
        handlers = new Handlers(this);
    }

    public static RuneDictionary feature() {
        return Mod.getSidedFeature(RuneDictionary.class);
    }
}
