(ns net.minecraft.tileentity.TileEntityNote
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityNote]))

(defn ->tile-entity-note
  "Constructor."
  (^TileEntityNote []
    (new TileEntityNote )))

(defn note
  "Instance Field.

  type: byte"
  (^Byte [^TileEntityNote this]
    (-> this .-note)))

(defn previous-redstone-state
  "Instance Field.

  type: boolean"
  (^Boolean [^TileEntityNote this]
    (-> this .-previousRedstoneState)))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityNote this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityNote this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn change-pitch
  ""
  ([^TileEntityNote this]
    (-> this (.changePitch))))

(defn trigger-note
  "world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`"
  ([^TileEntityNote this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in]
    (-> this (.triggerNote world-in pos-in))))

