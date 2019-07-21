(ns net.minecraftforge.event.ForgeEventFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event ForgeEventFactory]))

(defn ->forge-event-factory
  "Constructor."
  (^ForgeEventFactory []
    (new ForgeEventFactory )))

(defn *on-living-heal
  "entity - `net.minecraft.entity.EntityLivingBase`
  amount - `float`

  returns: `float`"
  (^Float [^net.minecraft.entity.EntityLivingBase entity ^Float amount]
    (ForgeEventFactory/onLivingHeal entity amount)))

(defn *can-create-fluid-source?
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  def - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Boolean def]
    (ForgeEventFactory/canCreateFluidSource world pos state def)))

(defn *on-arrow-loose
  "stack - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  charge - `int`
  has-ammo - `boolean`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world ^net.minecraft.entity.player.EntityPlayer player ^Integer charge ^Boolean has-ammo]
    (ForgeEventFactory/onArrowLoose stack world player charge has-ammo)))

(defn *on-player-block-place
  "player - `net.minecraft.entity.player.EntityPlayer`
  block-snapshot - `net.minecraftforge.common.util.BlockSnapshot`
  direction - `net.minecraft.util.EnumFacing`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraftforge.event.world.BlockEvent$PlaceEvent`"
  (^net.minecraftforge.event.world.BlockEvent$PlaceEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraftforge.common.util.BlockSnapshot block-snapshot ^net.minecraft.util.EnumFacing direction ^net.minecraft.util.EnumHand hand]
    (ForgeEventFactory/onPlayerBlockPlace player block-snapshot direction hand))
  (^net.minecraftforge.event.world.BlockEvent$PlaceEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraftforge.common.util.BlockSnapshot block-snapshot ^net.minecraft.util.EnumFacing direction]
    (ForgeEventFactory/onPlayerBlockPlace player block-snapshot direction)))

(defn *on-chunk-populate
  "pre - `boolean`
  gen - `net.minecraft.world.chunk.IChunkGenerator`
  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  x - `int`
  z - `int`
  has-village-generated - `boolean`"
  ([^Boolean pre ^net.minecraft.world.chunk.IChunkGenerator gen ^net.minecraft.world.World world ^java.util.Random rand ^Integer x ^Integer z ^Boolean has-village-generated]
    (ForgeEventFactory/onChunkPopulate pre gen world rand x z has-village-generated))
  ([^Boolean pre ^net.minecraft.world.chunk.IChunkGenerator gen ^net.minecraft.world.World world ^Integer x ^Integer z ^Boolean has-village-generated]
    (ForgeEventFactory/onChunkPopulate pre gen world x z has-village-generated)))

(defn *load-loot-table
  "name - `net.minecraft.util.ResourceLocation`
  table - `net.minecraft.world.storage.loot.LootTable`

  returns: `net.minecraft.world.storage.loot.LootTable`"
  (^net.minecraft.world.storage.loot.LootTable [^net.minecraft.util.ResourceLocation name ^net.minecraft.world.storage.loot.LootTable table]
    (ForgeEventFactory/loadLootTable name table)))

(defn *get-potential-spawns
  "world - `net.minecraft.world.WorldServer`
  type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`
  old-list - `java.util.List`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^net.minecraft.world.WorldServer world ^net.minecraft.entity.EnumCreatureType type ^net.minecraft.util.math.BlockPos pos ^java.util.List old-list]
    (ForgeEventFactory/getPotentialSpawns world type pos old-list)))

(defn *fire-player-loading-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  player-directory - `java.io.File`
  uuid-string - `java.lang.String`"
  ([^net.minecraft.entity.player.EntityPlayer player ^java.io.File player-directory ^java.lang.String uuid-string]
    (ForgeEventFactory/firePlayerLoadingEvent player player-directory uuid-string)))

(defn *on-item-use-finish
  "entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`
  result - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration ^net.minecraft.item.ItemStack result]
    (ForgeEventFactory/onItemUseFinish entity item duration result)))

(defn *on-entity-struck-by-lightning
  "entity - `net.minecraft.entity.Entity`
  bolt - `net.minecraft.entity.effect.EntityLightningBolt`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.Entity entity ^net.minecraft.entity.effect.EntityLightningBolt bolt]
    (ForgeEventFactory/onEntityStruckByLightning entity bolt)))

