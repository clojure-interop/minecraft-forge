(ns net.minecraft.entity.projectile.EntityLargeFireball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityLargeFireball]))

(defn ->entity-large-fireball
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  accel-x - `double`
  accel-y - `double`
  accel-z - `double`"
  (^EntityLargeFireball [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityLargeFireball world-in x y z accel-x accel-y accel-z))
  (^EntityLargeFireball [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityLargeFireball world-in shooter accel-x accel-y accel-z))
  (^EntityLargeFireball [^net.minecraft.world.World world-in]
    (new EntityLargeFireball world-in)))

(defn explosion-power
  "Instance Field.

  type: int"
  (^Integer [^EntityLargeFireball this]
    (-> this .-explosionPower)))

(defn *register-fixes-large-fireball
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityLargeFireball/registerFixesLargeFireball fixer)))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLargeFireball this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLargeFireball this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

