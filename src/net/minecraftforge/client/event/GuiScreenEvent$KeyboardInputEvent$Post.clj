(ns net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent$Post
  "This event fires after GuiScreen.handleKeyboardInput() provided that the active
  screen has not been changed as a result of GuiScreen.handleKeyboardInput() and
  the GuiScreen.keyHandled flag has not been set.
  Cancel this event when you successfully use the keyboard input to prevent other handlers from using the same input."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$KeyboardInputEvent$Post]))

(defn ->post
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$KeyboardInputEvent$Post [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$KeyboardInputEvent$Post gui)))

