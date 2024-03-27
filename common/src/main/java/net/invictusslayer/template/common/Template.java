package net.invictusslayer.template.common;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.invictusslayer.template.TemplatePlatform;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Template {
	public static final String MOD_ID = "template";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
	public static final RegistrySupplier<CreativeModeTab> TEMPLATE_TAB = TABS.register("template_tab", () -> CreativeTabRegistry.create(Component.translatable("creative_tab." + MOD_ID + ".template_tab"), () -> new ItemStack(Template.TEMPLATE_ITEM.get())));

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
	public static final RegistrySupplier<Item> TEMPLATE_ITEM = ITEMS.register("template_item", () -> new Item(new Item.Properties().arch$tab(Template.TEMPLATE_TAB)));

	public static void init() {
		TABS.register();
		ITEMS.register();

		LOGGER.info(TemplatePlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
	}
}
