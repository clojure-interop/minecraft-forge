(ns net.minecraft.network.play.client.CPacketPlayer$Rotation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayer$Rotation]))

(defn ->rotation
  "Constructor.

  yaw-in - `float`
  pitch-in - `float`
  on-ground-in - `boolean`"
  (^CPacketPlayer$Rotation [^Float yaw-in ^Float pitch-in ^Boolean on-ground-in]
    (new CPacketPlayer$Rotation yaw-in pitch-in on-ground-in))
  (^CPacketPlayer$Rotation []
    (new CPacketPlayer$Rotation )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer$Rotation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer$Rotation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

