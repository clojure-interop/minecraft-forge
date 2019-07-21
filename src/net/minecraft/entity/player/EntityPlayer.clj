(ns net.minecraft.entity.player.EntityPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player EntityPlayer]))

(defn ->entity-player
  "Constructor.

  world-in - `net.minecraft.world.World`
  game-profile-in - `com.mojang.authlib.GameProfile`"
  (^EntityPlayer [^net.minecraft.world.World world-in ^com.mojang.authlib.GameProfile game-profile-in]
    (new EntityPlayer world-in game-profile-in)))

(def *-persisted-nbt-tag
  "Static Constant.

  type: java.lang.String"
  EntityPlayer/PERSISTED_NBT_TAG)

(defn eye-height
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-eyeHeight)))

(defn inventory
  "Instance Field.

  type: net.minecraft.entity.player.InventoryPlayer"
  (^net.minecraft.entity.player.InventoryPlayer [^EntityPlayer this]
    (-> this .-inventory)))

(defn inventory-container
  "Instance Field.

  type: net.minecraft.inventory.Container"
  (^net.minecraft.inventory.Container [^EntityPlayer this]
    (-> this .-inventoryContainer)))

(defn open-container
  "Instance Field.

  type: net.minecraft.inventory.Container"
  (^net.minecraft.inventory.Container [^EntityPlayer this]
    (-> this .-openContainer)))

(defn prev-camera-yaw
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-prevCameraYaw)))

(defn camera-yaw
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-cameraYaw)))

(defn xp-cooldown
  "Instance Field.

  type: int"
  (^Integer [^EntityPlayer this]
    (-> this .-xpCooldown)))

(defn prev-chasing-pos-x
  "Instance Field.

  type: double"
  (^Double [^EntityPlayer this]
    (-> this .-prevChasingPosX)))

(defn prev-chasing-pos-y
  "Instance Field.

  type: double"
  (^Double [^EntityPlayer this]
    (-> this .-prevChasingPosY)))

(defn prev-chasing-pos-z
  "Instance Field.

  type: double"
  (^Double [^EntityPlayer this]
    (-> this .-prevChasingPosZ)))

(defn chasing-pos-x
  "Instance Field.

  type: double"
  (^Double [^EntityPlayer this]
    (-> this .-chasingPosX)))

(defn chasing-pos-y
  "Instance Field.

  type: double"
  (^Double [^EntityPlayer this]
    (-> this .-chasingPosY)))

(defn chasing-pos-z
  "Instance Field.

  type: double"
  (^Double [^EntityPlayer this]
    (-> this .-chasingPosZ)))

(defn bed-location
  "Instance Field.

  type: net.minecraft.util.math.BlockPos"
  (^net.minecraft.util.math.BlockPos [^EntityPlayer this]
    (-> this .-bedLocation)))

(defn render-offset-x
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-renderOffsetX)))

(defn render-offset-y
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-renderOffsetY)))

(defn render-offset-z
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-renderOffsetZ)))

(defn capabilities
  "Instance Field.

  type: net.minecraft.entity.player.PlayerCapabilities"
  (^net.minecraft.entity.player.PlayerCapabilities [^EntityPlayer this]
    (-> this .-capabilities)))

(defn experience-level
  "Instance Field.

  type: int"
  (^Integer [^EntityPlayer this]
    (-> this .-experienceLevel)))

(defn experience-total
  "Instance Field.

  type: int"
  (^Integer [^EntityPlayer this]
    (-> this .-experienceTotal)))

(defn experience
  "Instance Field.

  type: float"
  (^Float [^EntityPlayer this]
    (-> this .-experience)))

(defn fish-entity
  "Instance Field.

  type: net.minecraft.entity.projectile.EntityFishHook"
  (^net.minecraft.entity.projectile.EntityFishHook [^EntityPlayer this]
    (-> this .-fishEntity)))

(defn *register-fixes-player
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityPlayer/registerFixesPlayer fixer)))

(defn *get-bed-spawn-location
  "world-in - `net.minecraft.world.World`
  bed-location - `net.minecraft.util.math.BlockPos`
  force-spawn - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos bed-location ^Boolean force-spawn]
    (EntityPlayer/getBedSpawnLocation world-in bed-location force-spawn)))

