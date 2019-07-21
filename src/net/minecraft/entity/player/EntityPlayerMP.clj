(ns net.minecraft.entity.player.EntityPlayerMP
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player EntityPlayerMP]))

(defn ->entity-player-mp
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`
  world-in - `net.minecraft.world.WorldServer`
  profile - `com.mojang.authlib.GameProfile`
  interaction-manager-in - `net.minecraft.server.management.PlayerInteractionManager`"
  (^EntityPlayerMP [^net.minecraft.server.MinecraftServer server ^net.minecraft.world.WorldServer world-in ^com.mojang.authlib.GameProfile profile ^net.minecraft.server.management.PlayerInteractionManager interaction-manager-in]
    (new EntityPlayerMP server world-in profile interaction-manager-in)))

(defn connection
  "Instance Field.

  type: net.minecraft.network.NetHandlerPlayServer"
  (^net.minecraft.network.NetHandlerPlayServer [^EntityPlayerMP this]
    (-> this .-connection)))

(defn mc-server
  "Instance Constant.

  type: net.minecraft.server.MinecraftServer"
  (^net.minecraft.server.MinecraftServer [^EntityPlayerMP this]
    (-> this .-mcServer)))

(defn interaction-manager
  "Instance Constant.

  type: net.minecraft.server.management.PlayerInteractionManager"
  (^net.minecraft.server.management.PlayerInteractionManager [^EntityPlayerMP this]
    (-> this .-interactionManager)))

(defn managed-pos-x
  "Instance Field.

  type: double"
  (^Double [^EntityPlayerMP this]
    (-> this .-managedPosX)))

(defn managed-pos-z
  "Instance Field.

  type: double"
  (^Double [^EntityPlayerMP this]
    (-> this .-managedPosZ)))

(defn current-window-id
  "Instance Field.

  type: int"
  (^Integer [^EntityPlayerMP this]
    (-> this .-currentWindowId)))

(defn is-changing-quantity-only
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityPlayerMP this]
    (-> this .-isChangingQuantityOnly)))

(defn ping
  "Instance Field.

  type: int"
  (^Integer [^EntityPlayerMP this]
    (-> this .-ping)))

(defn player-conquered-the-end
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityPlayerMP this]
    (-> this .-playerConqueredTheEnd)))

(defn *func-191522-a
  "p-191522-0 - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer p-191522-0]
    (EntityPlayerMP/func_191522_a p-191522-0)))

(defn clear-elytra-flying
  ""
  ([^EntityPlayerMP this]
    (-> this (.clearElytraFlying))))

(defn load-resource-pack
  "url - `java.lang.String`
  hash - `java.lang.String`"
  ([^EntityPlayerMP this ^java.lang.String url ^java.lang.String hash]
    (-> this (.loadResourcePack url hash))))

(defn get-spectating-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityPlayerMP this]
    (-> this (.getSpectatingEntity))))

(defn handle-client-settings
  "packet-in - `net.minecraft.network.play.client.CPacketClientSettings`"
  ([^EntityPlayerMP this ^net.minecraft.network.play.client.CPacketClientSettings packet-in]
    (-> this (.handleClientSettings packet-in))))

(defn mount-entity-and-wake-up
  ""
  ([^EntityPlayerMP this]
    (-> this (.mountEntityAndWakeUp))))

(defn send-slot-contents
  "container-to-send - `net.minecraft.inventory.Container`
  slot-ind - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityPlayerMP this ^net.minecraft.inventory.Container container-to-send ^Integer slot-ind ^net.minecraft.item.ItemStack stack]
    (-> this (.sendSlotContents container-to-send slot-ind stack))))

(defn get-stat-file
  "returns: `net.minecraft.stats.StatisticsManagerServer`"
  (^net.minecraft.stats.StatisticsManagerServer [^EntityPlayerMP this]
    (-> this (.getStatFile))))

(defn dismount-riding-entity
  ""
  ([^EntityPlayerMP this]
    (-> this (.dismountRidingEntity))))

(defn display-gui-command-block
  "command-block - `net.minecraft.tileentity.TileEntityCommandBlock`"
  ([^EntityPlayerMP this ^net.minecraft.tileentity.TileEntityCommandBlock command-block]
    (-> this (.displayGuiCommandBlock command-block))))

(defn entity-invulnerable?
  "source - `net.minecraft.util.DamageSource`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^net.minecraft.util.DamageSource source]
    (-> this (.isEntityInvulnerable source))))

(defn creative?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerMP this]
    (-> this (.isCreative))))

(defn remove-experience-level
  "levels - `int`"
  ([^EntityPlayerMP this ^Integer levels]
    (-> this (.removeExperienceLevel levels))))

(defn add-stat
  "stat - `net.minecraft.stats.StatBase`
  amount - `int`"
  ([^EntityPlayerMP this ^net.minecraft.stats.StatBase stat ^Integer amount]
    (-> this (.addStat stat amount))))

(defn on-update
  ""
  ([^EntityPlayerMP this]
    (-> this (.onUpdate))))

(defn open-gui-horse-inventory
  "horse - `net.minecraft.entity.passive.AbstractHorse`
  inventory-in - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayerMP this ^net.minecraft.entity.passive.AbstractHorse horse ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.openGuiHorseInventory horse inventory-in))))

(defn update-held-item
  ""
  ([^EntityPlayerMP this]
    (-> this (.updateHeldItem))))

(defn set-spectating-entity
  "entity-to-spectate - `net.minecraft.entity.Entity`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity entity-to-spectate]
    (-> this (.setSpectatingEntity entity-to-spectate))))

(defn wake-up-player
  "immediately - `boolean`
  update-world-flag - `boolean`
  set-spawn - `boolean`"
  ([^EntityPlayerMP this ^Boolean immediately ^Boolean update-world-flag ^Boolean set-spawn]
    (-> this (.wakeUpPlayer immediately update-world-flag set-spawn))))

(defn set-position-and-update
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityPlayerMP this ^Double x ^Double y ^Double z]
    (-> this (.setPositionAndUpdate x y z))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityPlayerMP this]
    (-> this (.getPosition))))

(defn send-progress-bar-update
  "container-in - `net.minecraft.inventory.Container`
  var-to-update - `int`
  new-value - `int`"
  ([^EntityPlayerMP this ^net.minecraft.inventory.Container container-in ^Integer var-to-update ^Integer new-value]
    (-> this (.sendProgressBarUpdate container-in var-to-update new-value))))

(defn on-item-pickup
  "entity-in - `net.minecraft.entity.Entity`
  quantity - `int`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity entity-in ^Integer quantity]
    (-> this (.onItemPickup entity-in quantity))))

(defn get-last-active-time
  "returns: `long`"
  (^Long [^EntityPlayerMP this]
    (-> this (.getLastActiveTime))))

(defn send-status-message
  "chat-component - `net.minecraft.util.text.ITextComponent`
  action-bar - `boolean`"
  ([^EntityPlayerMP this ^net.minecraft.util.text.ITextComponent chat-component ^Boolean action-bar]
    (-> this (.sendStatusMessage chat-component action-bar))))

(defn take-stat
  "stat - `net.minecraft.stats.StatBase`"
  ([^EntityPlayerMP this ^net.minecraft.stats.StatBase stat]
    (-> this (.takeStat stat))))

(defn spectator?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerMP this]
    (-> this (.isSpectator))))

(defn get-player-ip
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityPlayerMP this]
    (-> this (.getPlayerIP))))

(defn open-edit-sign
  "sign-tile - `net.minecraft.tileentity.TileEntitySign`"
  ([^EntityPlayerMP this ^net.minecraft.tileentity.TileEntitySign sign-tile]
    (-> this (.openEditSign sign-tile))))

(defn invulnerable-dimension-change?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerMP this]
    (-> this (.isInvulnerableDimensionChange))))

(defn mark-player-active
  ""
  ([^EntityPlayerMP this]
    (-> this (.markPlayerActive))))

(defn get-chat-visibility
  "returns: `net.minecraft.entity.player.EntityPlayer$EnumChatVisibility`"
  (^net.minecraft.entity.player.EntityPlayer$EnumChatVisibility [^EntityPlayerMP this]
    (-> this (.getChatVisibility))))

(defn close-screen
  ""
  ([^EntityPlayerMP this]
    (-> this (.closeScreen))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPlayerMP this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn close-container
  ""
  ([^EntityPlayerMP this]
    (-> this (.closeContainer))))

(defn display-gui
  "gui-owner - `net.minecraft.world.IInteractionObject`"
  ([^EntityPlayerMP this ^net.minecraft.world.IInteractionObject gui-owner]
    (-> this (.displayGui gui-owner))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^EntityPlayerMP this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn send-container-to-player
  "container-in - `net.minecraft.inventory.Container`"
  ([^EntityPlayerMP this ^net.minecraft.inventory.Container container-in]
    (-> this (.sendContainerToPlayer container-in))))

(defn on-enchantment-critical
  "entity-hit - `net.minecraft.entity.Entity`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity entity-hit]
    (-> this (.onEnchantmentCritical entity-hit))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityPlayerMP this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn on-critical-hit
  "entity-hit - `net.minecraft.entity.Entity`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity entity-hit]
    (-> this (.onCriticalHit entity-hit))))

(defn get-next-window-id
  ""
  ([^EntityPlayerMP this]
    (-> this (.getNextWindowId))))

(defn swing-arm
  "hand - `net.minecraft.util.EnumHand`"
  ([^EntityPlayerMP this ^net.minecraft.util.EnumHand hand]
    (-> this (.swingArm hand))))

(defn get-tab-list-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^EntityPlayerMP this]
    (-> this (.getTabListDisplayName))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPlayerMP this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-game-type
  "game-type - `net.minecraft.world.GameType`"
  ([^EntityPlayerMP this ^net.minecraft.world.GameType game-type]
    (-> this (.setGameType game-type))))

(defn add-experience-level
  "levels - `int`"
  ([^EntityPlayerMP this ^Integer levels]
    (-> this (.addExperienceLevel levels))))

(defn add-self-to-internal-crafting-inventory
  ""
  ([^EntityPlayerMP this]
    (-> this (.addSelfToInternalCraftingInventory))))

(defn get-server-world
  "returns: `net.minecraft.world.WorldServer`"
  (^net.minecraft.world.WorldServer [^EntityPlayerMP this]
    (-> this (.getServerWorld))))

(defn set-entity-action-state
  "strafe - `float`
  forward - `float`
  jumping - `boolean`
  sneaking - `boolean`"
  ([^EntityPlayerMP this ^Float strafe ^Float forward ^Boolean jumping ^Boolean sneaking]
    (-> this (.setEntityActionState strafe forward jumping sneaking))))

(defn set-elytra-flying
  ""
  ([^EntityPlayerMP this]
    (-> this (.setElytraFlying))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn can-attack-player?
  "other - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^net.minecraft.entity.player.EntityPlayer other]
    (-> this (.canAttackPlayer other))))

(defn send-player-abilities
  ""
  ([^EntityPlayerMP this]
    (-> this (.sendPlayerAbilities))))

(defn add-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity entity-in]
    (-> this (.addEntity entity-in))))

(defn send-end-combat
  ""
  ([^EntityPlayerMP this]
    (-> this (.sendEndCombat))))

(defn spectated-by-player?
  "player - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.isSpectatedByPlayer player))))

(defn display-villager-trade-gui
  "villager - `net.minecraft.entity.IMerchant`"
  ([^EntityPlayerMP this ^net.minecraft.entity.IMerchant villager]
    (-> this (.displayVillagerTradeGui villager))))

(defn try-sleep
  "bed-location - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.entity.player.EntityPlayer$SleepResult`"
  (^net.minecraft.entity.player.EntityPlayer$SleepResult [^EntityPlayerMP this ^net.minecraft.util.math.BlockPos bed-location]
    (-> this (.trySleep bed-location))))

