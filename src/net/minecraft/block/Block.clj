(ns net.minecraft.block.Block
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block Block]))

(defn ->block
  "Constructor.

  block-material-in - `net.minecraft.block.material.Material`
  block-map-color-in - `net.minecraft.block.material.MapColor`"
  (^Block [^net.minecraft.block.material.Material block-material-in ^net.minecraft.block.material.MapColor block-map-color-in]
    (new Block block-material-in block-map-color-in))
  (^Block [^net.minecraft.block.material.Material material-in]
    (new Block material-in)))

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespacedDefaultedByKey<net.minecraft.util.ResourceLocation,net.minecraft.block.Block>"
  Block/REGISTRY)

(def *-block-state-ids
  "Static Constant.

  Deprecated.

  type: net.minecraft.util.ObjectIntIdentityMap<net.minecraft.block.state.IBlockState>"
  Block/BLOCK_STATE_IDS)

(def *-full-block-aabb
  "Static Constant.

  type: net.minecraft.util.math.AxisAlignedBB"
  Block/FULL_BLOCK_AABB)

(def *-null-aabb
  "Static Constant.

  type: net.minecraft.util.math.AxisAlignedBB"
  Block/NULL_AABB)

(defn block-particle-gravity
  "Instance Field.

  type: float"
  (^Float [^Block this]
    (-> this .-blockParticleGravity)))

(defn slipperiness
  "Instance Field.

  type: float"
  (^Float [^Block this]
    (-> this .-slipperiness)))

(defn *get-block-from-name
  "name - `java.lang.String`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^java.lang.String name]
    (Block/getBlockFromName name)))

(defn *get-state-by-id
  "id - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Integer id]
    (Block/getStateById id)))

(defn *get-id-from-block
  "block-in - `net.minecraft.block.Block`

  returns: `int`"
  (^Integer [^net.minecraft.block.Block block-in]
    (Block/getIdFromBlock block-in)))

(defn *register-blocks
  ""
  ([]
    (Block/registerBlocks )))

(defn *get-block-by-id
  "id - `int`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Integer id]
    (Block/getBlockById id)))

(defn *get-state-id
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^net.minecraft.block.state.IBlockState state]
    (Block/getStateId state)))

(defn *equal-to?
  "block-in - `net.minecraft.block.Block`
  other - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.Block block-in ^net.minecraft.block.Block other]
    (Block/isEqualTo block-in other)))

(defn *get-block-from-item
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^net.minecraft.item.Item item-in]
    (Block/getBlockFromItem item-in)))

(defn *spawn-as-entity
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  stack - `net.minecraft.item.ItemStack`"
  ([^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.item.ItemStack stack]
    (Block/spawnAsEntity world-in pos stack)))

(defn on-entity-walk
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityWalk world-in pos entity-in))))

(defn on-landed
  "world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in]
    (-> this (.onLanded world-in entity-in))))

(defn get-tick-randomly?
  "returns: `boolean`"
  (^Boolean [^Block this]
    (-> this (.getTickRandomly))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Block this]
    (-> this (.getUnlocalizedName))))

(defn on-entity-collided-with-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  entity-in - `net.minecraft.entity.Entity`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityCollidedWithBlock world-in pos state entity-in))))

(defn get-selected-bounding-box
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getSelectedBoundingBox state world-in pos))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn burning?
  "Determines if this block should set fire and deal fire damage
   to entities coming into contact with it.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the block should deal damage - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBurning world pos))))

(defn can-creature-spawn?
  "Determines if a specified mob type can spawn on this block, returning false will
   prevent any mob from spawning on the block.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  type - The Mob Category Type - `net.minecraft.entity.EntityLiving$SpawnPlacementType`

  returns: True to allow a mob of the specified category to spawn, false to prevent it. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLiving$SpawnPlacementType type]
    (-> this (.canCreatureSpawn state world pos type))))

(defn get-render-type
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn get-item
  "Deprecated.

  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^Block this]
    (-> this (.getBlockLayer))))

(defn modify-acceleration
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`
  motion - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.Vec3d motion]
    (-> this (.modifyAcceleration world-in pos entity-in motion))))

(defn fertile?
  "Checks if this soil is fertile, typically this means that growth rates
   of plants on this soil will be slightly sped up.
   Only vanilla case is tilledField when it is within range of water.

  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the soil should be considered fertile. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isFertile world pos))))

(defn quantity-dropped
  "State and fortune sensitive version, this replaces the old (int meta, Random rand)
   version in 1.1.

  state - Current state - `net.minecraft.block.state.IBlockState`
  fortune - Current item fortune level - `int`
  random - Random number generator - `java.util.Random`

  returns: The number of items to drop - `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDropped state fortune random)))
  (^Integer [^Block this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn rotate-block
  "Rotate the block. For vanilla blocks this rotates around the axis passed in (generally, it should be the \"face\" that was hit).
   Note: for mod blocks, this is up to the block and modder to decide. It is not mandated that it be a rotation around the
   face, but could be a rotation to orient *to* that face, or a visiting of possible rotations.
   The method should return true if the rotation was successful though.

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  axis - The axis to rotate around - `net.minecraft.util.EnumFacing`

  returns: True if the rotation was successful, False if the rotation failed, or is not possible - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing axis]
    (-> this (.rotateBlock world pos axis))))