(defn *get-uuid
  "profile - `com.mojang.authlib.GameProfile`

  returns: `java.util.UUID`"
  (^java.util.UUID [^com.mojang.authlib.GameProfile profile]
    (EntityPlayer/getUUID profile)))

(defn *get-offline-uuid
  "username - `java.lang.String`

  returns: `java.util.UUID`"
  (^java.util.UUID [^java.lang.String username]
    (EntityPlayer/getOfflineUUID username)))

(defn invisible-to-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isInvisibleToPlayer player))))

(defn on-kill-entity
  "entity-living-in - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityPlayer this ^net.minecraft.entity.EntityLivingBase entity-living-in]
    (-> this (.onKillEntity entity-living-in))))

(defn wearing?
  "part - `net.minecraft.entity.player.EnumPlayerModelParts`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.entity.player.EnumPlayerModelParts part]
    (-> this (.isWearing part))))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntityPlayer this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn respawn-player
  ""
  ([^EntityPlayer this]
    (-> this (.respawnPlayer))))

(defn spawn-forced?
  "A dimension aware version of isSpawnForced.
   Noramally isSpawnForced is used to determine if the respawn system should check for a bed or not.
   This just extends that to be dimension aware.

  dimension - The dimension to get whether to check for a bed before spawning for - `int`

  returns: The player specific spawn location for the dimension.  May be null. - `boolean`"
  (^Boolean [^EntityPlayer this ^Integer dimension]
    (-> this (.isSpawnForced dimension)))
  (^Boolean [^EntityPlayer this]
    (-> this (.isSpawnForced))))

(defn add-exhaustion
  "exhaustion - `float`"
  ([^EntityPlayer this ^Float exhaustion]
    (-> this (.addExhaustion exhaustion))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getEyeHeight))))

(defn get-cooldown-tracker
  "returns: `net.minecraft.util.CooldownTracker`"
  (^net.minecraft.util.CooldownTracker [^EntityPlayer this]
    (-> this (.getCooldownTracker))))

(defn can-open?
  "code - `net.minecraft.world.LockCode`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.world.LockCode code]
    (-> this (.canOpen code))))

(defn get-always-render-name-tag-for-render?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.getAlwaysRenderNameTagForRender))))

(defn dismount-riding-entity
  ""
  ([^EntityPlayer this]
    (-> this (.dismountRidingEntity))))

(defn display-gui-command-block
  "command-block - `net.minecraft.tileentity.TileEntityCommandBlock`"
  ([^EntityPlayer this ^net.minecraft.tileentity.TileEntityCommandBlock command-block]
    (-> this (.displayGuiCommandBlock command-block))))

(defn drop-item-and-get-stack
  "p-184816-1 - `net.minecraft.entity.item.EntityItem`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityPlayer this ^net.minecraft.entity.item.EntityItem p-184816-1]
    (-> this (.dropItemAndGetStack p-184816-1))))

(defn get-suffixes
  "returns: `java.util.Collection<net.minecraft.util.text.ITextComponent>`"
  (^java.util.Collection [^EntityPlayer this]
    (-> this (.getSuffixes))))

(defn get-armor-inventory-list
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityPlayer this]
    (-> this (.getArmorInventoryList))))

(defn creative?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isCreative))))

(defn spawn-sweep-particles
  ""
  ([^EntityPlayer this]
    (-> this (.spawnSweepParticles))))

(defn remove-experience-level
  "levels - `int`"
  ([^EntityPlayer this ^Integer levels]
    (-> this (.removeExperienceLevel levels))))

(defn pushed-by-water?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isPushedByWater))))

(defn get-armor-visibility
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getArmorVisibility))))

(defn add-stat
  "stat - `net.minecraft.stats.StatBase`
  amount - `int`"
  ([^EntityPlayer this ^net.minecraft.stats.StatBase stat ^Integer amount]
    (-> this (.addStat stat amount)))
  ([^EntityPlayer this ^net.minecraft.stats.StatBase stat]
    (-> this (.addStat stat))))

(defn on-update
  ""
  ([^EntityPlayer this]
    (-> this (.onUpdate))))

