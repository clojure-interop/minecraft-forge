(ns net.minecraft.network.play.client.CPacketUpdateSign
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketUpdateSign]))

(defn ->c-packet-update-sign
  "Constructor.

  pos-in - `net.minecraft.util.math.BlockPos`
  lines-in - `net.minecraft.util.text.ITextComponent[]`"
  (^CPacketUpdateSign [^net.minecraft.util.math.BlockPos pos-in lines-in]
    (new CPacketUpdateSign pos-in lines-in))
  (^CPacketUpdateSign []
    (new CPacketUpdateSign )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketUpdateSign this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketUpdateSign this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketUpdateSign this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^CPacketUpdateSign this]
    (-> this (.getPosition))))

(defn get-lines
  "returns: `java.lang.String[]`"
  ([^CPacketUpdateSign this]
    (-> this (.getLines))))