(defn fully-opaque?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullyOpaque state))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn get-map-color
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn full-block?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullBlock state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn add-hit-effects
  "Spawn a digging particle effect in the world, this is a wrapper
   around EffectRenderer.addBlockHitEffects to allow the block more
   control over the particles. Useful when you have entirely different
   texture sheets for different sides/locations in the world.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world-obj - `net.minecraft.world.World`
  target - The target the player is looking at {x/y/z/side/sub} - `net.minecraft.util.math.RayTraceResult`
  manager - A reference to the current particle manager. - `net.minecraft.client.particle.ParticleManager`

  returns: True to prevent vanilla digging particles form spawning. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-obj ^net.minecraft.util.math.RayTraceResult target ^net.minecraft.client.particle.ParticleManager manager]
    (-> this (.addHitEffects state world-obj target manager))))

(defn has-custom-breaking-progress?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.hasCustomBreakingProgress state))))

(defn begin-leaves-decay
  "Called when a leaf should start its decay process.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`"
  ([^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.beginLeavesDecay state world pos))))

(defn can-harvest-block?
  "Determines if the player can harvest this block, obtaining it's drops when the block is destroyed.

  world - `net.minecraft.world.IBlockAccess`
  pos - The block's current position - `net.minecraft.util.math.BlockPos`
  player - The player damaging the block - `net.minecraft.entity.player.EntityPlayer`

  returns: True to spawn the drops - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canHarvestBlock world pos player))))

(defn can-be-replaced-by-leaves?
  "Used during tree growth to determine if newly generated leaves can replace this block.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if this block can be replaced by growing leaves. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canBeReplacedByLeaves state world pos))))

(defn passable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isPassable world-in pos))))

(defn has-comparator-input-override?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.hasComparatorInputOverride state))))

(defn neighbor-changed
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn get-weak-power
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getWeakPower block-state block-access pos side))))

(defn tool-effective?
  "Checks if the specified tool type is efficient on this block,
   meaning that it digs at full speed.

  type - `java.lang.String`
  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^java.lang.String type ^net.minecraft.block.state.IBlockState state]
    (-> this (.isToolEffective type state))))

(defn with-mirror
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

(defn add-destroy-effects
  "Spawn particles for when the block is destroyed. Due to the nature
   of how this is invoked, the x/y/z locations are not always guaranteed
   to host your block. So be sure to do proper sanity checks before assuming
   that the location is this block.

  world - The current world - `net.minecraft.world.World`
  pos - Position to spawn the particle - `net.minecraft.util.math.BlockPos`
  manager - A reference to the current particle manager. - `net.minecraft.client.particle.ParticleManager`

  returns: True to prevent vanilla break particles from spawning. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.client.particle.ParticleManager manager]
    (-> this (.addDestroyEffects world pos manager))))

(defn associated-block?
  "other - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.Block other]
    (-> this (.isAssociatedBlock other))))

(defn get-state-for-placement
  "Gets the IBlockState to place

  world - The world the block is being placed in - `net.minecraft.world.World`
  pos - The position the block is being placed at - `net.minecraft.util.math.BlockPos`
  facing - The side the block is being placed on - `net.minecraft.util.EnumFacing`
  hit-x - The X coordinate of the hit vector - `float`
  hit-y - The Y coordinate of the hit vector - `float`
  hit-z - The Z coordinate of the hit vector - `float`
  meta - The metadata of ItemStack as processed by Item.getMetadata(int) - `int`
  placer - The entity placing the block - `net.minecraft.entity.EntityLivingBase`
  hand - The player hand used to place this block - `net.minecraft.util.EnumHand`

  returns: The state to be placed in the world - `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer ^net.minecraft.util.EnumHand hand]
    (-> this (.getStateForPlacement world pos facing hit-x hit-y hit-z meta placer hand)))
  (^net.minecraft.block.state.IBlockState [^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn can-sustain-plant?
  "Determines if this block can support the passed in plant, allowing it to be planted and grow.
   Some examples:
     Reeds check if its a reed, or if its sand/dirt/grass and adjacent to water
     Cacti checks if its a cacti, or if its sand
     Nether types check for soul sand
     Crops check for tilled soil
     Caves check if it's a solid surface
     Plains check if its grass or dirt
     Water check if its still water

  state - The Current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  direction - The direction relative to the given position the plant wants to be, typically its UP - `net.minecraft.util.EnumFacing`
  plantable - The plant that wants to check - `net.minecraftforge.common.IPlantable`

  returns: True to allow the plant to be planted/stay. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing direction ^net.minecraftforge.common.IPlantable plantable]
    (-> this (.canSustainPlant state world pos direction plantable))))

(defn get-harvest-level
  "Queries the harvest level of this item stack for the specified tool class,
   Returns -1 if this tool is not of the specified type

  state - `net.minecraft.block.state.IBlockState`

  returns: Harvest level, or -1 if not the specified tool type. - `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getHarvestLevel state))))

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn set-hardness
  "hardness - `float`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^Float hardness]
    (-> this (.setHardness hardness))))