(defn open-gui-horse-inventory
  "horse - `net.minecraft.entity.passive.AbstractHorse`
  inventory-in - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayer this ^net.minecraft.entity.passive.AbstractHorse horse ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.openGuiHorseInventory horse inventory-in))))

(defn get-display-name-string
  "Get the currently computed display name, cached for efficiency.

  returns: the current display name - `java.lang.String`"
  (^java.lang.String [^EntityPlayer this]
    (-> this (.getDisplayNameString))))

(defn can-harvest-block?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.block.state.IBlockState state]
    (-> this (.canHarvestBlock state))))

(defn wake-up-player
  "immediately - `boolean`
  update-world-flag - `boolean`
  set-spawn - `boolean`"
  ([^EntityPlayer this ^Boolean immediately ^Boolean update-world-flag ^Boolean set-spawn]
    (-> this (.wakeUpPlayer immediately update-world-flag set-spawn))))

(defn add-score
  "score-in - `int`"
  ([^EntityPlayer this ^Integer score-in]
    (-> this (.addScore score-in))))

(defn player-fully-asleep?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isPlayerFullyAsleep))))

(defn get-prefixes
  "returns: `java.util.Collection<net.minecraft.util.text.ITextComponent>`"
  (^java.util.Collection [^EntityPlayer this]
    (-> this (.getPrefixes))))

(defn can-eat?
  "ignore-hunger - `boolean`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^Boolean ignore-hunger]
    (-> this (.canEat ignore-hunger))))

(defn should-heal?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.shouldHeal))))

(defn apply-entity-collision
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityPlayer this ^net.minecraft.entity.Entity entity-in]
    (-> this (.applyEntityCollision entity-in))))

(defn open-edit-structure
  "structure - `net.minecraft.tileentity.TileEntityStructure`"
  ([^EntityPlayer this ^net.minecraft.tileentity.TileEntityStructure structure]
    (-> this (.openEditStructure structure))))

(defn get-absorption-amount
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getAbsorptionAmount))))

(defn send-status-message
  "chat-component - `net.minecraft.util.text.ITextComponent`
  action-bar - `boolean`"
  ([^EntityPlayer this ^net.minecraft.util.text.ITextComponent chat-component ^Boolean action-bar]
    (-> this (.sendStatusMessage chat-component action-bar))))

(defn take-stat
  "stat - `net.minecraft.stats.StatBase`"
  ([^EntityPlayer this ^net.minecraft.stats.StatBase stat]
    (-> this (.takeStat stat))))

(defn disable-shield
  "p-190777-1 - `boolean`"
  ([^EntityPlayer this ^Boolean p-190777-1]
    (-> this (.disableShield p-190777-1))))

(defn spectator?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isSpectator))))

(defn can-player-edit?
  "pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^net.minecraft.item.ItemStack stack]
    (-> this (.canPlayerEdit pos facing stack))))

(defn open-edit-sign
  "sign-tile - `net.minecraft.tileentity.TileEntitySign`"
  ([^EntityPlayer this ^net.minecraft.tileentity.TileEntitySign sign-tile]
    (-> this (.openEditSign sign-tile))))

(defn xp-bar-cap
  "returns: `int`"
  (^Integer [^EntityPlayer this]
    (-> this (.xpBarCap))))

(defn set-absorption-amount
  "amount - `float`"
  ([^EntityPlayer this ^Float amount]
    (-> this (.setAbsorptionAmount amount))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^EntityPlayer this]
    (-> this (.getDisplayName))))

(defn set-in-web
  ""
  ([^EntityPlayer this]
    (-> this (.setInWeb))))

(defn add-experience
  "amount - `int`"
  ([^EntityPlayer this ^Integer amount]
    (-> this (.addExperience amount))))

(defn get-bed-orientation-in-degrees
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getBedOrientationInDegrees))))

(defn add-prefix
  "Add a prefix to the player's username in chat

  prefix - The prefix - `net.minecraft.util.text.ITextComponent`"
  ([^EntityPlayer this ^net.minecraft.util.text.ITextComponent prefix]
    (-> this (.addPrefix prefix))))

(defn get-inventory-ender-chest
  "returns: `net.minecraft.inventory.InventoryEnderChest`"
  (^net.minecraft.inventory.InventoryEnderChest [^EntityPlayer this]
    (-> this (.getInventoryEnderChest))))

