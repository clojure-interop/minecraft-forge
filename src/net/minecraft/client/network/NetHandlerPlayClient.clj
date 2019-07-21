(ns net.minecraft.client.network.NetHandlerPlayClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network NetHandlerPlayClient]))

(defn ->net-handler-play-client
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  p-i-46300-2 - `net.minecraft.client.gui.GuiScreen`
  network-manager-in - `net.minecraft.network.NetworkManager`
  profile-in - `com.mojang.authlib.GameProfile`"
  (^NetHandlerPlayClient [^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.gui.GuiScreen p-i-46300-2 ^net.minecraft.network.NetworkManager network-manager-in ^com.mojang.authlib.GameProfile profile-in]
    (new NetHandlerPlayClient mc-in p-i-46300-2 network-manager-in profile-in)))

(defn current-server-max-players
  "Instance Field.

  type: int"
  (^Integer [^NetHandlerPlayClient this]
    (-> this .-currentServerMaxPlayers)))

(defn send-packet
  "packet-in - `net.minecraft.network.Packet`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacket packet-in))))

(defn handle-disconnect
  "packet-in - `net.minecraft.network.play.server.SPacketDisconnect`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketDisconnect packet-in]
    (-> this (.handleDisconnect packet-in))))

(defn handle-destroy-entities
  "packet-in - `net.minecraft.network.play.server.SPacketDestroyEntities`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketDestroyEntities packet-in]
    (-> this (.handleDestroyEntities packet-in))))

(defn handle-block-change
  "packet-in - `net.minecraft.network.play.server.SPacketBlockChange`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketBlockChange packet-in]
    (-> this (.handleBlockChange packet-in))))

(defn handle-maps
  "packet-in - `net.minecraft.network.play.server.SPacketMaps`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketMaps packet-in]
    (-> this (.handleMaps packet-in))))

(defn cleanup
  ""
  ([^NetHandlerPlayClient this]
    (-> this (.cleanup))))

(defn handle-player-list-header-footer
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerListHeaderFooter`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerListHeaderFooter packet-in]
    (-> this (.handlePlayerListHeaderFooter packet-in))))

(defn get-player-info-map
  "returns: `java.util.Collection<net.minecraft.client.network.NetworkPlayerInfo>`"
  (^java.util.Collection [^NetHandlerPlayClient this]
    (-> this (.getPlayerInfoMap))))

(defn handle-scoreboard-objective
  "packet-in - `net.minecraft.network.play.server.SPacketScoreboardObjective`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketScoreboardObjective packet-in]
    (-> this (.handleScoreboardObjective packet-in))))

(defn handle-update-tile-entity
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateTileEntity packet-in]
    (-> this (.handleUpdateTileEntity packet-in))))

(defn handle-title
  "packet-in - `net.minecraft.network.play.server.SPacketTitle`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTitle packet-in]
    (-> this (.handleTitle packet-in))))

(defn handle-block-break-anim
  "packet-in - `net.minecraft.network.play.server.SPacketBlockBreakAnim`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketBlockBreakAnim packet-in]
    (-> this (.handleBlockBreakAnim packet-in))))

(defn handle-sound-effect
  "packet-in - `net.minecraft.network.play.server.SPacketSoundEffect`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSoundEffect packet-in]
    (-> this (.handleSoundEffect packet-in))))

(defn handle-tab-complete
  "packet-in - `net.minecraft.network.play.server.SPacketTabComplete`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTabComplete packet-in]
    (-> this (.handleTabComplete packet-in))))

(defn handle-spawn-position
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnPosition`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnPosition packet-in]
    (-> this (.handleSpawnPosition packet-in))))

(defn handle-statistics
  "packet-in - `net.minecraft.network.play.server.SPacketStatistics`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketStatistics packet-in]
    (-> this (.handleStatistics packet-in))))

(defn handle-entity-equipment
  "packet-in - `net.minecraft.network.play.server.SPacketEntityEquipment`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityEquipment packet-in]
    (-> this (.handleEntityEquipment packet-in))))

(defn handle-entity-metadata
  "packet-in - `net.minecraft.network.play.server.SPacketEntityMetadata`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityMetadata packet-in]
    (-> this (.handleEntityMetadata packet-in))))

(defn handle-set-passengers
  "packet-in - `net.minecraft.network.play.server.SPacketSetPassengers`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSetPassengers packet-in]
    (-> this (.handleSetPassengers packet-in))))

(defn handle-close-window
  "packet-in - `net.minecraft.network.play.server.SPacketCloseWindow`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCloseWindow packet-in]
    (-> this (.handleCloseWindow packet-in))))

(defn handle-cooldown
  "packet-in - `net.minecraft.network.play.server.SPacketCooldown`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCooldown packet-in]
    (-> this (.handleCooldown packet-in))))

(defn handle-animation
  "packet-in - `net.minecraft.network.play.server.SPacketAnimation`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketAnimation packet-in]
    (-> this (.handleAnimation packet-in))))

