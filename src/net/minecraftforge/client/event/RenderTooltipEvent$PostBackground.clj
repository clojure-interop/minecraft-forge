(ns net.minecraftforge.client.event.RenderTooltipEvent$PostBackground
  "This event is fired directly after the tooltip background is drawn, but before any text is drawn."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderTooltipEvent$PostBackground]))

(defn ->post-background
  "Constructor.

  stack - `net.minecraft.item.ItemStack`
  text-lines - `java.util.List`
  x - `int`
  y - `int`
  fr - `net.minecraft.client.gui.FontRenderer`
  width - `int`
  height - `int`"
  (^RenderTooltipEvent$PostBackground [^net.minecraft.item.ItemStack stack ^java.util.List text-lines ^Integer x ^Integer y ^net.minecraft.client.gui.FontRenderer fr ^Integer width ^Integer height]
    (new RenderTooltipEvent$PostBackground stack text-lines x y fr width height)))

