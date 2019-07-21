(ns net.minecraft.network.play.server.SPacketEffect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEffect]))

(defn ->s-packet-effect
  "Constructor.

  sound-type-in - `int`
  sound-pos-in - `net.minecraft.util.math.BlockPos`
  sound-data-in - `int`
  server-wide-in - `boolean`"
  (^SPacketEffect [^Integer sound-type-in ^net.minecraft.util.math.BlockPos sound-pos-in ^Integer sound-data-in ^Boolean server-wide-in]
    (new SPacketEffect sound-type-in sound-pos-in sound-data-in server-wide-in))
  (^SPacketEffect []
    (new SPacketEffect )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEffect this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn sound-serverwide?
  "returns: `boolean`"
  (^Boolean [^SPacketEffect this]
    (-> this (.isSoundServerwide))))

(defn get-sound-type
  "returns: `int`"
  (^Integer [^SPacketEffect this]
    (-> this (.getSoundType))))

(defn get-sound-data
  "returns: `int`"
  (^Integer [^SPacketEffect this]
    (-> this (.getSoundData))))

(defn get-sound-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketEffect this]
    (-> this (.getSoundPos))))

