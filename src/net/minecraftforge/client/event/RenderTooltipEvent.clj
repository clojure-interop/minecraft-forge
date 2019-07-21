(ns net.minecraftforge.client.event.RenderTooltipEvent
  "A set of events which are fired at various points during tooltip rendering.

  Can be used to change the rendering parameters, draw something extra, etc.

  Do not use this event directly, use one of the subclasses:

  RenderTooltipEvent.Pre
  RenderTooltipEvent.PostBackground
  RenderTooltipEvent.PostText"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderTooltipEvent]))

(defn ->render-tooltip-event
  "Constructor.

  stack - `net.minecraft.item.ItemStack`
  lines - `java.util.List`
  x - `int`
  y - `int`
  fr - `net.minecraft.client.gui.FontRenderer`"
  (^RenderTooltipEvent [^net.minecraft.item.ItemStack stack ^java.util.List lines ^Integer x ^Integer y ^net.minecraft.client.gui.FontRenderer fr]
    (new RenderTooltipEvent stack lines x y fr)))

(defn get-stack
  "returns: The stack which the tooltip is being rendered for. As tooltips can be drawn without itemstacks, this stack may be empty. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RenderTooltipEvent this]
    (-> this (.getStack))))

(defn get-lines
  "The lines to be drawn. May change between RenderTooltipEvent.Pre and RenderTooltipEvent.Post.

  returns: An unmodifiable list of strings. Use ItemTooltipEvent to modify tooltip text. - `java.util.List<java.lang.String>`"
  (^java.util.List [^RenderTooltipEvent this]
    (-> this (.getLines))))

(defn get-x
  "returns: The X position of the tooltip box. By default, the mouse X position. - `int`"
  (^Integer [^RenderTooltipEvent this]
    (-> this (.getX))))

(defn get-y
  "returns: The Y position of the tooltip box. By default, the mouse Y position. - `int`"
  (^Integer [^RenderTooltipEvent this]
    (-> this (.getY))))

(defn get-font-renderer
  "returns: The FontRenderer instance the current render is using. - `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^RenderTooltipEvent this]
    (-> this (.getFontRenderer))))

