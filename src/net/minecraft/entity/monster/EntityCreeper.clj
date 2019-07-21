(ns net.minecraft.entity.monster.EntityCreeper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityCreeper]))

(defn ->entity-creeper
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityCreeper [^net.minecraft.world.World world-in]
    (new EntityCreeper world-in)))

(defn *register-fixes-creeper
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityCreeper/registerFixesCreeper fixer)))

(defn get-max-fall-height
  "returns: `int`"
  (^Integer [^EntityCreeper this]
    (-> this (.getMaxFallHeight))))

(defn get-powered?
  "returns: `boolean`"
  (^Boolean [^EntityCreeper this]
    (-> this (.getPowered))))

(defn on-update
  ""
  ([^EntityCreeper this]
    (-> this (.onUpdate))))

(defn set-creeper-state
  "state - `int`"
  ([^EntityCreeper this ^Integer state]
    (-> this (.setCreeperState state))))

(defn ai-enabled?
  "returns: `boolean`"
  (^Boolean [^EntityCreeper this]
    (-> this (.isAIEnabled))))

(defn get-creeper-flash-intensity
  "p-70831-1 - `float`

  returns: `float`"
  (^Float [^EntityCreeper this ^Float p-70831-1]
    (-> this (.getCreeperFlashIntensity p-70831-1))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityCreeper this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-creeper-state
  "returns: `int`"
  (^Integer [^EntityCreeper this]
    (-> this (.getCreeperState))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityCreeper this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityCreeper this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityCreeper this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn has-ignited?
  "returns: `boolean`"
  (^Boolean [^EntityCreeper this]
    (-> this (.hasIgnited))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityCreeper this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn on-struck-by-lightning
  "lightning-bolt - `net.minecraft.entity.effect.EntityLightningBolt`"
  ([^EntityCreeper this ^net.minecraft.entity.effect.EntityLightningBolt lightning-bolt]
    (-> this (.onStruckByLightning lightning-bolt))))

(defn ignite
  ""
  ([^EntityCreeper this]
    (-> this (.ignite))))

(defn increment-dropped-skulls
  ""
  ([^EntityCreeper this]
    (-> this (.incrementDroppedSkulls))))

