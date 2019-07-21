(ns net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$DrawScreenEvent]))

(defn ->draw-screen-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  mouse-x - `int`
  mouse-y - `int`
  render-partial-ticks - `float`"
  (^GuiScreenEvent$DrawScreenEvent [^net.minecraft.client.gui.GuiScreen gui ^Integer mouse-x ^Integer mouse-y ^Float render-partial-ticks]
    (new GuiScreenEvent$DrawScreenEvent gui mouse-x mouse-y render-partial-ticks)))

(defn get-mouse-x
  "The x coordinate of the mouse pointer on the screen.

  returns: `int`"
  (^Integer [^GuiScreenEvent$DrawScreenEvent this]
    (-> this (.getMouseX))))

(defn get-mouse-y
  "The y coordinate of the mouse pointer on the screen.

  returns: `int`"
  (^Integer [^GuiScreenEvent$DrawScreenEvent this]
    (-> this (.getMouseY))))

(defn get-render-partial-ticks
  "Partial render ticks elapsed.

  returns: `float`"
  (^Float [^GuiScreenEvent$DrawScreenEvent this]
    (-> this (.getRenderPartialTicks))))

