(ns net.minecraft.network.play.INetHandlerPlayClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play INetHandlerPlayClient]))

(defn handle-disconnect
  "packet-in - `net.minecraft.network.play.server.SPacketDisconnect`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketDisconnect packet-in]
    (-> this (.handleDisconnect packet-in))))

(defn handle-destroy-entities
  "packet-in - `net.minecraft.network.play.server.SPacketDestroyEntities`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketDestroyEntities packet-in]
    (-> this (.handleDestroyEntities packet-in))))

(defn handle-block-change
  "packet-in - `net.minecraft.network.play.server.SPacketBlockChange`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketBlockChange packet-in]
    (-> this (.handleBlockChange packet-in))))

(defn handle-maps
  "packet-in - `net.minecraft.network.play.server.SPacketMaps`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketMaps packet-in]
    (-> this (.handleMaps packet-in))))

(defn handle-player-list-header-footer
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerListHeaderFooter`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerListHeaderFooter packet-in]
    (-> this (.handlePlayerListHeaderFooter packet-in))))

(defn handle-scoreboard-objective
  "packet-in - `net.minecraft.network.play.server.SPacketScoreboardObjective`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketScoreboardObjective packet-in]
    (-> this (.handleScoreboardObjective packet-in))))

(defn handle-update-tile-entity
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateTileEntity packet-in]
    (-> this (.handleUpdateTileEntity packet-in))))

(defn handle-title
  "packet-in - `net.minecraft.network.play.server.SPacketTitle`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTitle packet-in]
    (-> this (.handleTitle packet-in))))

(defn handle-block-break-anim
  "packet-in - `net.minecraft.network.play.server.SPacketBlockBreakAnim`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketBlockBreakAnim packet-in]
    (-> this (.handleBlockBreakAnim packet-in))))

(defn handle-sound-effect
  "packet-in - `net.minecraft.network.play.server.SPacketSoundEffect`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSoundEffect packet-in]
    (-> this (.handleSoundEffect packet-in))))

(defn handle-tab-complete
  "packet-in - `net.minecraft.network.play.server.SPacketTabComplete`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTabComplete packet-in]
    (-> this (.handleTabComplete packet-in))))

(defn handle-spawn-position
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnPosition`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnPosition packet-in]
    (-> this (.handleSpawnPosition packet-in))))

(defn handle-statistics
  "packet-in - `net.minecraft.network.play.server.SPacketStatistics`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketStatistics packet-in]
    (-> this (.handleStatistics packet-in))))

(defn handle-entity-equipment
  "packet-in - `net.minecraft.network.play.server.SPacketEntityEquipment`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityEquipment packet-in]
    (-> this (.handleEntityEquipment packet-in))))

(defn handle-entity-metadata
  "packet-in - `net.minecraft.network.play.server.SPacketEntityMetadata`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityMetadata packet-in]
    (-> this (.handleEntityMetadata packet-in))))

(defn handle-set-passengers
  "packet-in - `net.minecraft.network.play.server.SPacketSetPassengers`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSetPassengers packet-in]
    (-> this (.handleSetPassengers packet-in))))

(defn handle-close-window
  "packet-in - `net.minecraft.network.play.server.SPacketCloseWindow`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCloseWindow packet-in]
    (-> this (.handleCloseWindow packet-in))))

(defn handle-cooldown
  "packet-in - `net.minecraft.network.play.server.SPacketCooldown`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCooldown packet-in]
    (-> this (.handleCooldown packet-in))))

(defn handle-animation
  "packet-in - `net.minecraft.network.play.server.SPacketAnimation`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketAnimation packet-in]
    (-> this (.handleAnimation packet-in))))