(defn has-reduced-debug?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.hasReducedDebug))))

(defn get-held-equipment
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityPlayer this]
    (-> this (.getHeldEquipment))))

(defn close-screen
  ""
  ([^EntityPlayer this]
    (-> this (.closeScreen))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityPlayer this]
    (-> this (.getName))))

(defn get-max-in-portal-time
  "returns: `int`"
  (^Integer [^EntityPlayer this]
    (-> this (.getMaxInPortalTime))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPlayer this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn jump
  ""
  ([^EntityPlayer this]
    (-> this (.jump))))

(defn set-spawn-point
  "pos - `net.minecraft.util.math.BlockPos`
  forced - `boolean`"
  ([^EntityPlayer this ^net.minecraft.util.math.BlockPos pos ^Boolean forced]
    (-> this (.setSpawnPoint pos forced))))

(defn display-gui
  "gui-owner - `net.minecraft.world.IInteractionObject`"
  ([^EntityPlayer this ^net.minecraft.world.IInteractionObject gui-owner]
    (-> this (.displayGui gui-owner))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^EntityPlayer this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn set-score
  "score-in - `int`"
  ([^EntityPlayer this ^Integer score-in]
    (-> this (.setScore score-in))))

(defn send-command-feedback
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.sendCommandFeedback))))

(defn get-luck
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getLuck))))

(defn get-cooled-attack-strength
  "adjust-ticks - `float`

  returns: `float`"
  (^Float [^EntityPlayer this ^Float adjust-ticks]
    (-> this (.getCooledAttackStrength adjust-ticks))))

(defn user?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isUser))))

(defn on-enchantment-critical
  "entity-hit - `net.minecraft.entity.Entity`"
  ([^EntityPlayer this ^net.minecraft.entity.Entity entity-hit]
    (-> this (.onEnchantmentCritical entity-hit))))

(defn set-spawn-chunk
  "A dimension aware version of setSpawnChunk.
   This functions identically, but allows you to specify which dimension to affect, rather than affecting the player's current dimension.

  pos - The spawn point to set as the player-specific spawn point for the dimension - `net.minecraft.util.math.BlockPos`
  forced - Whether or not the respawn code should check for a bed at this location (true means it won't check for a bed) - `boolean`
  dimension - Which dimension to apply the player-specific respawn point to - `int`"
  ([^EntityPlayer this ^net.minecraft.util.math.BlockPos pos ^Boolean forced ^Integer dimension]
    (-> this (.setSpawnChunk pos forced dimension))))

(defn drop-item
  "dropped-item - `net.minecraft.item.ItemStack`
  drop-around - `boolean`
  trace-item - `boolean`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^EntityPlayer this ^net.minecraft.item.ItemStack dropped-item ^Boolean drop-around ^Boolean trace-item]
    (-> this (.dropItem dropped-item drop-around trace-item)))
  (^net.minecraft.entity.item.EntityItem [^EntityPlayer this ^net.minecraft.item.ItemStack item-stack-in ^Boolean unused]
    (-> this (.dropItem item-stack-in unused)))
  (^net.minecraft.entity.item.EntityItem [^EntityPlayer this ^Boolean drop-all]
    (-> this (.dropItem drop-all))))

(defn get-score
  "returns: `int`"
  (^Integer [^EntityPlayer this]
    (-> this (.getScore))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityPlayer this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityPlayer this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn on-critical-hit
  "entity-hit - `net.minecraft.entity.Entity`"
  ([^EntityPlayer this ^net.minecraft.entity.Entity entity-hit]
    (-> this (.onCriticalHit entity-hit))))

(defn player-sleeping?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isPlayerSleeping))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPlayer this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-game-type
  "game-type - `net.minecraft.world.GameType`"
  ([^EntityPlayer this ^net.minecraft.world.GameType game-type]
    (-> this (.setGameType game-type))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn add-experience-level
  "levels - `int`"
  ([^EntityPlayer this ^Integer levels]
    (-> this (.addExperienceLevel levels))))

(defn prepare-player-to-spawn
  ""
  ([^EntityPlayer this]
    (-> this (.preparePlayerToSpawn))))

