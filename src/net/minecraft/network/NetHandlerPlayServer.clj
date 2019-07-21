(ns net.minecraft.network.NetHandlerPlayServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NetHandlerPlayServer]))

(defn ->net-handler-play-server
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`
  network-manager-in - `net.minecraft.network.NetworkManager`
  player-in - `net.minecraft.entity.player.EntityPlayerMP`"
  (^NetHandlerPlayServer [^net.minecraft.server.MinecraftServer server ^net.minecraft.network.NetworkManager network-manager-in ^net.minecraft.entity.player.EntityPlayerMP player-in]
    (new NetHandlerPlayServer server network-manager-in player-in)))

(defn net-manager
  "Instance Constant.

  type: net.minecraft.network.NetworkManager"
  (^net.minecraft.network.NetworkManager [^NetHandlerPlayServer this]
    (-> this .-netManager)))

(defn player-entity
  "Instance Field.

  type: net.minecraft.entity.player.EntityPlayerMP"
  (^net.minecraft.entity.player.EntityPlayerMP [^NetHandlerPlayServer this]
    (-> this .-playerEntity)))

(defn process-client-settings
  "packet-in - `net.minecraft.network.play.client.CPacketClientSettings`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketClientSettings packet-in]
    (-> this (.processClientSettings packet-in))))

(defn send-packet
  "packet-in - `net.minecraft.network.Packet`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacket packet-in))))

(defn handle-spectate
  "packet-in - `net.minecraft.network.play.client.CPacketSpectate`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketSpectate packet-in]
    (-> this (.handleSpectate packet-in))))

(defn process-click-window
  "packet-in - `net.minecraft.network.play.client.CPacketClickWindow`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketClickWindow packet-in]
    (-> this (.processClickWindow packet-in))))

(defn process-update-sign
  "packet-in - `net.minecraft.network.play.client.CPacketUpdateSign`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketUpdateSign packet-in]
    (-> this (.processUpdateSign packet-in))))

(defn process-player-digging
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerDigging`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerDigging packet-in]
    (-> this (.processPlayerDigging packet-in))))

(defn process-try-use-item-on-block
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock packet-in]
    (-> this (.processTryUseItemOnBlock packet-in))))

(defn handle-resource-pack-status
  "packet-in - `net.minecraft.network.play.client.CPacketResourcePackStatus`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketResourcePackStatus packet-in]
    (-> this (.handleResourcePackStatus packet-in))))

(defn disconnect
  "reason - `java.lang.String`"
  ([^NetHandlerPlayServer this ^java.lang.String reason]
    (-> this (.disconnect reason))))

(defn process-confirm-teleport
  "packet-in - `net.minecraft.network.play.client.CPacketConfirmTeleport`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketConfirmTeleport packet-in]
    (-> this (.processConfirmTeleport packet-in))))

(defn process-client-status
  "packet-in - `net.minecraft.network.play.client.CPacketClientStatus`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketClientStatus packet-in]
    (-> this (.processClientStatus packet-in))))

(defn handle-animation
  "packet-in - `net.minecraft.network.play.client.CPacketAnimation`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketAnimation packet-in]
    (-> this (.handleAnimation packet-in))))

(defn process-keep-alive
  "packet-in - `net.minecraft.network.play.client.CPacketKeepAlive`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketKeepAlive packet-in]
    (-> this (.processKeepAlive packet-in))))

(defn process-try-use-item
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerTryUseItem`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerTryUseItem packet-in]
    (-> this (.processTryUseItem packet-in))))

(defn process-steer-boat
  "packet-in - `net.minecraft.network.play.client.CPacketSteerBoat`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketSteerBoat packet-in]
    (-> this (.processSteerBoat packet-in))))

(defn process-player-abilities
  "packet-in - `net.minecraft.network.play.client.CPacketPlayerAbilities`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayerAbilities packet-in]
    (-> this (.processPlayerAbilities packet-in))))

(defn process-enchant-item
  "packet-in - `net.minecraft.network.play.client.CPacketEnchantItem`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketEnchantItem packet-in]
    (-> this (.processEnchantItem packet-in))))

(defn set-player-location
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  relative-set - `java.util.Set`"
  ([^NetHandlerPlayServer this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^java.util.Set relative-set]
    (-> this (.setPlayerLocation x y z yaw pitch relative-set)))
  ([^NetHandlerPlayServer this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch]
    (-> this (.setPlayerLocation x y z yaw pitch))))

(defn update
  ""
  ([^NetHandlerPlayServer this]
    (-> this (.update))))

(defn process-confirm-transaction
  "packet-in - `net.minecraft.network.play.client.CPacketConfirmTransaction`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketConfirmTransaction packet-in]
    (-> this (.processConfirmTransaction packet-in))))

(defn process-input
  "packet-in - `net.minecraft.network.play.client.CPacketInput`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketInput packet-in]
    (-> this (.processInput packet-in))))

(defn process-use-entity
  "packet-in - `net.minecraft.network.play.client.CPacketUseEntity`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketUseEntity packet-in]
    (-> this (.processUseEntity packet-in))))

(defn process-chat-message
  "packet-in - `net.minecraft.network.play.client.CPacketChatMessage`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketChatMessage packet-in]
    (-> this (.processChatMessage packet-in))))

(defn process-custom-payload
  "packet-in - `net.minecraft.network.play.client.CPacketCustomPayload`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketCustomPayload packet-in]
    (-> this (.processCustomPayload packet-in))))

(defn get-network-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^NetHandlerPlayServer this]
    (-> this (.getNetworkManager))))

(defn process-held-item-change
  "packet-in - `net.minecraft.network.play.client.CPacketHeldItemChange`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketHeldItemChange packet-in]
    (-> this (.processHeldItemChange packet-in))))

(defn process-player
  "packet-in - `net.minecraft.network.play.client.CPacketPlayer`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketPlayer packet-in]
    (-> this (.processPlayer packet-in))))

(defn process-creative-inventory-action
  "packet-in - `net.minecraft.network.play.client.CPacketCreativeInventoryAction`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketCreativeInventoryAction packet-in]
    (-> this (.processCreativeInventoryAction packet-in))))

(defn process-close-window
  "packet-in - `net.minecraft.network.play.client.CPacketCloseWindow`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketCloseWindow packet-in]
    (-> this (.processCloseWindow packet-in))))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerPlayServer this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

(defn process-vehicle-move
  "packet-in - `net.minecraft.network.play.client.CPacketVehicleMove`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketVehicleMove packet-in]
    (-> this (.processVehicleMove packet-in))))

(defn process-tab-complete
  "packet-in - `net.minecraft.network.play.client.CPacketTabComplete`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketTabComplete packet-in]
    (-> this (.processTabComplete packet-in))))

(defn process-entity-action
  "packet-in - `net.minecraft.network.play.client.CPacketEntityAction`"
  ([^NetHandlerPlayServer this ^net.minecraft.network.play.client.CPacketEntityAction packet-in]
    (-> this (.processEntityAction packet-in))))

