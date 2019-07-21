(ns net.minecraft.client.renderer.ChestRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ChestRenderer]))

(defn ->chest-renderer
  "Constructor."
  (^ChestRenderer []
    (new ChestRenderer )))

(defn render-chest-brightness
  "block-in - `net.minecraft.block.Block`
  color - `float`"
  ([^ChestRenderer this ^net.minecraft.block.Block block-in ^Float color]
    (-> this (.renderChestBrightness block-in color))))