(defn on-block-clicked
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onBlockClicked world-in pos player-in))))

(defn get-bed-spawn-position
  "Returns the position that the player is moved to upon
   waking up, or respawning at the bed.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  player - The player or camera entity, null in some cases. - `net.minecraft.entity.player.EntityPlayer`

  returns: The spawn position - `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getBedSpawnPosition state world pos player))))

(defn set-block-unbreakable
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this]
    (-> this (.setBlockUnbreakable))))

(defn get-mobility-flag
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMobilityFlag state))))

(defn ladder?
  "Checks if a player or entity can use this block to 'climb' like a ladder.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  entity - The entity trying to use the ladder, CAN be null. - `net.minecraft.entity.EntityLivingBase`

  returns: True if the block should act like a ladder - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity]
    (-> this (.isLadder state world pos entity))))

(defn has-tile-entity?
  "Called throughout the code as a replacement for block instanceof BlockContainer
   Moving this to the Block base class allows for mods that wish to extend vanilla
   blocks, and also want to have a tile entity on that block, may.

   Return true from this function to specify this block has a tile entity.

  state - State of the current block - `net.minecraft.block.state.IBlockState`

  returns: True if block has a tile entity, false otherwise - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.hasTileEntity state)))
  (^Boolean [^Block this]
    (-> this (.hasTileEntity))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Block this]
    (-> this (.toString))))

(defn collidable?
  "returns: `boolean`"
  (^Boolean [^Block this]
    (-> this (.isCollidable))))

(defn fire-source?
  "Currently only called by fire when it is on top of this block.
   Returning true will prevent the fire from naturally dying during updating.
   Also prevents firing from dying from rain.

  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  side - The face that the fire is coming from - `net.minecraft.util.EnumFacing`

  returns: True if this block sustains fire, meaning it will never go out. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isFireSource world pos side))))

(defn can-sustain-leaves?
  "Determines if this block can prevent leaves connected to it from decaying.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if the presence this block can prevent leaves from decaying. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canSustainLeaves state world pos))))

(defn get-fire-spread-speed
  "Called when fire is updating on a neighbor block.
   The higher the number returned, the faster fire will spread around this block.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  face - The face that the fire is coming from - `net.minecraft.util.EnumFacing`

  returns: A number that is used to determine the speed of fire growth around the block - `int`"
  (^Integer [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face]
    (-> this (.getFireSpreadSpeed world pos face))))

(defn on-fallen-upon
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`
  fall-distance - `float`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in ^Float fall-distance]
    (-> this (.onFallenUpon world-in pos entity-in fall-distance))))

(defn drop-block-as-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  fortune - `int`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune]
    (-> this (.dropBlockAsItem world-in pos state fortune))))

(defn get-enchant-power-bonus
  "Determines the amount of enchanting power this block can provide to an enchanting table.

  world - The World - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: The amount of enchanting power this block produces. - `float`"
  (^Float [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getEnchantPowerBonus world pos))))

(defn replaceable-ore-gen?
  "Determines if the current block is replaceable by Ore veins during world generation.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  target - The generic target block the gen is looking for, Standards define stone for overworld generation, and neatherack for the nether. - `com.google.common.base.Predicate`

  returns: True to allow this block to be replaced by a ore - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^com.google.common.base.Predicate target]
    (-> this (.isReplaceableOreGen state world pos target))))

(defn get-weak-changes?
  "If this block should be notified of weak changes.
   Weak changes are changes 1 block away through a solid block.
   Similar to comparators.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true To be notified of changes - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getWeakChanges world pos))))

(defn set-light-opacity
  "opacity - `int`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^Integer opacity]
    (-> this (.setLightOpacity opacity))))

(defn translucent?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isTranslucent state))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^Block this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player tooltip advanced))))

