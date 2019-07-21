(ns net.minecraftforge.client.event.GuiScreenEvent
  "Event classes for GuiScreen events."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent]))

(defn ->gui-screen-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent gui)))

(defn get-gui
  "The GuiScreen object generating this event.

  returns: `net.minecraft.client.gui.GuiScreen`"
  (^net.minecraft.client.gui.GuiScreen [^GuiScreenEvent this]
    (-> this (.getGui))))

