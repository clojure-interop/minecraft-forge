(ns net.minecraft.entity.Entity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity Entity]))

(defn ->entity
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^Entity [^net.minecraft.world.World world-in]
    (new Entity world-in)))

(defn prevent-entity-spawning
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-preventEntitySpawning)))

(defn force-spawn
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-forceSpawn)))

(defn world
  "Instance Field.

  type: net.minecraft.world.World"
  (^net.minecraft.world.World [^Entity this]
    (-> this .-world)))

(defn prev-pos-x
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-prevPosX)))

(defn prev-pos-y
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-prevPosY)))

(defn prev-pos-z
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-prevPosZ)))

(defn pos-x
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-posX)))

(defn pos-y
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-posY)))

(defn pos-z
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-posZ)))

(defn motion-x
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-motionX)))

(defn motion-y
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-motionY)))

(defn motion-z
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-motionZ)))

(defn rotation-yaw
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-rotationYaw)))

(defn rotation-pitch
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-rotationPitch)))

(defn prev-rotation-yaw
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-prevRotationYaw)))

(defn prev-rotation-pitch
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-prevRotationPitch)))

(defn on-ground
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-onGround)))

(defn is-collided-horizontally
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-isCollidedHorizontally)))

(defn is-collided-vertically
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-isCollidedVertically)))

(defn is-collided
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-isCollided)))

(defn velocity-changed
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-velocityChanged)))

(defn is-dead
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-isDead)))

(defn width
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-width)))

(defn height
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-height)))

(defn prev-distance-walked-modified
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-prevDistanceWalkedModified)))

(defn distance-walked-modified
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-distanceWalkedModified)))

(defn distance-walked-on-step-modified
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-distanceWalkedOnStepModified)))

(defn fall-distance
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-fallDistance)))

(defn last-tick-pos-x
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-lastTickPosX)))

(defn last-tick-pos-y
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-lastTickPosY)))

(defn last-tick-pos-z
  "Instance Field.

  type: double"
  (^Double [^Entity this]
    (-> this .-lastTickPosZ)))

(defn step-height
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-stepHeight)))

(defn no-clip
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-noClip)))

(defn entity-collision-reduction
  "Instance Field.

  type: float"
  (^Float [^Entity this]
    (-> this .-entityCollisionReduction)))

(defn ticks-existed
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-ticksExisted)))

(defn hurt-resistant-time
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-hurtResistantTime)))

(defn added-to-chunk
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-addedToChunk)))

(defn chunk-coord-x
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-chunkCoordX)))

(defn chunk-coord-y
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-chunkCoordY)))

(defn chunk-coord-z
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-chunkCoordZ)))

(defn server-pos-x
  "Instance Field.

  type: long"
  (^Long [^Entity this]
    (-> this .-serverPosX)))

(defn server-pos-y
  "Instance Field.

  type: long"
  (^Long [^Entity this]
    (-> this .-serverPosY)))

(defn server-pos-z
  "Instance Field.

  type: long"
  (^Long [^Entity this]
    (-> this .-serverPosZ)))

(defn ignore-frustum-check
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-ignoreFrustumCheck)))

(defn is-air-borne
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-isAirBorne)))

(defn time-until-portal
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-timeUntilPortal)))

(defn dimension
  "Instance Field.

  type: int"
  (^Integer [^Entity this]
    (-> this .-dimension)))

(defn capture-drops
  "Instance Field.

  type: boolean"
  (^Boolean [^Entity this]
    (-> this .-captureDrops)))

(defn captured-drops
  "Instance Field.

  type: java.util.ArrayList<net.minecraft.entity.item.EntityItem>"
  (^java.util.ArrayList [^Entity this]
    (-> this .-capturedDrops)))

(defn *register-fixes
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (Entity/registerFixes fixer)))

(defn *get-render-distance-weight
  "returns: `double`"
  (^Double []
    (Entity/getRenderDistanceWeight )))

(defn *set-render-distance-weight
  "render-dist-weight - `double`"
  ([^Double render-dist-weight]
    (Entity/setRenderDistanceWeight render-dist-weight)))

