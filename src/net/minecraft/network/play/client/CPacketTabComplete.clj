(ns net.minecraft.network.play.client.CPacketTabComplete
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketTabComplete]))

(defn ->c-packet-tab-complete
  "Constructor.

  message-in - `java.lang.String`
  target-block-in - `net.minecraft.util.math.BlockPos`
  has-target-block-in - `boolean`"
  (^CPacketTabComplete [^java.lang.String message-in ^net.minecraft.util.math.BlockPos target-block-in ^Boolean has-target-block-in]
    (new CPacketTabComplete message-in target-block-in has-target-block-in))
  (^CPacketTabComplete []
    (new CPacketTabComplete )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketTabComplete this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketTabComplete this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketTabComplete this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^CPacketTabComplete this]
    (-> this (.getMessage))))

(defn get-target-block
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^CPacketTabComplete this]
    (-> this (.getTargetBlock))))

(defn has-target-block?
  "returns: `boolean`"
  (^Boolean [^CPacketTabComplete this]
    (-> this (.hasTargetBlock))))

