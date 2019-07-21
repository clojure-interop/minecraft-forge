(ns net.minecraft.entity.EntityLivingBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityLivingBase]))

(defn ->entity-living-base
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityLivingBase [^net.minecraft.world.World world-in]
    (new EntityLivingBase world-in)))

(defn is-swing-in-progress
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityLivingBase this]
    (-> this .-isSwingInProgress)))

(defn swinging-hand
  "Instance Field.

  type: net.minecraft.util.EnumHand"
  (^net.minecraft.util.EnumHand [^EntityLivingBase this]
    (-> this .-swingingHand)))

(defn swing-progress-int
  "Instance Field.

  type: int"
  (^Integer [^EntityLivingBase this]
    (-> this .-swingProgressInt)))

(defn arrow-hit-timer
  "Instance Field.

  type: int"
  (^Integer [^EntityLivingBase this]
    (-> this .-arrowHitTimer)))

(defn hurt-time
  "Instance Field.

  type: int"
  (^Integer [^EntityLivingBase this]
    (-> this .-hurtTime)))

(defn max-hurt-time
  "Instance Field.

  type: int"
  (^Integer [^EntityLivingBase this]
    (-> this .-maxHurtTime)))

(defn attacked-at-yaw
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-attackedAtYaw)))

(defn death-time
  "Instance Field.

  type: int"
  (^Integer [^EntityLivingBase this]
    (-> this .-deathTime)))

(defn prev-swing-progress
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-prevSwingProgress)))

(defn swing-progress
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-swingProgress)))

(defn prev-limb-swing-amount
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-prevLimbSwingAmount)))

(defn limb-swing-amount
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-limbSwingAmount)))

(defn limb-swing
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-limbSwing)))

(defn max-hurt-resistant-time
  "Instance Field.

  type: int"
  (^Integer [^EntityLivingBase this]
    (-> this .-maxHurtResistantTime)))

(defn prev-camera-pitch
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-prevCameraPitch)))

(defn camera-pitch
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-cameraPitch)))

(defn random-unused-2
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-randomUnused2)))

(defn random-unused-1
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-randomUnused1)))

(defn render-yaw-offset
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-renderYawOffset)))

(defn prev-render-yaw-offset
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-prevRenderYawOffset)))

(defn rotation-yaw-head
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-rotationYawHead)))

(defn prev-rotation-yaw-head
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-prevRotationYawHead)))

(defn jump-movement-factor
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-jumpMovementFactor)))

(defn move-strafing
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-moveStrafing)))

(defn move-forward
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-moveForward)))

(defn random-yaw-velocity
  "Instance Field.

  type: float"
  (^Float [^EntityLivingBase this]
    (-> this .-randomYawVelocity)))

(defn *are-all-potions-ambient
  "potion-effects - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^java.util.Collection potion-effects]
    (EntityLivingBase/areAllPotionsAmbient potion-effects)))

(defn get-rotation-yaw-head
  "returns: `float`"
  (^Float [^EntityLivingBase this]
    (-> this (.getRotationYawHead))))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityLivingBase this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntityLivingBase this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn get-combat-tracker
  "returns: `net.minecraft.util.CombatTracker`"
  (^net.minecraft.util.CombatTracker [^EntityLivingBase this]
    (-> this (.getCombatTracker))))

(defn get-ai-target
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityLivingBase this]
    (-> this (.getAITarget))))

(defn on-entity-update
  ""
  ([^EntityLivingBase this]
    (-> this (.onEntityUpdate))))

(defn stop-active-hand
  ""
  ([^EntityLivingBase this]
    (-> this (.stopActiveHand))))

(defn on-kill-command
  ""
  ([^EntityLivingBase this]
    (-> this (.onKillCommand))))

(defn get-always-render-name-tag-for-render?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.getAlwaysRenderNameTagForRender))))

(defn render-broken-item-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^EntityLivingBase this ^net.minecraft.item.ItemStack stack]
    (-> this (.renderBrokenItemStack stack))))

