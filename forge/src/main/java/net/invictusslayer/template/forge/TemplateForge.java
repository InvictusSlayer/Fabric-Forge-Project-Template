package net.invictusslayer.template.forge;

import dev.architectury.platform.forge.EventBuses;
import net.invictusslayer.template.common.Template;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Template.MOD_ID)
public class TemplateForge {
	public TemplateForge() {
		EventBuses.registerModEventBus(Template.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
		Template.init();
	}
}