(defn in-range-to-render-3d?
  "x - `double`
  y - `double`
  z - `double`

  returns: `boolean`"
  (^Boolean [^Entity this ^Double x ^Double y ^Double z]
    (-> this (.isInRangeToRender3d x y z))))

(defn get-adjusted-horizontal-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Entity this]
    (-> this (.getAdjustedHorizontalFacing))))

(defn get-rotation-yaw-head
  "returns: `float`"
  (^Float [^Entity this]
    (-> this (.getRotationYawHead))))

(defn should-render-in-pass?
  "pass - `int`

  returns: `boolean`"
  (^Boolean [^Entity this ^Integer pass]
    (-> this (.shouldRenderInPass pass))))

(defn invisible-to-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isInvisibleToPlayer player))))

(defn on-kill-entity
  "entity-living-in - `net.minecraft.entity.EntityLivingBase`"
  ([^Entity this ^net.minecraft.entity.EntityLivingBase entity-living-in]
    (-> this (.onKillEntity entity-living-in))))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^Entity this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn non-boss?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isNonBoss))))

(defn set-custom-name-tag
  "name - `java.lang.String`"
  ([^Entity this ^java.lang.String name]
    (-> this (.setCustomNameTag name))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^Entity this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-collision-border-size
  "returns: `float`"
  (^Float [^Entity this]
    (-> this (.getCollisionBorderSize))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^Entity this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn on-scoreboard-team?
  "team-in - `net.minecraft.scoreboard.Team`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.scoreboard.Team team-in]
    (-> this (.isOnScoreboardTeam team-in))))

(defn get-max-fall-height
  "returns: `int`"
  (^Integer [^Entity this]
    (-> this (.getMaxFallHeight))))

(defn on-entity-update
  ""
  ([^Entity this]
    (-> this (.onEntityUpdate))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^Entity this]
    (-> this (.getEyeHeight))))

(defn set-air
  "air - `int`"
  ([^Entity this ^Integer air]
    (-> this (.setAir air))))

(defn burning?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isBurning))))

(defn riding-or-being-ridden-by?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isRidingOrBeingRiddenBy entity-in))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^Entity this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-entity-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Entity this]
    (-> this (.getEntityBoundingBox))))

(defn set-world
  "world-in - `net.minecraft.world.World`"
  ([^Entity this ^net.minecraft.world.World world-in]
    (-> this (.setWorld world-in))))

(defn on-kill-command
  ""
  ([^Entity this]
    (-> this (.onKillCommand))))

(defn get-command-sender-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Entity this]
    (-> this (.getCommandSenderEntity))))

(defn get-position-vector
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Entity this]
    (-> this (.getPositionVector))))

(defn get-always-render-name-tag-for-render?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.getAlwaysRenderNameTagForRender))))

(defn add-entity-crash-info
  "category - `net.minecraft.crash.CrashReportCategory`"
  ([^Entity this ^net.minecraft.crash.CrashReportCategory category]
    (-> this (.addEntityCrashInfo category))))

(defn dismount-riding-entity
  ""
  ([^Entity this]
    (-> this (.dismountRidingEntity))))

(defn copy-location-and-angles-from
  "entity-in - `net.minecraft.entity.Entity`"
  ([^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.copyLocationAndAnglesFrom entity-in))))

(defn set-position-non-dirty
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.setPositionNonDirty))))

(defn entity-invulnerable?
  "source - `net.minecraft.util.DamageSource`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.util.DamageSource source]
    (-> this (.isEntityInvulnerable source))))

(defn set-entity-invulnerable
  "is-invulnerable - `boolean`"
  ([^Entity this ^Boolean is-invulnerable]
    (-> this (.setEntityInvulnerable is-invulnerable))))