(defn get-ai-path-node-type
  "Get the PathNodeType for this block. Return null for vanilla behavior.

  state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: the PathNodeType - `net.minecraft.pathfinding.PathNodeType`"
  (^net.minecraft.pathfinding.PathNodeType [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getAiPathNodeType state world pos))))

(defn block-normal-cube?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isBlockNormalCube state))))

(defn get-light-value
  "Get a light value for the block at the specified coordinates, normal ranges are between 0 and 15

  state - Block state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: The light value - `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightValue state world pos)))
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getLightValue state))))

(defn on-block-destroyed-by-explosion
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  explosion-in - `net.minecraft.world.Explosion`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.Explosion explosion-in]
    (-> this (.onBlockDestroyedByExplosion world-in pos explosion-in))))

(defn fill-with-rain
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.fillWithRain world-in pos))))

(defn get-localized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Block this]
    (-> this (.getLocalizedName))))

(defn collision-ray-trace
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  start - `net.minecraft.util.math.Vec3d`
  end - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.Vec3d start ^net.minecraft.util.math.Vec3d end]
    (-> this (.collisionRayTrace block-state world-in pos start end))))

(defn full-cube?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn get-offset
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getOffset state world-in pos))))

(defn get-beacon-color-multiplier
  "state - The state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.World`
  pos - The position of this state - `net.minecraft.util.math.BlockPos`
  beacon-pos - The position of the beacon - `net.minecraft.util.math.BlockPos`

  returns: A float RGB [0.0, 1.0] array to be averaged with a beacon's existing beam color, or null to do nothing to the beam - `float[]`"
  ([^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.BlockPos beacon-pos]
    (-> this (.getBeaconColorMultiplier state world pos beacon-pos))))

(defn requires-updates
  "returns: `boolean`"
  (^Boolean [^Block this]
    (-> this (.requiresUpdates))))

(defn get-pick-block
  "Called when a user uses the creative pick block button on this block

  state - `net.minecraft.block.state.IBlockState`
  target - The full target the player is looking at - `net.minecraft.util.math.RayTraceResult`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: A ItemStack to add to the player's inventory, empty itemstack if nothing should be added. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.RayTraceResult target ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getPickBlock state target world pos player))))

(defn get-extended-state
  "Can return IExtendedBlockState

  state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getExtendedState state world pos))))

(defn does-side-block-rendering
  "Check if the face of a block should block rendering.

   Faces which are fully opaque should return true, faces with transparency
   or faces which do not span the full size of the block should return false.

  state - The current block state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  face - The side to check - `net.minecraft.util.EnumFacing`

  returns: True if the block is opaque on the specified side. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face]
    (-> this (.doesSideBlockRendering state world pos face))))

(defn block-solid?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isBlockSolid world-in pos side))))

(defn entity-inside-material?
  "Called when the entity is inside this block, may be used to determined if the entity can breathing,
   display material overlays, or if the entity can swim inside a block.

  world - that is being tested. - `net.minecraft.world.IBlockAccess`
  blockpos - position thats being tested. - `net.minecraft.util.math.BlockPos`
  iblockstate - state at world/blockpos - `net.minecraft.block.state.IBlockState`
  entity - that is being tested. - `net.minecraft.entity.Entity`
  y-to-test - `double`
  material-in - to test for. - `net.minecraft.block.material.Material`
  testing-head - when true, its testing the entities head for vision, breathing ect... otherwise its testing the body, for swimming and movement adjustment. - `boolean`

  returns: null for default behavior, true if the entity is within the material, false if it was not. - `java.lang.Boolean`"
  (^java.lang.Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos blockpos ^net.minecraft.block.state.IBlockState iblockstate ^net.minecraft.entity.Entity entity ^Double y-to-test ^net.minecraft.block.material.Material material-in ^Boolean testing-head]
    (-> this (.isEntityInsideMaterial world blockpos iblockstate entity y-to-test material-in testing-head))))

(defn on-neighbor-change
  "Called when a tile entity on a side of this block changes is created or is destroyed.

  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  neighbor - Block position of neighbor - `net.minecraft.util.math.BlockPos`"
  ([^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.BlockPos neighbor]
    (-> this (.onNeighborChange world pos neighbor))))

(defn get-block-state
  "returns: `net.minecraft.block.state.BlockStateContainer`"
  (^net.minecraft.block.state.BlockStateContainer [^Block this]
    (-> this (.getBlockState))))

(defn should-side-be-rendered?
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

(defn can-provide-power?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.canProvidePower state))))

(defn get-creative-tab-to-display-on
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^Block this]
    (-> this (.getCreativeTabToDisplayOn))))

(defn set-creative-tab
  "tab - `net.minecraft.creativetab.CreativeTabs`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^net.minecraft.creativetab.CreativeTabs tab]
    (-> this (.setCreativeTab tab))))