(defn *on-create-world-spawn
  "world - `net.minecraft.world.World`
  settings - `net.minecraft.world.WorldSettings`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^net.minecraft.world.WorldSettings settings]
    (ForgeEventFactory/onCreateWorldSpawn world settings)))

(defn *on-player-destroy-item
  "player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`"
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand]
    (ForgeEventFactory/onPlayerDestroyItem player stack hand)))

(defn *on-item-pickup
  "entity-item - `net.minecraft.entity.item.EntityItem`
  entity-in - `net.minecraft.entity.player.EntityPlayer`
  itemstack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.entity.item.EntityItem entity-item ^net.minecraft.entity.player.EntityPlayer entity-in ^net.minecraft.item.ItemStack itemstack]
    (ForgeEventFactory/onItemPickup entity-item entity-in itemstack)))

(defn *on-player-spawn-set
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  forced - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^Boolean forced]
    (ForgeEventFactory/onPlayerSpawnSet player pos forced)))

(defn *on-replace-biome-blocks
  "gen - `net.minecraft.world.chunk.IChunkGenerator`
  x - `int`
  z - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`
  world - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.chunk.IChunkGenerator gen ^Integer x ^Integer z ^net.minecraft.world.chunk.ChunkPrimer primer ^net.minecraft.world.World world]
    (ForgeEventFactory/onReplaceBiomeBlocks gen x z primer world)))

(defn *gather-capabilities
  "item - `net.minecraft.item.Item`
  stack - `net.minecraft.item.ItemStack`
  parent - `net.minecraftforge.common.capabilities.ICapabilityProvider`

  returns: `net.minecraftforge.common.capabilities.CapabilityDispatcher`"
  (^net.minecraftforge.common.capabilities.CapabilityDispatcher [^net.minecraft.item.Item item ^net.minecraft.item.ItemStack stack ^net.minecraftforge.common.capabilities.ICapabilityProvider parent]
    (ForgeEventFactory/gatherCapabilities item stack parent))
  (^net.minecraftforge.common.capabilities.CapabilityDispatcher [^net.minecraft.world.World world ^net.minecraftforge.common.capabilities.ICapabilityProvider parent]
    (ForgeEventFactory/gatherCapabilities world parent))
  (^net.minecraftforge.common.capabilities.CapabilityDispatcher [^net.minecraft.tileentity.TileEntity tile-entity]
    (ForgeEventFactory/gatherCapabilities tile-entity)))

(defn *on-client-chat
  "type - `byte`
  message - `net.minecraft.util.text.ITextComponent`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^Byte type ^net.minecraft.util.text.ITextComponent message]
    (ForgeEventFactory/onClientChat type message)))

(defn *render-fire-overlay
  "player - `net.minecraft.entity.player.EntityPlayer`
  render-partial-ticks - `float`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^Float render-partial-ticks]
    (ForgeEventFactory/renderFireOverlay player render-partial-ticks)))

(defn *get-break-speed
  "player - `net.minecraft.entity.player.EntityPlayer`
  state - `net.minecraft.block.state.IBlockState`
  original - `float`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.block.state.IBlockState state ^Float original ^net.minecraft.util.math.BlockPos pos]
    (ForgeEventFactory/getBreakSpeed player state original pos)))

(defn *get-player-display-name
  "player - `net.minecraft.entity.player.EntityPlayer`
  username - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.entity.player.EntityPlayer player ^java.lang.String username]
    (ForgeEventFactory/getPlayerDisplayName player username)))

(defn *on-stop-entity-tracking
  "entity - `net.minecraft.entity.Entity`
  player - `net.minecraft.entity.player.EntityPlayer`"
  ([^net.minecraft.entity.Entity entity ^net.minecraft.entity.player.EntityPlayer player]
    (ForgeEventFactory/onStopEntityTracking entity player)))

(defn *can-entity-update?
  "entity - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.Entity entity]
    (ForgeEventFactory/canEntityUpdate entity)))

(defn *can-entity-despawn
  "entity - `net.minecraft.entity.EntityLiving`

  returns: `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^net.minecraft.entity.EntityLiving entity]
    (ForgeEventFactory/canEntityDespawn entity)))

(defn *on-item-use-tick
  "entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration]
    (ForgeEventFactory/onItemUseTick entity item duration)))

