(ns net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre
  "This event fires just before GuiScreen.drawScreen(int, int, float) is called.
  Cancel this event to skip GuiScreen.drawScreen(int, int, float)."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$DrawScreenEvent$Pre]))

(defn ->pre
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  mouse-x - `int`
  mouse-y - `int`
  render-partial-ticks - `float`"
  (^GuiScreenEvent$DrawScreenEvent$Pre [^net.minecraft.client.gui.GuiScreen gui ^Integer mouse-x ^Integer mouse-y ^Float render-partial-ticks]
    (new GuiScreenEvent$DrawScreenEvent$Pre gui mouse-x mouse-y render-partial-ticks)))