(defn get-ai-move-speed
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getAIMoveSpeed))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn can-attack-player?
  "other - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.entity.player.EntityPlayer other]
    (-> this (.canAttackPlayer other))))

(defn open-gui
  "Opens a GUI with this player, uses FML's IGuiHandler system.
   Allows for extension by modders.

  mod - The mod trying to open a GUI - `java.lang.Object`
  mod-gui-id - GUI ID - `int`
  world - Current World - `net.minecraft.world.World`
  x - Passed directly to IGuiHandler, data meaningless Typically world X position - `int`
  y - Passed directly to IGuiHandler, data meaningless Typically world Y position - `int`
  z - Passed directly to IGuiHandler, data meaningless Typically world Z position - `int`"
  ([^EntityPlayer this ^java.lang.Object mod ^Integer mod-gui-id ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (-> this (.openGui mod mod-gui-id world x y z))))

(defn get-item-stack-from-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityPlayer this ^net.minecraft.inventory.EntityEquipmentSlot slot-in]
    (-> this (.getItemStackFromSlot slot-in))))

(defn get-cooldown-period
  "returns: `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getCooldownPeriod))))

(defn send-player-abilities
  ""
  ([^EntityPlayer this]
    (-> this (.sendPlayerAbilities))))

(defn reset-cooldown
  ""
  ([^EntityPlayer this]
    (-> this (.resetCooldown))))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityPlayer this]
    (-> this (.getSoundCategory))))

(defn add-suffix
  "Add a suffix to the player's username in chat

  suffix - The suffix - `net.minecraft.util.text.ITextComponent`"
  ([^EntityPlayer this ^net.minecraft.util.text.ITextComponent suffix]
    (-> this (.addSuffix suffix))))

(defn add-to-player-score
  "entity-in - `net.minecraft.entity.Entity`
  amount - `int`"
  ([^EntityPlayer this ^net.minecraft.entity.Entity entity-in ^Integer amount]
    (-> this (.addToPlayerScore entity-in amount))))

(defn get-dig-speed
  "state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntityPlayer this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDigSpeed state pos)))
  (^Float [^EntityPlayer this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getDigSpeed state))))

(defn get-xp-seed
  "returns: `int`"
  (^Integer [^EntityPlayer this]
    (-> this (.getXPSeed))))

(defn get-sleep-timer
  "returns: `int`"
  (^Integer [^EntityPlayer this]
    (-> this (.getSleepTimer))))

(defn get-portal-cooldown
  "returns: `int`"
  (^Integer [^EntityPlayer this]
    (-> this (.getPortalCooldown))))

(defn get-world-scoreboard
  "returns: `net.minecraft.scoreboard.Scoreboard`"
  (^net.minecraft.scoreboard.Scoreboard [^EntityPlayer this]
    (-> this (.getWorldScoreboard))))

(defn display-villager-trade-gui
  "villager - `net.minecraft.entity.IMerchant`"
  ([^EntityPlayer this ^net.minecraft.entity.IMerchant villager]
    (-> this (.displayVillagerTradeGui villager))))

(defn interact-on
  "p-190775-1 - `net.minecraft.entity.Entity`
  p-190775-2 - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^EntityPlayer this ^net.minecraft.entity.Entity p-190775-1 ^net.minecraft.util.EnumHand p-190775-2]
    (-> this (.interactOn p-190775-1 p-190775-2))))

(defn get-game-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^EntityPlayer this]
    (-> this (.getGameProfile))))

(defn try-sleep
  "bed-location - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.entity.player.EntityPlayer$SleepResult`"
  (^net.minecraft.entity.player.EntityPlayer$SleepResult [^EntityPlayer this ^net.minecraft.util.math.BlockPos bed-location]
    (-> this (.trySleep bed-location))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn entity-inside-opaque-block?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isEntityInsideOpaqueBlock))))

(defn refresh-display-name
  "Force the displayed name to refresh"
  ([^EntityPlayer this]
    (-> this (.refreshDisplayName))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^EntityPlayer this]
    (-> this (.getYOffset))))

(defn get-team
  "returns: `net.minecraft.scoreboard.Team`"
  (^net.minecraft.scoreboard.Team [^EntityPlayer this]
    (-> this (.getTeam))))

