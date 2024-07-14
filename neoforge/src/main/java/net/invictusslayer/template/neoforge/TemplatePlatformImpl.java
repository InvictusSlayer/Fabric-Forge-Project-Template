package net.invictusslayer.template.neoforge;

import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class TemplatePlatformImpl {
	public static Path getConfigDirectory() {
		return FMLPaths.CONFIGDIR.get();
	}
}
