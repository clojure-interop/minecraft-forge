(ns net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post
  "This event fires just after GuiScreen.drawScreen(int, int, float) is called."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$DrawScreenEvent$Post]))

(defn ->post
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  mouse-x - `int`
  mouse-y - `int`
  render-partial-ticks - `float`"
  (^GuiScreenEvent$DrawScreenEvent$Post [^net.minecraft.client.gui.GuiScreen gui ^Integer mouse-x ^Integer mouse-y ^Float render-partial-ticks]
    (new GuiScreenEvent$DrawScreenEvent$Post gui mouse-x mouse-y render-partial-ticks)))

