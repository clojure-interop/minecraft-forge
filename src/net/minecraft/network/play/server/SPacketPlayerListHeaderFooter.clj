(ns net.minecraft.network.play.server.SPacketPlayerListHeaderFooter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketPlayerListHeaderFooter]))

(defn ->s-packet-player-list-header-footer
  "Constructor.

  header-in - `net.minecraft.util.text.ITextComponent`"
  (^SPacketPlayerListHeaderFooter [^net.minecraft.util.text.ITextComponent header-in]
    (new SPacketPlayerListHeaderFooter header-in))
  (^SPacketPlayerListHeaderFooter []
    (new SPacketPlayerListHeaderFooter )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerListHeaderFooter this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerListHeaderFooter this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketPlayerListHeaderFooter this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-header
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketPlayerListHeaderFooter this]
    (-> this (.getHeader))))

(defn get-footer
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketPlayerListHeaderFooter this]
    (-> this (.getFooter))))

