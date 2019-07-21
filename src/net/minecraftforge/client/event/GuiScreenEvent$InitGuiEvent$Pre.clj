(ns net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent$Pre
  "This event fires just after initializing GuiScreen.mc, GuiScreen.fontRendererObj,
  GuiScreen.width, and GuiScreen.height.

  If canceled the following lines are skipped in GuiScreen.setWorldAndResolution(Minecraft, int, int):
  this.buttonList.clear();
  this.initGui();"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$InitGuiEvent$Pre]))

(defn ->pre
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  button-list - `java.util.List`"
  (^GuiScreenEvent$InitGuiEvent$Pre [^net.minecraft.client.gui.GuiScreen gui ^java.util.List button-list]
    (new GuiScreenEvent$InitGuiEvent$Pre gui button-list)))

