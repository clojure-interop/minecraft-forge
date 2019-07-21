(ns net.minecraft.block.ITileEntityProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block ITileEntityProvider]))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^ITileEntityProvider this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

