(ns net.minecraft.network.play.server.SPacketEntity$S15PacketEntityRelMove
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntity$S15PacketEntityRelMove]))

(defn ->s-15-packet-entity-rel-move
  "Constructor.

  entity-id-in - `int`
  x-in - `long`
  y-in - `long`
  z-in - `long`
  on-ground-in - `boolean`"
  (^SPacketEntity$S15PacketEntityRelMove [^Integer entity-id-in ^Long x-in ^Long y-in ^Long z-in ^Boolean on-ground-in]
    (new SPacketEntity$S15PacketEntityRelMove entity-id-in x-in y-in z-in on-ground-in))
  (^SPacketEntity$S15PacketEntityRelMove []
    (new SPacketEntity$S15PacketEntityRelMove )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity$S15PacketEntityRelMove this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntity$S15PacketEntityRelMove this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

