(ns net.minecraftforge.client.event.RenderTooltipEvent$Post
  "Events inheriting from this class are fired at different stages during the tooltip rendering.

  Do not use this event directly, use one of its subclasses:

  RenderTooltipEvent.PostBackground
  RenderTooltipEvent.PostText"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderTooltipEvent$Post]))

(defn ->post
  "Constructor.

  stack - `net.minecraft.item.ItemStack`
  text-lines - `java.util.List`
  x - `int`
  y - `int`
  fr - `net.minecraft.client.gui.FontRenderer`
  width - `int`
  height - `int`"
  (^RenderTooltipEvent$Post [^net.minecraft.item.ItemStack stack ^java.util.List text-lines ^Integer x ^Integer y ^net.minecraft.client.gui.FontRenderer fr ^Integer width ^Integer height]
    (new RenderTooltipEvent$Post stack text-lines x y fr width height)))

(defn get-width
  "returns: The width of the tooltip box. This is the width of the inner box, not including the border. - `int`"
  (^Integer [^RenderTooltipEvent$Post this]
    (-> this (.getWidth))))

(defn get-height
  "returns: The height of the tooltip box. This is the height of the inner box, not including the border. - `int`"
  (^Integer [^RenderTooltipEvent$Post this]
    (-> this (.getHeight))))