(defn bed-foot?
  "Determines if the current block is the foot half of the bed.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the current block is the foot side of a bed. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBedFoot world pos))))

(defn get-bed-direction
  "Returns the direction of the block. Same values that
   are returned by BlockDirectional

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: Bed direction - `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBedDirection state world pos))))

(defn opaque-cube?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn normal-cube?
  "Return true if the block is a normal, solid cube.  This
   determines indirect power state, entity ejection from blocks, and a few
   others.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the block is a full cube - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isNormalCube state world pos)))
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isNormalCube state))))

(defn can-render-in-layer?
  "Queries if this block should render in a given layer.
   ISmartBlockModel can use MinecraftForgeClient.getRenderLayer() to alter their model based on layer.

  state - `net.minecraft.block.state.IBlockState`
  layer - `net.minecraft.util.BlockRenderLayer`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.canRenderInLayer state layer))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn on-block-destroyed-by-player
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockDestroyedByPlayer world-in pos state))))

(defn get-sound-type
  "Sensitive version of getSoundType

  state - The state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.World`
  pos - The position. Note that the world may not necessarily have state here! - `net.minecraft.util.math.BlockPos`
  entity - The entity that is breaking/stepping on/placing/hitting/falling on this block, or null if no entity is in this context - `net.minecraft.entity.Entity`

  returns: A SoundType to use - `net.minecraft.block.SoundType`"
  (^net.minecraft.block.SoundType [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity]
    (-> this (.getSoundType state world pos entity)))
  (^net.minecraft.block.SoundType [^Block this]
    (-> this (.getSoundType))))

(defn can-connect-redstone?
  "Determine if this block can make a redstone connection on the side provided,
   Useful to control which sides are inputs and outputs for redstone wires.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  side - The side that is trying to make the connection, CAN BE NULL - `net.minecraft.util.EnumFacing`

  returns: True to make the connection - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.canConnectRedstone state world pos side))))

(defn on-block-activated
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onBlockActivated world-in pos state player-in hand facing hit-x hit-y hit-z))))

(defn on-plant-grow
  "Called when a plant grows on this block, only implemented for saplings using the WorldGen*Trees classes right now.
   Modder may implement this for custom plants.
   This does not use ForgeDirection, because large/huge trees can be located in non-representable direction,
   so the source location is specified.
   Currently this just changes the block to dirt if it was grass.

   Note: This happens DURING the generation, the generation may not be complete when this is called.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - Current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  source - Source plant's position in world - `net.minecraft.util.math.BlockPos`"
  ([^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.BlockPos source]
    (-> this (.onPlantGrow state world pos source))))

(defn causes-suffocation
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.causesSuffocation state))))

(defn wood?
  "world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if the block is wood (logs) - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isWood world pos))))

(defn drop-xp-on-block-break
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  amount - `int`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Integer amount]
    (-> this (.dropXpOnBlockBreak world-in pos amount))))

(defn can-silk-harvest?
  "Return true from this function if the player with silk touch can harvest this block directly, and not it's normal drops.

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  state - current block state - `net.minecraft.block.state.IBlockState`
  player - The player doing the harvesting - `net.minecraft.entity.player.EntityPlayer`

  returns: True if the block can be directly harvested using silk touch - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canSilkHarvest world pos state player))))

(defn get-harvest-tool
  "Queries the class of tool required to harvest this block, if null is returned
   we assume that anything can harvest this block.

  state - `net.minecraft.block.state.IBlockState`

  returns: `java.lang.String`"
  (^java.lang.String [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getHarvestTool state))))

