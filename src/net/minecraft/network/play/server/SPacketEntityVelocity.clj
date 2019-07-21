(ns net.minecraft.network.play.server.SPacketEntityVelocity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityVelocity]))

(defn ->s-packet-entity-velocity
  "Constructor.

  entity-id-in - `int`
  motion-x-in - `double`
  motion-y-in - `double`
  motion-z-in - `double`"
  (^SPacketEntityVelocity [^Integer entity-id-in ^Double motion-x-in ^Double motion-y-in ^Double motion-z-in]
    (new SPacketEntityVelocity entity-id-in motion-x-in motion-y-in motion-z-in))
  (^SPacketEntityVelocity [^net.minecraft.entity.Entity entity-in]
    (new SPacketEntityVelocity entity-in))
  (^SPacketEntityVelocity []
    (new SPacketEntityVelocity )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityVelocity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityVelocity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityVelocity this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityVelocity this]
    (-> this (.getEntityID))))

(defn get-motion-x
  "returns: `int`"
  (^Integer [^SPacketEntityVelocity this]
    (-> this (.getMotionX))))

(defn get-motion-y
  "returns: `int`"
  (^Integer [^SPacketEntityVelocity this]
    (-> this (.getMotionY))))

(defn get-motion-z
  "returns: `int`"
  (^Integer [^SPacketEntityVelocity this]
    (-> this (.getMotionZ))))

