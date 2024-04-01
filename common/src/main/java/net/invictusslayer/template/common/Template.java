package net.invictusslayer.template.common;

import net.invictusslayer.template.TemplatePlatform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Template {
	public static final String MOD_ID = "template";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void init() {
		LOGGER.info(TemplatePlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
	}
}
