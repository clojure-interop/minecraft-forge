(ns net.minecraftforge.client.event.RenderTooltipEvent$PostText
  "This event is fired directly after the tooltip text is drawn, but before the GL state is reset."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderTooltipEvent$PostText]))

(defn ->post-text
  "Constructor.

  stack - `net.minecraft.item.ItemStack`
  text-lines - `java.util.List`
  x - `int`
  y - `int`
  fr - `net.minecraft.client.gui.FontRenderer`
  width - `int`
  height - `int`"
  (^RenderTooltipEvent$PostText [^net.minecraft.item.ItemStack stack ^java.util.List text-lines ^Integer x ^Integer y ^net.minecraft.client.gui.FontRenderer fr ^Integer width ^Integer height]
    (new RenderTooltipEvent$PostText stack text-lines x y fr width height)))

