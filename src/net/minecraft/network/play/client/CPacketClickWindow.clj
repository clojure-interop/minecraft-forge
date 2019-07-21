(ns net.minecraft.network.play.client.CPacketClickWindow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketClickWindow]))

(defn ->c-packet-click-window
  "Constructor.

  window-id-in - `int`
  slot-id-in - `int`
  used-button-in - `int`
  mode-in - `net.minecraft.inventory.ClickType`
  clicked-item-in - `net.minecraft.item.ItemStack`
  action-number-in - `short`"
  (^CPacketClickWindow [^Integer window-id-in ^Integer slot-id-in ^Integer used-button-in ^net.minecraft.inventory.ClickType mode-in ^net.minecraft.item.ItemStack clicked-item-in ^Short action-number-in]
    (new CPacketClickWindow window-id-in slot-id-in used-button-in mode-in clicked-item-in action-number-in))
  (^CPacketClickWindow []
    (new CPacketClickWindow )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketClickWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-click-type
  "returns: `net.minecraft.inventory.ClickType`"
  (^net.minecraft.inventory.ClickType [^CPacketClickWindow this]
    (-> this (.getClickType))))

(defn get-used-button
  "returns: `int`"
  (^Integer [^CPacketClickWindow this]
    (-> this (.getUsedButton))))

(defn get-slot-id
  "returns: `int`"
  (^Integer [^CPacketClickWindow this]
    (-> this (.getSlotId))))

(defn get-action-number
  "returns: `short`"
  (^Short [^CPacketClickWindow this]
    (-> this (.getActionNumber))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketClickWindow this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-clicked-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^CPacketClickWindow this]
    (-> this (.getClickedItem))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^CPacketClickWindow this]
    (-> this (.getWindowId))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketClickWindow this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

