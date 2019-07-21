(ns net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent$Pre
  "This event fires once it has been determined that a GuiButton object has been clicked.
  Cancel this event to bypass GuiScreen.actionPerformed(GuiButton).
  Replace button with a different button from buttonList to have that button's action executed."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$ActionPerformedEvent$Pre]))

(defn ->pre
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  button - `net.minecraft.client.gui.GuiButton`
  button-list - `java.util.List`"
  (^GuiScreenEvent$ActionPerformedEvent$Pre [^net.minecraft.client.gui.GuiScreen gui ^net.minecraft.client.gui.GuiButton button ^java.util.List button-list]
    (new GuiScreenEvent$ActionPerformedEvent$Pre gui button button-list)))

