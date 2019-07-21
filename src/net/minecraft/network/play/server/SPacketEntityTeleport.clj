(ns net.minecraft.network.play.server.SPacketEntityTeleport
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityTeleport]))

(defn ->s-packet-entity-teleport
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^SPacketEntityTeleport [^net.minecraft.entity.Entity entity-in]
    (new SPacketEntityTeleport entity-in))
  (^SPacketEntityTeleport []
    (new SPacketEntityTeleport )))

(defn get-yaw
  "returns: `byte`"
  (^Byte [^SPacketEntityTeleport this]
    (-> this (.getYaw))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityTeleport this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-pitch
  "returns: `byte`"
  (^Byte [^SPacketEntityTeleport this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketEntityTeleport this]
    (-> this (.getZ))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityTeleport this]
    (-> this (.getEntityId))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketEntityTeleport this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityTeleport this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketEntityTeleport this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityTeleport this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-on-ground?
  "returns: `boolean`"
  (^Boolean [^SPacketEntityTeleport this]
    (-> this (.getOnGround))))

