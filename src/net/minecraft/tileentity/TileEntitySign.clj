(ns net.minecraft.tileentity.TileEntitySign
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntitySign]))

(defn ->tile-entity-sign
  "Constructor."
  (^TileEntitySign []
    (new TileEntitySign )))

(defn sign-text
  "Instance Constant.

  type: net.minecraft.util.text.ITextComponent[]"
  ([^TileEntitySign this]
    (-> this .-signText)))

(defn line-being-edited
  "Instance Field.

  type: int"
  (^Integer [^TileEntitySign this]
    (-> this .-lineBeingEdited)))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntitySign this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntitySign this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn only-ops-can-set-nbt
  "returns: `boolean`"
  (^Boolean [^TileEntitySign this]
    (-> this (.onlyOpsCanSetNbt))))

(defn get-stats
  "returns: `net.minecraft.command.CommandResultStats`"
  (^net.minecraft.command.CommandResultStats [^TileEntitySign this]
    (-> this (.getStats))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntitySign this]
    (-> this (.getUpdateTag))))

(defn execute-command
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntitySign this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.executeCommand player-in))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntitySign this]
    (-> this (.getUpdatePacket))))

(defn get-is-editable?
  "returns: `boolean`"
  (^Boolean [^TileEntitySign this]
    (-> this (.getIsEditable))))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^TileEntitySign this]
    (-> this (.getPlayer))))

(defn set-player
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntitySign this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.setPlayer player-in))))

(defn set-editable
  "is-editable-in - `boolean`"
  ([^TileEntitySign this ^Boolean is-editable-in]
    (-> this (.setEditable is-editable-in))))

