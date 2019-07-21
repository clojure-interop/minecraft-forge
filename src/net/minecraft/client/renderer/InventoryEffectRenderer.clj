(ns net.minecraft.client.renderer.InventoryEffectRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer InventoryEffectRenderer]))

(defn ->inventory-effect-renderer
  "Constructor.

  inventory-slots-in - `net.minecraft.inventory.Container`"
  (^InventoryEffectRenderer [^net.minecraft.inventory.Container inventory-slots-in]
    (new InventoryEffectRenderer inventory-slots-in)))

(defn init-gui
  ""
  ([^InventoryEffectRenderer this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^InventoryEffectRenderer this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

