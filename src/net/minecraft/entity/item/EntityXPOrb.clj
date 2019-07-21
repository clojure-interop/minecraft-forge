(ns net.minecraft.entity.item.EntityXPOrb
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityXPOrb]))

(defn ->entity-xp-orb
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  exp-value - `int`"
  (^EntityXPOrb [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Integer exp-value]
    (new EntityXPOrb world-in x y z exp-value))
  (^EntityXPOrb [^net.minecraft.world.World world-in]
    (new EntityXPOrb world-in)))

(defn xp-color
  "Instance Field.

  type: int"
  (^Integer [^EntityXPOrb this]
    (-> this .-xpColor)))

(defn xp-orb-age
  "Instance Field.

  type: int"
  (^Integer [^EntityXPOrb this]
    (-> this .-xpOrbAge)))

(defn delay-before-can-pickup
  "Instance Field.

  type: int"
  (^Integer [^EntityXPOrb this]
    (-> this .-delayBeforeCanPickup)))

(defn xp-value
  "Instance Field.

  type: int"
  (^Integer [^EntityXPOrb this]
    (-> this .-xpValue)))

(defn *get-xp-split
  "exp-value - `int`

  returns: `int`"
  (^Integer [^Integer exp-value]
    (EntityXPOrb/getXPSplit exp-value)))

(defn on-update
  ""
  ([^EntityXPOrb this]
    (-> this (.onUpdate))))

(defn get-xp-value
  "returns: `int`"
  (^Integer [^EntityXPOrb this]
    (-> this (.getXpValue))))

(defn can-be-attacked-with-item?
  "returns: `boolean`"
  (^Boolean [^EntityXPOrb this]
    (-> this (.canBeAttackedWithItem))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityXPOrb this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityXPOrb this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityXPOrb this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityXPOrb this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn handle-water-movement
  "returns: `boolean`"
  (^Boolean [^EntityXPOrb this]
    (-> this (.handleWaterMovement))))

(defn get-texture-by-xp
  "returns: `int`"
  (^Integer [^EntityXPOrb this]
    (-> this (.getTextureByXP))))

(defn on-collide-with-player
  "entity-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityXPOrb this ^net.minecraft.entity.player.EntityPlayer entity-in]
    (-> this (.onCollideWithPlayer entity-in))))

