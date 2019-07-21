(ns net.minecraft.network.play.INetHandlerPlayServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play INetHandlerPlayServer]))

(defn process-client-settings
  "packet-in - `net.minecraft.network.play.client.CPacketClientSettings`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketClientSettings packet-in]
    (-> this (.processClientSettings packet-in))))

(defn handle-spectate
  "packet-in - `net.minecraft.network.play.client.CPacketSpectate`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketSpectate packet-in]
    (-> this (.handleSpectate packet-in))))

(defn process-click-window
  "packet-in - `net.minecraft.network.play.client.CPacketClickWindow`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketClickWindow packet-in]
    (-> this (.processClickWindow packet-in))))

(defn process-update-sign
  "packet-in - `net.minecraft.network.play.client.CPacketUpdateSign`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketUpdateSign packet-in]
    (-> this (.processUpdateSign packet-in))))

(defn process-player-digging
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerDigging`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerDigging packet-in]
    (-> this (.processPlayerDigging packet-in))))

(defn process-try-use-item-on-block
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock packet-in]
    (-> this (.processTryUseItemOnBlock packet-in))))

(defn handle-resource-pack-status
  "packet-in - `net.minecraft.network.play.client.CPacketResourcePackStatus`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketResourcePackStatus packet-in]
    (-> this (.handleResourcePackStatus packet-in))))

(defn process-confirm-teleport
  "packet-in - `net.minecraft.network.play.client.CPacketConfirmTeleport`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketConfirmTeleport packet-in]
    (-> this (.processConfirmTeleport packet-in))))

(defn process-client-status
  "packet-in - `net.minecraft.network.play.client.CPacketClientStatus`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketClientStatus packet-in]
    (-> this (.processClientStatus packet-in))))

(defn handle-animation
  "packet-in - `net.minecraft.network.play.client.CPacketAnimation`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketAnimation packet-in]
    (-> this (.handleAnimation packet-in))))

(defn process-keep-alive
  "packet-in - `net.minecraft.network.play.client.CPacketKeepAlive`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketKeepAlive packet-in]
    (-> this (.processKeepAlive packet-in))))

(defn process-try-use-item
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerTryUseItem`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerTryUseItem packet-in]
    (-> this (.processTryUseItem packet-in))))

(defn process-steer-boat
  "packet-in - `net.minecraft.network.play.client.CPacketSteerBoat`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketSteerBoat packet-in]
    (-> this (.processSteerBoat packet-in))))

(defn process-player-abilities
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerAbilities`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerAbilities packet-in]
    (-> this (.processPlayerAbilities packet-in))))

(defn process-enchant-item
  "packet-in - `net.minecraft.network.play.client.CPacketEnchantItem`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketEnchantItem packet-in]
    (-> this (.processEnchantItem packet-in))))

(defn process-confirm-transaction
  "packet-in - `net.minecraft.network.play.client.CPacketConfirmTransaction`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketConfirmTransaction packet-in]
    (-> this (.processConfirmTransaction packet-in))))

(defn process-input
  "packet-in - `net.minecraft.network.play.client.CPacketInput`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketInput packet-in]
    (-> this (.processInput packet-in))))

(defn process-use-entity
  "packet-in - `net.minecraft.network.play.client.CPacketUseEntity`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketUseEntity packet-in]
    (-> this (.processUseEntity packet-in))))

(defn process-chat-message
  "packet-in - `net.minecraft.network.play.client.CPacketChatMessage`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketChatMessage packet-in]
    (-> this (.processChatMessage packet-in))))

(defn process-custom-payload
  "packet-in - `net.minecraft.network.play.client.CPacketCustomPayload`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketCustomPayload packet-in]
    (-> this (.processCustomPayload packet-in))))

(defn process-held-item-change
  "packet-in - `net.minecraft.network.play.client.CPacketHeldItemChange`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketHeldItemChange packet-in]
    (-> this (.processHeldItemChange packet-in))))

(defn process-player
  "packet-in - `net.minecraft.network.play.client.CPacketPlayer`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayer packet-in]
    (-> this (.processPlayer packet-in))))

(defn process-creative-inventory-action
  "packet-in - `net.minecraft.network.play.client.CPacketCreativeInventoryAction`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketCreativeInventoryAction packet-in]
    (-> this (.processCreativeInventoryAction packet-in))))

(defn process-close-window
  "packet-in - `net.minecraft.network.play.client.CPacketCloseWindow`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketCloseWindow packet-in]
    (-> this (.processCloseWindow packet-in))))

(defn process-vehicle-move
  "packet-in - `net.minecraft.network.play.client.CPacketVehicleMove`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketVehicleMove packet-in]
    (-> this (.processVehicleMove packet-in))))

(defn process-tab-complete
  "packet-in - `net.minecraft.network.play.client.CPacketTabComplete`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketTabComplete packet-in]
    (-> this (.processTabComplete packet-in))))

(defn process-entity-action
  "packet-in - `net.minecraft.network.play.client.CPacketEntityAction`"
  ([^INetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketEntityAction packet-in]
    (-> this (.processEntityAction packet-in))))

