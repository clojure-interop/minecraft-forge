(ns net.minecraft.network.play.server.SPacketSignEditorOpen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSignEditorOpen]))

(defn ->s-packet-sign-editor-open
  "Constructor.

  pos-in - `net.minecraft.util.math.BlockPos`"
  (^SPacketSignEditorOpen [^net.minecraft.util.math.BlockPos pos-in]
    (new SPacketSignEditorOpen pos-in))
  (^SPacketSignEditorOpen []
    (new SPacketSignEditorOpen )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSignEditorOpen this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSignEditorOpen this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSignEditorOpen this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-sign-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketSignEditorOpen this]
    (-> this (.getSignPosition))))

