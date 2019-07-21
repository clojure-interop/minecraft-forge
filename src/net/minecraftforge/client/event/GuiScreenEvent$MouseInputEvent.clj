(ns net.minecraftforge.client.event.GuiScreenEvent$MouseInputEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$MouseInputEvent]))

(defn ->mouse-input-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$MouseInputEvent [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$MouseInputEvent gui)))

