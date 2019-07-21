(ns net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$KeyboardInputEvent]))

(defn ->keyboard-input-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$KeyboardInputEvent [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$KeyboardInputEvent gui)))

