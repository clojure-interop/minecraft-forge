(ns net.minecraft.block.BlockJukebox$TileEntityJukebox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockJukebox$TileEntityJukebox]))

(defn ->tile-entity-jukebox
  "Constructor."
  (^BlockJukebox$TileEntityJukebox []
    (new BlockJukebox$TileEntityJukebox )))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^BlockJukebox$TileEntityJukebox this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^BlockJukebox$TileEntityJukebox this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-record
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockJukebox$TileEntityJukebox this]
    (-> this (.getRecord))))

(defn set-record
  "record-stack - `net.minecraft.item.ItemStack`"
  ([^BlockJukebox$TileEntityJukebox this ^net.minecraft.item.ItemStack record-stack]
    (-> this (.setRecord record-stack))))