(defn dismount-riding-entity
  ""
  ([^EntityLivingBase this]
    (-> this (.dismountRidingEntity))))

(defn add-potion-effect
  "potioneffect-in - `net.minecraft.potion.PotionEffect`"
  ([^EntityLivingBase this ^net.minecraft.potion.PotionEffect potioneffect-in]
    (-> this (.addPotionEffect potioneffect-in))))

(defn get-last-damage-source
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^EntityLivingBase this]
    (-> this (.getLastDamageSource))))

(defn attempt-teleport
  "x - `double`
  y - `double`
  z - `double`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^Double x ^Double y ^Double z]
    (-> this (.attemptTeleport x y z))))

(defn get-item-in-use-max-count
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getItemInUseMaxCount))))

(defn get-last-attacker
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityLivingBase this]
    (-> this (.getLastAttacker))))

(defn get-armor-inventory-list
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityLivingBase this]
    (-> this (.getArmorInventoryList))))

(defn get-rng
  "returns: `java.util.Random`"
  (^java.util.Random [^EntityLivingBase this]
    (-> this (.getRNG))))

(defn set-jumping
  "jumping - `boolean`"
  ([^EntityLivingBase this ^Boolean jumping]
    (-> this (.setJumping jumping))))

(defn can-be-hit-with-potion?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.canBeHitWithPotion))))

(defn remove-potion-effect
  "potion-in - `net.minecraft.potion.Potion`"
  ([^EntityLivingBase this ^net.minecraft.potion.Potion potion-in]
    (-> this (.removePotionEffect potion-in))))

(defn on-update
  ""
  ([^EntityLivingBase this]
    (-> this (.onUpdate))))

(defn potion-applicable?
  "potioneffect-in - `net.minecraft.potion.PotionEffect`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.potion.PotionEffect potioneffect-in]
    (-> this (.isPotionApplicable potioneffect-in))))

(defn get-ticks-elytra-flying
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getTicksElytraFlying))))

(defn get-look-vec
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityLivingBase this]
    (-> this (.getLookVec))))

