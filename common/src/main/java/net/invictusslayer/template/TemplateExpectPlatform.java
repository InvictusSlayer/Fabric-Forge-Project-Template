package net.invictusslayer.template;

import dev.architectury.injectables.annotations.ExpectPlatform;

import java.nio.file.Path;

public class TemplateExpectPlatform {
    @ExpectPlatform
    public static Path getConfigDirectory() {
        throw new AssertionError();
    }
}
