(ns net.minecraftforge.client.event.GuiScreenEvent$MouseInputEvent$Post
  "This event fires after GuiScreen.handleMouseInput() provided that the active
  screen has not been changed as a result of GuiScreen.handleMouseInput() and
  the GuiScreen.mouseHandled flag has not been set.
  Cancel this event when you successfully use the mouse input to prevent other handlers from using the same input."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$MouseInputEvent$Post]))

(defn ->post
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$MouseInputEvent$Post [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$MouseInputEvent$Post gui)))