(defn *on-player-multi-block-place
  "player - `net.minecraft.entity.player.EntityPlayer`
  block-snapshots - `java.util.List`
  direction - `net.minecraft.util.EnumFacing`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraftforge.event.world.BlockEvent$MultiPlaceEvent`"
  (^net.minecraftforge.event.world.BlockEvent$MultiPlaceEvent [^net.minecraft.entity.player.EntityPlayer player ^java.util.List block-snapshots ^net.minecraft.util.EnumFacing direction ^net.minecraft.util.EnumHand hand]
    (ForgeEventFactory/onPlayerMultiBlockPlace player block-snapshots direction hand))
  (^net.minecraftforge.event.world.BlockEvent$MultiPlaceEvent [^net.minecraft.entity.player.EntityPlayer player ^java.util.List block-snapshots ^net.minecraft.util.EnumFacing direction]
    (ForgeEventFactory/onPlayerMultiBlockPlace player block-snapshots direction)))

(defn *do-special-spawn
  "entity - `net.minecraft.entity.EntityLiving`
  world - `net.minecraft.world.World`
  x - `float`
  y - `float`
  z - `float`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLiving entity ^net.minecraft.world.World world ^Float x ^Float y ^Float z]
    (ForgeEventFactory/doSpecialSpawn entity world x y z)))

(defn *on-item-use-start
  "entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration]
    (ForgeEventFactory/onItemUseStart entity item duration)))

(defn *on-item-tooltip
  "item-stack - `net.minecraft.item.ItemStack`
  entity-player - `net.minecraft.entity.player.EntityPlayer`
  tool-tip - `java.util.List`
  show-advanced-item-tooltips - `boolean`

  returns: `net.minecraftforge.event.entity.player.ItemTooltipEvent`"
  (^net.minecraftforge.event.entity.player.ItemTooltipEvent [^net.minecraft.item.ItemStack item-stack ^net.minecraft.entity.player.EntityPlayer entity-player ^java.util.List tool-tip ^Boolean show-advanced-item-tooltips]
    (ForgeEventFactory/onItemTooltip item-stack entity-player tool-tip show-advanced-item-tooltips)))

(defn *fire-player-saving-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  player-directory - `java.io.File`
  uuid-string - `java.lang.String`"
  ([^net.minecraft.entity.player.EntityPlayer player ^java.io.File player-directory ^java.lang.String uuid-string]
    (ForgeEventFactory/firePlayerSavingEvent player player-directory uuid-string)))

(defn *on-player-sleep-in-bed
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.entity.player.EntityPlayer$SleepResult`"
  (^net.minecraft.entity.player.EntityPlayer$SleepResult [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (ForgeEventFactory/onPlayerSleepInBed player pos)))

(defn *on-player-clone
  "player - `net.minecraft.entity.player.EntityPlayer`
  old-player - `net.minecraft.entity.player.EntityPlayer`
  was-death - `boolean`"
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.player.EntityPlayer old-player ^Boolean was-death]
    (ForgeEventFactory/onPlayerClone player old-player was-death)))

(defn *do-player-harvest-check
  "player - `net.minecraft.entity.player.EntityPlayer`
  state - `net.minecraft.block.state.IBlockState`
  success - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.block.state.IBlockState state ^Boolean success]
    (ForgeEventFactory/doPlayerHarvestCheck player state success)))

(defn *on-player-brewed-potion
  "player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`"
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (ForgeEventFactory/onPlayerBrewedPotion player stack)))

(defn *fire-sleeping-location-check
  "player - `net.minecraft.entity.player.EntityPlayer`
  sleeping-location - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos sleeping-location]
    (ForgeEventFactory/fireSleepingLocationCheck player sleeping-location)))

(defn *fire-zombie-summon-aid
  "zombie - `net.minecraft.entity.monster.EntityZombie`
  world - `net.minecraft.world.World`
  x - `int`
  y - `int`
  z - `int`
  attacker - `net.minecraft.entity.EntityLivingBase`
  summon-chance - `double`

  returns: `net.minecraftforge.event.entity.living.ZombieEvent$SummonAidEvent`"
  (^net.minecraftforge.event.entity.living.ZombieEvent$SummonAidEvent [^net.minecraft.entity.monster.EntityZombie zombie ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z ^net.minecraft.entity.EntityLivingBase attacker ^Double summon-chance]
    (ForgeEventFactory/fireZombieSummonAid zombie world x y z attacker summon-chance)))