(defn get-entity-data
  "Returns a NBTTagCompound that can be used to store custom data for this entity.
   It will be written, and read from disc, so it persists over world saves.

  returns: A NBTTagCompound - `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^Entity this]
    (-> this (.getEntityData))))

(defn get-recursive-passengers
  "returns: `java.util.Collection<net.minecraft.entity.Entity>`"
  (^java.util.Collection [^Entity this]
    (-> this (.getRecursivePassengers))))

(defn get-armor-inventory-list
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^Entity this]
    (-> this (.getArmorInventoryList))))

(defn set-position
  "x - `double`
  y - `double`
  z - `double`"
  ([^Entity this ^Double x ^Double y ^Double z]
    (-> this (.setPosition x y z))))

(defn verify-explosion
  "explosion-in - `net.minecraft.world.Explosion`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-state-in - `net.minecraft.block.state.IBlockState`
  p-174816-5 - `float`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.world.Explosion explosion-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState block-state-in ^Float p-174816-5]
    (-> this (.verifyExplosion explosion-in world-in pos block-state-in p-174816-5))))

(defn get-rotated-yaw
  "transform-rotation - `net.minecraft.util.Rotation`

  returns: `float`"
  (^Float [^Entity this ^net.minecraft.util.Rotation transform-rotation]
    (-> this (.getRotatedYaw transform-rotation))))

(defn being-ridden?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isBeingRidden))))

(defn pushed-by-water?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isPushedByWater))))

(defn get-last-portal-vec
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Entity this]
    (-> this (.getLastPortalVec))))

(defn get-distance
  "x - `double`
  y - `double`
  z - `double`

  returns: `double`"
  (^Double [^Entity this ^Double x ^Double y ^Double z]
    (-> this (.getDistance x y z))))

(defn get-mirrored-yaw
  "transform-mirror - `net.minecraft.util.Mirror`

  returns: `float`"
  (^Float [^Entity this ^net.minecraft.util.Mirror transform-mirror]
    (-> this (.getMirroredYaw transform-mirror))))

(defn on-update
  ""
  ([^Entity this]
    (-> this (.onUpdate))))

(defn remove-tracking-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^Entity this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.removeTrackingPlayer player))))

(defn get-look-vec
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Entity this]
    (-> this (.getLookVec))))

(defn get-push-reaction
  "returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^Entity this]
    (-> this (.getPushReaction))))

(defn add-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^Entity this ^Double x ^Double y ^Double z]
    (-> this (.addVelocity x y z))))

(defn apply-player-interaction
  "player - `net.minecraft.entity.player.EntityPlayer`
  vec - `net.minecraft.util.math.Vec3d`
  stack - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^Entity this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.Vec3d vec ^net.minecraft.util.EnumHand stack]
    (-> this (.applyPlayerInteraction player vec stack))))

(defn set-position-and-update
  "x - `double`
  y - `double`
  z - `double`"
  ([^Entity this ^Double x ^Double y ^Double z]
    (-> this (.setPositionAndUpdate x y z))))

(defn move-to-block-pos-and-angles
  "pos - `net.minecraft.util.math.BlockPos`
  rotation-yaw-in - `float`
  rotation-pitch-in - `float`"
  ([^Entity this ^net.minecraft.util.math.BlockPos pos ^Float rotation-yaw-in ^Float rotation-pitch-in]
    (-> this (.moveToBlockPosAndAngles pos rotation-yaw-in rotation-pitch-in))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^Entity this]
    (-> this (.getServer))))

(defn add-tag
  "tag - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Entity this ^java.lang.String tag]
    (-> this (.addTag tag))))

(defn get-parts
  "returns: `net.minecraft.entity.Entity[]`"
  ([^Entity this]
    (-> this (.getParts))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Entity this]
    (-> this (.getPosition))))

(defn get-position-eyes
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Entity this ^Float partial-ticks]
    (-> this (.getPositionEyes partial-ticks))))

(defn immune-to-fire?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isImmuneToFire))))

(defn set-sprinting
  "sprinting - `boolean`"
  ([^Entity this ^Boolean sprinting]
    (-> this (.setSprinting sprinting))))

(defn get-distance-sq-to-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `double`"
  (^Double [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getDistanceSqToEntity entity-in))))

(defn get-data-manager
  "returns: `net.minecraft.network.datasync.EntityDataManager`"
  (^net.minecraft.network.datasync.EntityDataManager [^Entity this]
    (-> this (.getDataManager))))

(defn set-silent
  "is-silent - `boolean`"
  ([^Entity this ^Boolean is-silent]
    (-> this (.setSilent is-silent))))

(defn set-outside-border
  "outside-border - `boolean`"
  ([^Entity this ^Boolean outside-border]
    (-> this (.setOutsideBorder outside-border))))

(defn set-command-stat
  "type - `net.minecraft.command.CommandResultStats$Type`
  amount - `int`"
  ([^Entity this ^net.minecraft.command.CommandResultStats$Type type ^Integer amount]
    (-> this (.setCommandStat type amount))))

(defn set-always-render-name-tag
  "always-render-name-tag - `boolean`"
  ([^Entity this ^Boolean always-render-name-tag]
    (-> this (.setAlwaysRenderNameTag always-render-name-tag))))

(defn apply-entity-collision
  "entity-in - `net.minecraft.entity.Entity`"
  ([^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.applyEntityCollision entity-in))))

(defn get-equipment-and-armor
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^Entity this]
    (-> this (.getEquipmentAndArmor))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^Entity this]
    (-> this (.getEntityId))))

(defn ray-trace
  "block-reach-distance - `double`
  partial-ticks - `float`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^Entity this ^Double block-reach-distance ^Float partial-ticks]
    (-> this (.rayTrace block-reach-distance partial-ticks))))

(defn entity-equal?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isEntityEqual entity-in))))

(defn hit-by-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.hitByEntity entity-in))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Entity this]
    (-> this (.toString))))

(defn on-same-team?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isOnSameTeam entity-in))))

(defn set-rotation-yaw-head
  "rotation - `float`"
  ([^Entity this ^Float rotation]
    (-> this (.setRotationYawHead rotation))))

(defn can-be-attacked-with-item?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.canBeAttackedWithItem))))

(defn get-teleport-direction
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Entity this]
    (-> this (.getTeleportDirection))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^Entity this]
    (-> this (.getDisplayName))))

(defn set-in-web
  ""
  ([^Entity this]
    (-> this (.setInWeb))))

(defn set-position-and-rotation
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`"
  ([^Entity this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch]
    (-> this (.setPositionAndRotation x y z yaw pitch))))

