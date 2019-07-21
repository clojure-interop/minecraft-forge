(ns net.minecraft.entity.projectile.EntityFireball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityFireball]))

(defn ->entity-fireball
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  accel-x - `double`
  accel-y - `double`
  accel-z - `double`"
  (^EntityFireball [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityFireball world-in x y z accel-x accel-y accel-z))
  (^EntityFireball [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityFireball world-in shooter accel-x accel-y accel-z))
  (^EntityFireball [^net.minecraft.world.World world-in]
    (new EntityFireball world-in)))

(defn shooting-entity
  "Instance Field.

  type: net.minecraft.entity.EntityLivingBase"
  (^net.minecraft.entity.EntityLivingBase [^EntityFireball this]
    (-> this .-shootingEntity)))

(defn acceleration-x
  "Instance Field.

  type: double"
  (^Double [^EntityFireball this]
    (-> this .-accelerationX)))

(defn acceleration-y
  "Instance Field.

  type: double"
  (^Double [^EntityFireball this]
    (-> this .-accelerationY)))

(defn acceleration-z
  "Instance Field.

  type: double"
  (^Double [^EntityFireball this]
    (-> this .-accelerationZ)))

(defn *register-fixes-fireball
  "fixer - `net.minecraft.util.datafix.DataFixer`
  name - `java.lang.String`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.String name]
    (EntityFireball/registerFixesFireball fixer name)))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityFireball this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-collision-border-size
  "returns: `float`"
  (^Float [^EntityFireball this]
    (-> this (.getCollisionBorderSize))))

(defn on-update
  ""
  ([^EntityFireball this]
    (-> this (.onUpdate))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityFireball this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityFireball this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^EntityFireball this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityFireball this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityFireball this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityFireball this]
    (-> this (.canBeCollidedWith))))

