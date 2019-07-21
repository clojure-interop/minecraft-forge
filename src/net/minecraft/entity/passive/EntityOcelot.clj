(ns net.minecraft.entity.passive.EntityOcelot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityOcelot]))

(defn ->entity-ocelot
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityOcelot [^net.minecraft.world.World world-in]
    (new EntityOcelot world-in)))

(defn *register-fixes-ocelot
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityOcelot/registerFixesOcelot fixer)))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityOcelot this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityOcelot this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityOcelot`"
  (^net.minecraft.entity.passive.EntityOcelot [^EntityOcelot this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityOcelot this]
    (-> this (.getCanSpawnHere))))

(defn get-tame-skin
  "returns: `int`"
  (^Integer [^EntityOcelot this]
    (-> this (.getTameSkin))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityOcelot this]
    (-> this (.getName))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityOcelot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityOcelot this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn set-tame-skin
  "skin-id - `int`"
  ([^EntityOcelot this ^Integer skin-id]
    (-> this (.setTameSkin skin-id))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityOcelot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn not-colliding?
  "returns: `boolean`"
  (^Boolean [^EntityOcelot this]
    (-> this (.isNotColliding))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityOcelot this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^EntityOcelot this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityOcelot this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityOcelot this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn update-ai-tasks
  ""
  ([^EntityOcelot this]
    (-> this (.updateAITasks))))

