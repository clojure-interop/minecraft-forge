(ns net.minecraft.entity.item.EntityArmorStand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityArmorStand]))

(defn ->entity-armor-stand
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos-x - `double`
  pos-y - `double`
  pos-z - `double`"
  (^EntityArmorStand [^net.minecraft.world.World world-in ^Double pos-x ^Double pos-y ^Double pos-z]
    (new EntityArmorStand world-in pos-x pos-y pos-z))
  (^EntityArmorStand [^net.minecraft.world.World world-in]
    (new EntityArmorStand world-in)))

(def *-status
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<java.lang.Byte>"
  EntityArmorStand/STATUS)

(def *-head-rotation
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<net.minecraft.util.math.Rotations>"
  EntityArmorStand/HEAD_ROTATION)

(def *-body-rotation
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<net.minecraft.util.math.Rotations>"
  EntityArmorStand/BODY_ROTATION)

(def *-left-arm-rotation
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<net.minecraft.util.math.Rotations>"
  EntityArmorStand/LEFT_ARM_ROTATION)

(def *-right-arm-rotation
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<net.minecraft.util.math.Rotations>"
  EntityArmorStand/RIGHT_ARM_ROTATION)

(def *-left-leg-rotation
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<net.minecraft.util.math.Rotations>"
  EntityArmorStand/LEFT_LEG_ROTATION)

(def *-right-leg-rotation
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<net.minecraft.util.math.Rotations>"
  EntityArmorStand/RIGHT_LEG_ROTATION)

(defn punch-cooldown
  "Instance Field.

  type: long"
  (^Long [^EntityArmorStand this]
    (-> this .-punchCooldown)))

(defn *register-fixes-armor-stand
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityArmorStand/registerFixesArmorStand fixer)))

(defn get-right-leg-rotation
  "returns: `net.minecraft.util.math.Rotations`"
  (^net.minecraft.util.math.Rotations [^EntityArmorStand this]
    (-> this (.getRightLegRotation))))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntityArmorStand this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityArmorStand this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityArmorStand this]
    (-> this (.getEyeHeight))))

(defn has-marker?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.hasMarker))))

(defn on-kill-command
  ""
  ([^EntityArmorStand this]
    (-> this (.onKillCommand))))

(defn small?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.isSmall))))

(defn get-head-rotation
  "returns: `net.minecraft.util.math.Rotations`"
  (^net.minecraft.util.math.Rotations [^EntityArmorStand this]
    (-> this (.getHeadRotation))))

(defn get-armor-inventory-list
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityArmorStand this]
    (-> this (.getArmorInventoryList))))

(defn set-head-rotation
  "vec - `net.minecraft.util.math.Rotations`"
  ([^EntityArmorStand this ^net.minecraft.util.math.Rotations vec]
    (-> this (.setHeadRotation vec))))

(defn can-be-hit-with-potion?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.canBeHitWithPotion))))

(defn set-left-leg-rotation
  "vec - `net.minecraft.util.math.Rotations`"
  ([^EntityArmorStand this ^net.minecraft.util.math.Rotations vec]
    (-> this (.setLeftLegRotation vec))))

(defn on-update
  ""
  ([^EntityArmorStand this]
    (-> this (.onUpdate))))

(defn get-push-reaction
  "returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^EntityArmorStand this]
    (-> this (.getPushReaction))))

(defn apply-player-interaction
  "player - `net.minecraft.entity.player.EntityPlayer`
  vec - `net.minecraft.util.math.Vec3d`
  stack - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^EntityArmorStand this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.Vec3d vec ^net.minecraft.util.EnumHand stack]
    (-> this (.applyPlayerInteraction player vec stack))))

(defn get-left-arm-rotation
  "returns: `net.minecraft.util.math.Rotations`"
  (^net.minecraft.util.math.Rotations [^EntityArmorStand this]
    (-> this (.getLeftArmRotation))))

(defn get-right-arm-rotation
  "returns: `net.minecraft.util.math.Rotations`"
  (^net.minecraft.util.math.Rotations [^EntityArmorStand this]
    (-> this (.getRightArmRotation))))

(defn get-show-arms?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.getShowArms))))

(defn has-no-base-plate?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.hasNoBasePlate))))

(defn set-rotation-yaw-head
  "rotation - `float`"
  ([^EntityArmorStand this ^Float rotation]
    (-> this (.setRotationYawHead rotation))))

(defn set-right-arm-rotation
  "vec - `net.minecraft.util.math.Rotations`"
  ([^EntityArmorStand this ^net.minecraft.util.math.Rotations vec]
    (-> this (.setRightArmRotation vec))))

(defn get-held-equipment
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityArmorStand this]
    (-> this (.getHeldEquipment))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityArmorStand this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityArmorStand this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attackable
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.attackable))))

(defn server-world?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.isServerWorld))))

(defn get-left-leg-rotation
  "returns: `net.minecraft.util.math.Rotations`"
  (^net.minecraft.util.math.Rotations [^EntityArmorStand this]
    (-> this (.getLeftLegRotation))))

(defn child?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.isChild))))

(defn get-body-rotation
  "returns: `net.minecraft.util.math.Rotations`"
  (^net.minecraft.util.math.Rotations [^EntityArmorStand this]
    (-> this (.getBodyRotation))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityArmorStand this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-item-stack-from-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityArmorStand this ^net.minecraft.inventory.EntityEquipmentSlot slot-in]
    (-> this (.getItemStackFromSlot slot-in))))

(defn set-render-yaw-offset
  "offset - `float`"
  ([^EntityArmorStand this ^Float offset]
    (-> this (.setRenderYawOffset offset))))

(defn immune-to-explosions?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.isImmuneToExplosions))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.canBeCollidedWith))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityArmorStand this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn set-body-rotation
  "vec - `net.minecraft.util.math.Rotations`"
  ([^EntityArmorStand this ^net.minecraft.util.math.Rotations vec]
    (-> this (.setBodyRotation vec))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^EntityArmorStand this]
    (-> this (.getYOffset))))

(defn get-primary-hand
  "returns: `net.minecraft.util.EnumHandSide`"
  (^net.minecraft.util.EnumHandSide [^EntityArmorStand this]
    (-> this (.getPrimaryHand))))

(defn on-struck-by-lightning
  "lightning-bolt - `net.minecraft.entity.effect.EntityLightningBolt`"
  ([^EntityArmorStand this ^net.minecraft.entity.effect.EntityLightningBolt lightning-bolt]
    (-> this (.onStruckByLightning lightning-bolt))))

(defn set-right-leg-rotation
  "vec - `net.minecraft.util.math.Rotations`"
  ([^EntityArmorStand this ^net.minecraft.util.math.Rotations vec]
    (-> this (.setRightLegRotation vec))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityArmorStand this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^EntityArmorStand this]
    (-> this (.canBePushed))))

(defn set-invisible
  "invisible - `boolean`"
  ([^EntityArmorStand this ^Boolean invisible]
    (-> this (.setInvisible invisible))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityArmorStand this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn set-left-arm-rotation
  "vec - `net.minecraft.util.math.Rotations`"
  ([^EntityArmorStand this ^net.minecraft.util.math.Rotations vec]
    (-> this (.setLeftArmRotation vec))))

(defn set-item-stack-to-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityArmorStand this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStackToSlot slot-in stack))))

