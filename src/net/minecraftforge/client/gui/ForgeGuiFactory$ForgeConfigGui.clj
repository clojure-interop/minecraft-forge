(ns net.minecraftforge.client.gui.ForgeGuiFactory$ForgeConfigGui
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory$ForgeConfigGui]))

(defn ->forge-config-gui
  "Constructor.

  parent-screen - `net.minecraft.client.gui.GuiScreen`"
  (^ForgeGuiFactory$ForgeConfigGui [^net.minecraft.client.gui.GuiScreen parent-screen]
    (new ForgeGuiFactory$ForgeConfigGui parent-screen)))

