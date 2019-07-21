(ns net.minecraft.network.play.server.SPacketExplosion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketExplosion]))

(defn ->s-packet-explosion
  "Constructor.

  x-in - `double`
  y-in - `double`
  z-in - `double`
  strength-in - `float`
  affected-block-positions-in - `java.util.List`
  motion - `net.minecraft.util.math.Vec3d`"
  (^SPacketExplosion [^Double x-in ^Double y-in ^Double z-in ^Float strength-in ^java.util.List affected-block-positions-in ^net.minecraft.util.math.Vec3d motion]
    (new SPacketExplosion x-in y-in z-in strength-in affected-block-positions-in motion))
  (^SPacketExplosion []
    (new SPacketExplosion )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketExplosion this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-motion-x
  "returns: `float`"
  (^Float [^SPacketExplosion this]
    (-> this (.getMotionX))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketExplosion this]
    (-> this (.getZ))))

(defn get-affected-block-positions
  "returns: `java.util.List<net.minecraft.util.math.BlockPos>`"
  (^java.util.List [^SPacketExplosion this]
    (-> this (.getAffectedBlockPositions))))

(defn get-motion-y
  "returns: `float`"
  (^Float [^SPacketExplosion this]
    (-> this (.getMotionY))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketExplosion this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketExplosion this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketExplosion this]
    (-> this (.getX))))

(defn get-motion-z
  "returns: `float`"
  (^Float [^SPacketExplosion this]
    (-> this (.getMotionZ))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketExplosion this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-strength
  "returns: `float`"
  (^Float [^SPacketExplosion this]
    (-> this (.getStrength))))

