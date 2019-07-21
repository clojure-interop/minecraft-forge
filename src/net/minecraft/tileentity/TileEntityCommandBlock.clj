(ns net.minecraft.tileentity.TileEntityCommandBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityCommandBlock]))

(defn ->tile-entity-command-block
  "Constructor."
  (^TileEntityCommandBlock []
    (new TileEntityCommandBlock )))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityCommandBlock this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-command-result-stats
  "returns: `net.minecraft.command.CommandResultStats`"
  (^net.minecraft.command.CommandResultStats [^TileEntityCommandBlock this]
    (-> this (.getCommandResultStats))))

(defn get-mode
  "returns: `net.minecraft.tileentity.TileEntityCommandBlock$Mode`"
  (^net.minecraft.tileentity.TileEntityCommandBlock$Mode [^TileEntityCommandBlock this]
    (-> this (.getMode))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityCommandBlock this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn set-powered
  "powered-in - `boolean`"
  ([^TileEntityCommandBlock this ^Boolean powered-in]
    (-> this (.setPowered powered-in))))

(defn only-ops-can-set-nbt
  "returns: `boolean`"
  (^Boolean [^TileEntityCommandBlock this]
    (-> this (.onlyOpsCanSetNbt))))

(defn validate
  ""
  ([^TileEntityCommandBlock this]
    (-> this (.validate))))

(defn powered?
  "returns: `boolean`"
  (^Boolean [^TileEntityCommandBlock this]
    (-> this (.isPowered))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityCommandBlock this]
    (-> this (.getUpdatePacket))))

(defn set-condition-met
  "condition-met-in - `boolean`"
  ([^TileEntityCommandBlock this ^Boolean condition-met-in]
    (-> this (.setConditionMet condition-met-in))))

(defn set-auto
  "auto-in - `boolean`"
  ([^TileEntityCommandBlock this ^Boolean auto-in]
    (-> this (.setAuto auto-in))))

(defn auto?
  "returns: `boolean`"
  (^Boolean [^TileEntityCommandBlock this]
    (-> this (.isAuto))))

(defn send-to-client?
  "returns: `boolean`"
  (^Boolean [^TileEntityCommandBlock this]
    (-> this (.isSendToClient))))

(defn condition-met?
  "returns: `boolean`"
  (^Boolean [^TileEntityCommandBlock this]
    (-> this (.isConditionMet))))

(defn conditional?
  "returns: `boolean`"
  (^Boolean [^TileEntityCommandBlock this]
    (-> this (.isConditional))))

(defn get-command-block-logic
  "returns: `net.minecraft.tileentity.CommandBlockBaseLogic`"
  (^net.minecraft.tileentity.CommandBlockBaseLogic [^TileEntityCommandBlock this]
    (-> this (.getCommandBlockLogic))))

(defn set-send-to-client
  "p-184252-1 - `boolean`"
  ([^TileEntityCommandBlock this ^Boolean p-184252-1]
    (-> this (.setSendToClient p-184252-1))))

