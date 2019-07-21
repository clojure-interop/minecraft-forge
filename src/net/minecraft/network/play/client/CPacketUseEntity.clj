(ns net.minecraft.network.play.client.CPacketUseEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketUseEntity]))

(defn ->c-packet-use-entity
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  hand-in - `net.minecraft.util.EnumHand`
  hit-vec-in - `net.minecraft.util.math.Vec3d`"
  (^CPacketUseEntity [^net.minecraft.entity.Entity entity-in ^net.minecraft.util.EnumHand hand-in ^net.minecraft.util.math.Vec3d hit-vec-in]
    (new CPacketUseEntity entity-in hand-in hit-vec-in))
  (^CPacketUseEntity [^net.minecraft.entity.Entity entity-in ^net.minecraft.util.EnumHand hand-in]
    (new CPacketUseEntity entity-in hand-in))
  (^CPacketUseEntity [^net.minecraft.entity.Entity entity-in]
    (new CPacketUseEntity entity-in))
  (^CPacketUseEntity []
    (new CPacketUseEntity )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketUseEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketUseEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketUseEntity this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-entity-from-world
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^CPacketUseEntity this ^net.minecraft.world.World world-in]
    (-> this (.getEntityFromWorld world-in))))

(defn get-action
  "returns: `net.minecraft.network.play.client.CPacketUseEntity$Action`"
  (^net.minecraft.network.play.client.CPacketUseEntity$Action [^CPacketUseEntity this]
    (-> this (.getAction))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^CPacketUseEntity this]
    (-> this (.getHand))))

(defn get-hit-vec
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^CPacketUseEntity this]
    (-> this (.getHitVec))))

