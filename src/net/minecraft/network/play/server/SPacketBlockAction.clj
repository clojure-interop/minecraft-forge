(ns net.minecraft.network.play.server.SPacketBlockAction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketBlockAction]))

(defn ->s-packet-block-action
  "Constructor.

  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  instrument-in - `int`
  pitch-in - `int`"
  (^SPacketBlockAction [^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer instrument-in ^Integer pitch-in]
    (new SPacketBlockAction pos block-in instrument-in pitch-in))
  (^SPacketBlockAction []
    (new SPacketBlockAction )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketBlockAction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketBlockAction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketBlockAction this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-block-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketBlockAction this]
    (-> this (.getBlockPosition))))

(defn get-data-1
  "returns: `int`"
  (^Integer [^SPacketBlockAction this]
    (-> this (.getData1))))

(defn get-data-2
  "returns: `int`"
  (^Integer [^SPacketBlockAction this]
    (-> this (.getData2))))

(defn get-block-type
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^SPacketBlockAction this]
    (-> this (.getBlockType))))