(defn *can-mount-entity?
  "entity-mounting - `net.minecraft.entity.Entity`
  entity-being-mounted - `net.minecraft.entity.Entity`
  is-mounting - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.Entity entity-mounting ^net.minecraft.entity.Entity entity-being-mounted ^Boolean is-mounting]
    (ForgeEventFactory/canMountEntity entity-mounting entity-being-mounted is-mounting)))

(defn *gather-entity-selectors
  "map - `java.util.Map`
  main-selector - `java.lang.String`
  sender - `net.minecraft.command.ICommandSender`
  position - `net.minecraft.util.math.Vec3d`

  returns: `java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>>`"
  (^java.util.List [^java.util.Map map ^java.lang.String main-selector ^net.minecraft.command.ICommandSender sender ^net.minecraft.util.math.Vec3d position]
    (ForgeEventFactory/gatherEntitySelectors map main-selector sender position)))

(defn *on-bucket-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  target - `net.minecraft.util.math.RayTraceResult`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.item.ItemStack stack ^net.minecraft.util.math.RayTraceResult target]
    (ForgeEventFactory/onBucketUse player world stack target)))

(defn *on-player-wakeup
  "player - `net.minecraft.entity.player.EntityPlayer`
  wake-immediately - `boolean`
  update-world-flag - `boolean`
  set-spawn - `boolean`"
  ([^net.minecraft.entity.player.EntityPlayer player ^Boolean wake-immediately ^Boolean update-world-flag ^Boolean set-spawn]
    (ForgeEventFactory/onPlayerWakeup player wake-immediately update-world-flag set-spawn)))

(defn *on-item-expire
  "entity - `net.minecraft.entity.item.EntityItem`
  item - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.entity.item.EntityItem entity ^net.minecraft.item.ItemStack item]
    (ForgeEventFactory/onItemExpire entity item)))

(defn *render-block-overlay
  "player - `net.minecraft.entity.player.EntityPlayer`
  render-partial-ticks - `float`
  type - `net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType`
  block - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^Float render-partial-ticks ^net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType type ^net.minecraft.block.state.IBlockState block ^net.minecraft.util.math.BlockPos pos]
    (ForgeEventFactory/renderBlockOverlay player render-partial-ticks type block pos)))

(defn *on-potion-brewed
  "brewing-item-stacks - `net.minecraft.util.NonNullList`"
  ([^net.minecraft.util.NonNullList brewing-item-stacks]
    (ForgeEventFactory/onPotionBrewed brewing-item-stacks)))

(defn *get-max-spawn-pack-size
  "entity - `net.minecraft.entity.EntityLiving`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLiving entity]
    (ForgeEventFactory/getMaxSpawnPackSize entity)))

(defn *on-explosion-start
  "world - `net.minecraft.world.World`
  explosion - `net.minecraft.world.Explosion`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^net.minecraft.world.Explosion explosion]
    (ForgeEventFactory/onExplosionStart world explosion)))

(defn *get-experience-drop
  "entity - `net.minecraft.entity.EntityLivingBase`
  attacking-player - `net.minecraft.entity.player.EntityPlayer`
  original-experience - `int`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.entity.player.EntityPlayer attacking-player ^Integer original-experience]
    (ForgeEventFactory/getExperienceDrop entity attacking-player original-experience)))

(defn *on-apply-bonemeal
  "player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.item.ItemStack stack]
    (ForgeEventFactory/onApplyBonemeal player world pos state stack)))

(defn *on-use-item-stop
  "entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration]
    (ForgeEventFactory/onUseItemStop entity item duration)))

