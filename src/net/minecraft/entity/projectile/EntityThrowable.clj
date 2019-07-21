(ns net.minecraft.entity.projectile.EntityThrowable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityThrowable]))

(defn ->entity-throwable
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityThrowable [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityThrowable world-in x y z))
  (^EntityThrowable [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase thrower-in]
    (new EntityThrowable world-in thrower-in))
  (^EntityThrowable [^net.minecraft.world.World world-in]
    (new EntityThrowable world-in)))

(defn throwable-shake
  "Instance Field.

  type: int"
  (^Integer [^EntityThrowable this]
    (-> this .-throwableShake)))

(defn ignore-entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^EntityThrowable this]
    (-> this .-ignoreEntity)))

(defn *register-fixes-throwable
  "fixer - `net.minecraft.util.datafix.DataFixer`
  name - `java.lang.String`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.String name]
    (EntityThrowable/registerFixesThrowable fixer name)))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityThrowable this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn set-heading-from-thrower
  "entity-thrower - `net.minecraft.entity.Entity`
  rotation-pitch-in - `float`
  rotation-yaw-in - `float`
  pitch-offset - `float`
  velocity - `float`
  inaccuracy - `float`"
  ([^EntityThrowable this ^net.minecraft.entity.Entity entity-thrower ^Float rotation-pitch-in ^Float rotation-yaw-in ^Float pitch-offset ^Float velocity ^Float inaccuracy]
    (-> this (.setHeadingFromThrower entity-thrower rotation-pitch-in rotation-yaw-in pitch-offset velocity inaccuracy))))

(defn set-throwable-heading
  "x - `double`
  y - `double`
  z - `double`
  velocity - `float`
  inaccuracy - `float`"
  ([^EntityThrowable this ^Double x ^Double y ^Double z ^Float velocity ^Float inaccuracy]
    (-> this (.setThrowableHeading x y z velocity inaccuracy))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityThrowable this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

(defn on-update
  ""
  ([^EntityThrowable this]
    (-> this (.onUpdate))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityThrowable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityThrowable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-thrower
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityThrowable this]
    (-> this (.getThrower))))