(defn handle-update-boss-info
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateBossInfo`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateBossInfo packet-in]
    (-> this (.handleUpdateBossInfo packet-in))))

(defn handle-camera
  "packet-in - `net.minecraft.network.play.server.SPacketCamera`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCamera packet-in]
    (-> this (.handleCamera packet-in))))

(defn handle-window-items
  "packet-in - `net.minecraft.network.play.server.SPacketWindowItems`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketWindowItems packet-in]
    (-> this (.handleWindowItems packet-in))))

(defn handle-set-slot
  "packet-in - `net.minecraft.network.play.server.SPacketSetSlot`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSetSlot packet-in]
    (-> this (.handleSetSlot packet-in))))

(defn handle-entity-attach
  "packet-in - `net.minecraft.network.play.server.SPacketEntityAttach`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityAttach packet-in]
    (-> this (.handleEntityAttach packet-in))))

(defn handle-entity-status
  "packet-in - `net.minecraft.network.play.server.SPacketEntityStatus`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityStatus packet-in]
    (-> this (.handleEntityStatus packet-in))))

(defn handle-chunk-data
  "packet-in - `net.minecraft.network.play.server.SPacketChunkData`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketChunkData packet-in]
    (-> this (.handleChunkData packet-in))))

(defn handle-set-experience
  "packet-in - `net.minecraft.network.play.server.SPacketSetExperience`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSetExperience packet-in]
    (-> this (.handleSetExperience packet-in))))

(defn handle-entity-head-look
  "packet-in - `net.minecraft.network.play.server.SPacketEntityHeadLook`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityHeadLook packet-in]
    (-> this (.handleEntityHeadLook packet-in))))

(defn handle-server-difficulty
  "packet-in - `net.minecraft.network.play.server.SPacketServerDifficulty`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketServerDifficulty packet-in]
    (-> this (.handleServerDifficulty packet-in))))

(defn handle-effect
  "packet-in - `net.minecraft.network.play.server.SPacketEffect`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEffect packet-in]
    (-> this (.handleEffect packet-in))))

(defn handle-spawn-global-entity
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnGlobalEntity`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnGlobalEntity packet-in]
    (-> this (.handleSpawnGlobalEntity packet-in))))

(defn handle-explosion
  "packet-in - `net.minecraft.network.play.server.SPacketExplosion`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketExplosion packet-in]
    (-> this (.handleExplosion packet-in))))

(defn handle-particles
  "packet-in - `net.minecraft.network.play.server.SPacketParticles`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketParticles packet-in]
    (-> this (.handleParticles packet-in))))

(defn handle-update-score
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateScore`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateScore packet-in]
    (-> this (.handleUpdateScore packet-in))))

(defn handle-confirm-transaction
  "packet-in - `net.minecraft.network.play.server.SPacketConfirmTransaction`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketConfirmTransaction packet-in]
    (-> this (.handleConfirmTransaction packet-in))))

(defn handle-spawn-player
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnPlayer`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnPlayer packet-in]
    (-> this (.handleSpawnPlayer packet-in))))

(defn handle-world-border
  "packet-in - `net.minecraft.network.play.server.SPacketWorldBorder`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketWorldBorder packet-in]
    (-> this (.handleWorldBorder packet-in))))

(defn handle-entity-movement
  "packet-in - `net.minecraft.network.play.server.SPacketEntity`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntity packet-in]
    (-> this (.handleEntityMovement packet-in))))

(defn handle-chat
  "packet-in - `net.minecraft.network.play.server.SPacketChat`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketChat packet-in]
    (-> this (.handleChat packet-in))))

(defn handle-custom-sound
  "packet-in - `net.minecraft.network.play.server.SPacketCustomSound`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCustomSound packet-in]
    (-> this (.handleCustomSound packet-in))))

(defn handle-join-game
  "packet-in - `net.minecraft.network.play.server.SPacketJoinGame`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketJoinGame packet-in]
    (-> this (.handleJoinGame packet-in))))

(defn handle-change-game-state
  "packet-in - `net.minecraft.network.play.server.SPacketChangeGameState`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketChangeGameState packet-in]
    (-> this (.handleChangeGameState packet-in))))

(defn handle-update-health
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateHealth`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUpdateHealth packet-in]
    (-> this (.handleUpdateHealth packet-in))))

(defn handle-teams
  "packet-in - `net.minecraft.network.play.server.SPacketTeams`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTeams packet-in]
    (-> this (.handleTeams packet-in))))

(defn handle-combat-event
  "packet-in - `net.minecraft.network.play.server.SPacketCombatEvent`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCombatEvent packet-in]
    (-> this (.handleCombatEvent packet-in))))

(defn handle-player-abilities
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerAbilities`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerAbilities packet-in]
    (-> this (.handlePlayerAbilities packet-in))))

(defn process-chunk-unload
  "packet-in - `net.minecraft.network.play.server.SPacketUnloadChunk`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUnloadChunk packet-in]
    (-> this (.processChunkUnload packet-in))))

(defn handle-move-vehicle
  "packet-in - `net.minecraft.network.play.server.SPacketMoveVehicle`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketMoveVehicle packet-in]
    (-> this (.handleMoveVehicle packet-in))))

(defn handle-respawn
  "packet-in - `net.minecraft.network.play.server.SPacketRespawn`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketRespawn packet-in]
    (-> this (.handleRespawn packet-in))))

(defn handle-multi-block-change
  "packet-in - `net.minecraft.network.play.server.SPacketMultiBlockChange`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketMultiBlockChange packet-in]
    (-> this (.handleMultiBlockChange packet-in))))