(defn handle-update-boss-info
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateBossInfo`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateBossInfo packet-in]
    (-> this (.handleUpdateBossInfo packet-in))))

(defn handle-camera
  "packet-in - `net.minecraft.network.play.server.SPacketCamera`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCamera packet-in]
    (-> this (.handleCamera packet-in))))

(defn handle-window-items
  "packet-in - `net.minecraft.network.play.server.SPacketWindowItems`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketWindowItems packet-in]
    (-> this (.handleWindowItems packet-in))))

(defn handle-set-slot
  "packet-in - `net.minecraft.network.play.server.SPacketSetSlot`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSetSlot packet-in]
    (-> this (.handleSetSlot packet-in))))

(defn handle-entity-attach
  "packet-in - `net.minecraft.network.play.server.SPacketEntityAttach`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityAttach packet-in]
    (-> this (.handleEntityAttach packet-in))))

(defn handle-entity-status
  "packet-in - `net.minecraft.network.play.server.SPacketEntityStatus`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityStatus packet-in]
    (-> this (.handleEntityStatus packet-in))))

(defn handle-chunk-data
  "packet-in - `net.minecraft.network.play.server.SPacketChunkData`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketChunkData packet-in]
    (-> this (.handleChunkData packet-in))))

(defn handle-set-experience
  "packet-in - `net.minecraft.network.play.server.SPacketSetExperience`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSetExperience packet-in]
    (-> this (.handleSetExperience packet-in))))

(defn handle-entity-head-look
  "packet-in - `net.minecraft.network.play.server.SPacketEntityHeadLook`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityHeadLook packet-in]
    (-> this (.handleEntityHeadLook packet-in))))

(defn handle-server-difficulty
  "packet-in - `net.minecraft.network.play.server.SPacketServerDifficulty`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketServerDifficulty packet-in]
    (-> this (.handleServerDifficulty packet-in))))

(defn handle-effect
  "packet-in - `net.minecraft.network.play.server.SPacketEffect`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEffect packet-in]
    (-> this (.handleEffect packet-in))))

(defn handle-spawn-global-entity
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnGlobalEntity`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnGlobalEntity packet-in]
    (-> this (.handleSpawnGlobalEntity packet-in))))

(defn handle-explosion
  "packet-in - `net.minecraft.network.play.server.SPacketExplosion`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketExplosion packet-in]
    (-> this (.handleExplosion packet-in))))

(defn handle-particles
  "packet-in - `net.minecraft.network.play.server.SPacketParticles`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketParticles packet-in]
    (-> this (.handleParticles packet-in))))

(defn handle-update-score
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateScore`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateScore packet-in]
    (-> this (.handleUpdateScore packet-in))))

(defn handle-confirm-transaction
  "packet-in - `net.minecraft.network.play.server.SPacketConfirmTransaction`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketConfirmTransaction packet-in]
    (-> this (.handleConfirmTransaction packet-in))))

(defn get-network-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^NetHandlerPlayClient this]
    (-> this (.getNetworkManager))))

(defn handle-spawn-player
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnPlayer`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnPlayer packet-in]
    (-> this (.handleSpawnPlayer packet-in))))

(defn handle-world-border
  "packet-in - `net.minecraft.network.play.server.SPacketWorldBorder`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketWorldBorder packet-in]
    (-> this (.handleWorldBorder packet-in))))

(defn handle-entity-movement
  "packet-in - `net.minecraft.network.play.server.SPacketEntity`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntity packet-in]
    (-> this (.handleEntityMovement packet-in))))

(defn handle-chat
  "packet-in - `net.minecraft.network.play.server.SPacketChat`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketChat packet-in]
    (-> this (.handleChat packet-in))))

(defn handle-custom-sound
  "packet-in - `net.minecraft.network.play.server.SPacketCustomSound`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCustomSound packet-in]
    (-> this (.handleCustomSound packet-in))))

(defn handle-join-game
  "packet-in - `net.minecraft.network.play.server.SPacketJoinGame`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketJoinGame packet-in]
    (-> this (.handleJoinGame packet-in))))

(defn handle-change-game-state
  "packet-in - `net.minecraft.network.play.server.SPacketChangeGameState`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketChangeGameState packet-in]
    (-> this (.handleChangeGameState packet-in))))

(defn handle-update-health
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateHealth`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateHealth packet-in]
    (-> this (.handleUpdateHealth packet-in))))

(defn handle-teams
  "packet-in - `net.minecraft.network.play.server.SPacketTeams`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTeams packet-in]
    (-> this (.handleTeams packet-in))))

(defn handle-combat-event
  "packet-in - `net.minecraft.network.play.server.SPacketCombatEvent`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCombatEvent packet-in]
    (-> this (.handleCombatEvent packet-in))))

(defn handle-player-abilities
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerAbilities`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerAbilities packet-in]
    (-> this (.handlePlayerAbilities packet-in))))

(defn process-chunk-unload
  "packet-in - `net.minecraft.network.play.server.SPacketUnloadChunk`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUnloadChunk packet-in]
    (-> this (.processChunkUnload packet-in))))

(defn handle-move-vehicle
  "packet-in - `net.minecraft.network.play.server.SPacketMoveVehicle`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketMoveVehicle packet-in]
    (-> this (.handleMoveVehicle packet-in))))

