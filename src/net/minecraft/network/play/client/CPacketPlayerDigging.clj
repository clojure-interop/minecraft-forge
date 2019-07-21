(ns net.minecraft.network.play.client.CPacketPlayerDigging
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayerDigging]))

(defn ->c-packet-player-digging
  "Constructor.

  action-in - `net.minecraft.network.play.client.CPacketPlayerDigging$Action`
  pos-in - `net.minecraft.util.math.BlockPos`
  facing-in - `net.minecraft.util.EnumFacing`"
  (^CPacketPlayerDigging [^net.minecraft.network.play.client.CPacketPlayerDigging$Action action-in ^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.util.EnumFacing facing-in]
    (new CPacketPlayerDigging action-in pos-in facing-in))
  (^CPacketPlayerDigging []
    (new CPacketPlayerDigging )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerDigging this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerDigging this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketPlayerDigging this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^CPacketPlayerDigging this]
    (-> this (.getPosition))))

(defn get-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^CPacketPlayerDigging this]
    (-> this (.getFacing))))

(defn get-action
  "returns: `net.minecraft.network.play.client.CPacketPlayerDigging$Action`"
  (^net.minecraft.network.play.client.CPacketPlayerDigging$Action [^CPacketPlayerDigging this]
    (-> this (.getAction))))

