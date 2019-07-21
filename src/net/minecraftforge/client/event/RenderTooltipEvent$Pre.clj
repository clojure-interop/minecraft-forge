(ns net.minecraftforge.client.event.RenderTooltipEvent$Pre
  "This event is fired before any tooltip calculations are done. It provides setters for all aspects of the tooltip, so the final render can be modified.

  This event is Cancelable."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderTooltipEvent$Pre]))

(defn ->pre
  "Constructor.

  stack - `net.minecraft.item.ItemStack`
  lines - `java.util.List`
  x - `int`
  y - `int`
  screen-width - `int`
  screen-height - `int`
  max-width - `int`
  fr - `net.minecraft.client.gui.FontRenderer`"
  (^RenderTooltipEvent$Pre [^net.minecraft.item.ItemStack stack ^java.util.List lines ^Integer x ^Integer y ^Integer screen-width ^Integer screen-height ^Integer max-width ^net.minecraft.client.gui.FontRenderer fr]
    (new RenderTooltipEvent$Pre stack lines x y screen-width screen-height max-width fr)))

(defn get-max-width
  "returns: The max width the tooltip can be. Defaults to -1 (unlimited). - `int`"
  (^Integer [^RenderTooltipEvent$Pre this]
    (-> this (.getMaxWidth))))

(defn set-font-renderer
  "Sets the FontRenderer to be used to render text.

  fr - `net.minecraft.client.gui.FontRenderer`"
  ([^RenderTooltipEvent$Pre this ^net.minecraft.client.gui.FontRenderer fr]
    (-> this (.setFontRenderer fr))))

(defn set-screen-width
  "screen-width - `int`"
  ([^RenderTooltipEvent$Pre this ^Integer screen-width]
    (-> this (.setScreenWidth screen-width))))

(defn get-screen-height
  "returns: `int`"
  (^Integer [^RenderTooltipEvent$Pre this]
    (-> this (.getScreenHeight))))

(defn set-screen-height
  "screen-height - `int`"
  ([^RenderTooltipEvent$Pre this ^Integer screen-height]
    (-> this (.setScreenHeight screen-height))))

(defn set-max-width
  "Sets the max width of the tooltip. Use -1 for unlimited.

  max-width - `int`"
  ([^RenderTooltipEvent$Pre this ^Integer max-width]
    (-> this (.setMaxWidth max-width))))

(defn set-y
  "Set the Y origin of the tooltip.

  y - `int`"
  ([^RenderTooltipEvent$Pre this ^Integer y]
    (-> this (.setY y))))

(defn set-x
  "Set the X origin of the tooltip.

  x - `int`"
  ([^RenderTooltipEvent$Pre this ^Integer x]
    (-> this (.setX x))))

(defn get-screen-width
  "returns: `int`"
  (^Integer [^RenderTooltipEvent$Pre this]
    (-> this (.getScreenWidth))))