(defn get-material
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.Material`"
  (^net.minecraft.block.material.Material [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMaterial state))))

(defn air?
  "Determines this block should be treated as an air block
   by the rest of the code. This method is primarily
   useful for creating pure logic-blocks that will be invisible
   to the player and otherwise interact as air would.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the block considered air - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isAir state world pos))))

(defn get-player-relative-block-hardness
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPlayerRelativeBlockHardness state player world-in pos))))

(defn leaves?
  "Determines if this block is considered a leaf block, used to apply the leaf decay and generation system.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if this block is considered leaves. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isLeaves state world pos))))

(defn get-use-neighbor-brightness?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getUseNeighborBrightness state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn recolor-block
  "Common way to recolor a block with an external tool

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  side - The side hit with the coloring tool - `net.minecraft.util.EnumFacing`
  color - The color to change to - `net.minecraft.item.EnumDyeColor`

  returns: If the recoloring was successful - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^net.minecraft.item.EnumDyeColor color]
    (-> this (.recolorBlock world pos side color))))

(defn get-default-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this]
    (-> this (.getDefaultState))))

(defn can-be-connected-to?
  "Determines if another block can connect to this block

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - The position of this block - `net.minecraft.util.math.BlockPos`
  facing - The side the connecting block is on - `net.minecraft.util.EnumFacing`

  returns: True to allow another block to connect to this block - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing]
    (-> this (.canBeConnectedTo world pos facing))))

(defn observed-neighbor-change
  "Called on an Observer block whenever an update for an Observer is received.

  observer-state - The Observer block's state. - `net.minecraft.block.state.IBlockState`
  world - The current world. - `net.minecraft.world.World`
  observer-pos - The Observer block's position. - `net.minecraft.util.math.BlockPos`
  changed-block - The updated block. - `net.minecraft.block.Block`
  changed-block-pos - The updated block's position. - `net.minecraft.util.math.BlockPos`"
  ([^Block this ^net.minecraft.block.state.IBlockState observer-state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos observer-pos ^net.minecraft.block.Block changed-block ^net.minecraft.util.math.BlockPos changed-block-pos]
    (-> this (.observedNeighborChange observer-state world observer-pos changed-block changed-block-pos))))

(defn can-drop-from-explosion?
  "explosion-in - `net.minecraft.world.Explosion`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.Explosion explosion-in]
    (-> this (.canDropFromExplosion explosion-in))))

(defn create-tile-entity
  "Called throughout the code as a replacement for ITileEntityProvider.createNewTileEntity
   Return the same thing you would from that function.
   This will fall back to ITileEntityProvider.createNewTileEntity(World) if this block is a ITileEntityProvider

  world - `net.minecraft.world.World`
  state - The state of the current block - `net.minecraft.block.state.IBlockState`

  returns: A instance of a class extending TileEntity - `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^Block this ^net.minecraft.world.World world ^net.minecraft.block.state.IBlockState state]
    (-> this (.createTileEntity world state))))

(defn can-collide-check?
  "state - `net.minecraft.block.state.IBlockState`
  hit-if-liquid - `boolean`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^Boolean hit-if-liquid]
    (-> this (.canCollideCheck state hit-if-liquid))))

(defn bed?
  "Determines if this block is classified as a Bed, Allowing
   players to sleep in it, though the block has to specifically
   perform the sleeping functionality in it's activated event.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  player - The player or camera entity, null in some cases. - `net.minecraft.entity.Entity`

  returns: True to treat this as a bed - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity player]
    (-> this (.isBed state world pos player))))

(defn get-enable-stats?
  "returns: `boolean`"
  (^Boolean [^Block this]
    (-> this (.getEnableStats))))

(defn beacon-base?
  "Determines if this block can be used as the base of a beacon.

  world-obj - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  beacon - Beacon position in world - `net.minecraft.util.math.BlockPos`

  returns: True, to support the beacon, and make it active with this block. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world-obj ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.BlockPos beacon]
    (-> this (.isBeaconBase world-obj pos beacon))))

(defn get-valid-rotations
  "Get the rotations that can apply to the block at the specified coordinates. Null means no rotations are possible.
   Note, this is up to the block to decide. It may not be accurate or representative.

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: An array of valid axes to rotate around, or null for none or unknown - `net.minecraft.util.EnumFacing[]`"
  ([^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getValidRotations world pos))))

(defn set-unlocalized-name
  "name - `java.lang.String`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^java.lang.String name]
    (-> this (.setUnlocalizedName name))))

(defn get-ambient-occlusion-light-value
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getAmbientOcclusionLightValue state))))

(defn set-resistance
  "resistance - `float`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^Float resistance]
    (-> this (.setResistance resistance))))

(defn get-packed-lightmap-coords
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPackedLightmapCoords state source pos))))

