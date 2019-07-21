(ns net.minecraft.network.play.client.CPacketPlayer$PositionRotation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayer$PositionRotation]))

(defn ->position-rotation
  "Constructor.

  x-in - `double`
  y-in - `double`
  z-in - `double`
  yaw-in - `float`
  pitch-in - `float`
  on-ground-in - `boolean`"
  (^CPacketPlayer$PositionRotation [^Double x-in ^Double y-in ^Double z-in ^Float yaw-in ^Float pitch-in ^Boolean on-ground-in]
    (new CPacketPlayer$PositionRotation x-in y-in z-in yaw-in pitch-in on-ground-in))
  (^CPacketPlayer$PositionRotation []
    (new CPacketPlayer$PositionRotation )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer$PositionRotation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer$PositionRotation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