(defn should-dismount-in-water?
  "If the rider should be dismounted from the entity when the entity goes under water

  rider - The entity that is riding - `net.minecraft.entity.Entity`

  returns: if the entity should be dismounted when under water - `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity rider]
    (-> this (.shouldDismountInWater rider))))

(defn move-relative
  "strafe - `float`
  forward - `float`
  friction - `float`"
  ([^Entity this ^Float strafe ^Float forward ^Float friction]
    (-> this (.moveRelative strafe forward friction))))

(defn reset-entity-id
  "Reset the entity ID to a new value. Not to be used from Mod code"
  ([^Entity this]
    (-> this (.resetEntityId))))

(defn in-lava?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isInLava))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^Entity this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn get-held-equipment
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^Entity this]
    (-> this (.getHeldEquipment))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Entity this]
    (-> this (.getName))))

(defn get-max-in-portal-time
  "returns: `int`"
  (^Integer [^Entity this]
    (-> this (.getMaxInPortalTime))))

(defn set-unique-id
  "unique-id-in - `java.util.UUID`"
  ([^Entity this ^java.util.UUID unique-id-in]
    (-> this (.setUniqueId unique-id-in))))

(defn entity-drop-item
  "stack - `net.minecraft.item.ItemStack`
  offset-y - `float`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^Entity this ^net.minecraft.item.ItemStack stack ^Float offset-y]
    (-> this (.entityDropItem stack offset-y))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^Entity this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^Entity this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn send-command-feedback
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.sendCommandFeedback))))

(defn get-recursive-passengers-by-type
  "entity-class - `java.lang.Class`

  returns: `<T extends net.minecraft.entity.Entity> java.util.Collection<T>`"
  ([^Entity this ^java.lang.Class entity-class]
    (-> this (.getRecursivePassengersByType entity-class))))

(defn drop-item
  "item-in - `net.minecraft.item.Item`
  size - `int`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^Entity this ^net.minecraft.item.Item item-in ^Integer size]
    (-> this (.dropItem item-in size))))

(defn get-always-render-name-tag?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.getAlwaysRenderNameTag))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^Entity this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn serialize-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^Entity this]
    (-> this (.serializeNBT))))

(defn get-distance-to-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `float`"
  (^Float [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getDistanceToEntity entity-in))))

(defn get-controlling-passenger
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Entity this]
    (-> this (.getControllingPassenger))))

(defn get-distance-sq-to-center
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `double`"
  (^Double [^Entity this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDistanceSqToCenter pos))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^Entity this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn get-lowest-riding-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Entity this]
    (-> this (.getLowestRidingEntity))))

(defn apply-orientation-to-entity
  "entity-to-update - `net.minecraft.entity.Entity`"
  ([^Entity this ^net.minecraft.entity.Entity entity-to-update]
    (-> this (.applyOrientationToEntity entity-to-update))))

(defn write-to-nbt-atomically
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBTAtomically compound))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^Entity this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn update-passenger
  "passenger - `net.minecraft.entity.Entity`"
  ([^Entity this ^net.minecraft.entity.Entity passenger]
    (-> this (.updatePassenger passenger))))

(defn can-rider-interact?
  "If a rider of this entity can interact with this entity. Should return true on the
   ridden entity if so.

  returns: if the entity can be interacted with from a rider - `boolean`"
  (^Boolean [^Entity this]
    (-> this (.canRiderInteract))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^Entity this]
    (-> this (.getUniqueID))))

(defn ignore-item-entity-data
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.ignoreItemEntityData))))

(defn get-persistent-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^Entity this]
    (-> this (.getPersistentID))))

(defn extinguish
  ""
  ([^Entity this]
    (-> this (.extinguish))))

(defn glowing?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isGlowing))))

(defn set-entity-id
  "id - `int`"
  ([^Entity this ^Integer id]
    (-> this (.setEntityId id))))

(defn get-entity-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^Entity this]
    (-> this (.getEntityWorld))))

(defn get-passengers
  "returns: `java.util.List<net.minecraft.entity.Entity>`"
  (^java.util.List [^Entity this]
    (-> this (.getPassengers))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.hasCustomName))))

(defn can-render-on-fire?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.canRenderOnFire))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-distance-sq
  "x - `double`
  y - `double`
  z - `double`

  returns: `double`"
  (^Double [^Entity this ^Double x ^Double y ^Double z]
    (-> this (.getDistanceSq x y z)))
  (^Double [^Entity this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDistanceSq pos))))

(defn set-sneaking
  "sneaking - `boolean`"
  ([^Entity this ^Boolean sneaking]
    (-> this (.setSneaking sneaking))))

(defn inside-of-material?
  "material-in - `net.minecraft.block.material.Material`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.block.material.Material material-in]
    (-> this (.isInsideOfMaterial material-in))))

(defn get-tags
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^Entity this]
    (-> this (.getTags))))

(defn wet?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isWet))))

(defn in-water?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isInWater))))

(defn invisible?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isInvisible))))

(defn get-pitch-yaw
  "returns: `net.minecraft.util.math.Vec2f`"
  (^net.minecraft.util.math.Vec2f [^Entity this]
    (-> this (.getPitchYaw))))

(defn riding-same-entity?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isRidingSameEntity entity-in))))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^Entity this]
    (-> this (.getSoundCategory))))

(defn set-glowing
  "glowing-in - `boolean`"
  ([^Entity this ^Boolean glowing-in]
    (-> this (.setGlowing glowing-in))))

(defn silent?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isSilent))))

(defn add-tracking-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^Entity this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.addTrackingPlayer player))))

(defn move
  "type - `net.minecraft.entity.MoverType`
  x - `double`
  y - `double`
  z - `double`"
  ([^Entity this ^net.minecraft.entity.MoverType type ^Double x ^Double y ^Double z]
    (-> this (.move type x y z))))

(defn has-no-gravity?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.hasNoGravity))))

(defn add-to-player-score
  "entity-in - `net.minecraft.entity.Entity`
  amount - `int`"
  ([^Entity this ^net.minecraft.entity.Entity entity-in ^Integer amount]
    (-> this (.addToPlayerScore entity-in amount))))

(defn sneaking?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isSneaking))))

(defn set-render-yaw-offset
  "offset - `float`"
  ([^Entity this ^Float offset]
    (-> this (.setRenderYawOffset offset))))

(defn get-command-stats
  "returns: `net.minecraft.command.CommandResultStats`"
  (^net.minecraft.command.CommandResultStats [^Entity this]
    (-> this (.getCommandStats))))

(defn creature-type?
  "Returns true if the entity is of the @link{EnumCreatureType} provided

  type - The EnumCreatureType type this entity is evaluating - `net.minecraft.entity.EnumCreatureType`
  for-spawn-count - If this is being invoked to check spawn count caps. - `boolean`

  returns: If the creature is of the type provided - `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.EnumCreatureType type ^Boolean for-spawn-count]
    (-> this (.isCreatureType type for-spawn-count))))

