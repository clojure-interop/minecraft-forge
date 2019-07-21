(ns net.minecraft.tileentity.TileEntityMobSpawner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityMobSpawner]))

(defn ->tile-entity-mob-spawner
  "Constructor."
  (^TileEntityMobSpawner []
    (new TileEntityMobSpawner )))

(defn *register-fixes-mob-spawner
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityMobSpawner/registerFixesMobSpawner fixer)))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityMobSpawner this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityMobSpawner this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn update
  ""
  ([^TileEntityMobSpawner this]
    (-> this (.update))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityMobSpawner this]
    (-> this (.getUpdatePacket))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityMobSpawner this]
    (-> this (.getUpdateTag))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntityMobSpawner this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn only-ops-can-set-nbt
  "returns: `boolean`"
  (^Boolean [^TileEntityMobSpawner this]
    (-> this (.onlyOpsCanSetNbt))))

(defn get-spawner-base-logic
  "returns: `net.minecraft.tileentity.MobSpawnerBaseLogic`"
  (^net.minecraft.tileentity.MobSpawnerBaseLogic [^TileEntityMobSpawner this]
    (-> this (.getSpawnerBaseLogic))))

