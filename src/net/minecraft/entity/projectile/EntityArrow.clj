(ns net.minecraft.entity.projectile.EntityArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityArrow]))

(defn ->entity-arrow
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityArrow [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityArrow world-in x y z))
  (^EntityArrow [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter]
    (new EntityArrow world-in shooter))
  (^EntityArrow [^net.minecraft.world.World world-in]
    (new EntityArrow world-in)))

(defn pickup-status
  "Instance Field.

  type: net.minecraft.entity.projectile.EntityArrow$PickupStatus"
  (^net.minecraft.entity.projectile.EntityArrow$PickupStatus [^EntityArrow this]
    (-> this .-pickupStatus)))

(defn arrow-shake
  "Instance Field.

  type: int"
  (^Integer [^EntityArrow this]
    (-> this .-arrowShake)))

(defn shooting-entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^EntityArrow this]
    (-> this .-shootingEntity)))

(defn *register-fixes-arrow
  "fixer - `net.minecraft.util.datafix.DataFixer`
  name - `java.lang.String`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.String name]
    (EntityArrow/registerFixesArrow fixer name))
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityArrow/registerFixesArrow fixer)))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityArrow this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn set-is-critical
  "critical - `boolean`"
  ([^EntityArrow this ^Boolean critical]
    (-> this (.setIsCritical critical))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityArrow this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityArrow this]
    (-> this (.getEyeHeight))))

(defn on-update
  ""
  ([^EntityArrow this]
    (-> this (.onUpdate))))

(defn set-throwable-heading
  "x - `double`
  y - `double`
  z - `double`
  velocity - `float`
  inaccuracy - `float`"
  ([^EntityArrow this ^Double x ^Double y ^Double z ^Float velocity ^Float inaccuracy]
    (-> this (.setThrowableHeading x y z velocity inaccuracy))))

(defn set-knockback-strength
  "knockback-strength-in - `int`"
  ([^EntityArrow this ^Integer knockback-strength-in]
    (-> this (.setKnockbackStrength knockback-strength-in))))

(defn get-damage
  "returns: `double`"
  (^Double [^EntityArrow this]
    (-> this (.getDamage))))

(defn set-enchantment-effects-from-entity
  "p-190547-1 - `net.minecraft.entity.EntityLivingBase`
  p-190547-2 - `float`"
  ([^EntityArrow this ^net.minecraft.entity.EntityLivingBase p-190547-1 ^Float p-190547-2]
    (-> this (.setEnchantmentEffectsFromEntity p-190547-1 p-190547-2))))

(defn can-be-attacked-with-item?
  "returns: `boolean`"
  (^Boolean [^EntityArrow this]
    (-> this (.canBeAttackedWithItem))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityArrow this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityArrow this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-is-critical?
  "returns: `boolean`"
  (^Boolean [^EntityArrow this]
    (-> this (.getIsCritical))))

(defn set-aim
  "shooter - `net.minecraft.entity.Entity`
  pitch - `float`
  yaw - `float`
  p-184547-4 - `float`
  velocity - `float`
  inaccuracy - `float`"
  ([^EntityArrow this ^net.minecraft.entity.Entity shooter ^Float pitch ^Float yaw ^Float p-184547-4 ^Float velocity ^Float inaccuracy]
    (-> this (.setAim shooter pitch yaw p-184547-4 velocity inaccuracy))))

(defn move
  "type - `net.minecraft.entity.MoverType`
  x - `double`
  y - `double`
  z - `double`"
  ([^EntityArrow this ^net.minecraft.entity.MoverType type ^Double x ^Double y ^Double z]
    (-> this (.move type x y z))))

(defn on-collide-with-player
  "entity-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityArrow this ^net.minecraft.entity.player.EntityPlayer entity-in]
    (-> this (.onCollideWithPlayer entity-in))))

(defn set-damage
  "damage-in - `double`"
  ([^EntityArrow this ^Double damage-in]
    (-> this (.setDamage damage-in))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityArrow this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

