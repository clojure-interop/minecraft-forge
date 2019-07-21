(ns net.minecraft.tileentity.TileEntityEndPortal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityEndPortal]))

(defn ->tile-entity-end-portal
  "Constructor."
  (^TileEntityEndPortal []
    (new TileEntityEndPortal )))

(defn should-render-face?
  "p-184313-1 - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityEndPortal this ^net.minecraft.util.EnumFacing p-184313-1]
    (-> this (.shouldRenderFace p-184313-1))))

