(ns net.minecraftforge.fml.client.FMLConfigGuiFactory$FMLConfigGuiScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client FMLConfigGuiFactory$FMLConfigGuiScreen]))

(defn ->fml-config-gui-screen
  "Constructor.

  parent - `net.minecraft.client.gui.GuiScreen`"
  (^FMLConfigGuiFactory$FMLConfigGuiScreen [^net.minecraft.client.gui.GuiScreen parent]
    (new FMLConfigGuiFactory$FMLConfigGuiScreen parent)))

