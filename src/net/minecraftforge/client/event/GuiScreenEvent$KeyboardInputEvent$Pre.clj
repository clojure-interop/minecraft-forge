(ns net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent$Pre
  "This event fires when keyboard input is detected by a GuiScreen.
  Cancel this event to bypass GuiScreen.handleKeyboardInput()."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$KeyboardInputEvent$Pre]))

(defn ->pre
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$KeyboardInputEvent$Pre [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$KeyboardInputEvent$Pre gui)))

