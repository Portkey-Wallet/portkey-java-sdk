package io.aelf.portkey.utils.log;

import io.aelf.utils.AElfException;
import org.jetbrains.annotations.NotNull;

public class SystemOutLogger implements ILogger {
    @Override
    public void e(@NotNull String msg, @NotNull AElfException exception) {
        System.out.println("error: ".concat(msg));
        exception.printStackTrace();
    }

    @Override
    public void i(@NotNull String @NotNull ... msg) {
        for (String s : msg) {
            System.out.println("info: ".concat(s));
        }
    }

    @Override
    public void w(@NotNull String @NotNull ... msg) {
        for (String s : msg) {
            System.out.println("warn: ".concat(s));
        }
    }
}