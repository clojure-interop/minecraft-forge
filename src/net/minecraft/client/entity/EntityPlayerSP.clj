(ns net.minecraft.client.entity.EntityPlayerSP
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.entity EntityPlayerSP]))

(defn ->entity-player-sp
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  world-in - `net.minecraft.world.World`
  net-handler - `net.minecraft.client.network.NetHandlerPlayClient`
  stat-file - `net.minecraft.stats.StatisticsManager`"
  (^EntityPlayerSP [^net.minecraft.client.Minecraft mc-in ^net.minecraft.world.World world-in ^net.minecraft.client.network.NetHandlerPlayClient net-handler ^net.minecraft.stats.StatisticsManager stat-file]
    (new EntityPlayerSP mc-in world-in net-handler stat-file)))

(defn connection
  "Instance Constant.

  type: net.minecraft.client.network.NetHandlerPlayClient"
  (^net.minecraft.client.network.NetHandlerPlayClient [^EntityPlayerSP this]
    (-> this .-connection)))

(defn movement-input
  "Instance Field.

  type: net.minecraft.util.MovementInput"
  (^net.minecraft.util.MovementInput [^EntityPlayerSP this]
    (-> this .-movementInput)))

(defn sprinting-ticks-left
  "Instance Field.

  type: int"
  (^Integer [^EntityPlayerSP this]
    (-> this .-sprintingTicksLeft)))

(defn render-arm-yaw
  "Instance Field.

  type: float"
  (^Float [^EntityPlayerSP this]
    (-> this .-renderArmYaw)))

(defn render-arm-pitch
  "Instance Field.

  type: float"
  (^Float [^EntityPlayerSP this]
    (-> this .-renderArmPitch)))

(defn prev-render-arm-yaw
  "Instance Field.

  type: float"
  (^Float [^EntityPlayerSP this]
    (-> this .-prevRenderArmYaw)))

(defn prev-render-arm-pitch
  "Instance Field.

  type: float"
  (^Float [^EntityPlayerSP this]
    (-> this .-prevRenderArmPitch)))

(defn time-in-portal
  "Instance Field.

  type: float"
  (^Float [^EntityPlayerSP this]
    (-> this .-timeInPortal)))

(defn prev-time-in-portal
  "Instance Field.

  type: float"
  (^Float [^EntityPlayerSP this]
    (-> this .-prevTimeInPortal)))

(defn respawn-player
  ""
  ([^EntityPlayerSP this]
    (-> this (.respawnPlayer))))

(defn get-permission-level
  "returns: `int`"
  (^Integer [^EntityPlayerSP this]
    (-> this (.getPermissionLevel))))

(defn dismount-riding-entity
  ""
  ([^EntityPlayerSP this]
    (-> this (.dismountRidingEntity))))

(defn display-gui-command-block
  "command-block - `net.minecraft.tileentity.TileEntityCommandBlock`"
  ([^EntityPlayerSP this ^net.minecraft.tileentity.TileEntityCommandBlock command-block]
    (-> this (.displayGuiCommandBlock command-block))))

(defn drop-item-and-get-stack
  "p-184816-1 - `net.minecraft.entity.item.EntityItem`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityPlayerSP this ^net.minecraft.entity.item.EntityItem p-184816-1]
    (-> this (.dropItemAndGetStack p-184816-1))))

(defn add-stat
  "stat - `net.minecraft.stats.StatBase`
  amount - `int`"
  ([^EntityPlayerSP this ^net.minecraft.stats.StatBase stat ^Integer amount]
    (-> this (.addStat stat amount))))

(defn on-update
  ""
  ([^EntityPlayerSP this]
    (-> this (.onUpdate))))

(defn open-gui-horse-inventory
  "horse - `net.minecraft.entity.passive.AbstractHorse`
  inventory-in - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayerSP this ^net.minecraft.entity.passive.AbstractHorse horse ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.openGuiHorseInventory horse inventory-in))))