(defn handle-falling
  "y - `double`
  on-ground-in - `boolean`"
  ([^EntityPlayerMP this ^Double y ^Boolean on-ground-in]
    (-> this (.handleFalling y on-ground-in))))

(defn remove-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntity entity-in))))

(defn display-gui-chest
  "chest-inventory - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayerMP this ^net.minecraft.inventory.IInventory chest-inventory]
    (-> this (.displayGUIChest chest-inventory))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn start-riding
  "entity-in - `net.minecraft.entity.Entity`
  force - `boolean`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^net.minecraft.entity.Entity entity-in ^Boolean force]
    (-> this (.startRiding entity-in force))))

(defn clone-player
  "old-player - `net.minecraft.entity.player.EntityPlayer`
  respawn-from-end - `boolean`"
  ([^EntityPlayerMP this ^net.minecraft.entity.player.EntityPlayer old-player ^Boolean respawn-from-end]
    (-> this (.clonePlayer old-player respawn-from-end))))

(defn update-crafting-inventory
  "container-to-send - `net.minecraft.inventory.Container`
  items-list - `net.minecraft.util.NonNullList`"
  ([^EntityPlayerMP this ^net.minecraft.inventory.Container container-to-send ^net.minecraft.util.NonNullList items-list]
    (-> this (.updateCraftingInventory container-to-send items-list))))

