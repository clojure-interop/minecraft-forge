(ns net.minecraft.network.play.server.SPacketUpdateTileEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUpdateTileEntity]))

(defn ->s-packet-update-tile-entity
  "Constructor.

  block-pos-in - `net.minecraft.util.math.BlockPos`
  tile-entity-type-in - `int`
  compound-in - `net.minecraft.nbt.NBTTagCompound`"
  (^SPacketUpdateTileEntity [^net.minecraft.util.math.BlockPos block-pos-in ^Integer tile-entity-type-in ^net.minecraft.nbt.NBTTagCompound compound-in]
    (new SPacketUpdateTileEntity block-pos-in tile-entity-type-in compound-in))
  (^SPacketUpdateTileEntity []
    (new SPacketUpdateTileEntity )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateTileEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateTileEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketUpdateTileEntity this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketUpdateTileEntity this]
    (-> this (.getPos))))

(defn get-tile-entity-type
  "returns: `int`"
  (^Integer [^SPacketUpdateTileEntity this]
    (-> this (.getTileEntityType))))

(defn get-nbt-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SPacketUpdateTileEntity this]
    (-> this (.getNbtCompound))))