(defn set-player-sp-health
  "health - `float`"
  ([^EntityPlayerSP this ^Float health]
    (-> this (.setPlayerSPHealth health))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityPlayerSP this]
    (-> this (.getPosition))))

(defn set-sprinting
  "sprinting - `boolean`"
  ([^EntityPlayerSP this ^Boolean sprinting]
    (-> this (.setSprinting sprinting))))

(defn open-edit-structure
  "structure - `net.minecraft.tileentity.TileEntityStructure`"
  ([^EntityPlayerSP this ^net.minecraft.tileentity.TileEntityStructure structure]
    (-> this (.openEditStructure structure))))

(defn send-status-message
  "chat-component - `net.minecraft.util.text.ITextComponent`
  action-bar - `boolean`"
  ([^EntityPlayerSP this ^net.minecraft.util.text.ITextComponent chat-component ^Boolean action-bar]
    (-> this (.sendStatusMessage chat-component action-bar))))

(defn on-update-walking-player
  ""
  ([^EntityPlayerSP this]
    (-> this (.onUpdateWalkingPlayer))))

(defn open-edit-sign
  "sign-tile - `net.minecraft.tileentity.TileEntitySign`"
  ([^EntityPlayerSP this ^net.minecraft.tileentity.TileEntitySign sign-tile]
    (-> this (.openEditSign sign-tile))))

(defn hand-active?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isHandActive))))

(defn rowing-boat?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isRowingBoat))))

(defn close-screen
  ""
  ([^EntityPlayerSP this]
    (-> this (.closeScreen))))

(defn riding-horse?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isRidingHorse))))

(defn display-gui
  "gui-owner - `net.minecraft.world.IInteractionObject`"
  ([^EntityPlayerSP this ^net.minecraft.world.IInteractionObject gui-owner]
    (-> this (.displayGui gui-owner))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^EntityPlayerSP this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn user?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isUser))))

(defn on-enchantment-critical
  "entity-hit - `net.minecraft.entity.Entity`"
  ([^EntityPlayerSP this ^net.minecraft.entity.Entity entity-hit]
    (-> this (.onEnchantmentCritical entity-hit))))

(defn heal
  "heal-amount - `float`"
  ([^EntityPlayerSP this ^Float heal-amount]
    (-> this (.heal heal-amount))))

(defn drop-item
  "drop-all - `boolean`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^EntityPlayerSP this ^Boolean drop-all]
    (-> this (.dropItem drop-all))))

(defn on-critical-hit
  "entity-hit - `net.minecraft.entity.Entity`"
  ([^EntityPlayerSP this ^net.minecraft.entity.Entity entity-hit]
    (-> this (.onCriticalHit entity-hit))))

(defn swing-arm
  "hand - `net.minecraft.util.EnumHand`"
  ([^EntityPlayerSP this ^net.minecraft.util.EnumHand hand]
    (-> this (.swingArm hand))))

(defn remove-active-potion-effect
  "potioneffectin - `net.minecraft.potion.Potion`

  returns: `net.minecraft.potion.PotionEffect`"
  (^net.minecraft.potion.PotionEffect [^EntityPlayerSP this ^net.minecraft.potion.Potion potioneffectin]
    (-> this (.removeActivePotionEffect potioneffectin))))

(defn server-world?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isServerWorld))))

(defn close-screen-and-drop-stack
  ""
  ([^EntityPlayerSP this]
    (-> this (.closeScreenAndDropStack))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityPlayerSP this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn send-player-abilities
  ""
  ([^EntityPlayerSP this]
    (-> this (.sendPlayerAbilities))))

(defn move
  "type - `net.minecraft.entity.MoverType`
  x - `double`
  y - `double`
  z - `double`"
  ([^EntityPlayerSP this ^net.minecraft.entity.MoverType type ^Double x ^Double y ^Double z]
    (-> this (.move type x y z))))

(defn set-permission-level
  "p-184839-1 - `int`"
  ([^EntityPlayerSP this ^Integer p-184839-1]
    (-> this (.setPermissionLevel p-184839-1))))

(defn sneaking?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isSneaking))))

