(ns net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityItemStackRenderer]))

(defn ->tile-entity-item-stack-renderer
  "Constructor."
  (^TileEntityItemStackRenderer []
    (new TileEntityItemStackRenderer )))

(defn *-instance
  "Static Field.

  type: net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer"
  []
  TileEntityItemStackRenderer/instance)

(defn render-by-item
  "item-stack-in - `net.minecraft.item.ItemStack`"
  ([^TileEntityItemStackRenderer this ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.renderByItem item-stack-in))))

