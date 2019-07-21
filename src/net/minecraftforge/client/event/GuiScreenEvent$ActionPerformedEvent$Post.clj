(ns net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent$Post
  "This event fires after GuiScreen.actionPerformed(GuiButton) provided that the active
  screen has not been changed as a result of GuiScreen.actionPerformed(GuiButton)."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$ActionPerformedEvent$Post]))

(defn ->post
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  button - `net.minecraft.client.gui.GuiButton`
  button-list - `java.util.List`"
  (^GuiScreenEvent$ActionPerformedEvent$Post [^net.minecraft.client.gui.GuiScreen gui ^net.minecraft.client.gui.GuiButton button ^java.util.List button-list]
    (new GuiScreenEvent$ActionPerformedEvent$Post gui button button-list)))

