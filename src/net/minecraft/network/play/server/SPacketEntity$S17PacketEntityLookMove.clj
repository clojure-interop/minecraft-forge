(ns net.minecraft.network.play.server.SPacketEntity$S17PacketEntityLookMove
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntity$S17PacketEntityLookMove]))

(defn ->s-17-packet-entity-look-move
  "Constructor.

  entity-id-in - `int`
  x-in - `long`
  y-in - `long`
  z-in - `long`
  yaw-in - `byte`
  pitch-in - `byte`
  on-ground-in - `boolean`"
  (^SPacketEntity$S17PacketEntityLookMove [^Integer entity-id-in ^Long x-in ^Long y-in ^Long z-in ^Byte yaw-in ^Byte pitch-in ^Boolean on-ground-in]
    (new SPacketEntity$S17PacketEntityLookMove entity-id-in x-in y-in z-in yaw-in pitch-in on-ground-in))
  (^SPacketEntity$S17PacketEntityLookMove []
    (new SPacketEntity$S17PacketEntityLookMove )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity$S17PacketEntityLookMove this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity$S17PacketEntityLookMove this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

