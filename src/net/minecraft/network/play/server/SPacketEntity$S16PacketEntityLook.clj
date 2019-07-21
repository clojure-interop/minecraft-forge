(ns net.minecraft.network.play.server.SPacketEntity$S16PacketEntityLook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntity$S16PacketEntityLook]))

(defn ->s-16-packet-entity-look
  "Constructor.

  entity-id-in - `int`
  yaw-in - `byte`
  pitch-in - `byte`
  on-ground-in - `boolean`"
  (^SPacketEntity$S16PacketEntityLook [^Integer entity-id-in ^Byte yaw-in ^Byte pitch-in ^Boolean on-ground-in]
    (new SPacketEntity$S16PacketEntityLook entity-id-in yaw-in pitch-in on-ground-in))
  (^SPacketEntity$S16PacketEntityLook []
    (new SPacketEntity$S16PacketEntityLook )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity$S16PacketEntityLook this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity$S16PacketEntityLook this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

