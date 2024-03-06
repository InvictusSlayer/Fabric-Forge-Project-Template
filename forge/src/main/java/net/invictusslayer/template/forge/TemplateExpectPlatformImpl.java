package net.invictusslayer.template.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class TemplateExpectPlatformImpl {
	public static Path getConfigDirectory() {
		return FMLPaths.CONFIGDIR.get();
	}
}
