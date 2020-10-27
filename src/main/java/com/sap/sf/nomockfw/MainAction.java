package com.sap.sf.nomockfw;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class MainAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        String command = "./gradlew.bat clean";
        try
        {
            Runtime.getRuntime().exec(command);

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
