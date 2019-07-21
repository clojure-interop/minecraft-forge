(ns net.minecraft.network.play.server.SPacketBlockBreakAnim
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketBlockBreakAnim]))

(defn ->s-packet-block-break-anim
  "Constructor.

  breaker-id-in - `int`
  position-in - `net.minecraft.util.math.BlockPos`
  progress-in - `int`"
  (^SPacketBlockBreakAnim [^Integer breaker-id-in ^net.minecraft.util.math.BlockPos position-in ^Integer progress-in]
    (new SPacketBlockBreakAnim breaker-id-in position-in progress-in))
  (^SPacketBlockBreakAnim []
    (new SPacketBlockBreakAnim )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketBlockBreakAnim this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketBlockBreakAnim this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketBlockBreakAnim this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-breaker-id
  "returns: `int`"
  (^Integer [^SPacketBlockBreakAnim this]
    (-> this (.getBreakerId))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketBlockBreakAnim this]
    (-> this (.getPosition))))

(defn get-progress
  "returns: `int`"
  (^Integer [^SPacketBlockBreakAnim this]
    (-> this (.getProgress))))

