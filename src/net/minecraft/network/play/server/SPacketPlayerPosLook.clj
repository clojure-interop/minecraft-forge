(ns net.minecraft.network.play.server.SPacketPlayerPosLook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketPlayerPosLook]))

(defn ->s-packet-player-pos-look
  "Constructor.

  x-in - `double`
  y-in - `double`
  z-in - `double`
  yaw-in - `float`
  pitch-in - `float`
  flags-in - `java.util.Set`
  teleport-id-in - `int`"
  (^SPacketPlayerPosLook [^Double x-in ^Double y-in ^Double z-in ^Float yaw-in ^Float pitch-in ^java.util.Set flags-in ^Integer teleport-id-in]
    (new SPacketPlayerPosLook x-in y-in z-in yaw-in pitch-in flags-in teleport-id-in))
  (^SPacketPlayerPosLook []
    (new SPacketPlayerPosLook )))

(defn get-yaw
  "returns: `float`"
  (^Float [^SPacketPlayerPosLook this]
    (-> this (.getYaw))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerPosLook this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-teleport-id
  "returns: `int`"
  (^Integer [^SPacketPlayerPosLook this]
    (-> this (.getTeleportId))))

(defn get-pitch
  "returns: `float`"
  (^Float [^SPacketPlayerPosLook this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketPlayerPosLook this]
    (-> this (.getZ))))

(defn get-flags
  "returns: `java.util.Set<net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags>`"
  (^java.util.Set [^SPacketPlayerPosLook this]
    (-> this (.getFlags))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketPlayerPosLook this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketPlayerPosLook this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketPlayerPosLook this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerPosLook this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

