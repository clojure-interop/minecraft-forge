(ns net.minecraftforge.fml.client.config.GuiButtonExt
  "This class provides a button that fixes several bugs present in the vanilla GuiButton drawing code.
  The gist of it is that it allows buttons of any size without gaps in the graphics and with the
  borders drawn properly. It also prevents button text from extending out of the sides of the button by
  trimming the end of the string and adding an ellipsis.

  The code that handles drawing the button is in GuiUtils."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiButtonExt]))

(defn ->gui-button-ext
  "Constructor.

  id - `int`
  x-pos - `int`
  y-pos - `int`
  width - `int`
  height - `int`
  display-string - `java.lang.String`"
  (^GuiButtonExt [^Integer id ^Integer x-pos ^Integer y-pos ^Integer width ^Integer height ^java.lang.String display-string]
    (new GuiButtonExt id x-pos y-pos width height display-string))
  (^GuiButtonExt [^Integer id ^Integer x-pos ^Integer y-pos ^java.lang.String display-string]
    (new GuiButtonExt id x-pos y-pos display-string)))

(defn draw-button
  "Draws this button to the screen.

  mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButtonExt this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButton mc mouse-x mouse-y))))

