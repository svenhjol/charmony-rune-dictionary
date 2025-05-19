package svenhjol.charmony.rune_dictionary.common;

import net.fabricmc.api.ModInitializer;
import svenhjol.charmony.api.core.Side;
import svenhjol.charmony.rune_dictionary.RuneDictionaryMod;
import svenhjol.charmony.rune_dictionary.common.features.rune_dictionary.RuneDictionary;

public final class CommonInitializer implements ModInitializer {
    @Override
    public void onInitialize() {
        // Ensure charmony is launched first.
        svenhjol.charmony.core.common.CommonInitializer.init();

        // Prepare and run the mod.
        var mod = RuneDictionaryMod.instance();
        mod.addSidedFeature(RuneDictionary.class);
        mod.run(Side.Common);
    }
}