(defn set-server-brand
  "brand - `java.lang.String`"
  ([^EntityPlayerSP this ^java.lang.String brand]
    (-> this (.setServerBrand brand))))

(defn send-chat-message
  "message - `java.lang.String`"
  ([^EntityPlayerSP this ^java.lang.String message]
    (-> this (.sendChatMessage message))))

(defn display-villager-trade-gui
  "villager - `net.minecraft.entity.IMerchant`"
  ([^EntityPlayerSP this ^net.minecraft.entity.IMerchant villager]
    (-> this (.displayVillagerTradeGui villager))))

(defn set-xp-stats
  "current-xp - `float`
  max-xp - `int`
  level - `int`"
  ([^EntityPlayerSP this ^Float current-xp ^Integer max-xp ^Integer level]
    (-> this (.setXPStats current-xp max-xp level))))

(defn reset-active-hand
  ""
  ([^EntityPlayerSP this]
    (-> this (.resetActiveHand))))

(defn get-horse-jump-power
  "returns: `float`"
  (^Float [^EntityPlayerSP this]
    (-> this (.getHorseJumpPower))))

(defn display-gui-chest
  "chest-inventory - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayerSP this ^net.minecraft.inventory.IInventory chest-inventory]
    (-> this (.displayGUIChest chest-inventory))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^EntityPlayerSP this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn start-riding
  "entity-in - `net.minecraft.entity.Entity`
  force - `boolean`

  returns: `boolean`"
  (^Boolean [^EntityPlayerSP this ^net.minecraft.entity.Entity entity-in ^Boolean force]
    (-> this (.startRiding entity-in force))))

(defn get-stat-file-writer
  "returns: `net.minecraft.stats.StatisticsManager`"
  (^net.minecraft.stats.StatisticsManager [^EntityPlayerSP this]
    (-> this (.getStatFileWriter))))

(defn update-ridden
  ""
  ([^EntityPlayerSP this]
    (-> this (.updateRidden))))

(defn play-sound
  "sound-in - `net.minecraft.util.SoundEvent`
  volume - `float`
  pitch - `float`"
  ([^EntityPlayerSP this ^net.minecraft.util.SoundEvent sound-in ^Float volume ^Float pitch]
    (-> this (.playSound sound-in volume pitch))))

(defn set-active-hand
  "hand - `net.minecraft.util.EnumHand`"
  ([^EntityPlayerSP this ^net.minecraft.util.EnumHand hand]
    (-> this (.setActiveHand hand))))

(defn update-entity-action-state
  ""
  ([^EntityPlayerSP this]
    (-> this (.updateEntityActionState))))

(defn display-gui-edit-command-cart
  "command-block - `net.minecraft.tileentity.CommandBlockBaseLogic`"
  ([^EntityPlayerSP this ^net.minecraft.tileentity.CommandBlockBaseLogic command-block]
    (-> this (.displayGuiEditCommandCart command-block))))

(defn get-active-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^EntityPlayerSP this]
    (-> this (.getActiveHand))))

(defn send-horse-inventory
  ""
  ([^EntityPlayerSP this]
    (-> this (.sendHorseInventory))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityPlayerSP this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn auto-jump-enabled?
  "returns: `boolean`"
  (^Boolean [^EntityPlayerSP this]
    (-> this (.isAutoJumpEnabled))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityPlayerSP this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-look
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityPlayerSP this ^Float partial-ticks]
    (-> this (.getLook partial-ticks))))

(defn open-book
  "stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`"
  ([^EntityPlayerSP this ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand]
    (-> this (.openBook stack hand))))

(defn on-living-update
  ""
  ([^EntityPlayerSP this]
    (-> this (.onLivingUpdate))))

(defn get-server-brand
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityPlayerSP this]
    (-> this (.getServerBrand))))

