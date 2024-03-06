package net.invictusslayer.template.fabric;

import net.invictusslayer.template.common.Template;
import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer {
	public void onInitialize() {
		Template.init();
	}
}