(defn *can-entity-spawn
  "entity - `net.minecraft.entity.EntityLiving`
  world - `net.minecraft.world.World`
  x - `float`
  y - `float`
  z - `float`

  returns: `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^net.minecraft.entity.EntityLiving entity ^net.minecraft.world.World world ^Float x ^Float y ^Float z]
    (ForgeEventFactory/canEntitySpawn entity world x y z)))

(defn *on-start-entity-tracking
  "entity - `net.minecraft.entity.Entity`
  player - `net.minecraft.entity.player.EntityPlayer`"
  ([^net.minecraft.entity.Entity entity ^net.minecraft.entity.player.EntityPlayer player]
    (ForgeEventFactory/onStartEntityTracking entity player)))

(defn *can-entity-spawn-spawner?
  "entity - `net.minecraft.entity.EntityLiving`
  world - `net.minecraft.world.World`
  x - `float`
  y - `float`
  z - `float`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLiving entity ^net.minecraft.world.World world ^Float x ^Float y ^Float z]
    (ForgeEventFactory/canEntitySpawnSpawner entity world x y z)))

(defn *on-enchantment-level-set
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  enchant-row - `int`
  power - `int`
  item-stack - `net.minecraft.item.ItemStack`
  level - `int`

  returns: `int`"
  (^Integer [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Integer enchant-row ^Integer power ^net.minecraft.item.ItemStack item-stack ^Integer level]
    (ForgeEventFactory/onEnchantmentLevelSet world pos enchant-row power item-stack level)))

(defn *on-hoe-use
  "stack - `net.minecraft.item.ItemStack`
  player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (ForgeEventFactory/onHoeUse stack player world-in pos)))

(defn *render-water-overlay
  "player - `net.minecraft.entity.player.EntityPlayer`
  render-partial-ticks - `float`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^Float render-partial-ticks]
    (ForgeEventFactory/renderWaterOverlay player render-partial-ticks)))

(defn *fire-block-harvesting
  "drops - `java.util.List`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  fortune - `int`
  drop-chance - `float`
  silk-touch - `boolean`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `float`"
  (^Float [^java.util.List drops ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune ^Float drop-chance ^Boolean silk-touch ^net.minecraft.entity.player.EntityPlayer player]
    (ForgeEventFactory/fireBlockHarvesting drops world pos state fortune drop-chance silk-touch player)))

(defn *on-play-sound-at-entity
  "entity - `net.minecraft.entity.Entity`
  name - `net.minecraft.util.SoundEvent`
  category - `net.minecraft.util.SoundCategory`
  volume - `float`
  pitch - `float`

  returns: `net.minecraftforge.event.entity.PlaySoundAtEntityEvent`"
  (^net.minecraftforge.event.entity.PlaySoundAtEntityEvent [^net.minecraft.entity.Entity entity ^net.minecraft.util.SoundEvent name ^net.minecraft.util.SoundCategory category ^Float volume ^Float pitch]
    (ForgeEventFactory/onPlaySoundAtEntity entity name category volume pitch)))

(defn *on-player-drops
  "player - `net.minecraft.entity.player.EntityPlayer`
  cause - `net.minecraft.util.DamageSource`
  captured-drops - `java.util.List`
  recently-hit - `boolean`"
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.DamageSource cause ^java.util.List captured-drops ^Boolean recently-hit]
    (ForgeEventFactory/onPlayerDrops player cause captured-drops recently-hit)))

(defn *on-potion-attempt-brew
  "stacks - `net.minecraft.util.NonNullList`

  returns: `boolean`"
  (^Boolean [^net.minecraft.util.NonNullList stacks]
    (ForgeEventFactory/onPotionAttemptBrew stacks)))

(defn *on-player-fall
  "player - `net.minecraft.entity.player.EntityPlayer`
  distance - `float`
  multiplier - `float`"
  ([^net.minecraft.entity.player.EntityPlayer player ^Float distance ^Float multiplier]
    (ForgeEventFactory/onPlayerFall player distance multiplier)))

(defn *on-arrow-nock
  "item - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  has-ammo - `boolean`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^net.minecraft.item.ItemStack item ^net.minecraft.world.World world ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand ^Boolean has-ammo]
    (ForgeEventFactory/onArrowNock item world player hand has-ammo)))

(defn *on-neighbor-notify
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  notified-sides - `java.util.EnumSet`
  force-redstone-update - `boolean`

  returns: `net.minecraftforge.event.world.BlockEvent$NeighborNotifyEvent`"
  (^net.minecraftforge.event.world.BlockEvent$NeighborNotifyEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.EnumSet notified-sides ^Boolean force-redstone-update]
    (ForgeEventFactory/onNeighborNotify world pos state notified-sides force-redstone-update)))

(defn *on-explosion-detonate
  "world - `net.minecraft.world.World`
  explosion - `net.minecraft.world.Explosion`
  list - `java.util.List`
  diameter - `double`"
  ([^net.minecraft.world.World world ^net.minecraft.world.Explosion explosion ^java.util.List list ^Double diameter]
    (ForgeEventFactory/onExplosionDetonate world explosion list diameter)))