(defn get-exp-drop
  "Gathers how much experience this block drops when broken.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position - `net.minecraft.util.math.BlockPos`
  fortune - `int`

  returns: Amount of XP from breaking this block. - `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.getExpDrop state world pos fortune))))

(defn set-bed-occupied
  "Called when a user either starts or stops sleeping in the bed.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  player - The player or camera entity, null in some cases. - `net.minecraft.entity.player.EntityPlayer`
  occupied - True if we are occupying the bed, or false if they are stopping use of the bed - `boolean`"
  ([^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player ^Boolean occupied]
    (-> this (.setBedOccupied world pos player occupied))))

(defn add-landing-effects
  "Allows a block to override the standard EntityLivingBase.updateFallState
   particles, this is a server side method that spawns particles with
   WorldServer.spawnParticle

  state - `net.minecraft.block.state.IBlockState`
  world-obj - `net.minecraft.world.WorldServer`
  block-position - of the block that the entity landed on. - `net.minecraft.util.math.BlockPos`
  iblockstate - State at the specific world/pos - `net.minecraft.block.state.IBlockState`
  entity - the entity that hit landed on the block. - `net.minecraft.entity.EntityLivingBase`
  number-of-particles - that vanilla would have spawned. - `int`

  returns: True to prevent vanilla landing particles form spawning. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.WorldServer world-obj ^net.minecraft.util.math.BlockPos block-position ^net.minecraft.block.state.IBlockState iblockstate ^net.minecraft.entity.EntityLivingBase entity ^Integer number-of-particles]
    (-> this (.addLandingEffects state world-obj block-position iblockstate entity number-of-particles))))

(defn on-block-placed-by
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  placer - `net.minecraft.entity.EntityLivingBase`
  stack - `net.minecraft.item.ItemStack`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.EntityLivingBase placer ^net.minecraft.item.ItemStack stack]
    (-> this (.onBlockPlacedBy world-in pos state placer stack))))

(defn can-entity-spawn?
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.Entity entity-in]
    (-> this (.canEntitySpawn state entity-in))))

(defn get-offset-type
  "returns: `net.minecraft.block.Block$EnumOffsetType`"
  (^net.minecraft.block.Block$EnumOffsetType [^Block this]
    (-> this (.getOffsetType))))

(defn get-collision-bounding-box
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-actual-state
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^Block this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn set-tick-randomly
  "should-tick - `boolean`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^Boolean should-tick]
    (-> this (.setTickRandomly should-tick))))

(defn get-state-from-meta
  "Deprecated.

  meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn replaceable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isReplaceable world-in pos))))

(defn can-spawn-in-block?
  "returns: `boolean`"
  (^Boolean [^Block this]
    (-> this (.canSpawnInBlock))))

(defn side-solid?
  "Checks if the block is a solid face on the given side, used by placement logic.

  base-state - The base state, getActualState should be called first - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  side - The side to check - `net.minecraft.util.EnumFacing`

  returns: True if the block is solid on the specified side. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState base-state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isSideSolid base-state world pos side))))

(defn set-harvest-level
  "Sets or removes the tool and level required to harvest this block.

  tool-class - Class - `java.lang.String`
  level - Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0 - `int`
  state - The specific state. - `net.minecraft.block.state.IBlockState`"
  ([^Block this ^java.lang.String tool-class ^Integer level ^net.minecraft.block.state.IBlockState state]
    (-> this (.setHarvestLevel tool-class level state)))
  ([^Block this ^java.lang.String tool-class ^Integer level]
    (-> this (.setHarvestLevel tool-class level))))

(defn random-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  random - `java.util.Random`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random random]
    (-> this (.randomTick world-in pos state random))))

(defn on-block-harvested
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onBlockHarvested world-in pos state player))))

(defn removed-by-player
  "Called when a player removes a block.  This is responsible for
   actually destroying the block, and the block is intact at time of call.
   This is called regardless of whether the player can harvest the block or
   not.

   Return true if the block is actually destroyed.

   Note: When used in multiplayer, this is called on both client and
   server sides!

  state - The current state. - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  player - The player damaging the block, may be null - `net.minecraft.entity.player.EntityPlayer`
  will-harvest - True if Block.harvestBlock will be called after this, if the return in true. Can be useful to delay the destruction of tile entities till after harvestBlock - `boolean`

  returns: True if the block is actually destroyed. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player ^Boolean will-harvest]
    (-> this (.removedByPlayer state world pos player will-harvest))))

(defn get-flammability
  "Chance that fire will spread and consume this block.
   300 being a 100% chance, 0, being a 0% chance.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  face - The face that the fire is coming from - `net.minecraft.util.EnumFacing`

  returns: A number ranging from 0 to 300 relating used to determine if the block will be consumed by fire - `int`"
  (^Integer [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face]
    (-> this (.getFlammability world pos face))))

(defn get-explosion-resistance
  "Location sensitive version of getExplosionRestance

  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  exploder - The entity that caused the explosion, can be null - `net.minecraft.entity.Entity`
  explosion - The explosion - `net.minecraft.world.Explosion`

  returns: The amount of the explosion absorbed. - `float`"
  (^Float [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity exploder ^net.minecraft.world.Explosion explosion]
    (-> this (.getExplosionResistance world pos exploder explosion)))
  (^Float [^Block this ^net.minecraft.entity.Entity exploder]
    (-> this (.getExplosionResistance exploder))))

(defn flammable?
  "Called when fire is updating, checks if a block face can catch fire.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  face - The face that the fire is coming from - `net.minecraft.util.EnumFacing`

  returns: True if the face can be on fire, false otherwise. - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face]
    (-> this (.isFlammable world pos face))))

(defn harvest-block
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  te - `net.minecraft.tileentity.TileEntity`
  stack - `net.minecraft.item.ItemStack`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.tileentity.TileEntity te ^net.minecraft.item.ItemStack stack]
    (-> this (.harvestBlock world-in player pos state te stack))))

(defn quantity-dropped-with-bonus
  "fortune - `int`
  random - `java.util.Random`

  returns: `int`"
  (^Integer [^Block this ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDroppedWithBonus fortune random))))

(defn set-light-level
  "value - `float`

  returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Block this ^Float value]
    (-> this (.setLightLevel value))))

(defn get-bounding-box
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn event-received
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  id - `int`
  param - `int`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Integer id ^Integer param]
    (-> this (.eventReceived state world-in pos id param))))

(defn get-drops
  "This returns a complete list of items dropped from this block.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  state - Current state - `net.minecraft.block.state.IBlockState`
  fortune - Breakers fortune level - `int`

  returns: A ArrayList containing all items this block drops - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune]
    (-> this (.getDrops world pos state fortune))))

(defn can-entity-destroy?
  "Determines if this block is can be destroyed by the specified entities normal behavior.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  entity - `net.minecraft.entity.Entity`

  returns: True to allow the ender dragon to destroy this block - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity]
    (-> this (.canEntityDestroy state world pos entity))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Block this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^Block this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

(defn with-rotation
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn can-place-block-on-side?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.canPlaceBlockOnSide world-in pos side))))

(defn get-block-hardness
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockHardness block-state world-in pos))))

(defn get-light-opacity
  "Location aware and overrideable version of the lightOpacity array,
   return the number to subtract from the light value when it passes through this block.

   This is not guaranteed to have the tile entity in place before this is called, so it is
   Recommended that you have your tile entity call relight after being placed if you
   rely on it for light info.

  state - The Block state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: The amount of light to block, 0 for air, 255 for fully opaque. - `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightOpacity state world pos)))
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getLightOpacity state))))