(defn immune-to-explosions?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isImmuneToExplosions))))

(defn remove-tag
  "tag - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Entity this ^java.lang.String tag]
    (-> this (.removeTag tag))))

(defn get-portal-cooldown
  "returns: `int`"
  (^Integer [^Entity this]
    (-> this (.getPortalCooldown))))

(defn spectated-by-player?
  "player - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.isSpectatedByPlayer player))))

(defn offset-position-in-liquid?
  "x - `double`
  y - `double`
  z - `double`

  returns: `boolean`"
  (^Boolean [^Entity this ^Double x ^Double y ^Double z]
    (-> this (.isOffsetPositionInLiquid x y z))))

(defn get-picked-result
  "Called when a user uses the creative pick block button on this entity.

  target - The full target the player is looking at - `net.minecraft.util.math.RayTraceResult`

  returns: A ItemStack to add to the player's inventory, empty ItemStack if nothing should be added. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Entity this ^net.minecraft.util.math.RayTraceResult target]
    (-> this (.getPickedResult target))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.canBeCollidedWith))))

(defn spawn-running-particles
  ""
  ([^Entity this]
    (-> this (.spawnRunningParticles))))

(defn set-no-gravity
  "no-gravity - `boolean`"
  ([^Entity this ^Boolean no-gravity]
    (-> this (.setNoGravity no-gravity))))

