(ns net.minecraftforge.client.event.GuiScreenEvent$MouseInputEvent$Pre
  "This event fires when mouse input is detected by a GuiScreen.
  Cancel this event to bypass GuiScreen.handleMouseInput()."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$MouseInputEvent$Pre]))

(defn ->pre
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$MouseInputEvent$Pre [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$MouseInputEvent$Pre gui)))