(defn get-game-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^NetHandlerPlayClient this]
    (-> this (.getGameProfile))))

(defn handle-respawn
  "packet-in - `net.minecraft.network.play.server.SPacketRespawn`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketRespawn packet-in]
    (-> this (.handleRespawn packet-in))))

(defn handle-multi-block-change
  "packet-in - `net.minecraft.network.play.server.SPacketMultiBlockChange`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketMultiBlockChange packet-in]
    (-> this (.handleMultiBlockChange packet-in))))

(defn handle-collect-item
  "packet-in - `net.minecraft.network.play.server.SPacketCollectItem`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCollectItem packet-in]
    (-> this (.handleCollectItem packet-in))))

(defn handle-custom-payload
  "packet-in - `net.minecraft.network.play.server.SPacketCustomPayload`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCustomPayload packet-in]
    (-> this (.handleCustomPayload packet-in))))

(defn handle-time-update
  "packet-in - `net.minecraft.network.play.server.SPacketTimeUpdate`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTimeUpdate packet-in]
    (-> this (.handleTimeUpdate packet-in))))

(defn handle-use-bed
  "packet-in - `net.minecraft.network.play.server.SPacketUseBed`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUseBed packet-in]
    (-> this (.handleUseBed packet-in))))

(defn handle-spawn-painting
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnPainting`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnPainting packet-in]
    (-> this (.handleSpawnPainting packet-in))))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerPlayClient this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

(defn handle-window-property
  "packet-in - `net.minecraft.network.play.server.SPacketWindowProperty`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketWindowProperty packet-in]
    (-> this (.handleWindowProperty packet-in))))

(defn handle-sign-editor-open
  "packet-in - `net.minecraft.network.play.server.SPacketSignEditorOpen`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSignEditorOpen packet-in]
    (-> this (.handleSignEditorOpen packet-in))))

(defn handle-entity-effect
  "packet-in - `net.minecraft.network.play.server.SPacketEntityEffect`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityEffect packet-in]
    (-> this (.handleEntityEffect packet-in))))

(defn handle-resource-pack
  "packet-in - `net.minecraft.network.play.server.SPacketResourcePackSend`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketResourcePackSend packet-in]
    (-> this (.handleResourcePack packet-in))))

(defn handle-held-item-change
  "packet-in - `net.minecraft.network.play.server.SPacketHeldItemChange`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketHeldItemChange packet-in]
    (-> this (.handleHeldItemChange packet-in))))

(defn handle-spawn-experience-orb
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnExperienceOrb`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnExperienceOrb packet-in]
    (-> this (.handleSpawnExperienceOrb packet-in))))

(defn handle-entity-teleport
  "packet-in - `net.minecraft.network.play.server.SPacketEntityTeleport`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityTeleport packet-in]
    (-> this (.handleEntityTeleport packet-in))))

(defn handle-open-window
  "packet-in - `net.minecraft.network.play.server.SPacketOpenWindow`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketOpenWindow packet-in]
    (-> this (.handleOpenWindow packet-in))))

(defn handle-block-action
  "packet-in - `net.minecraft.network.play.server.SPacketBlockAction`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketBlockAction packet-in]
    (-> this (.handleBlockAction packet-in))))

(defn handle-spawn-mob
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnMob`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnMob packet-in]
    (-> this (.handleSpawnMob packet-in))))

(defn get-player-info
  "unique-id - `java.util.UUID`

  returns: `net.minecraft.client.network.NetworkPlayerInfo`"
  (^net.minecraft.client.network.NetworkPlayerInfo [^NetHandlerPlayClient this ^java.util.UUID unique-id]
    (-> this (.getPlayerInfo unique-id))))

(defn handle-player-list-item
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerListItem`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerListItem packet-in]
    (-> this (.handlePlayerListItem packet-in))))

(defn handle-entity-velocity
  "packet-in - `net.minecraft.network.play.server.SPacketEntityVelocity`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityVelocity packet-in]
    (-> this (.handleEntityVelocity packet-in))))

(defn handle-display-objective
  "packet-in - `net.minecraft.network.play.server.SPacketDisplayObjective`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketDisplayObjective packet-in]
    (-> this (.handleDisplayObjective packet-in))))

(defn handle-keep-alive
  "packet-in - `net.minecraft.network.play.server.SPacketKeepAlive`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketKeepAlive packet-in]
    (-> this (.handleKeepAlive packet-in))))

(defn handle-player-pos-look
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerPosLook`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerPosLook packet-in]
    (-> this (.handlePlayerPosLook packet-in))))

(defn handle-remove-entity-effect
  "packet-in - `net.minecraft.network.play.server.SPacketRemoveEntityEffect`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketRemoveEntityEffect packet-in]
    (-> this (.handleRemoveEntityEffect packet-in))))

(defn handle-entity-properties
  "packet-in - `net.minecraft.network.play.server.SPacketEntityProperties`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityProperties packet-in]
    (-> this (.handleEntityProperties packet-in))))

(defn handle-spawn-object
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnObject`"
  ([^NetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnObject packet-in]
    (-> this (.handleSpawnObject packet-in))))