(defn send-all-window-properties
  "container-in - `net.minecraft.inventory.Container`
  inventory - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayerMP this ^net.minecraft.inventory.Container container-in ^net.minecraft.inventory.IInventory inventory]
    (-> this (.sendAllWindowProperties container-in inventory))))

(defn on-update-entity
  ""
  ([^EntityPlayerMP this]
    (-> this (.onUpdateEntity))))

(defn send-enter-combat
  ""
  ([^EntityPlayerMP this]
    (-> this (.sendEnterCombat))))

(defn has-achievement?
  "achievement-in - `net.minecraft.stats.Achievement`

  returns: `boolean`"
  (^Boolean [^EntityPlayerMP this ^net.minecraft.stats.Achievement achievement-in]
    (-> this (.hasAchievement achievement-in))))

(defn change-dimension
  "dimension-in - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityPlayerMP this ^Integer dimension-in]
    (-> this (.changeDimension dimension-in))))

(defn clear-invulnerable-dimension-change
  ""
  ([^EntityPlayerMP this]
    (-> this (.clearInvulnerableDimensionChange))))

(defn open-book
  "stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`"
  ([^EntityPlayerMP this ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand]
    (-> this (.openBook stack hand))))

(defn set-player-health-updated
  ""
  ([^EntityPlayerMP this]
    (-> this (.setPlayerHealthUpdated))))

(defn attack-target-entity-with-current-item
  "target-entity - `net.minecraft.entity.Entity`"
  ([^EntityPlayerMP this ^net.minecraft.entity.Entity target-entity]
    (-> this (.attackTargetEntityWithCurrentItem target-entity))))

