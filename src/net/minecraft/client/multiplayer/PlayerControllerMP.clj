(ns net.minecraft.client.multiplayer.PlayerControllerMP
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer PlayerControllerMP]))

(defn ->player-controller-mp
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  net-handler - `net.minecraft.client.network.NetHandlerPlayClient`"
  (^PlayerControllerMP [^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.network.NetHandlerPlayClient net-handler]
    (new PlayerControllerMP mc-in net-handler)))

(defn *click-block-creative
  "mc-in - `net.minecraft.client.Minecraft`
  player-controller - `net.minecraft.client.multiplayer.PlayerControllerMP`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`"
  ([^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.multiplayer.PlayerControllerMP player-controller ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing]
    (PlayerControllerMP/clickBlockCreative mc-in player-controller pos facing)))

(defn get-current-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^PlayerControllerMP this]
    (-> this (.getCurrentGameType))))

(defn send-packet-drop-item
  "item-stack-in - `net.minecraft.item.ItemStack`"
  ([^PlayerControllerMP this ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.sendPacketDropItem item-stack-in))))

(defn attack-entity
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  target-entity - `net.minecraft.entity.Entity`"
  ([^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.entity.Entity target-entity]
    (-> this (.attackEntity player-in target-entity))))

(defn get-block-reach-distance
  "returns: `float`"
  (^Float [^PlayerControllerMP this]
    (-> this (.getBlockReachDistance))))

(defn process-right-click-block
  "player - `net.minecraft.client.entity.EntityPlayerSP`
  world-in - `net.minecraft.client.multiplayer.WorldClient`
  stack - `net.minecraft.util.math.BlockPos`
  pos - `net.minecraft.util.EnumFacing`
  facing - `net.minecraft.util.math.Vec3d`
  vec - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^PlayerControllerMP this ^net.minecraft.client.entity.EntityPlayerSP player ^net.minecraft.client.multiplayer.WorldClient world-in ^net.minecraft.util.math.BlockPos stack ^net.minecraft.util.EnumFacing pos ^net.minecraft.util.math.Vec3d facing ^net.minecraft.util.EnumHand vec]
    (-> this (.processRightClickBlock player world-in stack pos facing vec))))

(defn interact-with-entity
  "player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.Entity`
  raytrace - `net.minecraft.util.math.RayTraceResult`
  held-item - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity target ^net.minecraft.util.math.RayTraceResult raytrace ^net.minecraft.util.EnumHand held-item]
    (-> this (.interactWithEntity player target raytrace held-item)))
  (^net.minecraft.util.EnumActionResult [^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity target ^net.minecraft.util.EnumHand held-item]
    (-> this (.interactWithEntity player target held-item))))

(defn create-client-player
  "world-in - `net.minecraft.world.World`
  stat-writer - `net.minecraft.stats.StatisticsManager`

  returns: `net.minecraft.client.entity.EntityPlayerSP`"
  (^net.minecraft.client.entity.EntityPlayerSP [^PlayerControllerMP this ^net.minecraft.world.World world-in ^net.minecraft.stats.StatisticsManager stat-writer]
    (-> this (.createClientPlayer world-in stat-writer))))

(defn send-enchant-packet
  "window-id - `int`
  button - `int`"
  ([^PlayerControllerMP this ^Integer window-id ^Integer button]
    (-> this (.sendEnchantPacket window-id button))))

(defn in-creative-mode?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.isInCreativeMode))))

(defn window-click
  "window-id - `int`
  slot-id - `int`
  mouse-button - `int`
  type - `net.minecraft.inventory.ClickType`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PlayerControllerMP this ^Integer window-id ^Integer slot-id ^Integer mouse-button ^net.minecraft.inventory.ClickType type ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.windowClick window-id slot-id mouse-button type player))))

(defn process-right-click
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  stack - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.EnumHand stack]
    (-> this (.processRightClick player world-in stack))))

(defn game-is-survival-or-adventure
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.gameIsSurvivalOrAdventure))))

(defn pick-item
  "index - `int`"
  ([^PlayerControllerMP this ^Integer index]
    (-> this (.pickItem index))))

(defn not-creative?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.isNotCreative))))

(defn spectator?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.isSpectator))))

(defn update-controller
  ""
  ([^PlayerControllerMP this]
    (-> this (.updateController))))

(defn riding-horse?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.isRidingHorse))))

(defn set-player-capabilities
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.setPlayerCapabilities player))))

(defn on-player-damage-block
  "pos-block - `net.minecraft.util.math.BlockPos`
  direction-facing - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^PlayerControllerMP this ^net.minecraft.util.math.BlockPos pos-block ^net.minecraft.util.EnumFacing direction-facing]
    (-> this (.onPlayerDamageBlock pos-block direction-facing))))

(defn reset-block-removing
  ""
  ([^PlayerControllerMP this]
    (-> this (.resetBlockRemoving))))

(defn spectator-mode?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.isSpectatorMode))))

(defn set-game-type
  "type - `net.minecraft.world.GameType`"
  ([^PlayerControllerMP this ^net.minecraft.world.GameType type]
    (-> this (.setGameType type))))

(defn send-slot-packet
  "item-stack-in - `net.minecraft.item.ItemStack`
  slot-id - `int`"
  ([^PlayerControllerMP this ^net.minecraft.item.ItemStack item-stack-in ^Integer slot-id]
    (-> this (.sendSlotPacket item-stack-in slot-id))))

(defn flip-player
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.flipPlayer player-in))))

(defn extended-reach
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.extendedReach))))

(defn on-player-destroy-block
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^PlayerControllerMP this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.onPlayerDestroyBlock pos))))

(defn get-is-hitting-block?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.getIsHittingBlock))))

(defn should-draw-hud?
  "returns: `boolean`"
  (^Boolean [^PlayerControllerMP this]
    (-> this (.shouldDrawHUD))))

(defn on-stopped-using-item
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^PlayerControllerMP this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onStoppedUsingItem player-in))))

(defn click-block
  "loc - `net.minecraft.util.math.BlockPos`
  face - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^PlayerControllerMP this ^net.minecraft.util.math.BlockPos loc ^net.minecraft.util.EnumFacing face]
    (-> this (.clickBlock loc face))))