(defn add-movement-stat
  "p-71000-1 - `double`
  p-71000-3 - `double`
  p-71000-5 - `double`"
  ([^EntityPlayer this ^Double p-71000-1 ^Double p-71000-3 ^Double p-71000-5]
    (-> this (.addMovementStat p-71000-1 p-71000-3 p-71000-5))))

(defn display-gui-chest
  "chest-inventory - `net.minecraft.inventory.IInventory`"
  ([^EntityPlayer this ^net.minecraft.inventory.IInventory chest-inventory]
    (-> this (.displayGUIChest chest-inventory))))

(defn set-reduced-debug
  "reduced-debug - `boolean`"
  ([^EntityPlayer this ^Boolean reduced-debug]
    (-> this (.setReducedDebug reduced-debug))))

(defn clone-player
  "old-player - `net.minecraft.entity.player.EntityPlayer`
  respawn-from-end - `boolean`"
  ([^EntityPlayer this ^net.minecraft.entity.player.EntityPlayer old-player ^Boolean respawn-from-end]
    (-> this (.clonePlayer old-player respawn-from-end))))

(defn set-primary-hand
  "hand - `net.minecraft.util.EnumHandSide`"
  ([^EntityPlayer this ^net.minecraft.util.EnumHandSide hand]
    (-> this (.setPrimaryHand hand))))

(defn get-primary-hand
  "returns: `net.minecraft.util.EnumHandSide`"
  (^net.minecraft.util.EnumHandSide [^EntityPlayer this]
    (-> this (.getPrimaryHand))))

(defn get-bed-location
  "A dimension aware version of getBedLocation.

  dimension - The dimension to get the bed spawn for - `int`

  returns: The player specific spawn location for the dimension.  May be null. - `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityPlayer this ^Integer dimension]
    (-> this (.getBedLocation dimension)))
  (^net.minecraft.util.math.BlockPos [^EntityPlayer this]
    (-> this (.getBedLocation))))

(defn update-ridden
  ""
  ([^EntityPlayer this]
    (-> this (.updateRidden))))

(defn play-sound
  "sound-in - `net.minecraft.util.SoundEvent`
  volume - `float`
  pitch - `float`"
  ([^EntityPlayer this ^net.minecraft.util.SoundEvent sound-in ^Float volume ^Float pitch]
    (-> this (.playSound sound-in volume pitch))))

(defn get-default-eye-height
  "Returns the default eye height of the player

  returns: player default eye height - `float`"
  (^Float [^EntityPlayer this]
    (-> this (.getDefaultEyeHeight))))

(defn display-gui-edit-command-cart
  "command-block - `net.minecraft.tileentity.CommandBlockBaseLogic`"
  ([^EntityPlayer this ^net.minecraft.tileentity.CommandBlockBaseLogic command-block]
    (-> this (.displayGuiEditCommandCart command-block))))

(defn has-achievement?
  "achievement-in - `net.minecraft.stats.Achievement`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.stats.Achievement achievement-in]
    (-> this (.hasAchievement achievement-in))))

(defn set-dead
  ""
  ([^EntityPlayer this]
    (-> this (.setDead))))

(defn can-use-command-block?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.canUseCommandBlock))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityPlayer this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-food-stats
  "returns: `net.minecraft.util.FoodStats`"
  (^net.minecraft.util.FoodStats [^EntityPlayer this]
    (-> this (.getFoodStats))))

(defn open-book
  "stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`"
  ([^EntityPlayer this ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand]
    (-> this (.openBook stack hand))))

(defn on-living-update
  ""
  ([^EntityPlayer this]
    (-> this (.onLivingUpdate))))

(defn func-191521-c
  "p-191521-1 - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityPlayer this ^net.minecraft.item.ItemStack p-191521-1]
    (-> this (.func_191521_c p-191521-1))))

(defn set-item-stack-to-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityPlayer this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStackToSlot slot-in stack))))

(defn attack-target-entity-with-current-item
  "target-entity - `net.minecraft.entity.Entity`"
  ([^EntityPlayer this ^net.minecraft.entity.Entity target-entity]
    (-> this (.attackTargetEntityWithCurrentItem target-entity))))

(defn allow-edit?
  "returns: `boolean`"
  (^Boolean [^EntityPlayer this]
    (-> this (.isAllowEdit))))