(defn perform-hurt-animation
  ""
  ([^Entity this]
    (-> this (.performHurtAnimation))))

(defn can-passenger-steer?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.canPassengerSteer))))

(defn get-cached-unique-id-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Entity this]
    (-> this (.getCachedUniqueIdString))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Entity this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn entity-inside-opaque-block?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isEntityInsideOpaqueBlock))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^Entity this]
    (-> this (.getYOffset))))

(defn get-team
  "returns: `net.minecraft.scoreboard.Team`"
  (^net.minecraft.scoreboard.Team [^Entity this]
    (-> this (.getTeam))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Entity this]
    (-> this (.hashCode))))

(defn does-entity-not-trigger-pressure-plate
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.doesEntityNotTriggerPressurePlate))))

(defn handle-water-movement
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.handleWaterMovement))))

(defn entity-alive?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isEntityAlive))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Entity this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn start-riding
  "entity-in - `net.minecraft.entity.Entity`
  force - `boolean`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in ^Boolean force]
    (-> this (.startRiding entity-in force)))
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.startRiding entity-in))))

(defn set-portal
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^Entity this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setPortal pos))))

(defn remove-passengers
  ""
  ([^Entity this]
    (-> this (.removePassengers))))

(defn set-location-and-angles
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`"
  ([^Entity this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch]
    (-> this (.setLocationAndAngles x y z yaw pitch))))

(defn set-fire
  "seconds - `int`"
  ([^Entity this ^Integer seconds]
    (-> this (.setFire seconds))))

(defn update-ridden
  ""
  ([^Entity this]
    (-> this (.updateRidden))))

(defn get-forward
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Entity this]
    (-> this (.getForward))))

(defn get-collision-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Entity this]
    (-> this (.getCollisionBoundingBox))))

(defn set-command-stats
  "entity-in - `net.minecraft.entity.Entity`"
  ([^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.setCommandStats entity-in))))

(defn on-struck-by-lightning
  "lightning-bolt - `net.minecraft.entity.effect.EntityLightningBolt`"
  ([^Entity this ^net.minecraft.entity.effect.EntityLightningBolt lightning-bolt]
    (-> this (.onStruckByLightning lightning-bolt))))

(defn play-sound
  "sound-in - `net.minecraft.util.SoundEvent`
  volume - `float`
  pitch - `float`"
  ([^Entity this ^net.minecraft.util.SoundEvent sound-in ^Float volume ^Float pitch]
    (-> this (.playSound sound-in volume pitch))))

(defn get-collision-box
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getCollisionBox entity-in))))

(defn on-collide-with-player
  "entity-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^Entity this ^net.minecraft.entity.player.EntityPlayer entity-in]
    (-> this (.onCollideWithPlayer entity-in))))

(defn sprinting?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isSprinting))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^Entity this]
    (-> this (.getMountedYOffset))))

(defn get-is-invulnerable?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.getIsInvulnerable))))

(defn set-drop-items-when-dead
  "drop-when-dead - `boolean`"
  ([^Entity this ^Boolean drop-when-dead]
    (-> this (.setDropItemsWhenDead drop-when-dead))))

(defn get-explosion-resistance
  "explosion-in - `net.minecraft.world.Explosion`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-state-in - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^Entity this ^net.minecraft.world.Explosion explosion-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState block-state-in]
    (-> this (.getExplosionResistance explosion-in world-in pos block-state-in))))

(defn reset-position-to-bb
  ""
  ([^Entity this]
    (-> this (.resetPositionToBB))))

(defn turn
  "yaw - `float`
  pitch - `float`"
  ([^Entity this ^Float yaw ^Float pitch]
    (-> this (.turn yaw pitch))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^Entity this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.canBePushed))))

(defn can-trample?
  "Checks if this Entity can trample a Block.

  world - The world in which the block will be trampled - `net.minecraft.world.World`
  block - The block being tested - `net.minecraft.block.Block`
  pos - The block pos - `net.minecraft.util.math.BlockPos`
  fall-distance - The fall distance - `float`

  returns: true if this entity can trample, false otherwise - `boolean`"
  (^Boolean [^Entity this ^net.minecraft.world.World world ^net.minecraft.block.Block block ^net.minecraft.util.math.BlockPos pos ^Float fall-distance]
    (-> this (.canTrample world block pos fall-distance))))

(defn deserialize-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^Entity this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.deserializeNBT nbt))))

(defn set-dead
  ""
  ([^Entity this]
    (-> this (.setDead))))

(defn get-custom-name-tag
  "returns: `java.lang.String`"
  (^java.lang.String [^Entity this]
    (-> this (.getCustomNameTag))))

(defn set-entity-bounding-box
  "bb - `net.minecraft.util.math.AxisAlignedBB`"
  ([^Entity this ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.setEntityBoundingBox bb))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Entity this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn set-invisible
  "invisible - `boolean`"
  ([^Entity this ^Boolean invisible]
    (-> this (.setInvisible invisible))))

(defn handle-status-update
  "id - `byte`"
  ([^Entity this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn outside-border?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isOutsideBorder))))

(defn drop-item-with-offset
  "item-in - `net.minecraft.item.Item`
  size - `int`
  offset-y - `float`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^Entity this ^net.minecraft.item.Item item-in ^Integer size ^Float offset-y]
    (-> this (.dropItemWithOffset item-in size offset-y))))

(defn get-look
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Entity this ^Float partial-ticks]
    (-> this (.getLook partial-ticks))))

(defn change-dimension
  "dimension-in - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Entity this ^Integer dimension-in]
    (-> this (.changeDimension dimension-in))))

(defn riding?
  "returns: `boolean`"
  (^Boolean [^Entity this]
    (-> this (.isRiding))))

(defn get-render-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Entity this]
    (-> this (.getRenderBoundingBox))))

(defn passenger?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isPassenger entity-in))))

(defn get-air
  "returns: `int`"
  (^Integer [^Entity this]
    (-> this (.getAir))))

(defn should-rider-sit?
  "Used in model rendering to determine if the entity riding this entity should be in the 'sitting' position.

  returns: false to prevent an entity that is mounted to this entity from displaying the 'sitting' animation. - `boolean`"
  (^Boolean [^Entity this]
    (-> this (.shouldRiderSit))))

(defn get-horizontal-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Entity this]
    (-> this (.getHorizontalFacing))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^Entity this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

(defn write-to-nbt-optional
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^Entity this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBTOptional compound))))

(defn set-item-stack-to-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`"
  ([^Entity this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStackToSlot slot-in stack))))

(defn get-riding-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Entity this]
    (-> this (.getRidingEntity))))

