(ns net.minecraft.tileentity.TileEntityFlowerPot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityFlowerPot]))

(defn ->tile-entity-flower-pot
  "Constructor.

  pot-item - `net.minecraft.item.Item`
  pot-data - `int`"
  (^TileEntityFlowerPot [^net.minecraft.item.Item pot-item ^Integer pot-data]
    (new TileEntityFlowerPot pot-item pot-data))
  (^TileEntityFlowerPot []
    (new TileEntityFlowerPot )))

(defn *register-fixes-flower-pot
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityFlowerPot/registerFixesFlowerPot fixer)))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityFlowerPot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityFlowerPot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityFlowerPot this]
    (-> this (.getUpdatePacket))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityFlowerPot this]
    (-> this (.getUpdateTag))))

(defn set-item-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^TileEntityFlowerPot this ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStack stack))))

(defn get-flower-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityFlowerPot this]
    (-> this (.getFlowerItemStack))))

(defn get-flower-pot-item
  "returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^TileEntityFlowerPot this]
    (-> this (.getFlowerPotItem))))

(defn get-flower-pot-data
  "returns: `int`"
  (^Integer [^TileEntityFlowerPot this]
    (-> this (.getFlowerPotData))))

