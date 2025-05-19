package svenhjol.charmony.rune_dictionary.client;

import net.fabricmc.api.ClientModInitializer;
import svenhjol.charmony.api.core.Side;
import svenhjol.charmony.rune_dictionary.RuneDictionaryMod;
import svenhjol.charmony.rune_dictionary.client.features.RuneDictionary;

public final class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Ensure charmony is launched first.
        svenhjol.charmony.core.client.ClientInitializer.init();

        // Prepare and run the mod.
        var mod = RuneDictionaryMod.instance();
        mod.addSidedFeature(RuneDictionary.class);
        mod.run(Side.Client);
    }
}
