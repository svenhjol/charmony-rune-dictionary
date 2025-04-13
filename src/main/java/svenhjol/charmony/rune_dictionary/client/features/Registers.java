package svenhjol.charmony.rune_dictionary.client.features;

import svenhjol.charmony.core.base.Setup;
import svenhjol.charmony.core.client.ClientRegistry;
import svenhjol.charmony.rune_dictionary.common.features.rune_dictionary.Networking;

public class Registers extends Setup<RuneDictionary> {
    public Registers(RuneDictionary feature) {
        super(feature);

        var registry = ClientRegistry.forFeature(feature);

        registry.packetReceiver(Networking.S2CDictionary.TYPE,
            () -> feature.handlers::handleDictionary);
        registry.packetReceiver(Networking.S2CKnowledge.TYPE,
            () -> feature.handlers::handleKnowledge);
    }
}