(defn handle-collect-item
  "packet-in - `net.minecraft.network.play.server.SPacketCollectItem`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCollectItem packet-in]
    (-> this (.handleCollectItem packet-in))))

(defn handle-custom-payload
  "packet-in - `net.minecraft.network.play.server.SPacketCustomPayload`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketCustomPayload packet-in]
    (-> this (.handleCustomPayload packet-in))))

(defn handle-time-update
  "packet-in - `net.minecraft.network.play.server.SPacketTimeUpdate`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketTimeUpdate packet-in]
    (-> this (.handleTimeUpdate packet-in))))

(defn handle-use-bed
  "packet-in - `net.minecraft.network.play.server.SPacketUseBed`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketUseBed packet-in]
    (-> this (.handleUseBed packet-in))))

(defn handle-spawn-painting
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnPainting`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnPainting packet-in]
    (-> this (.handleSpawnPainting packet-in))))

(defn handle-window-property
  "packet-in - `net.minecraft.network.play.server.SPacketWindowProperty`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketWindowProperty packet-in]
    (-> this (.handleWindowProperty packet-in))))

(defn handle-sign-editor-open
  "packet-in - `net.minecraft.network.play.server.SPacketSignEditorOpen`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSignEditorOpen packet-in]
    (-> this (.handleSignEditorOpen packet-in))))

(defn handle-entity-effect
  "packet-in - `net.minecraft.network.play.server.SPacketEntityEffect`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityEffect packet-in]
    (-> this (.handleEntityEffect packet-in))))

(defn handle-resource-pack
  "packet-in - `net.minecraft.network.play.server.SPacketResourcePackSend`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketResourcePackSend packet-in]
    (-> this (.handleResourcePack packet-in))))

(defn handle-held-item-change
  "packet-in - `net.minecraft.network.play.server.SPacketHeldItemChange`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketHeldItemChange packet-in]
    (-> this (.handleHeldItemChange packet-in))))

(defn handle-spawn-experience-orb
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnExperienceOrb`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnExperienceOrb packet-in]
    (-> this (.handleSpawnExperienceOrb packet-in))))

(defn handle-entity-teleport
  "packet-in - `net.minecraft.network.play.server.SPacketEntityTeleport`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityTeleport packet-in]
    (-> this (.handleEntityTeleport packet-in))))

(defn handle-open-window
  "packet-in - `net.minecraft.network.play.server.SPacketOpenWindow`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketOpenWindow packet-in]
    (-> this (.handleOpenWindow packet-in))))

(defn handle-block-action
  "packet-in - `net.minecraft.network.play.server.SPacketBlockAction`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketBlockAction packet-in]
    (-> this (.handleBlockAction packet-in))))

(defn handle-spawn-mob
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnMob`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnMob packet-in]
    (-> this (.handleSpawnMob packet-in))))

(defn handle-player-list-item
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerListItem`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerListItem packet-in]
    (-> this (.handlePlayerListItem packet-in))))

(defn handle-entity-velocity
  "packet-in - `net.minecraft.network.play.server.SPacketEntityVelocity`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityVelocity packet-in]
    (-> this (.handleEntityVelocity packet-in))))

(defn handle-display-objective
  "packet-in - `net.minecraft.network.play.server.SPacketDisplayObjective`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketDisplayObjective packet-in]
    (-> this (.handleDisplayObjective packet-in))))

(defn handle-keep-alive
  "packet-in - `net.minecraft.network.play.server.SPacketKeepAlive`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketKeepAlive packet-in]
    (-> this (.handleKeepAlive packet-in))))

(defn handle-player-pos-look
  "packet-in - `net.minecraft.network.play.server.SPacketPlayerPosLook`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketPlayerPosLook packet-in]
    (-> this (.handlePlayerPosLook packet-in))))

(defn handle-remove-entity-effect
  "packet-in - `net.minecraft.network.play.server.SPacketRemoveEntityEffect`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketRemoveEntityEffect packet-in]
    (-> this (.handleRemoveEntityEffect packet-in))))

(defn handle-entity-properties
  "packet-in - `net.minecraft.network.play.server.SPacketEntityProperties`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketEntityProperties packet-in]
    (-> this (.handleEntityProperties packet-in))))

(defn handle-spawn-object
  "packet-in - `net.minecraft.network.play.server.SPacketSpawnObject`"
  ([^INetHandlerPlayClient this ^net.minecraft.network.play.server.SPacketSpawnObject packet-in]
    (-> this (.handleSpawnObject packet-in))))

