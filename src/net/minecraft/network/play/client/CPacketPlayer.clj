(ns net.minecraft.network.play.client.CPacketPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayer]))

(defn ->c-packet-player
  "Constructor.

  on-ground-in - `boolean`"
  (^CPacketPlayer [^Boolean on-ground-in]
    (new CPacketPlayer on-ground-in))
  (^CPacketPlayer []
    (new CPacketPlayer )))

(defn get-yaw
  "default-value - `float`

  returns: `float`"
  (^Float [^CPacketPlayer this ^Float default-value]
    (-> this (.getYaw default-value))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-pitch
  "default-value - `float`

  returns: `float`"
  (^Float [^CPacketPlayer this ^Float default-value]
    (-> this (.getPitch default-value))))

(defn get-z
  "default-value - `double`

  returns: `double`"
  (^Double [^CPacketPlayer this ^Double default-value]
    (-> this (.getZ default-value))))

(defn get-y
  "default-value - `double`

  returns: `double`"
  (^Double [^CPacketPlayer this ^Double default-value]
    (-> this (.getY default-value))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketPlayer this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-x
  "default-value - `double`

  returns: `double`"
  (^Double [^CPacketPlayer this ^Double default-value]
    (-> this (.getX default-value))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn on-ground?
  "returns: `boolean`"
  (^Boolean [^CPacketPlayer this]
    (-> this (.isOnGround))))

