(ns net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent$Post
  "This event fires right after GuiScreen.initGui().
  This is a good place to alter a GuiScreen's component layout if desired."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$InitGuiEvent$Post]))

(defn ->post
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  button-list - `java.util.List`"
  (^GuiScreenEvent$InitGuiEvent$Post [^net.minecraft.client.gui.GuiScreen gui ^java.util.List button-list]
    (new GuiScreenEvent$InitGuiEvent$Post gui button-list)))

