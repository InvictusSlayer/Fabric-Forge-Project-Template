package net.invictusslayer.template.fabric;

import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class TemplatePlatformImpl {
	public static Path getConfigDirectory() {
		return FabricLoader.getInstance().getConfigDir();
	}
}
