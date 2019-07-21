(ns net.minecraftforge.client.event.GuiOpenEvent
  "This event is called before any Gui will open.
  If you don't want this to happen, cancel the event.
  If you want to override this Gui, simply set the gui variable to your own Gui."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiOpenEvent]))

(defn ->gui-open-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiOpenEvent [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiOpenEvent gui)))

(defn get-gui
  "returns: `net.minecraft.client.gui.GuiScreen`"
  (^net.minecraft.client.gui.GuiScreen [^GuiOpenEvent this]
    (-> this (.getGui))))

(defn set-gui
  "gui - `net.minecraft.client.gui.GuiScreen`"
  ([^GuiOpenEvent this ^net.minecraft.client.gui.GuiScreen gui]
    (-> this (.setGui gui))))

