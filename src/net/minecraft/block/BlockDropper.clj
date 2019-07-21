(ns net.minecraft.block.BlockDropper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDropper]))

(defn ->block-dropper
  "Constructor."
  (^BlockDropper []
    (new BlockDropper )))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockDropper this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