(defn foliage?
  "Used by getTopSolidOrLiquidBlock while placing biome decorations, villages, etc
   Also used to determine if the player can spawn on this block.

  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: False to disallow spawning - `boolean`"
  (^Boolean [^Block this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isFoliage world pos))))

(defn get-comparator-input-override
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getComparatorInputOverride block-state world-in pos))))

(defn should-check-weak-power?
  "Called to determine whether to allow the a block to handle its own indirect power rather than using the default rules.

  state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  side - The INPUT side of the block to be powered - ie the opposite of this block's output side - `net.minecraft.util.EnumFacing`

  returns: Whether Block#isProvidingWeakPower should be called when determining indirect power - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldCheckWeakPower state world pos side))))

(defn add-collision-box-to-list
  "Deprecated.

  state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-box - `net.minecraft.util.math.AxisAlignedBB`
  colliding-boxes - `java.util.List`
  entity-in - `net.minecraft.entity.Entity`
  p-185477-7 - `boolean`"
  ([^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.AxisAlignedBB entity-box ^java.util.List colliding-boxes ^net.minecraft.entity.Entity entity-in ^Boolean p-185477-7]
    (-> this (.addCollisionBoxToList state world-in pos entity-box colliding-boxes entity-in p-185477-7))))

(defn get-strong-power
  "Deprecated.

  block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^Block this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getStrongPower block-state block-access pos side))))

(defn on-block-exploded
  "Called when the block is destroyed by an explosion.
   Useful for allowing the block to take into account tile entities,
   state, etc. when exploded, before it is removed.

  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  explosion - The explosion instance affecting the block - `net.minecraft.world.Explosion`"
  ([^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.Explosion explosion]
    (-> this (.onBlockExploded world pos explosion))))

(defn can-place-torch-on-top?
  "Determines if a torch can be placed on the top surface of this block.
   Useful for creating your own block that torches can be on, such as fences.

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: True to allow the torch to be placed - `boolean`"
  (^Boolean [^Block this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceTorchOnTop state world pos))))

(defn aabb-inside-material?
  "Called when boats or fishing hooks are inside the block to check if they are inside
   the material requested.

  world - world that is being tested. - `net.minecraft.world.World`
  pos - block thats being tested. - `net.minecraft.util.math.BlockPos`
  bounding-box - box to test, generally the bounds of an entity that are besting tested. - `net.minecraft.util.math.AxisAlignedBB`
  material-in - to check for. - `net.minecraft.block.material.Material`

  returns: null for default behavior, true if the box is within the material, false if it was not. - `java.lang.Boolean`"
  (^java.lang.Boolean [^Block this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.AxisAlignedBB bounding-box ^net.minecraft.block.material.Material material-in]
    (-> this (.isAABBInsideMaterial world pos bounding-box material-in))))

