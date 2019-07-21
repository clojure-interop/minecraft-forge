(ns net.minecraft.entity.passive.EntityRabbit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityRabbit]))

(defn ->entity-rabbit
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityRabbit [^net.minecraft.world.World world-in]
    (new EntityRabbit world-in)))

(defn *register-fixes-rabbit
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityRabbit/registerFixesRabbit fixer)))

(defn set-jumping
  "jumping - `boolean`"
  ([^EntityRabbit this ^Boolean jumping]
    (-> this (.setJumping jumping))))

(defn get-rabbit-type
  "returns: `int`"
  (^Integer [^EntityRabbit this]
    (-> this (.getRabbitType))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityRabbit this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityRabbit`"
  (^net.minecraft.entity.passive.EntityRabbit [^EntityRabbit this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn set-movement-speed
  "new-speed - `double`"
  ([^EntityRabbit this ^Double new-speed]
    (-> this (.setMovementSpeed new-speed))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityRabbit this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityRabbit this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityRabbit this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityRabbit this]
    (-> this (.getSoundCategory))))

(defn spawn-running-particles
  ""
  ([^EntityRabbit this]
    (-> this (.spawnRunningParticles))))

(defn set-rabbit-type
  "rabbit-type-id - `int`"
  ([^EntityRabbit this ^Integer rabbit-type-id]
    (-> this (.setRabbitType rabbit-type-id))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityRabbit this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn start-jumping
  ""
  ([^EntityRabbit this]
    (-> this (.startJumping))))

(defn set-jump-completion
  "p-175521-1 - `float`

  returns: `float`"
  (^Float [^EntityRabbit this ^Float p-175521-1]
    (-> this (.setJumpCompletion p-175521-1))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityRabbit this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn update-ai-tasks
  ""
  ([^EntityRabbit this]
    (-> this (.updateAITasks))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityRabbit this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn on-living-update
  ""
  ([^EntityRabbit this]
    (-> this (.onLivingUpdate))))

