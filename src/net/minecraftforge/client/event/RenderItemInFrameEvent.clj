(ns net.minecraftforge.client.event.RenderItemInFrameEvent
  "This event is called when an item is rendered in an item frame.

  You can set canceled to do no further vanilla processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderItemInFrameEvent]))

(defn ->render-item-in-frame-event
  "Constructor.

  item-frame - `net.minecraft.entity.item.EntityItemFrame`
  render-item-frame - `net.minecraft.client.renderer.tileentity.RenderItemFrame`"
  (^RenderItemInFrameEvent [^net.minecraft.entity.item.EntityItemFrame item-frame ^net.minecraft.client.renderer.tileentity.RenderItemFrame render-item-frame]
    (new RenderItemInFrameEvent item-frame render-item-frame)))

(defn get-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RenderItemInFrameEvent this]
    (-> this (.getItem))))

(defn get-entity-item-frame
  "returns: `net.minecraft.entity.item.EntityItemFrame`"
  (^net.minecraft.entity.item.EntityItemFrame [^RenderItemInFrameEvent this]
    (-> this (.getEntityItemFrame))))

(defn get-renderer
  "returns: `net.minecraft.client.renderer.tileentity.RenderItemFrame`"
  (^net.minecraft.client.renderer.tileentity.RenderItemFrame [^RenderItemInFrameEvent this]
    (-> this (.getRenderer))))

