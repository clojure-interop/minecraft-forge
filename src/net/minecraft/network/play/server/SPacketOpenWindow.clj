(ns net.minecraft.network.play.server.SPacketOpenWindow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketOpenWindow]))

(defn ->s-packet-open-window
  "Constructor.

  window-id-in - `int`
  inventory-type-in - `java.lang.String`
  window-title-in - `net.minecraft.util.text.ITextComponent`
  slot-count-in - `int`
  entity-id-in - `int`"
  (^SPacketOpenWindow [^Integer window-id-in ^java.lang.String inventory-type-in ^net.minecraft.util.text.ITextComponent window-title-in ^Integer slot-count-in ^Integer entity-id-in]
    (new SPacketOpenWindow window-id-in inventory-type-in window-title-in slot-count-in entity-id-in))
  (^SPacketOpenWindow [^Integer window-id-in ^java.lang.String inventory-type-in ^net.minecraft.util.text.ITextComponent window-title-in ^Integer slot-count-in]
    (new SPacketOpenWindow window-id-in inventory-type-in window-title-in slot-count-in))
  (^SPacketOpenWindow [^Integer window-id-in ^java.lang.String inventory-type-in ^net.minecraft.util.text.ITextComponent window-title-in]
    (new SPacketOpenWindow window-id-in inventory-type-in window-title-in))
  (^SPacketOpenWindow []
    (new SPacketOpenWindow )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketOpenWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn has-slots?
  "returns: `boolean`"
  (^Boolean [^SPacketOpenWindow this]
    (-> this (.hasSlots))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketOpenWindow this]
    (-> this (.getGuiId))))

(defn get-window-title
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketOpenWindow this]
    (-> this (.getWindowTitle))))

(defn get-slot-count
  "returns: `int`"
  (^Integer [^SPacketOpenWindow this]
    (-> this (.getSlotCount))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketOpenWindow this]
    (-> this (.getEntityId))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketOpenWindow this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^SPacketOpenWindow this]
    (-> this (.getWindowId))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketOpenWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