(defn get-entity-attribute
  "attribute - `net.minecraft.entity.ai.attributes.IAttribute`

  returns: `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.IAttributeInstance [^EntityLivingBase this ^net.minecraft.entity.ai.attributes.IAttribute attribute]
    (-> this (.getEntityAttribute attribute))))

(defn set-sprinting
  "sprinting - `boolean`"
  ([^EntityLivingBase this ^Boolean sprinting]
    (-> this (.setSprinting sprinting))))

(defn on-item-pickup
  "entity-in - `net.minecraft.entity.Entity`
  quantity - `int`"
  ([^EntityLivingBase this ^net.minecraft.entity.Entity entity-in ^Integer quantity]
    (-> this (.onItemPickup entity-in quantity))))

(defn can-entity-be-seen?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.entity.Entity entity-in]
    (-> this (.canEntityBeSeen entity-in))))

(defn get-absorption-amount
  "returns: `float`"
  (^Float [^EntityLivingBase this]
    (-> this (.getAbsorptionAmount))))

(defn dismount-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityLivingBase this ^net.minecraft.entity.Entity entity-in]
    (-> this (.dismountEntity entity-in))))

(defn set-rotation-yaw-head
  "rotation - `float`"
  ([^EntityLivingBase this ^Float rotation]
    (-> this (.setRotationYawHead rotation))))

(defn set-arrow-count-in-entity
  "count - `int`"
  ([^EntityLivingBase this ^Integer count]
    (-> this (.setArrowCountInEntity count))))

(defn set-absorption-amount
  "amount - `float`"
  ([^EntityLivingBase this ^Float amount]
    (-> this (.setAbsorptionAmount amount))))

(defn get-held-item-offhand
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityLivingBase this]
    (-> this (.getHeldItemOffhand))))

(defn get-attribute-map
  "returns: `net.minecraft.entity.ai.attributes.AbstractAttributeMap`"
  (^net.minecraft.entity.ai.attributes.AbstractAttributeMap [^EntityLivingBase this]
    (-> this (.getAttributeMap))))

(defn hand-active?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isHandActive))))

(defn clear-active-potions
  ""
  ([^EntityLivingBase this]
    (-> this (.clearActivePotions))))

(defn get-max-health
  "returns: `float`"
  (^Float [^EntityLivingBase this]
    (-> this (.getMaxHealth))))

(defn get-active-potion-effect
  "potion-in - `net.minecraft.potion.Potion`

  returns: `net.minecraft.potion.PotionEffect`"
  (^net.minecraft.potion.PotionEffect [^EntityLivingBase this ^net.minecraft.potion.Potion potion-in]
    (-> this (.getActivePotionEffect potion-in))))

(defn get-active-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityLivingBase this]
    (-> this (.getActiveItemStack))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLivingBase this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn potion-active?
  "potion-in - `net.minecraft.potion.Potion`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.potion.Potion potion-in]
    (-> this (.isPotionActive potion-in))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^EntityLivingBase this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-total-armor-value
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getTotalArmorValue))))

(defn entity-undead?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isEntityUndead))))

(defn elytra-flying?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isElytraFlying))))

(defn get-attacking-entity
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityLivingBase this]
    (-> this (.getAttackingEntity))))

(defn heal
  "heal-amount - `float`"
  ([^EntityLivingBase this ^Float heal-amount]
    (-> this (.heal heal-amount))))

(defn on-ladder?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isOnLadder))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityLivingBase this]
    (-> this (.getCreatureAttribute))))

(defn active-item-stack-blocking?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isActiveItemStackBlocking))))

(defn set-ai-move-speed
  "speed-in - `float`"
  ([^EntityLivingBase this ^Float speed-in]
    (-> this (.setAIMoveSpeed speed-in))))

(defn get-active-potion-effects
  "returns: `java.util.Collection<net.minecraft.potion.PotionEffect>`"
  (^java.util.Collection [^EntityLivingBase this]
    (-> this (.getActivePotionEffects))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityLivingBase this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityLivingBase this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn get-health
  "returns: `float`"
  (^Float [^EntityLivingBase this]
    (-> this (.getHealth))))

(defn player-sleeping?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isPlayerSleeping))))

(defn swing-arm
  "hand - `net.minecraft.util.EnumHand`"
  ([^EntityLivingBase this ^net.minecraft.util.EnumHand hand]
    (-> this (.swingArm hand))))

(defn remove-active-potion-effect
  "potioneffectin - `net.minecraft.potion.Potion`

  returns: `net.minecraft.potion.PotionEffect`"
  (^net.minecraft.potion.PotionEffect [^EntityLivingBase this ^net.minecraft.potion.Potion potioneffectin]
    (-> this (.removeActivePotionEffect potioneffectin))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLivingBase this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-held-item
  "hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityLivingBase this ^net.minecraft.util.EnumHand hand]
    (-> this (.getHeldItem hand))))

(defn attackable
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.attackable))))

(defn server-world?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isServerWorld))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn child?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isChild))))

(defn can-breathe-underwater?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.canBreatheUnderwater))))

(defn get-ai-move-speed
  "returns: `float`"
  (^Float [^EntityLivingBase this]
    (-> this (.getAIMoveSpeed))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-held-item-mainhand
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityLivingBase this]
    (-> this (.getHeldItemMainhand))))

(defn get-item-stack-from-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityLivingBase this ^net.minecraft.inventory.EntityEquipmentSlot slot-in]
    (-> this (.getItemStackFromSlot slot-in))))

(defn get-last-attacker-time
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getLastAttackerTime))))

(defn get-swing-progress
  "partial-tick-time - `float`

  returns: `float`"
  (^Float [^EntityLivingBase this ^Float partial-tick-time]
    (-> this (.getSwingProgress partial-tick-time))))

(defn set-held-item
  "hand - `net.minecraft.util.EnumHand`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityLivingBase this ^net.minecraft.util.EnumHand hand ^net.minecraft.item.ItemStack stack]
    (-> this (.setHeldItem hand stack))))

(defn set-render-yaw-offset
  "offset - `float`"
  ([^EntityLivingBase this ^Float offset]
    (-> this (.setRenderYawOffset offset))))

(defn send-end-combat
  ""
  ([^EntityLivingBase this]
    (-> this (.sendEndCombat))))

(defn set-last-attacker
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityLivingBase this ^net.minecraft.entity.Entity entity-in]
    (-> this (.setLastAttacker entity-in))))

(defn set-health
  "health - `float`"
  ([^EntityLivingBase this ^Float health]
    (-> this (.setHealth health))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.canBeCollidedWith))))

(defn perform-hurt-animation
  ""
  ([^EntityLivingBase this]
    (-> this (.performHurtAnimation))))

(defn get-arrow-count-in-entity
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getArrowCountInEntity))))

(defn reset-active-hand
  ""
  ([^EntityLivingBase this]
    (-> this (.resetActiveHand))))

(defn entity-alive?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.isEntityAlive))))

(defn get-age
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getAge))))

(defn get-primary-hand
  "returns: `net.minecraft.util.EnumHandSide`"
  (^net.minecraft.util.EnumHandSide [^EntityLivingBase this]
    (-> this (.getPrimaryHand))))

(defn get-revenge-timer
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getRevengeTimer))))

(defn get-item-in-use-count
  "returns: `int`"
  (^Integer [^EntityLivingBase this]
    (-> this (.getItemInUseCount))))

(defn update-ridden
  ""
  ([^EntityLivingBase this]
    (-> this (.updateRidden))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn set-revenge-target
  "living-base - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityLivingBase this ^net.minecraft.entity.EntityLivingBase living-base]
    (-> this (.setRevengeTarget living-base))))

(defn set-active-hand
  "hand - `net.minecraft.util.EnumHand`"
  ([^EntityLivingBase this ^net.minecraft.util.EnumHand hand]
    (-> this (.setActiveHand hand))))

(defn has-item-in-slot?
  "p-190630-1 - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.inventory.EntityEquipmentSlot p-190630-1]
    (-> this (.hasItemInSlot p-190630-1))))

(defn send-enter-combat
  ""
  ([^EntityLivingBase this]
    (-> this (.sendEnterCombat))))

(defn get-active-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^EntityLivingBase this]
    (-> this (.getActiveHand))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityLivingBase this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^EntityLivingBase this]
    (-> this (.canBePushed))))

(defn knock-back
  "entity-in - `net.minecraft.entity.Entity`
  strength - `float`
  x-ratio - `double`
  z-ratio - `double`"
  ([^EntityLivingBase this ^net.minecraft.entity.Entity entity-in ^Float strength ^Double x-ratio ^Double z-ratio]
    (-> this (.knockBack entity-in strength x-ratio z-ratio))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityLivingBase this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-look
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityLivingBase this ^Float partial-ticks]
    (-> this (.getLook partial-ticks))))

(defn on-living-update
  ""
  ([^EntityLivingBase this]
    (-> this (.onLivingUpdate))))

(defn set-item-stack-to-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityLivingBase this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStackToSlot slot-in stack))))

(defn cure-potion-effects
  "Removes all potion effects that have curativeItem as a curative item for its effect

  curative-item - The itemstack we are using to cure potion effects - `net.minecraft.item.ItemStack`"
  ([^EntityLivingBase this ^net.minecraft.item.ItemStack curative-item]
    (-> this (.curePotionEffects curative-item))))

(defn should-rider-face-forward?
  "Returns true if the entity's rider (EntityPlayer) should face forward when mounted.
   currently only used in vanilla code by pigs.

  player - The player who is riding the entity. - `net.minecraft.entity.player.EntityPlayer`

  returns: If the player should orient the same direction as this entity. - `boolean`"
  (^Boolean [^EntityLivingBase this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.shouldRiderFaceForward player))))

