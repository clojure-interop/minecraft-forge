(ns net.minecraft.network.play.server.SPacketEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntity]))

(defn ->s-packet-entity
  "Constructor.

  entity-id-in - `int`"
  (^SPacketEntity [^Integer entity-id-in]
    (new SPacketEntity entity-id-in))
  (^SPacketEntity []
    (new SPacketEntity )))

(defn get-yaw
  "returns: `byte`"
  (^Byte [^SPacketEntity this]
    (-> this (.getYaw))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-entity
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^SPacketEntity this ^net.minecraft.world.World world-in]
    (-> this (.getEntity world-in))))

(defn get-pitch
  "returns: `byte`"
  (^Byte [^SPacketEntity this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `int`"
  (^Integer [^SPacketEntity this]
    (-> this (.getZ))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketEntity this]
    (-> this (.toString))))

(defn get-y
  "returns: `int`"
  (^Integer [^SPacketEntity this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntity this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `int`"
  (^Integer [^SPacketEntity this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn rotating?
  "returns: `boolean`"
  (^Boolean [^SPacketEntity this]
    (-> this (.isRotating))))

(defn get-on-ground?
  "returns: `boolean`"
  (^Boolean [^SPacketEntity this]
    (-> this (.getOnGround))))

