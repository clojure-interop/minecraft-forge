(ns net.minecraftforge.client.event.GuiScreenEvent$BackgroundDrawnEvent
  "This event fires at the end of GuiScreen.drawDefaultBackground() and before the rest of the Gui draws.
  This allows drawing next to Guis, above the background but below any tooltips."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$BackgroundDrawnEvent]))

(defn ->background-drawn-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$BackgroundDrawnEvent [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$BackgroundDrawnEvent gui)))

(defn get-mouse-x
  "The x coordinate of the mouse pointer on the screen.

  returns: `int`"
  (^Integer [^GuiScreenEvent$BackgroundDrawnEvent this]
    (-> this (.getMouseX))))

(defn get-mouse-y
  "The y coordinate of the mouse pointer on the screen.

  returns: `int`"
  (^Integer [^GuiScreenEvent$BackgroundDrawnEvent this]
    (-> this (.getMouseY))))

